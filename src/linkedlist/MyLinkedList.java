package LinkedList;

import java.util.Random;

public class MyLinkedList {
	int data;
	MyLinkedList next;
	MyLinkedList head;
	int size=0;
	
	public void insert(int data) {
		MyLinkedList node = new MyLinkedList();
		node.data = data;
		node.next = null;
		
		if(head==null) {
			head = node;
			size++;
		}
		else {
			MyLinkedList temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = node;
			size++;
		}
	}
	
	public void show() {
		MyLinkedList temp = head;
		System.out.print("(head)");
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	public void showAddress() {
		MyLinkedList temp = head;
		System.out.print("(head)"+temp.hashCode()+"->");
		while(temp!=null) {
			try {
			System.out.print(temp.next.hashCode()+"->");
			}catch(Exception e) {
				
			}
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	public MyLinkedList RandomList(int n, int range) {
		MyLinkedList l = new MyLinkedList();
		Random r = new Random();
		while(n!=0) {
			l.insert(r.nextInt(range));
			n--;
		}
		return l;
	}
	
	public MyLinkedList NodeAt(int n) {
		MyLinkedList node=head;
		while(n>1) {
			node = node.next;
			n--;
		}
		return node;
	}

	
	int size() {
		return size;
	}
}
