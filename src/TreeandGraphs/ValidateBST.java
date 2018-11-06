package TreeandGraphs;

/*
 * Validate BST: Implement a function to check if a binary tree is a binary search tree. 
 * [NOTE : Root and the right nodes can have duplicate values, i.e. root.data can be equal to root.right.data]
 * */

public class ValidateBST {
	
	static boolean compareLeft(BST.Node root, int data) {
		if(root.data<data) {
			return true&&validate(root);
		}else {
		return false;
		}
	}
	
	static boolean compareRight(BST.Node root, int data) {
		if(root.data>=data) {
			return true&&validate(root);
		}else {
		return true;
		}
	}
	
	static boolean validate(BST.Node root) {
		boolean left = true;
		boolean right = true;
		if(root.lchild!=null) {
			left = compareLeft(root.lchild, root.data);
//			System.out.println("Left returns: "+left);
		}
		if(root.rchild!=null) {
			right = compareRight(root.rchild, root.data);
//			System.out.println("Right returns: "+right);
		}
		return left&&right;
	}

	public static void main(String[] args) {
		BST t = new BST();
		t.randomTree(5, 40);		//May or may not be a BST
//		t.randomBST(5, 40);			// Always a BST
		System.out.println("preorder");
		t.preOrderTraverse(t.getRoot());
		System.out.println("\ninorder");
		t.inOrderTraverse(t.getRoot());
		System.out.println("Is it BST? : "+validate(t.getRoot()));
	}

}
