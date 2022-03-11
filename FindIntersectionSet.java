package week3.day3.Assignment;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindIntersectionSet {

	public static void main(String[] args) {
		Set<Integer> s1=new LinkedHashSet<Integer>(Arrays.asList(3,2,11,4,6,7));
		Set<Integer> s2=new LinkedHashSet<Integer>(Arrays.asList(1,2,8,4,9,7));
		Set<Integer> Setlist=new LinkedHashSet<Integer>();
		for(Integer i:s1) {
			for(Integer j:s2) {
				if(i==j) {
					Setlist.add(i);
				}
			}
			
		}
		System.out.println(Setlist);
		
	}

}
