package linkedlist;

import java.util.Scanner;

public class Intersection {
	static boolean checkIntersection(MyLinkedList l, MyLinkedList l2) {
		MyLinkedList n = l.head;
		MyLinkedList n2 = l2.head;
		boolean check = false;
		while(n.next!=null) {
			n = n.next;
		}
		while(n2.next!=null) {
			n2 = n2.next;
		}
		if(n.hashCode()==n2.hashCode()) {
//			System.out.println(n.data+" | "+n2.data);
			check = true;
		}
		return check;
	}
	
	static MyLinkedList GetIntersectingNode(MyLinkedList l, MyLinkedList l2) {
		MyLinkedList n;
		MyLinkedList n2;
		MyLinkedList intersecting_node = null;
		int size_difference = Math.abs(l.size - l2.size);
		if(l.size>l2.size) {
			n = l.head;
			n2 = l2.head;
		}else{
			n = l2.head;
			n2 = l.head;
		}
		while(size_difference>0) {
			n = n.next;
			size_difference--;
		}
		while(n2!=null) {
			if(n2.hashCode()==n.hashCode()) {
				intersecting_node = n2;
				break;
			}else{
				n = n.next;
				n2 = n2.next;
			}
		}
		return intersecting_node;
	}
	
	public static void main(String[] args) {
		MyLinkedList l = new MyLinkedList();
		MyLinkedList l2 = new MyLinkedList();
		MyLinkedList l3 = new MyLinkedList();
		MyLinkedList n,temp;
		l = l.RandomList(3, 9);
		l2 = l2.RandomList(4, 9);
		l3 = l3.RandomList(3, 9);
		n = l.head;
		while(n.next!=null) {
			n = n.next;
		}
		n.next = l3.head;
//		l.show();
//		l.showAddress();
		n = l2.head;
		while(n.next!=null) {
			n = n.next;
		}
		n.next = l3.head;
//		System.out.println("Enter new values for intersecting nodes");
//		Scanner GD = new Scanner(System.in);
//		while(temp!=null) {
//			temp.data = GD.nextInt();
//			temp = temp.next;
//		}
//		n.next = l3.head;
		
		System.out.println();
		l.show();
		l2.show();
//		l2.showAddress();
//		System.out.println(l.size+" PPP "+l2.size);
		System.out.println(checkIntersection(l, l2));
		System.out.println(GetIntersectingNode(l,l2));
	}
}
