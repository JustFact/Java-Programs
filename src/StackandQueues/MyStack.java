package StackandQueues;

import java.util.EmptyStackException;
import java.util.Random;

public class MyStack {
//	static class MyStack{
		public int data;
		public MyStack next;
		private MyStack temp;
		private MyStack temp2;
		public MyStack(int value){
			this.data = value;
		}
	public MyStack() {}
	//	}
	public MyStack top;
	
	public void push(int value) {
		MyStack node = new MyStack(value);
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
	
	public boolean isEmpty() {
		return top==null;
	}
	
	public int peekNext() {
		if(temp==null) {
//			System.out.println("Traversing from top");
			temp = top;
		}
		int value = temp.data;
		temp = temp.next;
		return value;
	}
	
	public MyStack peekNextNode() {
		if(temp2 == null) {
//			System.out.println("Traversing from top");
			temp2 = top;
		}
		MyStack t = temp2;
		temp2 = temp2.next;
		return t;
	}
	
	public int peek() {
		if(top==null) {
			throw new EmptyStackException();
		}
		
		return top.data;
	}
	
	public MyStack RandomStack(int size, int range) {
		MyStack random_stack = new MyStack();
		Random r = new Random();
		int a;
		while(size>0) {
			a = r.nextInt(range);
			random_stack.push(a);
			size--;
		}
		return random_stack;
	}

}
