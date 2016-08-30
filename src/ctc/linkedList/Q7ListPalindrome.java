package ctc.linkedList;

import java.util.Stack;

public class Q7ListPalindrome {
	public static void main(String args[]){
		LinkedList ll= new LinkedList();
		ll.addElements();
		LinkedListNode head=ll.getHead();
		System.out.println(isPalindrome(head));
	}
	public static String isPalindrome(LinkedListNode head){
		String res= "Palindrome";
		if(head==null||head.next==null)
			return res;
		LinkedListNode fast=head;
		LinkedListNode slow=head;
		Stack s= new Stack();
		try{
			while(fast!=null&&fast.next!=null){
				s.push(slow);
				fast=fast.next.next;
				slow=slow.next;
			}
			if(fast!=null){
				slow=slow.next;
			}
			while(slow!=null){
				LinkedListNode temp=(LinkedListNode) s.pop();
				if(slow.data!=temp.data){
					res="Not a palindrome";
					return res;
				}
				slow=slow.next;
			}
		}catch(Exception e){
			System.out.println("Exception occured: ");
			e.printStackTrace();
		}
		return res;
	}
}
