package internet;
import java.util.ArrayList;

/*
 * {}{{}}{{{}}{
 * {{{{}}{{
 * 
 * */

public class BracketInversion {
	static String correct(String str) {
		if(str.length()%2!=0) {
			return "String is not valid";
		}
		ArrayList<Character> arrl = new ArrayList<Character>(str.length());
		for(char ch : str.toCharArray()) {
			arrl.add(ch);
		}
		int fbrac=0;
		for(int i = 0; i<str.length();i++) {
			if(arrl.get(i).equals('{')) {
				fbrac++;
			}else if(arrl.get(i).equals('}')) {
				fbrac -= 1;
			}
		}
//		System.out.println((fbrac)/2);
		return ""+((fbrac)/2);
	}
	public static void main(String[] args) {
		String str = "{}{{}}{{{}}{";
		System.out.println(correct(str));
	}

}
