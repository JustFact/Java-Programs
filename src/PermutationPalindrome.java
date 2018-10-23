
public class PermutationPalindrome {
		static boolean checkPP(String sentence) {
			int length = sentence.length();
			int check[] = new int[128];
			int checkOnes=0;
			
			for(int i = 0; i<length; i++) {
				if(sentence.toLowerCase().charAt(i)!=' ') {
					check[sentence.toLowerCase().charAt(i)]++;
				}
			}
			
			for(int i = 0; i<length;i++) {
				if(check[sentence.toLowerCase().charAt(i)]%2!=0) {
					if(checkOnes!=1) {
						checkOnes = 1;
					}else {
						return false;
					}
				}
			}
			return true;
		}
		
	public static void main(String[] args) {
		String a[] = {"taco cat","cato tac", "kitkat","12321","cbaabcd","wwo","Nitin","mobile","ccccccccvvvvbbnn","Ratzs live on no evil starz"};
		for(String b : a) {
			System.out.println(checkPP(b)+":\t "+b);	
		}
	}
}
