package tester;

import static java.time.LocalDate.parse;
import static utils.AccountValidationRules.parseNValidateAccountType;
import static utils.AccountValidationRules.validateAccountNo;
import static utils.AccountValidationRules.validateBalance;
import static utils.CollectionUtils.populateList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.banking.AcType;
import com.banking.BankAccount;

import custom_excs.AccountHandlingException;
import custom_ordering.BankAccountACTypeComparator;
import custom_ordering.BankAccountDateBalanceComparator;
import custom_ordering.BankAcctBalanceComparator;

public class TestAccounts {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			// create suitable DS to store account details

			ArrayList<BankAccount> accts = populateList();
			boolean exit = false;

			while (!exit) {
				try {
					System.out.println("Menu 1.Create New A/C 2.Display "+"\n"
							+ "3.Check for existance 4.Get Account Details 5.Link KYC "+"\n"
							+ "6.WIthdraw 7.Apply Interest 8.List of PhoneNo"+"\n"
							+ "9.Close Account 10.Transfer Money"+"\n"
							+ "11.Sorting as per a/c no." + " 14.Sorting as per creation date n balance"+"\n"
							+ "15.Sorting as per creation date and AcType"+"\n"
							+ "16.sorting as per date(anonymous inner cls)"+"\n"
							+ "100.Exit");
					System.out.println("Choose Option");
					switch (sc.nextInt()) {
					case 1:

						System.out.println("Enter a/c details : acctNo custName acctType  balance creationDate ");
						// validation rules + a/c instance
						BankAccount a = new BankAccount(sc.nextInt(), sc.next(),
								parseNValidateAccountType(sc.next().toUpperCase()), validateBalance(sc.nextDouble()),
								parse(sc.next()));
						accts.add(a);
						System.out.println("A/C created successfully!!!!!");

						break;
					case 2:
						System.out.println("Display all a/c details");
						for (BankAccount a1 : accts)
							if (a1 != null)
								System.out.println(a1);// Bank account cls's toString
						break;

					case 3:
						// check if accts exists.
						// i/p : acct no
						// o/p : present/absent
						System.out.println("Enter accts no");
						int acctNo = sc.nextInt();
						// System.out.println(accts.contains(acctNo)?"Present" : "Absent");// in this we
						// are getting absent output only bcoz we have to override the equals method
						// of the object class thats why we are getting only absent output.
						// If we override the equals method of the object clss still we get absent as
						// o/p.
						// bcoz we are passing the int val to the contains method int-> Integer
						// autoboxing and it is again calling the equals method of
						// Integer class for solving this problem we have to pass the reference of
						// BankAccounts to override its equals method.
						// for avhieveing this we have to overload the BankAccount constructor for only
						// acctNo.
						BankAccount ref = new BankAccount(acctNo);
						System.out.println(accts.contains(ref) ? "Present" : "Absent");
						break;

					case 4:
						// Get account summary->
						System.out.println("Enter acctNo");
						acctNo = sc.nextInt();
						ref = new BankAccount(acctNo);
						int index = accts.indexOf(ref);

						if (index == -1)
							throw new AccountHandlingException("Invalid Account No..!");

						System.out.println("Summary: " + accts.get(index));

						break;
					case 5:// link kyc details
						System.out.println("Enter a/c No");
						acctNo = sc.nextInt();
						// write the method to validate accNo.
						// if failure:throw exception.
						// found:returns validate bank a/c ref:
						// check if account exist.
						BankAccount bankAccount = validateAccountNo(acctNo, accts);
						// account exist.
						System.out.println("Enter KYC details email address phoneNo");
						bankAccount.linkKYC(sc.next(), sc.next(), sc.next());
						System.out.println("KYC linked");
						break;
//					case 6:
//						//withdraw
//						//i/p:a/c no,amount
//						System.out.println("Enter a/c no and amount ");
//						acctNo=sc.nextInt();
//						double amount=sc.nextDouble();
//						//account validations:for-each/for--doesn't exit(exception)
//					//	bankAccount = validateAccountNo(accNo,accounts);
//						//if its linked to kyc:allow transaction or throw exception
//					//	bankAccount.withdraw(amount);
//					//	System.out.println("Hello "+bankAccount.getCustName()+"withdrawl successful");
//						break;
//						
					case 7:
						// apply interest on saving account.
						System.out.println("Enter interest rate.");
						double rate = sc.nextDouble();
						// create enum type of saving
						AcType saving = AcType.SAVING;
						for (BankAccount a1 : accts)
							if (a1.getAcctType().equals(saving))
								a1.applyInterest(rate);
						System.out.println("Interest rate Applied.");
						break;

					case 8:// Display phone no of all customers whose a/c is created in specified month n
							// year
							// i/ps : month n year
						System.out.println("Enter month and year");
						int mon = sc.nextInt();
						int yrs = sc.nextInt();
						System.out.println("List of Phone No: ");
						for (BankAccount a1 : accts)
							if (a1.checkDate(mon, yrs))
								System.out.println(a1.getCustName() + " " + a1.getPhoneNo());

					case 9:// Close Account
						System.out.println("Enter A/C  No to close account.");
						index = accts.indexOf(new BankAccount(sc.nextInt()));
						if (index == -1)
							throw new AccountHandlingException("Invalid Acct No.!!!");
						System.out.println("A/C Closed for: " + accts.remove(index).getCustName());

					case 10:// Transfer Money
						System.out.println("Enter Debit A/C No");
						int debt = sc.nextInt();
						System.out.println("Enter Credit A/C No");
						int cred = sc.nextInt();
						// validate account number.
						BankAccount srcAccount = validateAccountNo(debt, accts);
						BankAccount destAccount = validateAccountNo(cred, accts);
						// transfer Fund
						srcAccount.transferFunds(destAccount, sc.nextDouble());
						break;

					case 11:// Sorting ascending order
						System.out.println("Sorting bank accounts as per a/c no.");
						Collections.sort(accts);
						break;

					case 12:// sorting a/c as per decending balance.
						System.out.println("Sorting a/c as per decending order.");
						Collections.sort(accts);
						break;

					case 13:// custom ordering by desc balance
						// Collections.sort(accts);//BankAccount's compareTo : Natural ordering
						// Collections : class
						// public static void sort(List<T> l1,Comparator<T> comp)
						// comp : instance (ref) of the class which imple Comparator i/f
						Collections.sort(accts, new BankAcctBalanceComparator());// sort(..) calls internally :
																					// BankAccountBalanceComparato 's
																					// compare : external ordering
																					// (custom)
						break;

					case 14:// sorting as per asc order of creation date n balance. : Custom ordering
						Collections.sort(accts, new BankAccountDateBalanceComparator());
						break;

					case 15:// sorting using date n AcType.
						Collections.sort(accts, new BankAccountACTypeComparator());
						break;
						
					case 16:
						//sort accts as per date using anonymous inner class
						// new Comparator<BankAccount>(){} --> instance of the class which implements comparator.
						Collections.sort(accts, new Comparator<BankAccount>() {
							@Override
							public int compare(BankAccount a1, BankAccount a2) {
								System.out.println("In Anon. inner cls");
								return a1.getCreationDate().compareTo(a2.getCreationDate());
							}
						});
						
						break;
					case 100:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println("Error " + e);
					System.out.println("Pls retry");
				}
				// To clear of the pending tokens from the buffer of Scanner.
				sc.nextLine();
			}
		}

	}

}
