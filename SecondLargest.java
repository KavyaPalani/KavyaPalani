package week3.day3.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {

		//int[] data= {3,2,11,4,6,7};
		List<Integer> l1 =new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println("SortedList: " +l1);
		int i=l1.size();
		System.out.println("Second Largest value : " +l1.get(i-2));
		
	}

}
