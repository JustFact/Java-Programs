package StackandQueues;
import java.util.EmptyStackException;

public class SortStack extends MyStack{
	
	static MyStack getLargestNode(MyStack s1) {
		MyStack largest = s1.top;
		MyStack temp = s1.top;
		boolean isNotEmpty = true ;
		while(isNotEmpty) {
			if(temp==null) {
				isNotEmpty = false;
			}else {
				temp = temp.next;
			}
			MyStack temp_node = s1.peekNextNode();
			if(largest.data<temp_node.data) {
				largest = temp_node;
			}
		}
		return largest;
	}
	
	static void removeNode(MyStack s1, int value) {
		MyStack current_node = s1.top;
		MyStack previous_node = null;
		while(current_node!=null) {
			if(current_node.data == value&&previous_node!=null) {
				previous_node.next = current_node.next;
				break;
			}else if(current_node.data == value&&previous_node==null){
				s1.top = current_node.next;
				break;
			}else {
			
				previous_node = current_node;
				current_node = current_node.next;
			}
		}
	}
	
	static MyStack sortStack(MyStack s1) {
		System.out.println(s1.hashCode());
		MyStack temp_stack = new MyStack();
		int value;
		while(!s1.isEmpty()) {
			value = getLargestNode(s1).data;
			temp_stack.push(value);
			removeNode(s1,value);
		}
		s1 = temp_stack;
		return s1;
	}
	
	public static void main(String[] args) {
		MyStack s1 = new MyStack();
		s1 = s1.RandomStack(15000, 500);
		double final_time;
		double initial_time;
		initial_time = System.currentTimeMillis();
		System.out.println(s1.hashCode());
		s1 = sortStack(s1);
		final_time = System.currentTimeMillis();
		while(!s1.isEmpty()) {
//			System.out.println(s1.pop());
			s1.pop();
		}
		System.out.println("Time: "+(final_time-initial_time));
	}

}
