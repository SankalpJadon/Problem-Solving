//Write code to partition a linked list around a value x, such that all nodes less than x
//come before all nodes greater than or equal to x.
package ctc.linkedList;

public class Q4PartitioningList {
	public static void main(String args[]){
		LinkedList ll= new LinkedList();
		ll.addElements();
		LinkedListNode head= ll.getHead();
		int val=30;
		Q4PartitioningList part= new Q4PartitioningList();
		LinkedListNode node= part.partition(head,val);
		while(node!=null){
			System.out.println(node.data);
			node=node.next;
		}
	}
	private LinkedListNode partition(LinkedListNode node,int val){
		LinkedListNode head1=null;
		LinkedListNode head2=null;
		while(node!=null){
			LinkedListNode next= node.next;
				if(node.data<val){
					node.next=head1;
					head1=node;
				}
				else{
					node.next=head2;
					head2=node;
				}
			node=next;		
		}
		LinkedListNode head=head1;
		while(head1.next!=null){
			head1= head1.next;
		}
		head1.next=head2;
	return head;
	}
}
