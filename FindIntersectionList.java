package week3.day3.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionList {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		List<Integer> l2=new ArrayList<Integer>(Arrays.asList(1,2,8,4,9,7));
		List<Integer> intersecList=new ArrayList<Integer>();
		for(int i=0;i<l1.size();i++) {
			for(int j=0;j<=l2.size();j++) {
				if(l1.get(i).equals(l2.get(j))) {
					intersecList.add(l1.get(i));
				}
			}
		}
		System.out.println(intersecList);
		
	}

}
