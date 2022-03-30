package TestAutomation.WebApplication;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "madam";
		String reverseStr="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			reverseStr= reverseStr + str.charAt(i);
					
		}
		if(str.equalsIgnoreCase(reverseStr))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
	}

}
