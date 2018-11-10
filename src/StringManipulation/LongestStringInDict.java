package StringManipulation;

/*
 * given the input of S = "abppplee" and D = {"able", "ale", "apple", "bale", "kangaroo"} 
 * the correct output would be "apple"
 * 
 * The words "able" and "ale" are both subsequences of S, but they are shorter than "apple".
 * 
 * The word "bale" is not a subsequence of S because even though S has all the right letters,
 * they are not in the right order.
 * 
 * The word "kangaroo" is the longest word in D, but it isn't a subsequence of S.
 * */

public class LongestStringInDict {
	
	static boolean isSubSequence(String str1, String str2) {
		int j = 0, len1 = str1.length(), len2 = str2.length();
		for(int i = 0; i<len1 && j<len2; i++) {
			if(str1.charAt(i)==str2.charAt(j)) {
				j++;
			}
		}
		return len2==j;
	}
	
	static String FindLongest(String input, String[] dict) {
		StringBuilder big_word = new StringBuilder("");
		for(String current_word : dict) {
			if(isSubSequence(input, current_word)) {
				if(current_word.length()>big_word.length()) {
					big_word.setLength(0);
					big_word.append(current_word);
				}
			}
		}
		return big_word.toString();
	}

	public static void main(String[] args) {
		String input = "abppplee";
		String Dict[] = {"able", "ale", "apple", "bale", "kangaroo"};
		System.out.println(FindLongest(input, Dict));
	}

}
