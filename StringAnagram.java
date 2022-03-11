package week3.Day1.Assignment;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="posts";
		if(text1.length()==(text2.length())) {
			System.out.println("Length of the strings are same");
		}
		else
		{
			System.out.println("Length are not same");
		}
		//convert from string to character
		char[] charArray = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		//sort the array
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		//check arrays are equal
		boolean result = Arrays.equals(charArray, charArray2);
		if(result) {
			System.out.println("It is Anagram");
		}
		else
		{
			System.out.println("It is not Anagram");
		}
	}

}
