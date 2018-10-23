package linkedlist;

public class ListPalindrome {
	
	static boolean checkPalindrome(MyLinkedList l) {
		MyLinkedList n = l.head;
		int checkOnes = 0;
		int checkThree = 0;
		int check[] = new int[128];
		
		while(n!=null) {
			check[n.data]++;
			n = n.next;
		}
		
		boolean checker = (l.NodeAt(l.size/2).data)==(l.NodeAt(l.size/2+1).data)&&(l.NodeAt(l.size/2+1).data)==(l.NodeAt(l.size/2+2).data);
//		System.out.println(checker);
		n = l.head;
		while(n!=null) {
			if(check[n.data]%2!=0) {
				if(checkOnes!=1&&!checker) {
					checkOnes = 1;
				}else if(checkThree<=3&&checker){
					checkThree++;
				}else {
					return false;
				}
			}
			n = n.next;
		}
		return true;
	}

	static boolean checkPalindrome2(MyLinkedList node, int length) {
		/*
		 * Recursive approach
		 * */
		return true;
	}
	public static void main(String[] args) {
		MyLinkedList l = new MyLinkedList();
		l.insert(1);
		l.insert(2);
		l.insert(1);
		l.insert(2);
		l.insert(1);
		l.show();
		System.out.println(checkPalindrome(l));
//		System.out.println(5/2);
	}
}
