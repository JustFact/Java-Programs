package StackandQueues;

import java.util.ArrayList;
/*
 * NOT COMPLETED
 * */
public class StackOfPlate{
	static class StackNode{
		int data;
		StackNode next;
		StackNode(int value){
			this.data = value;
		}
	}
	
	static ArrayList<StackNode> top = new ArrayList<StackNode>();
	static ArrayList<Integer> size = new ArrayList<Integer>();
	static int capacity = 5;
	
	public static int getLastIndex() {
		if(top.isEmpty()) {
			return 0;
		}
		return top.size()-1;
	}
	
	public static StackNode getLastStack() {
		if(top.isEmpty()) {
			return null;
		}
		return top.get(getLastIndex());
	}
	
	public static boolean isLastFull() {
		return size.get(getLastIndex())==capacity;
	}
	
	public void push(int value) {
		StackNode node = new StackNode(value);
		StackNode last = getLastStack();
		if(!isLastFull()&&last!=null) {
			
		}
		node.next = last;
		last = node;
	}
	
	public static void main(String[] args) {
		
		
	}
}













