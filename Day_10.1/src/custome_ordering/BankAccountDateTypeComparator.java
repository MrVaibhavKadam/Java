package custome_ordering;

import java.util.Comparator;

import com.banking.BankAccount;

public class BankAccountDateTypeComparator implements Comparator<BankAccount> {

	@Override
	public int compare(BankAccount o1, BankAccount o2) {
		//Date and Type
		//first do comparision based upon date
		int val=o1.getCreationDate().compareTo(o2.getCreationDate());
		if(val==0) {
			//if dates are same:compare them as per the a/c type.
			return o1.getAcctType().compareTo(o2.getAcctType());
		}
		return val;
	}

}
