package TestAutomation.WebApplication;

import java.util.ArrayList;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,4,9,5,3};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int num :a) {
			list.add(num);
		}
		
		Collections.sort(list,Collections.reverseOrder());
		
		System.out.println(list);
		
		
	}

}
