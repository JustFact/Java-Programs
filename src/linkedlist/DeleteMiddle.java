package linkedlist;

public class DeleteMiddle {
	static boolean DeleteValue(MyLinkedList l) {
		if(l==null||l.next==null) {
			System.out.println("False");
			return false;
		}
		MyLinkedList temp = l.next;
		l.data = temp.data;
		l.next = temp.next;
		System.out.println("True");
		return true;
	}
	public static void main(String[] args) {
		MyLinkedList l = new MyLinkedList();
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		l.insert(6);
		l.insert(7);
		l.insert(8);
		l.insert(9);
		l.insert(10);
		l.insert(11);
		l.show();
		MyLinkedList n = l.head;
		while(n!=null) {
			if(n.data==7) {
				break;
			}else {
				n = n.next;
			}
		}
		DeleteValue(n);
		l.show();
	}
}
