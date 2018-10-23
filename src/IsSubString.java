import java.util.ArrayList;

//"waterbottle" is a rotation of"erbottlewat")
public class IsSubString {
	static boolean IsItSubString(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		ArrayList<Character> arrl = new ArrayList<Character>(s1.length());
		ArrayList<Character> arrl2 = new ArrayList<Character>(s1.length());
		for(char ch : s1.toCharArray()) {
			arrl.add(ch);
		}
		
		for(char ch : s2.toCharArray()) {
			arrl2.add(ch);
		}
		for(int i = 0; i<s1.length();i++) {
			char ch = arrl.get(s1.length()-1);
			arrl.remove(s1.length()-1);
			arrl.add(0, ch);
			if(arrl.equals(arrl2)) {		// .equals() is important, can't use == operator due to Integer.valueOf() caching			
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		System.out.println(IsItSubString(s1,s2));
	}
}
