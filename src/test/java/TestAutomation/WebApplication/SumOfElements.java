package TestAutomation.WebApplication;

public class SumOfElements {

	public static void main(String[] args) {

	int[] a= {1,2,3,4,5};
	
	int sum= sumArray(a);
	int result= multiply(5,10);
	
	System.out.println(sum);
	System.out.println(result);
	
}


public static int sumArray(int[] a2) {
	
	int sumOfArray= 0;
	for(int i=0;i<a2.length; i++) {
		sumOfArray= sumOfArray+ a2[i];
	}
	return sumOfArray;
}

public static int multiply(int first, int second) {
	int multiplyResult= 0;
	for(int i=1; i<=second; i++)
	{
		multiplyResult= multiplyResult + first;
	}
	return multiplyResult;
}

}
