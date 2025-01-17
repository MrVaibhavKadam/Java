package tester;
import static utils.CollectionUtils.*;
import static java.util.Map.Entry;

import java.util.Map;
import java.util.Set;

import com.banking.BankAccount;
public class TestCollectionViewOfMap {

	public static void main(String[] args) {
		//get populated map from sample data.
		Map<Integer, BankAccount> acctsMap = populateMap(populateList());
        //display all account no's of this map.
		Set<Integer> acctsNos=acctsMap.keySet();
		System.out.println("Set of acct no's");
		for(int i:acctsNos)
			System.out.print(i+" ");
		
		//Display all acct details
		System.out.println("\n All Account's");
		for(BankAccount a:acctsMap.values())
			System.out.println(a);
		
		//Display both Key-Value pair i.e acct no's and acct Details
		for(Entry<Integer, BankAccount> e:acctsMap.entrySet())//IMPORTANT METHOD.   
			System.out.println(e.getKey()+":"+e.getValue());
		
	}

}
