package linkedlist;

import java.util.Scanner;



public class KthToLast {
	static class Index{
		public int value=0;
	}
	static void FindLast(MyLinkedList l, int i) {
		MyLinkedList n = l.head;
		int s = l.size;
		s = (s-i);
		while(s>(0)) {
			n = n.next;
			s--;
		}
		System.out.println(n.data);
	}
	
	static int SecondLast(MyLinkedList l, int k) {
		if(l == null) {
			return 0;
		}
		int index = SecondLast(l.next, k) + 1;
		if(index == k) {
			System.out.println(l.data);
		}
		return index;
	}
	
	static MyLinkedList MyLast(MyLinkedList l, int n) {
		MyLinkedList p1 = l.head;
		MyLinkedList p2 = l.head;
		int s = n;
		while(s>0) {
			p2 = p2.next;
			s--;
		}
		while(p2!=null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}
	
	static MyLinkedList kthToLast(MyLinkedList l, int k) {
		Index idx = new Index();
		return kthToLast(l,k,idx);
	}
	static MyLinkedList kthToLast(MyLinkedList l,int k, Index idx) {
		if(l == null) {
			return null;
		}
		MyLinkedList n = kthToLast(l.next,k,idx);
		idx.value = idx.value +1;
		return n;
	}
	
	public static void main(String[] args) {
		MyLinkedList l = new MyLinkedList();
		l = l.RandomList(9, 200);
		l.show();
		Scanner GD = new Scanner(System.in);
//		FindLast(l,GD.nextInt());
//		SecondLast(l,GD.nextInt());
		System.out.println(MyLast(l,GD.nextInt()).data);
		
	}
}
