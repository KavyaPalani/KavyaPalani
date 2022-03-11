package week3.Day1.Assignment;

public class StringEvenreverse {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] sub = test.split(" ");
		String revString = "";
		
		
		for(int i=0;i<sub.length;i++) {
			String word = sub[i];
			   String reverseWord = "";
		
				for(int j=word.length()-1;j>=0;j--) {
					reverseWord = reverseWord + word.charAt(j);
					}
				 revString = revString + reverseWord + " ";
				}
		  System.out.println(revString);
		
			
	

}
}