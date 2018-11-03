package TreeandGraphs;

/*
 * Validate BST: Implement a function to check if a binary tree is a binary search tree. 
 * */

public class ValidateBST {
	
	static boolean validate(BST.Node root) {
		if(root.rchild!=null && root.lchild!=null) {
			if(root.rchild.data>root.data && root.lchild.data<=root.data) {
				validate(root.lchild);
				validate(root.rchild);
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		BST t = new BST();
		t.RandomTree(40, 40);
		System.out.println(validate(t.getRoot()));
	}

}
