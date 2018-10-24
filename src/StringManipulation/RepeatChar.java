package StringManipulation;

public class RepeatChar {
	boolean CheckString(String sentence) {
		int length = sentence.length();
		boolean[] check = new boolean[128];
		if(sentence.length() > 128) {
			return false;
		}
		else{
		for(int i = 0; i<length; i++) {
			int v = sentence.charAt(i);
			if(check[v]) {
				return false;
			}else {
			check[v] = true;
			}
		}
		}
		return true;
	}
	public static void main(String args[]) {
		String a = "abcdefghijklmnopqrstuvwxyz";
		RepeatChar t = new RepeatChar();
		System.out.println(t.CheckString(a));
	}
}
