package StackandQueues;

import java.util.EmptyStackException;

public class MyStackBACKUP {
	static class StackNode{
		public int data;
		public StackNode next;
		public StackNode(int value){
			this.data = value;
		}
	}
	public StackNode top;
	
	public void push(int value) {
		StackNode node = new StackNode(value);
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
	
	public int peek() {
		if(top==null) {
			throw new EmptyStackException();
		}
		return top.data;
	}

}
