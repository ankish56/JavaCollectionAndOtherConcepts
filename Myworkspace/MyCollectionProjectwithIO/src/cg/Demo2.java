package cg;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo2 {

	public static void main(String[] args) {
		// generic collection
		//Set<String> col=new HashSet<String>();
		//Set<String> col=new LinkedHashSet<String>(); //ordered => maintains insertion order
		ArrayList<String> col=new ArrayList<String>(); //does not accept null as object throws NullPointerException
		                                       // No insertion order // stored elements
		col.add("Ram");
		col.add("Sham");
		col.add("Abdul");
		//col.add(55); //new Integer(55); //autoboxing
		col.add(null);
		col.add("Ganesh");
		col.add("Ram");
		System.out.println(col);
		System.out.println(col.size());
		System.out.println("=================================");
		for(String s:col)
		{
			System.out.println(s);
		}
		System.out.println("=================================");
		Iterator<String> it=col.iterator();
		while(it.hasNext()) {
			String ss= it.next();
			System.out.println(ss);
		}
	}

}
