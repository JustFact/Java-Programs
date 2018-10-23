package linkedlist;

import java.util.ArrayList;
import java.util.Scanner;

//1->1->3->8->6->5->7->2->5
//1->1->3->8->6->5->7->2->5			5 2 5
//1->1->3->5->6->8->7->2->5
//1->1->3->5->2->5->6->8->7
//1->1->3->2->5->5->7->8->6

public class Partition {
	static MyLinkedList MakePartition(MyLinkedList l, int i) {
		MyLinkedList n = l.head;
		ArrayList<Integer> small_values = new ArrayList<Integer>();
		ArrayList<Integer> large_values = new ArrayList<Integer>();
		int value = i;
		while(n!=null) {
			if(n.data>=value) {
				large_values.add(n.data);
			}else {
				small_values.add(n.data);
			}
			n = n.next;
		}
		n = l.head;
		while(!small_values.isEmpty()) {
			n.data = small_values.get(0);
			small_values.remove(0);
			n = n.next;
//			l.show();
		}
		while(!large_values.isEmpty()) {
			n.data = large_values.get(0);
			large_values.remove(0);
			n = n.next;
//			l.show();
		}
		return l;
	}
	
	public static void main(String[] args) {
		MyLinkedList l = new MyLinkedList();
		l = l.RandomList(50, 20);
		l.show();
		Scanner GD = new Scanner(System.in);
		l = MakePartition(l,GD.nextInt());
		GD.close();
		l.show();
	}
}
