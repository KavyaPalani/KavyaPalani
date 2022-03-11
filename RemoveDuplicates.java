package week3.day3.Assignment;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		List<String>strList=new ArrayList<String>();
		String[] str = text.split(" ");
		for(int k=0;k<str.length;k++) {
			strList.add(str[k]);
		}
		for(int i=0;i<strList.size()-1;i++) {
			for(int j=0;j<strList.size();j++) {
				if(strList.get(i).equalsIgnoreCase(strList.get(j))) {
					count++;
					if(count>0) {
						strList.remove(" ");
					}
				}
			}
		}
		System.out.println(strList);
	}
}
