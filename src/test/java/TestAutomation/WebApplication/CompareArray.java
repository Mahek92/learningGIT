package TestAutomation.WebApplication;

import java.util.ArrayList;

public class CompareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,4,5,7};
		int[] b= {2,4,6,7};
		
		ArrayList<Integer> compArray = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==b[i]) {
				compArray.add(a[i]);
				           
			}
		}
		
//		Object[] c=compArray.toArray();
//		for(Object num: c) {
//			System.out.println(num);
//		}
		
		System.out.println(compArray);


		
	}

}
