package week3.Day1.Assignment;

public class StringTwords {

	public static void main(String[] args) {
		String text=new String("Testleaf is located in Teynampet and above a taccobell");
		String replace = text.replace("T", "t");
		System.out.println(replace);
		//int length = replace.length();
		//System.out.println(length);
		String[] split = replace.split(" ");
		for(int i=0;i<=replace.length();i++) {
			if(split[i].startsWith("t")) {
				System.out.println(split[i]);
			}
				
		}
		}

}
