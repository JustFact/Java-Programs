package linkedlist;

import java.util.HashSet;


public class DeleteDups {
	
	static MyLinkedList DeleteDuplicates(MyLinkedList l) {
		MyLinkedList temp = l.head;
		int s = l.size;
		MyLinkedList nl = new MyLinkedList();
		HashSet<Integer> hs = new HashSet<Integer>(s);
		while(temp!=null) {
			hs.add(temp.data);
			temp = temp.next;
		}
		for(int i : hs) {
			nl.insert(i);
		}
		return nl;
	}
	
	static void DeleteDuplicate(MyLinkedList l) {
		MyLinkedList current_node,traversing_node,temp_previous_node;
		current_node = l.head;
		traversing_node = l.head;
		temp_previous_node = l.head;
		
		while(current_node!=null) {
			traversing_node = current_node.next;
			temp_previous_node = current_node;
			
			while(traversing_node!=null) {
				if(traversing_node.data == current_node.data) {
					temp_previous_node.next = traversing_node.next;
					traversing_node = temp_previous_node.next;
//					l.show();
					continue;
				}
				
				traversing_node = traversing_node.next;
				temp_previous_node = temp_previous_node.next;
			}
			
			current_node = current_node.next;
		}
	}
	
	public static void main(String[] args) {
		MyLinkedList l = new MyLinkedList();
		double initial_time,final_time;
		int set=50,range=100;
		//Time Complexity: O(n), Space Complexity: O(n), Not Stable
		l = l.RandomList(set,range);
		l.show();
		initial_time = System.currentTimeMillis();
		l = DeleteDuplicates(l);
		final_time = System.currentTimeMillis();
		l.show();
		System.out.println("Time: "+(final_time-initial_time));
		
		System.out.println("============");
		
		//Time Complexity: O(n^2), Space Complexity: O(3), Stable
		l = l.RandomList(set,range);
		l.show();
		initial_time = System.currentTimeMillis();
		DeleteDuplicate(l);
		final_time = System.currentTimeMillis();
		l.show();
		
		System.out.println("Time: "+(final_time-initial_time));
	}
}
