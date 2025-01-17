package tester;

import static com.banking.AcType.SAVING;
import static utils.AccountValidationRules.parseNValidateAccountType;
import static utils.AccountValidationRules.validateAccountNo;
import static utils.AccountValidationRules.validateBalance;
import static utils.CollectionUtils.*;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.banking.AcType;
import com.banking.BankAccount;

import custom_excs.AccountHandlingException;

public class TestAccounts {

	public static void main(String[] args) {
		// SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try (Scanner sc = new Scanner(System.in)) {
			// create suitable data Structure to store account details
			Map<Integer, BankAccount> accts = populateMap(populateList());
			boolean exit = false;

			while (!exit) {
				try {
					System.out.println(
							"Menu 1.Create New A/C 2.Display 3.Check if a/c exists 4.Fetch Account summary. 5.Link KYC"
									+ " 6.Apply Interest 7.Close A/C 100.Exit");
					System.out.println("Choose Option");
					switch (sc.nextInt()) {
					case 1:

						System.out.println("Enter a/c details : acctNo custName acctType  balance creationDate ");
						// validation rules + a/c instance
						BankAccount a = new BankAccount(sc.nextInt(), sc.next(),
								parseNValidateAccountType(sc.next().toUpperCase()), validateBalance(sc.nextDouble()),
								parse(sc.next()));
						// putIfAbsent
						BankAccount ref = accts.putIfAbsent(a.getAcctNo(), a);
						// For checking if the account is duplicate or not do NULL checking.
						if (ref != null)
							throw new AccountHandlingException("Duplicate acNo.");
						System.out.println("A/C created successfully!!!!!");

						break;
					case 2:
						//System.out.println(accts);// Invokes HM's toString
						for(BankAccount a1:accts.values())
							System.out.println(a1);
						
						break;
					case 3:// 3.Check if a/c exists
							// i/p:a/c no
							// o/p:Present/Absent
						System.out.println("Enter a/c no.");
						int accNo = sc.nextInt();
						System.out.println(accts.containsKey(accNo));
			
						break;
					case 4:
						System.out.println("Enter a/c no ");
						accNo = sc.nextInt();
						System.out.println(validateAccountNo(accNo, accts));
						break;

					case 5:// link kyc details
						System.out.println("Enter a/c No");
						accNo = sc.nextInt();
						// write the method to validate accNo.
						// if failure:throw exception.
						// found:returns validate bank a/c ref:
						// check if account exist.
						BankAccount bankAccount = validateAccountNo(accNo, accts);
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
////					//searching criteria value based
						//Map limitations cant directly search by value based criteria 
						//Map is not iterable: cant attach for-each.
						//map---->values()---> Collection<BankAccount>
						for(BankAccount a1: accts.values())//returns Collection<BankAccount> 
							if(a1.getAcctType().equals(AcType.SAVING))
								a1.applyInterest(rate);
						
						System.out.println("Interest Applied..!");
					case 7:// close account.
						System.out.println("Enter A/C No. to close bank a/c ");
//						//trying to  remove an entry by key type: Map's remove
						accNo = sc.nextInt();
						bankAccount = accts.remove(accNo);
						if(bankAccount == null)
							throw new AccountHandlingException("Invalid account No..!");
						System.out.println("Hello, "+ bankAccount.getCustName()+ ":Account closed..!");
						break;

//					case 6://withdraw
//						//i/p:a/c no,amount
//						System.out.println("Enter a/c no and amount ");
//						accNo=sc.nextInt();
//						double amount=sc.nextDouble();
//						//account validations:for-each/for--doesn't exit(exception)
//					//	bankAccount = validateAccountNo(accNo,accounts);
//						//if its linked to kyc:allow transaction or throw exception
//				//		bankAccount.withdraw(amount);
//				//		System.out.println("Hello "+bankAccount.getCustName()+"withdrawl successful");
//						break;

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
