package ctc.linkedList;

import java.util.HashMap;

public class Q1DeleteDuplicate {
	
	public static void main(String args[]){
		LinkedList ll= new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(20);
		ll.add(70);
		ll.add(10);
		deleteDup(ll);
	}
	public static void deleteDup(LinkedList ll){
		LinkedListNode node=ll.getHead();
		LinkedListNode head=node;
		LinkedListNode prev= null;
		HashMap ht= new HashMap<Integer,Boolean>();
		while(node!=null){
			if(ht.containsKey(node.data)){
				System.out.println(node.data);
				prev.next= node.next;
			}
			else{
				ht.put(node.data,true);
				prev=node;
			}
			node=node.next;
		}
		while(head!=null){
			System.out.println(head.data);
			head=head.next;
		}
	}
}
