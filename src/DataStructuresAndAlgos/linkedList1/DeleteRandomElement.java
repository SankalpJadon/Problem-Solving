//Delete element in middle with access only to that element.
package DataStructuresAndAlgos.linkedList1;

import java.util.Scanner;

class DeleteRandomElement {
	
	LinkedList ll;
	
	private void del(LinkNode node){
		if(node.nextNode==null){
			System.out.println("Can't delete the element");
		}
		else{
		LinkNode newNode=node.nextNode;
		node.data= newNode.data;
		node.nextNode=newNode.nextNode;
		}
	}
	
	public static void main(String args[]) {
		DeleteRandomElement delete= new DeleteRandomElement();
		delete.ll = new LinkedList();
		LinkNode a = new LinkNode("a");
		LinkNode b = new LinkNode("b");
		LinkNode c = new LinkNode("c");
		LinkNode d = new LinkNode("d");
		LinkNode e = new LinkNode("e");
		LinkNode f = new LinkNode("f");
		delete.ll.addAtHead(a);
		delete.ll.addAtHead(b);
		delete.ll.addAtHead(c);
		delete.ll.addAtHead(d);
		delete.ll.addAtHead(e);
		delete.ll.addAtHead(f);
		System.out.println("The list is: ");
		delete.ll.print();
		System.out.println("---");
		delete.del(a);
		System.out.println("---");
		delete.ll.print();
	}
}
