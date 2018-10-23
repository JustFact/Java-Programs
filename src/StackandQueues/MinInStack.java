package StackandQueues;

import java.util.EmptyStackException;

public class MinInStack extends MyStack{
	static class NodeInStack{
		public int data;
		public int min;
		public NodeInStack next;
		public NodeInStack(int value){
			this.data = value;
		}
	}
	private static NodeInStack top = null;
	
	public void push(int value) {
		NodeInStack node = new NodeInStack(value);
		if(top!=null&&top.min < value) {
			node.min = top.min;
		}else {
			node.min = value;
		}
		node.next = top;
		top = node;
	}
	
	public int pop() {
		if(top==null) {
			throw new EmptyStackException();
		}
		int value = top.data;
		top.data = 0;
		top = top.next;
		return value;
	}
	
	public int getMin() {
		if(top!=null) {
		return top.min;
		}
		return 0;
	}
	public boolean isEmpty() {
		return top==null;
	}
	public int peek() {
		return top.data;
	}
	
	
	public static void main(String[] args) {
		MinInStack s1 = new MinInStack();
//		s1 = s1.RandomStack(5000, 500);
		s1.push(2);
		s1.push(3);
		s1.push(5);
		s1.push(4);
		s1.push(3);
		s1.push(20);
		double init = System.currentTimeMillis();
		System.out.println(s1.getMin());
		double finalt = System.currentTimeMillis();
		System.out.println(finalt-init);
//		while(!s1.isEmpty()) {
//			System.out.println(s1.getMin()+"<-Min | Top->"+s1.pop());
//		}
		
	}
}
