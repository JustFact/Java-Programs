package StackandQueues;

import java.util.EmptyStackException;

public class ThreeInOne {
	int number_of_stack = 3;
	int stack_capacity;
	int values[];
	int top[];

	public void createStack(int stack_size) {
		stack_capacity = stack_size;
		values = new int[stack_size*number_of_stack];
		top = new int[number_of_stack];
	}
	
	public boolean isFull(int stack_num) {
		return top[stack_num] == stack_capacity;
	}
	public boolean isEmpty(int stack_num) {
		return top[stack_num] < 0;
	}
	public int indexOfTop(int stack_num) {
		int offset = stack_capacity*stack_num;
		int size = top[stack_num];
		return offset + size -1;
	}
	
	public void push(int stack_num, int value) {
		if(isFull(stack_num)) {
			System.out.println("Error: "+stack_num+" Stack Full");
			return;
		}
		top[stack_num]++;
		values[indexOfTop(stack_num)] = value;
	}
	
	public int pop(int stack_num) {
		if(isEmpty(stack_num)) {
			throw new EmptyStackException();
		}
		int value = values[indexOfTop(stack_num)];
		values[indexOfTop(stack_num)] = 0;
		top[stack_num]--;
		return value;
	}
	public int peek(int stack_num) {
		if(isEmpty(stack_num)) {
			throw new EmptyStackException();
		}
		return values[indexOfTop(stack_num)];
	}
	
	public static void main(String[] args) {
		
		
	}
}
