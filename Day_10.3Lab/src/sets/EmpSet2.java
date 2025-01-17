package sets;

import java.util.HashSet;

import com.app.core.Emp;

public class EmpSet2 {

	public static void main(String[] args) {
		//create empty hash set to store emp details
		HashSet<Emp> empSet=new HashSet<>();//Size:0, capa:16, load factor:0.75
		//Business rule: 2 emps are same iff empid and department name is same.
		Emp e1=new Emp(100, "Vaibhav", "CEO", 1500000);
		Emp e2=new Emp(100, "Vaibhav", "EO", 1500000);
		Emp e3=new Emp(101, "Ram", "Hr", 100000);
		Emp e4=new Emp(100, "Shyam", "CEO", 110000);
		Emp e5=new Emp(20, "Vaibhav", "CA", 1500000);

        
        System.out.println("Added "+empSet.add(e1));//True
        System.out.println("Added "+empSet.add(e2));//False:Reason DUPLICATE NOT allowed.
        System.out.println("Added "+empSet.add(e3));//True
        System.out.println("Added "+empSet.add(e4));//True
        System.out.println("Added "+empSet.add(e5));
       
        
        System.out.println("Set size "+empSet.size());
        System.out.println("HS"+empSet);
        
        

	}

	
}
