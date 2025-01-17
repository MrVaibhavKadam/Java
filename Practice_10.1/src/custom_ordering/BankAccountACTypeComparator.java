package custom_ordering;

import java.util.Comparator;

import com.banking.BankAccount;

public class BankAccountACTypeComparator implements Comparator<BankAccount>{
	public int compare(BankAccount a1, BankAccount a2) {
		int val = a1.getCreationDate().compareTo(a2.getCreationDate());
		if(val == 0) {
			return a1.getAcctType().compareTo(a2.getAcctType());
		}
	return val;	
	}

}
