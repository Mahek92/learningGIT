package TestAutomation.WebApplication;

public class AdjacentArrayDiff {
//Find max diff between adjacent nos in array
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,4,8,15,17};
		
		int result=maxDiff(a);
		System.out.println(result);
	}
	public static int maxDiff(int[] a) {
		// TODO Auto-generated method stub
		int diff=0;
		
		for(int i=0;i<a.length-1;i++) {
			
			if(a[i+1]-a[i] >diff)
			{
				diff = a[i+1]-a[i];
			}
		}
		return diff;
		
	}


	

}
