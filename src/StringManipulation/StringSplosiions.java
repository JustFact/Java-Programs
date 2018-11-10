package StringManipulation;

/*
 * Given a non-empty string like "Code" return a string like "CCoCodCode".
 * 
 * stringSplosion("Code") -> "CCoCodCode"
 * stringSplosion("abc") -> "aababc"
 * stringSplosion("ab") -> "aab"
 * */

public class StringSplosiions {
	
	static String stringSplosion(String str) {
		  char ch[] = str.toCharArray();
		  StringBuilder temp = new StringBuilder("");
		  StringBuilder temp2 = new StringBuilder("");
		  for(char c : ch){
		    temp.append(c);
		    temp2.append(temp.toString());
		  }
		  return temp2.toString();
		}
	

	public static void main(String[] args) {
		System.out.println(stringSplosion("Code"));
	}

}
