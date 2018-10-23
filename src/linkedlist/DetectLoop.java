package linkedlist;

import java.util.HashSet;

public class DetectLoop {
	static MyLinkedList findLoopingNode(MyLinkedList l) {
		MyLinkedList n = l.head;
		HashSet<MyLinkedList> hs = new HashSet<MyLinkedList>(l.size);
		while(!hs.contains(n)&&n!=null) {
			hs.add(n);
			n = n.next;
		}
		return n;
	}
	
	static void Detect(MyLinkedList l) {
		MyLinkedList fnode = l.head;
		MyLinkedList snode = l.head;
		while(fnode!=null) {
			
		}
	}
	public static void main(String[] args) {
		MyLinkedList l = new MyLinkedList();
		MyLinkedList n;
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		l.insert(6);
		l.insert(7);
		l.insert(8);
		l.show();
		n = l.head;
		while(n.next!=null) {
			n = n.next;
		}
		n.next = l.head.next.next;
//		l.show();
		System.out.println(findLoopingNode(l).data);
	}
}
