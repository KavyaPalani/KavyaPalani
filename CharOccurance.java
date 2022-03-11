package week3.Day1.Assignment;

import java.lang.reflect.Array;

public class CharOccurance {

	public static void main(String[] args) {

		String text="Welcome to chennai";
		char[] charArray = text.toCharArray();
		Array.getLength(charArray);
		//int length = text.length();
		int count=text.length()-text.replace("e", "").length();
		System.out.println("CharOccurance : " +count);
	}

}
