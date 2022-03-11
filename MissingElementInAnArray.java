package week3.day3.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		List<Integer> l1 =new ArrayList<Integer>(Arrays.asList(1,2,3,4,7,6,8));
		System.out.println(l1);
		int count=0;
		for(Integer i:l1) {
			count++;
			if(count!=i) {
				System.out.println("Missing Element is : " +count);
				break;

			}
		}

		
	}

}
