public class wordCompression {
	static String compress(String sentence) {
		StringBuilder s = new StringBuilder();
		int count=0;
		for(int i = 0;i<sentence.length();i++) {
			if((i+1)==sentence.length()) {
				s.append(sentence.charAt(i));
				s.append(++count);
				count = 0;
			}else if(sentence.charAt(i)!=sentence.charAt(i+1)) {
				s.append(sentence.charAt(i));
				s.append(++count);
				count = 0;
			}else {
				count++;
			}
		}
		return s.toString().length()<sentence.length()?s.toString():sentence;
	}
	public static void main(String[] args) {
		System.out.println(compress("abcd"));
	}
}