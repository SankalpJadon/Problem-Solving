/*You have two numbers represented by a linked list, where each node contains a
single digit. The digits are stored in reverse order, such that the 1 's digit is at the head
of the list. Write a function that adds the two numbers and returns the sum as a
linked list */
package ctc.linkedList;

public class Q5AddTwoNumbers {
	public static void main(String args[]){
		LinkedList ll1= new LinkedList();
		ll1.add(2);
		ll1.add(7);
		ll1.add(4);
		LinkedList ll2= new LinkedList();
		ll2.add(8);
		ll2.add(7);
		ll2.add(4);
		ll2.add(9);
		if(ll1.size>ll2.size){
			LinkedListNode pad=new LinkedListNode(0);
			LinkedListNode tail= ll2.getTail();
			tail.next=pad;
		}
		else if(ll2.size>ll1.size){
			LinkedListNode pad=new LinkedListNode(0);
			LinkedListNode tail= ll1.getTail();
			tail.next=pad;
		}
		LinkedListNode head1= ll1.getHead();
		LinkedListNode head2= ll2.getHead();
		Q5AddTwoNumbers addTwoNumber= new Q5AddTwoNumbers();
		LinkedListNode node= addTwoNumber.add(head1,head2);
	}
	public LinkedListNode add(LinkedListNode h1,LinkedListNode h2){
		int newSize=0;

	}
}
