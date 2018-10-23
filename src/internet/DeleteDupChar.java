package internet;
import java.util.ArrayList;
public class DeleteDupChar {
	static String Delete(String str) {
		int length = str.length();
		ArrayList<Character> arrl = new ArrayList<Character>(length);
		for(char ch : str.toCharArray()) {
			arrl.add(ch);
		}
		for(int i = 0; i<arrl.size()-1;i++) {
			if(arrl.get(i).equals(arrl.get(i+1))) {
				arrl.remove(i);
				arrl.remove(i);
					i=0;
			}
		}
		StringBuilder bd = new StringBuilder();
		for(char ch : arrl) {
			bd.append(ch);
		}
		return bd.toString();
	}
	
	public static void main(String[] args) {
		String str = "ABDDBCRRTYUBBUI";//CRRTYUBBUI
		System.out.println(str);
		System.out.println(Delete(str));
	}
}
