package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0;
		char[] array = str.toCharArray();
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length-1; j++) {
				if(array[i]==array[j]) {
					System.out.println(array[i]);
					count=count+1;
					break;
										
				}
				
			}
			
		} System.out.println(count);

	}

}
