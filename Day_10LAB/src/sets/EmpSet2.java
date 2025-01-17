package sets;

import java.util.HashSet;

import com.app.core.Emp;

public class EmpSet2 {

	public static void main(String[] args) {
		//create empty hash set to store emp details
		HashSet<Emp> empSet=new HashSet<>();//Size:0, capa:16, load factor:0.75
		//Business rule: 2 emps are same iff empId and depName is SAME.
		
		Emp e1=new Emp(100, "Vaibhav", "CEO", 1500000);//new
		Emp e2=new Emp(100, "Vaibhav", "MKT", 1500000);//new
		Emp e3=new Emp(101, "Ram", "Hr", 100000);//new
		Emp e4=new Emp(100, "Vai", "CEO", 110000);//duplicate
		Emp e5=new Emp(20, "Vaibhav", "CEO", 1500000);
		Emp e6=new Emp(110, "Vaibhav", "CEO", 1500000);
		Emp e7=new Emp(131, "Ram", "Hr", 100000);
		Emp e8=new Emp(002, "Shyam", "RnD", 110000);
        
        System.out.println("Added "+empSet.add(e1));//True
        System.out.println("Added "+empSet.add(e2));//False:Reason DUPLICATE NOT allowed.
        System.out.println("Added "+empSet.add(e3));//True
        System.out.println("Added "+empSet.add(e4));//True
        System.out.println("Added "+empSet.add(e5));
        System.out.println("Added "+empSet.add(e6));
        System.out.println("Added "+empSet.add(e7));
        System.out.println("Added "+empSet.add(e8));
        
        System.out.println("Set size "+empSet.size());
        System.out.println("HS"+empSet);
        
        

	}

	
}
