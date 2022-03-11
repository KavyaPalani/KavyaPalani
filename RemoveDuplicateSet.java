package week3.day3.Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateSet {

	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
		String[] textSplit = text.split(" ");
		Set<String> textSet =new LinkedHashSet<String>();
		for(int i=0;i<textSplit.length;i++) {
			textSet.add(textSplit[i]);
		}
		System.out.println("Set : " +textSet);
		
	}

}
