// Implement an algorithm to delete a node in the middle of a singly linked list, given
// only access to that node.
package ctc.linkedList;

import java.util.Scanner;

public class Q3DeleteNode {
	public static void main(String args[]){
		LinkedList ll= new LinkedList();
		LinkedListNode node1= ll.getHead();
		for(int i=1;i<4;i++){
			node1=node1.next;
		}
		Q3DeleteNode delete= new Q3DeleteNode();
		if(delete.deleteNode(node1))
			System.out.println("Deleted ");
		else
			System.out.println("Not deleted");
		
		LinkedListNode node2= ll.getHead();
		while(node2!=null){
			System.out.print(node2.data);
			node2= node2.next;
		}
	}
	private boolean deleteNode(LinkedListNode node){
		if(node==null){
			return false;
		}
		else if(node.next==null){
			node=null;
			return true;
		}
		else{
			LinkedListNode temp= node.next;
			node.data=temp.data;
			node.next=temp.next;
			return true;
		}
	}
}
