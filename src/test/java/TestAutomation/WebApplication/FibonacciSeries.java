package TestAutomation.WebApplication;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//example->1 2 3 5 8 13 21
		
		int first = 0;
		int second = 1;
		int i=1;
		int sum=0;
		
		while(i<9) //print upto 8 times
		{
			sum= first + second;
			System.out.println(sum);
			first= second;
			second= sum;
			
			i++;
		}
		
		
	}

}
