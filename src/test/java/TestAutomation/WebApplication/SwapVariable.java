package TestAutomation.WebApplication;

public class SwapVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =9;
		int b=4;
//		int temp;
//		
//		temp=a;
//		a=b;
//		b=temp;
		
		a= a+b; //13
		b= a-b; //9
		a= a-b; //4

		
		
		System.out.println(a);
		System.out.println(b);
	}

}
