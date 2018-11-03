package TreeandGraphs;

import java.util.Random;

/*Implementation of Binary Search Tree*/

public class BST {
	
	static class Node{
//		String name;
		int data;
		int height;
		Node lchild;
		Node rchild;
		
		Node(int data, String name){
			this.data = data;
//			this.name = name;
			lchild = null;
			rchild = null;
		}
		
		public String toString() {
//			return name+" "+data;
			return ""+data;
		}
	}
	
	private Node root;
	
	void addNode(int value, String name) {
		Node node  = new Node(value, name);
		if(root==null) {
			root = node;
		}else {
			
			Node focus = root;
			
			Node parent;
			
			while(true) {
				parent  = focus;
				
				if(value < focus.data) {
					focus = focus.lchild;
					
					if(focus==null) {
						parent.lchild = node;
						return;
					}	
				}else {
					focus = focus.rchild;
					if(focus==null) {
						parent.rchild = node;
						return;
					}
				}
			}
		}
	}
	
	public void inOrderTraverse(Node focus) {
		if(focus != null) {
//			System.out.print("Left: ");
			inOrderTraverse(focus.lchild);
//			System.out.print("Root: ");
			System.out.println(focus.toString());
//			System.out.print("Right: ");
			inOrderTraverse(focus.rchild);
		}
	}
	
	public void preOrderTraverse(Node focus) {
		if(focus != null) {
			System.out.println(focus.toString());
			preOrderTraverse(focus.lchild);
			preOrderTraverse(focus.rchild);
		}
	}
	
	public void postOrderTraverse(Node focus) {
		if(focus != null) {
			postOrderTraverse(focus.lchild);
			postOrderTraverse(focus.rchild);
			System.out.println(focus.toString());
		}
	}
	
	public Node findNode(int key) {
		Node focus = root;
		while(focus.data != key) {
			if(key<focus.data) {
				focus = focus.lchild;
			}else {
				focus = focus.rchild;
			}
			if(focus == null) {
				return null;
			}
		}
		return focus;
	}
	
	public Node getRoot() {
		return root;
	}
	
	public void RandomTree(int nodes, int range) {
		while(nodes>0) {
			Random r = new Random();
			this.addNode(r.nextInt(range),"");
			nodes--;
		}
	}
	
}
