package TestAutomation.WebApplication;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num= 543;
		int reversenum=0;
		
		while(num!=0) {
			
			int digit= num%10; //3 4
			reversenum = digit + reversenum* 10; //3 34
			num= num/10;//54 
		}
		
		System.out.println(reversenum);
	}

}
