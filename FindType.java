package week1.day2;

public class FindType {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter=0;
		int num=0;
		int space=0;
		int specialChar=0;
		char[] array = test.toCharArray();
		for (int i = 0; i < array.length; i++) {
			{
				if(Character.isDigit(array[i])) {
					num=num+1;
					continue;
				}
				if(Character.isLetter(array[i])) {
					letter=letter+1;
					continue;
				}
				if(Character.isSpace(array[i])) {
					space=space+1;
					continue;
				}
				else {
					specialChar=specialChar+1;
				
					
				}
				
			
		}
			
	} 
	System.out.println("Number :"+num);
	System.out.println("letter :"+letter);
	System.out.println("Space Bar :"+space);
	System.out.println("Special Character :"+specialChar);



}
}