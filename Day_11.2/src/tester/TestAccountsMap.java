package tester;

import static com.banking.AcType.SAVING;
import static utils.AccountValidationRules.parseNValidateAccountType;
import static utils.AccountValidationRules.validateAccountNo;
import static utils.AccountValidationRules.validateBalance;
import static utils.CollectionUtils.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.banking.BankAccount;

import custom_excs.AccountHandlingException;

public class TestAccountsMap {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			// create suitable data Structure to store account details:HashMap
			Map<Integer,BankAccount> accts = populateMap(populateList());
			boolean exit = false;

			while (!exit) {
				try {
					System.out.println(
							"Menu 1.Create New A/C 2.Display 3.Check if a/c exists 4.Fetch Account summary. 5.Link KYC"
									+ " 6.Apply Interest 7.Close A/C  100.Exit");
					System.out.println("Choose Option");
					switch (sc.nextInt()) {
					case 1:

						System.out.println("Enter a/c details : acctNo custName acctType  balance creationDate ");
						// validation rules + a/c instance
						BankAccount a = new BankAccount(sc.nextInt(), sc.next(),
								parseNValidateAccountType(sc.next().toUpperCase()), validateBalance(sc.nextDouble()),
								parse(sc.next()));
						//putIfAbsent
						BankAccount ref=accts.putIfAbsent(a.getAcctNo(), a);
						if(ref!=null)
							throw new AccountHandlingException("A/C already exists");
						
						System.out.println("A/C created successfully!!!!!");

						break;
					case 2:
						System.out.println("Display all a/c details");
//						System.out.println(accts);// invokes HashMap's toString
						for(BankAccount a1:accts.values())//collection of <BankAccount>
							System.out.println(a1);
						break;
					case 3:// 3.Check if a/c exists
							// i/p:a/c no
							// o/p:Present/Absent
						System.out.println("Enter a/c no.");
						int acctNo = sc.nextInt();
                        System.out.println(accts.containsKey(acctNo)?"Present":"Absent");
						break;
					case 4:
						System.out.println("Enter a/c no ");
						acctNo = sc.nextInt();
						System.out.println(validateAccountNo(acctNo, accts));
						
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
					case 6:// Applying interest on saving accounts
							// create enum type of saving
						System.out.println("Enter interest rate ");
						// AcType saving=AcType.SAVING;
						double rate = sc.nextDouble();
						//search by account type--if matched--invokes applyInterest
						//search criteria:value based.
						//Map limitations:Can't directly search by value based criteria.
						//Map is not iterable:can't attach for-each.
						//Solution= Convert the map into collection view.
						//map-->values()-->
						for(BankAccount a2:accts.values())//returns Collection<BankAccount>.
							if(a2.getAcctType().equals(SAVING))
								a2.applyInterest(rate);
						
						
						System.out.println("Interest Applied..!");
					case 7:// close account.
						System.out.println("Enter A/C No. to close bank a/c ");
						acctNo=sc.nextInt();
						bankAccount=accts.remove(acctNo);
						if(bankAccount==null)
							throw new AccountHandlingException("Invalis A/C No Can't remove the account");
						System.out.println("Hello, "+bankAccount.getCustName());
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

	private static LocalDate parse(String next) {
		// TODO Auto-generated method stub
		return null;
	}

}
