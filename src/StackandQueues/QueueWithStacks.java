package StackandQueues;

public class QueueWithStacks extends MyStackBACKUP {
	static class MyQueue{
		protected MyStackBACKUP s1 = new MyStackBACKUP();
		protected MyStackBACKUP s2 = new MyStackBACKUP();
		
		void push(int value) {
			s1.push(value);
		}
		int pop() {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			int value = s2.pop();
			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
			return value;
		}	
	}
	
	public static void main(String[] args) {
		MyQueue q1 = new MyQueue();
		q1.push(1);
		q1.push(2);
		q1.push(3);
		System.out.println(q1.pop());
		q1.push(4);
		System.out.println(q1.pop());
	}
}
