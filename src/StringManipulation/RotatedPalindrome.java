package StringManipulation;
/*
 * Check if the given string is rotated palindrome or not
 * CBAABCD is rotated palindrome of ABCDCBA
 * */

public class RotatedPalindrome {
	
	static String rotate(String str) {
		return (new StringBuffer(str).reverse()).toString();
	}
	
	static boolean isRotatedPalindrome(String str) {
		int len = str.length();
		String str2 = str+str;
		
		for(int i = 0; i<str2.length()-len+1;i++) {
			if(str2.substring(i, i+len).equals(rotate(str2.substring(i, i+len)))) {
				return true;
			}
		}
		
		return false;
	}
	public static void main(String args[]) {
		String str = "CBAABCD";
		System.out.println(isRotatedPalindrome(str));
		
	}
}
