package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		l1.get(0).linkKYC("madhura@gmail.com", "Pune", "456255656");
        l1.get(1).linkKYC("shekhar@gmail.com", "Delhi", "676255656");
        l1.get(2).linkKYC("kiran@gmail.com", "Chennai", "896255656");
        l1.get(3).linkKYC("riya@gmail.com", "Indore", "996255656");
        l1.get(4).linkKYC("rama@gmail.com", "Pune", "806255656");
		return l1;//collection utils returns populated accts list to caller.
	}
	//Add a static method to accept list of bank accounts copy these ref's in map and return the map to the caller.
	public static Map<Integer, BankAccount> populateMap(List<BankAccount>acctList)
	{   //Empty hashMap
		HashMap<Integer, BankAccount> hm=new HashMap<>();
		//Populate the HashMap
		for(BankAccount a:acctList)
			hm.put(a.getAcctNo(), a);
		return hm;
		
	}
}
