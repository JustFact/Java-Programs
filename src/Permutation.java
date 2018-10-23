public class Permutation {
	boolean CheckP(String s1, String s2) {
		
		int length = s1.length();
		if(s1.length() == s2.length()) {
			boolean[] check = new boolean[128];
			for(int i = 0; i<length; i++) {
				int v = s1.charAt(i);
				check[v] = true;
			}
			for(int i = 0; i<length; i++) {
				int v = s2.charAt(i);
				if(!check[v]) {
					return false;
				}
			}
		}else {
			return false;
		}
		return true;
	}
	
	public static void main(String args[]) {
		Permutation p  = new Permutation();
		System.out.println(p.CheckP("jaspreet", "reetjasp"));
	}
	
}
