package StringManipulation;
import java.util.*;

public class URLify {
	//My Name is Jas
	
	
	static String makeURL(String sentence, int len) {
		ArrayList<Character> arrl = new ArrayList<Character>(len);
		char[] arr = sentence.toCharArray();
		for(char a : arr) {
			arrl.add(a);
		}
		
		for(int i = 0;i<len;i++) {
			if(arrl.get(i).equals(' ')) {
				arrl.remove(i);
				arrl.add(i,'%');
				arrl.add(i+1,'2');
				arrl.add(i+2,'0');
			}
		}
		StringBuilder build = new StringBuilder(arrl.size());
		for(char ch : arrl) {
			build.append(ch);
		}
		return build.toString();
	}

	public static void main(String[] args) {
		System.out.println(makeURL("My name is jas            ", 15));
	}

}
