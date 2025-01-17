package com.banking;
//acct no(int),customer name(string), acct type(enum),balance(double),creationDate(java.util.Date)

import static utils.AccountValidationRules.validateBalance;

import java.time.LocalDate;

//Add : toString , constr.

import custom_excs.AccountHandlingException;

public class BankAccount {
	private int acctNo;
	private String custName;
	private AcType acctType;
	private double balance;
	private LocalDate creationDate;
	private KYC customerInfo;

	public BankAccount(int acctNo, String custName, AcType acctType, double balance, LocalDate date) {
		super();
		this.acctNo = acctNo;
		this.custName = custName;
		this.acctType = acctType;
		this.balance = balance;
		this.creationDate = date;

	}

	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", custName=" + custName + ", acctType=" + acctType + ", balance="
				+ balance + ", creationDate=" + creationDate + "]";
	}

	public int getAcctNo() {
		return acctNo;
	}

	public AcType getAcctType() {
		return acctType;
	}

	public String getCustName() {
		return custName;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	// B.L methods
	/*
	 * Methods public void withdraw(double amt) public void deposit(double amt)
	 * public void transferFunds(BankAccount dest,double amt) public void
	 * applyInterest(double rate) --to apply simple interest (yearly) (period=1 yr)
	 */
	// Add a B.L method to withdraw funds
	public void withdraw(double amt) throws AccountHandlingException {
		if (customerInfo == null)
			throw new AccountHandlingException("KYC not completed: No txn allowed.");
		validateBalance(balance - amt);
		balance -= amt;
	}

	// Add a B.L method to deposit funds
	public void deposit(double amt) {
		balance += amt;
	}

	// Add a B.L method to transfer funds from src a/c ---> dest a/c
	public void transferFunds(BankAccount dest, double amt) throws AccountHandlingException {
		this.withdraw(amt);
		dest.deposit(amt);
	}

	// add a B.L method for applying interest
	public void applyInterest(double interestRate) {
		balance += ((balance * interestRate) / 100);
	}

	// add the method to link the KYC details for an account.
	public void linkKYC(String email, String address, String phoneNo) {
		customerInfo = new KYC(email, address, phoneNo);
	}

	// embed KYC details within enclosing BankAccount class
	private class KYC {
		private String email, address, phoneNo;

		public KYC(String email, String address, String phoneNo) {
			super();
			this.email = email;
			this.address = address;
			this.phoneNo = phoneNo;
		}

		@Override
		public String toString() {
			return "KYC Details " + email + ", address=" + address + ", phoneNo=" + phoneNo;
		}

	}

}
