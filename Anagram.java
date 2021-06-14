package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	String text = "stops";
	String text1 = "pots";
	boolean flag = false;
	if(text.length()==text1.length()) {
	flag = true;
	System.out.println(flag);
	}else {
		System.out.println(flag);
	}
	char[] array = text.toCharArray();
	char[] array2 = text1.toCharArray();
	Arrays.sort(array);
	System.out.println(array);
	Arrays.sort(array2);
	System.out.println(array2);
	if(Arrays.equals(array, array2)) {
		flag = true;
		System.out.println(flag);
	}else {
		System.out.println(flag);
	}
	
		
	}
	
	
	}


