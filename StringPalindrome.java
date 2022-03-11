package week3.Day1.Assignment;

public class StringPalindrome {

	public static void main(String[] args) {
		String str="madam";
		String reversestr="";
		int length = str.length();
		for(int i=length-1;i>=0;--i) 
			reversestr=reversestr + str.charAt(i);
		if(str.equalsIgnoreCase(reversestr))
		{
			System.out.println(str  + " is a palindrome");
		}
		else
		{
			System.out.println(str + " is not palindrome");
		}
		
	}

}
