/*Given a circular linked list, implement an algorithm which returns the node at the
beginning of the loop. */
package ctc.linkedList;

public class Q6LoopInList {
	public static void main(String args[]){
		LinkedList ll= new LinkedList();
		ll.addElements();
		LinkedListNode head= ll.getHead();
		Q6LoopInList loop= new Q6LoopInList();
		System.out.println(loop.loopTest(head));
	}
	public boolean loopTest(LinkedListNode head){
		LinkedListNode fast=head.next;
		LinkedListNode slow=head;
		while(fast!=null && fast.next!=null){
			if(fast==slow){
				return true;
			}
			fast=fast.next.next;
			slow=slow.next;
		}
		return false;
	}
	
}
