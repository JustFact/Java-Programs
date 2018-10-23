package StackandQueues;

public class TestingPurpose {
	
	static void A(int arr[]) {
		arr[0] = 0;
	}
	
	static void B(int arr[]) {
		arr[3] = 0;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		
		A(arr);
		B(arr);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
