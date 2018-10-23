package internet;

import java.util.ArrayList;

/*
 * String  = "ABCABCABCXABCABC" //ABCABCXABC
 * Pattern = "ABC"
 * Character = "#"
 * 
 * Output = ###X##
 * 
 * */

public class ReplaceOverlap {
	static String SolOne(String str, String p, char ch) {
		int Slength = str.length();
		int Plength = p.length();
		ArrayList<Character> arrl = new ArrayList<Character>(str.length());
		ArrayList<Character> arrl1 = new ArrayList<Character>(p.length());
		
		return "";
	}
	
	public static void main(String[] args) {
		String str = "ABC";
		String pattern = "ABC";
		char ch = '%';
		System.out.println(SolOne(str,pattern,ch));
	}
}
