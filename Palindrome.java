package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		String inp = "Madam";
		
		String inp1 = "";
		
		System.out.println("The First Strig is :"+inp);
		
		for (int i = inp.length()-1; i >=0; i--) {
		
			inp1=inp1+inp.charAt(i);
		
		}
		
		System.out.println("The Reverse String is :"+inp1);
		
		if(inp.equalsIgnoreCase(inp1)) {
		
			System.out.println("The given String is Palindrome");
			
		}else {
		
			System.out.println("The given String is not Palindrome");
			
		}
		
	}

}
