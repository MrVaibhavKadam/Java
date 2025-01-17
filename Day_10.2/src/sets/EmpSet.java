package sets;

import java.util.HashSet;

import com.app.core.Emp;

public class EmpSet {

	public static void main(String[] args) {
		//create empty hash set to store emp details
		HashSet<Emp> empSet=new HashSet<>();//Size:0, capa:16, load factor:0.75
		System.out.println("Set size before "+empSet.size());//0
		Emp e1=new Emp(100, "Vaibhav", "CEO", 1500000);
		Emp e2=new Emp(100, "Vaibhav", "CEO", 1500000);
		Emp e3=new Emp(100, "Vaibhav", "CEO", 1500000);
        empSet.add(e1);
        empSet.add(e2);
        empSet.add(e3);
        
        
//        System.out.println("Set size after "+empSet.size());//3
//        System.out.println("HS "+empSet);//e1,e2,e3
//        //e1,e2,e3 are equal object: via equals:Yes
//        System.out.println(e1.equals(e2));//true
//        System.out.println(e2.equals(e3));//true
//        
//        System.out.println(e1.hashCode()+" "+e2.hashCode()+" "+e3.hashCode());//All hashCode are different for equal objects.Becoz we dont override hashCode() method.
        System.out.println("Set size after "+empSet.size());//1
        System.out.println("HS "+empSet);       
        System.out.println(e1.equals(e2));//true
        System.out.println(e2.equals(e3));//true
        
        System.out.println(e1.hashCode()+" "+e2.hashCode()+" "+e3.hashCode());
        //RUN THE PROGRAM.

	}

}
