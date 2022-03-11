package week3.Day1.Assignment;

public class StringVowels {

	public static void main(String[] args) {
		String text=new String("Education");
		String lowerCase = text.toLowerCase();
		System.out.println(lowerCase);
		//char charAt = lowerCase.charAt(i);
		for(int j=0;j<=lowerCase.length();j++) {
			if(lowerCase.charAt(j) == 'a' 
			  ||lowerCase.charAt(j)=='e'
			  || lowerCase.charAt(j)=='i'
			  ||lowerCase.charAt(j)=='o'
			  || lowerCase.charAt(j)=='u')
				{
						System.out.println(""+lowerCase.charAt(j));
				}
		}
	}

}
