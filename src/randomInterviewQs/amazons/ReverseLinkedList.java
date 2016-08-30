package randomInterviewQs.amazons;

import ctc.linkedList.LinkedList;
import ctc.linkedList.LinkedListNode;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);
		ll.add(8);
		System.out.println(ll.getHead().data);
		ReverseLinkedList rev= new ReverseLinkedList();
		LinkedListNode lln=rev.reverse(ll);
		while(lln!=null){
			System.out.println(lln.data);
			lln=lln.next;
		}
	}
	public LinkedListNode reverse(LinkedList ll){
		LinkedListNode curr=ll.getHead();
		LinkedListNode prev=null;
		LinkedListNode next;
		while(curr!=null){
			if(curr.next==null)
				curr.next=prev;
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return curr;
	}
}
