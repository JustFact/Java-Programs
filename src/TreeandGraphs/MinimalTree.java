package TreeandGraphs;

/*Minimal Tree: Given a sorted (increasing order) array with unique integer elements, write an algorithm to create 
a binary search tree with minimal height. */

public class MinimalTree {
	
	static BST createBST(int arr[], int left, int right, BST t) {
		if(!(right<left)) {
		int mid = (left+right)/2;
		t.addNode(arr[mid], "Node: ");
		createBST(arr, left, mid-1, t);
		createBST(arr, mid+1, right, t);
		return t;
		}else {
			return t;
		}
	}
	
	public static BST createBST(int arr[]){
		BST t = new BST();
		int left = 0;
		int right = arr.length-1;
		return createBST(arr,left,right,t);
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		BST t = createBST(arr);
		t.inOrderTraverse(t.getRoot());
		System.out.println("done\n");
		t.preOrderTraverse(t.getRoot());
		System.out.println("done\n");
		t.postOrderTraverse(t.getRoot());
		System.out.println("done\n");
		
	}
}
