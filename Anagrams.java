package Collections1;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String var1 = "Ravishankar";
		String var2 = "ShankarRavi";
		
		char[] c1 = var1.toUpperCase().toCharArray();
		char[] c2 = var2.toUpperCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
	
		if (Arrays.equals(c1, c2))
		{
			System.out.println("it is anagram");
		}
		else 
			System.out.println("not anagram");
		
		String sb = "Malayalam12";
		
		int len = sb.length();
		
		String r = " ";
		
		for (int j=len-1;j>=0;j--)
		{
			r = r + sb.charAt(j);
						
		}
		System.out.println("r : " + r);
		
		if (sb.equals(r))
			System.out.println("it is palindrome");
		else
			System.out.println("its not a palindrome);
	}

}
