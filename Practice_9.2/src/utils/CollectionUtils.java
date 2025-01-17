package utils;

import java.util.ArrayList;
import static com.banking.AcType.*;
import static java.time.LocalDate.*;
import com.banking.BankAccount;

public class CollectionUtils {
//add a static method to return the populated list of bank accts
	public static ArrayList<BankAccount> populateList()
	{
		//create empty list
		ArrayList<BankAccount>l1=new ArrayList<>();
		l1.add(new BankAccount(101,"madhura",FD,123456,parse("2020-06-06")));
		l1.add(new BankAccount(10,"Vaibhav",SAVING,3456,parse("2020-07-16")));
		l1.add(new BankAccount(51,"Rohit",CURRENT,85764,parse("2020-09-09")));
		l1.add(new BankAccount(98,"Dipak",SAVING,20030,parse("2020-12-05")));
		l1.add(new BankAccount(77,"ganesh",FD,89497,parse("2020-10-04")));
		return l1;//collection utils returns populated accts list to caller.
	}
}
