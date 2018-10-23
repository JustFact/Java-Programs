package StackandQueues;

import java.util.EmptyStackException;

public class AnimalShelter extends MyStringStack{
	
	
	public static void main(String[] args) {
		MyStringStack s1 = new MyStringStack();
		s1.enqueue("cat");
		s1.enqueue("dog");
		s1.enqueue("cat");
		s1.enqueue("cow");
		s1.enqueue("mouse");
		System.out.println(dequeueCat(s1).pet);
		System.out.println(dequeueCat(s1));
//		System.out.println(dequeueAny(s1));
		
	}
}
