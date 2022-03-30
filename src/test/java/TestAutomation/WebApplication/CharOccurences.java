package TestAutomation.WebApplication;

import java.util.HashMap;
import java.util.Map;

public class CharOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "abscdfeggtfhaabs" ;
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++) {
			
			if(map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i), map.get(str.charAt(i))+ 1);
			}
			else
			{
				map.put(str.charAt(i), 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			System.out.println("Key is" + entry.getKey()+  "\t" + "Value is" + entry.getValue());
		}
		
		
	}

}
