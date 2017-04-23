package com.vogella.java.collections.list;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class Assignment9_3 {
	
	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	    /*Adding EmpCode and EmpName to HashMap*/
	    hmap.put(101, "Mayank");
	    hmap.put(102, "Rahul");
	    hmap.put(103, "Rohit");
	    hmap.put(104, "Manas");
	    hmap.put(105, "Rohan");
	    
	    Set set = hmap.entrySet();
	    Iterator iterator = set.iterator();
	    while(iterator.hasNext()) {
	       Map.Entry mentry = (Map.Entry)iterator.next();
	       System.out.println(mentry.getValue()); //Print only EmpName as output
	    }
		
	}
	
}
