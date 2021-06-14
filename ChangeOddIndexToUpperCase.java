package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String input = "changeme";
		char[] arr = input.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			
			if (i%2!=0) {
				System.out.print(arr[i]);
								
			}else {
				System.out.print(Character.toUpperCase(arr[i]));				  
			}
				
			}
		}

	}


