package tester;

import java.util.Map;
import java.util.Set;
import static java.util.Map.Entry;
import com.banking.BankAccount;

import static utils.CollectionUtils.*;

public class TestCollectionViewOfMap {

	public static void main(String[] args) {
		//get populated map from sample data:Collection Utils
		Map<Integer, BankAccount> acctsMap = populateMap(populateList());
		//Display all account numbers.
		Set<Integer> acctNoSet = acctsMap.keySet();
		System.out.println("Keys:");
		for(int i: acctNoSet)
			System.out.print(i + " ");
		//Display all account details.
		System.out.println("All accts");
		for(BankAccount a: acctsMap.values())//IMPORTANT.
			System.out.println(a);
		//Display acct no and acct details.
		System.out.println("AcctNo and Details");
		for(Entry<Integer, BankAccount> e: acctsMap.entrySet()) {
			System.out.println(e);
			System.out.println("-----------------------------------------");
//			System.out.println(e.getKey()+":"+e.getValue());
		}
	}

}
