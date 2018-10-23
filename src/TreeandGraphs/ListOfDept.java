package TreeandGraphs;

import java.util.ArrayList;
import linkedlist.MyLinkedList;

/*
List of Depths: Given a binary tree, design an algorithm which creates a linked list of all the nodes at each 
depth (e.g., if you have a tree with depth D, you'll have D linked lists).
*/

public class ListOfDept {
	
	static BST createBST(int arr[], int left, int right, BST t) {
		if(!(right<left)) {
		int mid = (left+right)/2;
		t.addNode(arr[mid], "name");
		createBST(arr, left, mid-1, t);
		createBST(arr, mid+1, right, t);
		return t;
		}else{
			return t;
		}
	}
	
	static BST createBST(int arr[]){
		BST t = new BST();
		int left = 0;
		int right = arr.length-1;
		return createBST(arr,left,right,t);
	}

	static void createList(BST.Node root) {
		
		ArrayList<BST.Node> arrl = new ArrayList<BST.Node>();
		ArrayList<BST.Node> temp_arrl = new ArrayList<BST.Node>();
		MyLinkedList l = new MyLinkedList();
		
		arrl.add(root);
		while(!arrl.isEmpty()) {
			BST.Node focus = arrl.get(0);
			//create list
			l.insert(focus.data);
			
			if(focus.lchild!=null) {
			temp_arrl.add(focus.lchild);
			}
			if(focus.rchild!=null) {
			temp_arrl.add(focus.rchild);
			}
			arrl.remove(0);
			if(arrl.isEmpty()) {
				arrl = temp_arrl;
				temp_arrl = new ArrayList<BST.Node>();
				l.show();
				l = new MyLinkedList();
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27};
		BST t = createBST(arr);
		double itime = System.currentTimeMillis();
		createList(t.getRoot());
		double ftime = System.currentTimeMillis();
		System.out.println("Time: "+(ftime-itime));

	}

}
