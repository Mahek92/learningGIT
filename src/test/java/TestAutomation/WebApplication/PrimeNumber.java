package TestAutomation.WebApplication;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 boolean result =prime(31);
		 if(result)
		 {
			 System.out.println("num is not prime");
		 }
		 else
			 System.out.println("num is prime"); 
	}
	
	public static boolean prime(int number) {
		boolean flag= false;
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				flag=true;
				break;
			}
			
		}
		return flag;
		
	}

}
