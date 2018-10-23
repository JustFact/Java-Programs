package StackandQueues;

import java.util.EmptyStackException;

public class MyStringStack {
		String pet;
		MyStringStack top;
		MyStringStack next;
		MyStringStack(String pet){
			this.pet = pet;
		}
		MyStringStack(){}
		
		boolean isEmpty() {
			return top == null;
		}
		
		static void removeNode(MyStringStack s1, String value) {
			MyStringStack current_node = s1.top;
			MyStringStack previous_node = null;
			while(current_node!=null) {
				if(current_node.pet.equals(value)&&previous_node!=null) {
					previous_node.next = current_node.next;
					break;
				}else if(current_node.pet.equals(value)&&previous_node==null){
					s1.top = current_node.next;
					break;
				}else {
				
					previous_node = current_node;
					current_node = current_node.next;
				}
			}
		}
		
		void enqueue(String pet) {
			MyStringStack node = new MyStringStack(pet);
			node.next = top;
			top = node;
		}
		
		 String dequeue() {
			if(top==null) throw new EmptyStackException();
			String value = top.pet;
			top.pet = "";
			top = top.next;
			return value;
		}
		String peek() {
			return top.pet;
		}
		
		static String dequeueAny(MyStringStack s1) {
			MyStringStack temp = new MyStringStack();
			while(!s1.isEmpty()) {
				temp.enqueue(s1.dequeue());
			}
			String value = temp.dequeue();
			while(!temp.isEmpty()) {
				s1.enqueue(temp.dequeue());
			}
			return value;
		}
		
		static MyStringStack dequeueCat(MyStringStack s1) {
			MyStringStack temp = new MyStringStack();
			MyStringStack pet=null,temp_previous_node=null;
			MyStringStack temp_top = temp, temp_ptr;
			
			while(!s1.isEmpty()) {
				temp.enqueue(s1.dequeue());
			}
			
			temp_ptr = temp_top.top;
			
			while(!temp_top.isEmpty()) {
				if(temp_ptr.pet.equals("cat")) {
					pet = temp_ptr;
					removeNode(temp_top,"cat");
					break;
				}
				temp_previous_node = temp_ptr;
				temp_ptr = temp_ptr.next;
				temp_top = temp_top.next;
			}
			
			while(!temp.isEmpty()) {
				s1.enqueue(temp.dequeue());
			}
			return pet;
		}
		
}
