// Implement an algorithm to find the kth to last element of a singly linked list.
package ctc.linkedList;

import java.util.Scanner;

public class Q2KthToLastElement {
	public static void main(String args[]){
		LinkedList ll= new LinkedList();
		LinkedListNode head= ll.getHead();
		System.out.println("Enter k value: ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		Q2KthToLastElement element= new Q2KthToLastElement();
		LinkedListNode kthElement=element.getElement(head,n);
		System.out.println(kthElement.data);
	}
	
	public LinkedListNode getElement(LinkedListNode head,int n){
		LinkedListNode fast= head;
		LinkedListNode slow= head;
		try{
			if(head==null){
				return null;
			}
			for(int i=0;i<n;i++){
				fast=fast.next;
			}
			while(fast!=null){
				fast= fast.next;
				slow= slow.next;
			}
		}
		catch(Exception e){
			System.out.println("Exception occured: ");
			e.printStackTrace();
		}
		return slow;
	}
}
