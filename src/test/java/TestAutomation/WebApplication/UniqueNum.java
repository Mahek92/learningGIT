package TestAutomation.WebApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,1,3,4,2,4,3,6,7,6,8,9};
		
		/*
		 * ArrayList<Integer> list= new ArrayList<Integer>();
		 * 
		 * for(int num: a) { list.add(num); }
		 * 
		 * Set<Integer> set= new HashSet<Integer>(list);
		 * 
		 * System.out.println("Unique numbers are-" + set);
		 */
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(map.containsKey(a[i]))
					{
				map.put(a[i], map.get(a[i])+1);
					}
			else {
				map.put(a[i], 1);
			}
		}
		
		
		
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
			System.out.println("Key is" +entry.getKey()+ "\t" + "Value " + entry.getValue());
		}
	}

}
