package BitManipulation;

public class A {
	
		//Get bit at n'th position
		static boolean getBit(int num, int pos) {
			return ((num & (1<<pos)) != 0) ;
		}
		
		//Set bit at n'th position
		static int setBit(int num, int pos) {
			return num | (1<<pos);
		}
		
		//clear bit at n'th position
		static int clearBit(int num, int pos) {
			int mask = ~(1<<pos);
			return num & mask;
		}
		
		//clear bits from most significant bit to i'th bit
		static int clearMSBtoI(int num, int pos) {
			int mask = (1<<pos) - 1;
			return num & mask;
		}
		
		//TODO write addZero function
		//adding n zeros to a number
		static int addZero(int num, int n) {
			
			return 0;
		}
		
		public static void main(String args[]){
			int a = 9999;
			int b = 9;
			System.out.println(Integer.toBinaryString(a));
//			System.out.println(Integer.toBinaryString(b));
//			System.out.println(Integer.toBinaryString(1<<b));
			System.out.println(Integer.toBinaryString(clearMSBtoI(a,b)));
			
		}
}
