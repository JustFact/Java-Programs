package TreeandGraphs;

public class Queue {
	MyNode data;
	Queue next;
	Queue first;
	Queue last;
	
	Queue(MyNode x){
		this.data = x;
		this.next = null;
	}
	Queue(){}
	
	void push(MyNode x) {
		Queue node  = new Queue(x);
		if(last!=null) {
			last.next = node;
		}
		last  = node;
		if(first==null) {
			first = last;
		}
	}
	
	MyNode pop() {
		if(first == null) {
			last = null;
		}
		MyNode node = first.data;
		first.data = null;
		first = first.next;
		return node;
	}
	
	boolean isEmpty() {
		return first==null;
	}
	
}
