package week3.Day1.Assignment;

public class StringFindTypes {

	public static void main(String[] args) {
		String test="$$ Welcome to 2nd Class of Automation $$";
		int letter = 0,space =0,num =0,specialChar =0;
		char[] ca = test.toCharArray();
		for(char c1:ca) {
			if((c1>='a')&&(c1<='z')||(c1>='A')&&(c1<='Z')) {
				letter++;
			}
			else if((c1>='0')&&(c1<='9')) {
				num++;
			}
			else if(c1==' ') {
				space++;
			}
			else {
				specialChar++;
			}
			
		}
		System.out.println("letter : " +letter);
		System.out.println("space : " +space);
		System.out.println("num : " +num);
		System.out.println("specialChar : " +specialChar);

	}
}
