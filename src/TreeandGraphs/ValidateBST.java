package TreeandGraphs;

/*
 * Validate BST: Implement a function to check if a binary tree is a binary search tree. 
 * */

public class ValidateBST {
	
	static boolean validate(BST.Node root) {
		
		return true;
	}

	public static void main(String[] args) {
		BST t = new BST();
		t.randomTree(20, 40);
		System.out.println(validate(t.getRoot()));
	}

}
