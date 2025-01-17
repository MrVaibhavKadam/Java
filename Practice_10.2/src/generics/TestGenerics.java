package generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class TestGenerics {

	public static void main(String[] args) {
		Vector<Mgr> mgrs=new Vector<>();
		mgrs.add(new Mgr());
		mgrs.add(new Mgr());
		mgrs.add(new Mgr());
		mgrs.add(new Mgr());
		mgrs.add(new Mgr());
		//ArrayList(Collection<? extends E>collection)
		ArrayList<Emp>emps=new ArrayList<>(mgrs);
		System.out.println(emps);
		LinkedList<Emp> l2=new LinkedList<>(emps);
		//public boolean addAll(Collection<? extends E> c).this method is in AL and HS also.
		ArrayList<Emp>l3=new ArrayList<>();//Empty AL, Size=0 : initCapacity=10.
		l3.addAll(mgrs);
		HashSet<TempWorker>hs=new HashSet<>();
//		hs.addAll(mgrs);//Mgr is NOT a TempWorker.
//		hs.addAll(emps);//Emp IS Not a TempWorker.
//		hs.addAll(l2);//Emp IS Not a TempWorker.
		
		
	}

}
