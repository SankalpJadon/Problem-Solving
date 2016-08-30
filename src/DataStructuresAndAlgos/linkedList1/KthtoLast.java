package DataStructuresAndAlgos.linkedList1;

import java.util.Scanner;

public class KthtoLast {
	
	private LinkNode getKth(LinkedList list, int i){
		LinkNode beg=list.head;
		LinkNode curr=beg;
		int j=0;
		while(j<i){
			curr=curr.nextNode;
			j++;
		}
		while(curr.nextNode!=null){
			curr=curr.nextNode;
			beg=beg.nextNode;
		}
		return beg;
	}
	
	public static void main(String args[]){
		
		LinkedList ll= new LinkedList();
		LinkNode a=new LinkNode("a");
		LinkNode b=new LinkNode("b");
		LinkNode c=new LinkNode("c");
		LinkNode d=new LinkNode("d");
		LinkNode e=new LinkNode("e");
		LinkNode f=new LinkNode("f");
		ll.addAtHead(a);
		ll.addAtHead(b);
		ll.addAtHead(c);
		ll.addAtHead(d);
		ll.addAtHead(e);
		ll.addAtHead(f);
		System.out.println("The list is: ");
		ll.print();
		Scanner sc= new Scanner(System.in);
		int k=sc.nextInt();
		System.out.println(k+"th element from last is:");
		KthtoLast ktl=new KthtoLast();
		System.out.println(ktl.getKth(ll, k).data);
		
	}
	
}
