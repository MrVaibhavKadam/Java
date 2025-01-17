package tester;

import static utils.AccountValidationRules.parseNValidateAccountType;
import static utils.AccountValidationRules.validateAccountNo;
import static utils.AccountValidationRules.validateBalance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.banking.BankAccount;
import static com.banking.AcType.SAVING;
import static utils.CollectionUtils.populateList;

import custom_excs.AccountHandlingException;

public class TestAccounts {

	public static void main(String[] args) {
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try (Scanner sc = new Scanner(System.in)) {
			// create suitable data Structure to store account details
			ArrayList<BankAccount>accts=populateList();
			boolean exit = false;
			
			while (!exit) {
				try {
					System.out.println("Menu 1.Create New A/C 2.Display 3.Check if a/c exists 4.Fetch Account summary. 5.Link KYC"
							+ " 6.Apply Interest 7.Close A/C 10.Exit");
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
						for(BankAccount a1:accts)
							if(a1!=null)
								System.out.println(a1);//Bank account cls's toString                  
						break;
					case 3://3.Check if a/c exists
						//i/p:a/c no
						//o/p:Present/Absent
						System.out.println("Enter a/c no.");
						int accNo=sc.nextInt();
//						System.out.println(accts.contains(accNo)?"present":"absent");//int-->Integer
//						//list:a1,a2,a3,a4
//						//acctNo.equals(a1):false ..coz calling Integer cls's equals method=>false since Integer is of type int and BankAccount is of type string.so they are incompatable.
						BankAccount ref=new BankAccount(accNo);
						System.out.println(accts.contains(ref)?"present":"absent");
						break;
					case 4:
						System.out.println("Enter a/c no ");
						accNo=sc.nextInt();
						ref=new BankAccount(accNo);
						int index=accts.indexOf(ref);
						if(index==-1)
							throw new AccountHandlingException("Invalid a/c no..!");
						System.out.println("Summary "+accts.get(index));
						break;
						
					case 5://link kyc details
						System.out.println("Enter a/c No");
						 accNo=sc.nextInt();
						//write the method to validate accNo.
						//if failure:throw exception.
						//found:returns validate bank a/c ref:
						//check if account exist.
						BankAccount bankAccount=validateAccountNo(accNo,accts);
						//account exist.
						System.out.println("Enter KYC details email address phoneNo");
						bankAccount.linkKYC(sc.next(),sc.next(),sc.next());
						System.out.println("KYC linked");
						break;
					case 6://Applying interest on saving accounts
						//create enum type of saving
						System.out.println("Enter interest rate ");
						//AcType saving=AcType.SAVING;
						double rate = sc.nextDouble();
						for(BankAccount a1:accts)
							if(a1.getAcctType().equals(SAVING))//you can use .equals(SAVING) directly but we have to import static com.banking.AcType.*;
								a1.applyInterest(rate);
						System.out.println("Interest Applied..!");
					case 7://close account.
						System.out.println("Enter A/C No. to close bank a/c ");
						int index1=accts.indexOf(new BankAccount(sc.nextInt()));
						if (index1==-1)
							throw new AccountHandlingException("Invalid account no..!");
						System.out.println("closed account for "+accts.remove(index1).getCustName());
								
						break;
					case 8://Sorting by acctsNo(acending order)
						System.out.println("Sorting A/C By using acctNo");
						Collections.sort(accts);
						
						break;
					case 9://Sorthing using balance(decending order)
						//for this we have to override the compareTo method for balance in BankAccount.
						System.out.println("Sorting A/C By using Balance");
						Collections.sort(accts);
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

	
	
	private static LocalDate parse(String next) {
		// TODO Auto-generated method stub
		return null;
	}

}
