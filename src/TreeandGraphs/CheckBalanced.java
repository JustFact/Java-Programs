package TreeandGraphs;

import java.util.ArrayList;

/*Check Balanced: Implement a function to check if a binary tree is balanced. For the purposes of this question, 
a balanced tree is defined to be a tree such that the heights of the two subtrees of any node never differ by more 
than one. */

public class CheckBalanced {
	
	static void getHeight(BST.Node root, ArrayList<Integer> arrl, int index) {
		if(root!=null) {
			arrl.add(index, 1);
			getHeight(root.lchild,arrl,index++);
			getHeight(root.rchild,arrl,index++);
		}
	}
	
	static int getHeight(BST.Node root) {
		ArrayList<Integer> arrl = new ArrayList<Integer>();
		int index = 0;
		getHeight(root, arrl, index);
		return arrl.size();
	}
	
	static boolean checkBalance(BST.Node root) {
		int left_height = 0,right_height=0, balancing_factor=0;
		
		if(root.lchild!=null) {
			left_height = getHeight(root.lchild);
		}
		
		if(root.rchild!=null) {
			right_height = getHeight(root.rchild);
		}
		
		balancing_factor = left_height - right_height;
		
		if((balancing_factor<-1||balancing_factor>1)) {
			return false;
		}else if(root.lchild!=null||root.rchild!=null) {
			
			if(root.lchild!=null) {
				checkBalance(root.lchild);
			}
			
			if(root.rchild != null) {
				checkBalance(root.rchild);
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		BST tree; 
		int arr[] = {9,8,7};
		tree = MinimalTree.createBST(arr);		//A balanced Tree
		tree.randomBST(3, 20);					//A Random Tree (May or may not be balanced)
		
		System.out.println("In Order Traversal:");
		tree.inOrderTraverse(tree.getRoot());
		
		System.out.println("\nPre Order Traversal:");
		tree.preOrderTraverse(tree.getRoot());
		
		System.out.println("\nIs the Tree balanced?\n"+checkBalance(tree.getRoot()));
	}

}
