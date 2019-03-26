package StringManipulation;

import java.util.ArrayList;

/*
 * Your input is a compressed string of the format number[string] and the decompressed output form should 
 * be the string written number times. For example:
 * 
 * The input
 * 3[abc]4[ab]c
 * 
 * Would be output as
 * abcabcabcababababc
 * 
 * One repetition can occur inside another. For example, 2[3[a]b] decompresses into aaabaaab
 * */

public class StringDecompress {
	
	static void decompress(String s, int start, int times) {
		
	}
	
	static void decompress(String s) {
		decompress(s,0,1);					//Encapsulate within '1[' and ']'
	}

	public static void main(String[] args) {
		String str = "3[abc]4[ab]c";
		
		decompress(str);
	}

}
