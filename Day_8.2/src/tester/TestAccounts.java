package tester;

import static utils.AccountValidationRules.parseNValidateAccountType;
import static utils.AccountValidationRules.validateAccountNo;
import static utils.AccountValidationRules.validateBalance;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.banking.BankAccount;

import custom_excs.AccountHandlingException;

public class TestAccounts {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try (Scanner sc = new Scanner(System.in)) {
			// create suitable array to store account details
			System.out.println("Enter how many max no of accounts?");
			BankAccount[] accounts = new BankAccount[sc.nextInt()];// 100
			boolean exit = false;
			int counter = 0;
			while (!exit) {
				try {
					System.out.println("Menu 1.Create New A/C 2.Display 3.Link KYC 4.WIthdraw 10.Exit");
					System.out.println("Choose Option");
					switch (sc.nextInt()) {
					case 1:
						if (counter < accounts.length) {
							System.out.println("Enter a/c details : acctNo custName acctType  balance creationDate ");
							// validation rules + a/c instance
							BankAccount a = new BankAccount(sc.nextInt(), sc.next(),
									parseNValidateAccountType(sc.next()), validateBalance(sc.nextDouble()),
									sdf.parse(sc.next()));
							accounts[counter++]=a;
							System.out.println("A/C created successfully!!!!!");

						} else
							throw new AccountHandlingException("Max Accounts reached!!!");
						break;
					case 2:
						System.out.println("Display all a/c details");
						for(BankAccount a:accounts)
							if(a!=null)
								System.out.println(a);//Bank account cls's toString                  
						break;
					case 3://link kyc details
						System.out.println("Enter a/c No");
						int accNo=sc.nextInt();
						//write the method to validate accNo.
						//if failure:throw exception.
						//found:returns validate bank a/c ref:
						//check if account exist.
						BankAccount bankAccount = validateAccountNo(accNo,accounts);
						//account exist.
						System.out.println("Enter KYC details email address phoneNo");
						bankAccount.linkKYC(sc.next(),sc.next(),sc.next());
						System.out.println("KYC linked");
						break;
					case 4://withdraw
						//i/p:a/c no,amount
						System.out.println("Enter a/c no and amount ");
						accNo=sc.nextInt();
						double amount=sc.nextDouble();
						//account validations:for-each/for--doesn't exit(exception)
						bankAccount = validateAccountNo(accNo,accounts);
						//if its linked to kyc:allow transaction or throw exception
						bankAccount.withdraw(amount);
						System.out.println("Hello "+bankAccount.getCustName()+"withdrawl successful");
						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println("Error " + e);
					System.out.println("Pls retry");
				}
				//To clear of the pending tokens from the buffer of Scanner.
				sc.nextLine();
			}
		}

	}

}
