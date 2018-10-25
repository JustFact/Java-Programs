package LinkedList;

public class SumList {
	static MyLinkedList Sum(MyLinkedList l1, MyLinkedList l2) {
		MyLinkedList total = new MyLinkedList();
		MyLinkedList n1 = l1.head;
		MyLinkedList n2 = l2.head;
		while(n1!=null) {
			if(n1.data+n2.data>9) {
				if(n1.next!=null) {
				n1.next.data++;
				total.insert((n1.data+n2.data)%10);
				}else if(n1.next==null) {
					total.insert((n1.data+n2.data)%10);
					total.insert((n1.data+n2.data)/10);
				}
			}else if(n1.data+n2.data<=9) {
				total.insert(n1.data+n2.data);
			}
			n1 = n1.next;
			n2 = n2.next;
		}
		return total;
	}
	public static void main(String[] args) {
		MyLinkedList l1 = new MyLinkedList();
		MyLinkedList l2 = new MyLinkedList();
//		l1 = l1.RandomList(3, 10);
//		l2 = l2.RandomList(3, 10);
		l1.insert(9);
		l1.insert(9);
		l1.insert(9);
		l2.insert(9);
		l2.insert(9);
		l2.insert(9);
		l1.show();
		l2.show();
		Sum(l1,l2).show();
	}
}
