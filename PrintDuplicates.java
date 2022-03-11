package week3.day3.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDuplicates {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));
		int count=0;
		for(int i=0;i<=l1.size()-1;i++) {
			for(int j=i+1;j<=l1.size();j++) {
				if(l1.get(i)==l1.get(j))
					count++;
			}
			if(count>0)
				System.out.println(l1.get(i));
		}
		
	}

}
