package BitManipulation;

/*
 * Insertion: You are given two 32-bit numbers, N  and M,  and two bit positions,
 * i  and j. Write a  method to  insert M  into N  such that M  starts at  bit  j
 * and ends at  bit  i.
 * EXAMPLE 	Input: N 10000000000, M = 10011, i = 2, j = 6 
 * 			Output: N  =  10001001100
 * */

public class Insertion {
	
	static int insertBit(int N, int M, int i, int j) {
		int left = N & (-1<<j+1);
		int right = N & ((1<<i) - 1);
		N = left | right;
		System.out.println(Integer.toBinaryString(N));
		System.out.println(Integer.toBinaryString(M));
		M = M<<i;
		return N | M;
	}
	
	public static void main(String args[]){
		System.out.println(Integer.toBinaryString(insertBit(-1,10,3,6)));
	}
}
