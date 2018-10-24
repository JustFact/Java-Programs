package StringManipulation;

/*
pale, ple -> true
pales, pale -> true
pale, bale -> true
pale, bake -> false
*/

public class OneAway {
	static boolean checkMistake(String s1, String s2) {
		int sum=0;
		String sentence1,sentence2;
		if(s1.length()>=s2.length()) {
			sentence1 = s1;
			sentence2 = s2;
		}else {
			sentence1 = s2;
			sentence2 = s1;
		}
		int check[] = new int[128];
		for(int i = 0; i<sentence1.length(); i++) {
			check[sentence1.toLowerCase().charAt(i)]++;
		}
		
		for(int i = 0; i<sentence2.length(); i++) {
			sum += check[sentence2.toLowerCase().charAt(i)];
		}
		
		if(Math.abs(sentence1.length()-sum)>1) {
			return false;
		}else {
		return true;
		}
	}
	public static void main(String[] args) {
		String a[][] = {{"pale","bake"},{"pale","ple"},{"pales","pale"},{"pale","bale"},{"thjno","thank"},{"LOm","MoN"},{"jug","guj"}};
		for(String s[] : a) {
			System.out.println(s[0]+" -> "+s[1]+" \t: "+checkMistake(s[0],s[1]));
		}
	}
}
