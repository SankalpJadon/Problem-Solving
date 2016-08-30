package DataStructuresAndAlgos.linkedList1;
// removing duplicates from the list
import java.util.InputMismatchException;
import java.util.Scanner;

public class LinkedList {
	LinkNode head;
	LinkNode tail;
	int size = 0;

	public void addAtTail(LinkNode node) {
		if (tail == null) {
			head = node;
			tail = node;
		} else {
			tail.nextNode = node;
			tail = tail.nextNode;
		}
		size++;
	}

	public void addAtN(LinkNode node, int n) {
		if (n > size) {
			System.out.println("Position greater than the size");
		} else if (n == 0) {
			head = node;
			tail = node;
			size++;
		} else {
			int counter = 0;
			LinkNode currNode = head;
			while (counter < (n - 1)) {
				currNode = currNode.nextNode;
				counter++;
			}
			LinkNode n1 = currNode.nextNode;
			currNode.nextNode = node;
			node.nextNode = n1;
			size++;
		}

	}

	public void remove(String data) {
		if (head == null) {
			System.out.println("list is already empty");
		} else {
			LinkNode currNode = head;
			while (currNode.nextNode != null) {
				if (currNode.equals(data)) {
					head = currNode.nextNode;
					currNode.nextNode = null;
				} else {
					
				}
			}
		}
	}
	
//	public void removeDup(Node head){
//		Node current= head;
//		while(current!=null){
//			Node runner= current.nextNode;
//			while(runner!=null){
//				if(current.data.equals(runner.data)){
//					current.nextNode=runner.nextNode;
//				}
//				else{
//					runner=runner.nextNode;
//				}
//			}
//		}
//		print();
//	}
	public void removeDup(LinkNode head){
		LinkNode current= head;
		while(current!=null){
			LinkNode runner= current;
			while(runner.nextNode!=null){
				if(runner.nextNode.data.equals(current.data)){
					runner.nextNode=runner.nextNode.nextNode;
				}
				else{
					runner=runner.nextNode;
				}
			}
			current=current.nextNode;
		}
		print();
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	public void addAtHead(LinkNode node) {
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.nextNode = head;
			head = node;
		}
		size++;
	}

	public void reverseList(LinkNode head) {
		if(head==null){
			System.out.println("The list is empty");
		}
		else if(head.nextNode==null){
			System.out.println("Reverse list is: "+head);
		}
		else{
			tail=head;
			LinkNode prev=null;
			LinkNode next;
			LinkNode current=head;
			while(current!=null){
				next=current.nextNode;
				current.nextNode=prev;
				prev=current;
				current= next;
			}
		}
		
	}

	public LinkNode getHead() {
		return head;
	}

	public LinkNode getTail() {
		return tail;
	}

	public void print() {
		LinkNode node = head;
		if (node == null) {
			System.out.println("No values in the list! ");
		} else {
			while (node != null) {
				System.out.println(node);
				node = node.nextNode;
			}
		}

	}

	public static void main(String args[]) {

		LinkedList newNode = new LinkedList();
		int in;
		Scanner num = new Scanner(System.in);
		Scanner st = new Scanner(System.in);
		String str;
		int cont = 1;
		try {
			while (cont == 1) {
				System.out.println("Select 1 to get the size of the list: ");
				System.out.println("Select 2 to remove an element from the list at Nth position: ");
				System.out.println("Select 3 to check if the list is empty: ");
				System.out.println("Select 4 to add node at head: ");
				System.out.println("Select 5 to add node at tail: ");
				System.out.println("Select 6 to add node at Nth position: ");
				System.out.println("Select 7 to reverse a list: ");
				System.out.println("Select 8 to get head node: ");
				System.out.println("Select 9 to get tail node: ");
				System.out.println("Select 10 to print the list: ");
				System.out.println("Select 11 to remove duplicates: ");
				System.out.println("Select 0 to terminate the program: ");
				int input = num.nextInt();

				switch (input) {

				case 1:
					System.out.println("Size of the list is: " + newNode.size);
					break;

				case 2:
					System.out.println("Enter the element to be removed: ");
					str = st.nextLine();
					newNode.remove(str);
					break;

				case 3:
					if (newNode.isEmpty()) {
						System.out.println("List is: empty");
					} else {
						System.out.println("List is: not empty");
					}
					break;

				case 4:
					System.out.println("Enter the node element to be inserted at head: ");
					str = st.nextLine();
					LinkNode nodeAtHead = new LinkNode(str);
					newNode.addAtHead(nodeAtHead);
					break;

				case 5:
					System.out.println("Enter the node element to be inserted at tail: ");
					str = st.nextLine();
					LinkNode nodeAtTail = new LinkNode(str);
					newNode.addAtTail(nodeAtTail);
					break;

				case 6:
					System.out.println("Enter the node element to be inserted: ");
					str = st.nextLine();
					LinkNode nodeAtN = new LinkNode(str);
					System.out.println("Enter the insertion position: ");
					in = num.nextInt();
					newNode.addAtN(nodeAtN, in);
					break;

				case 7:
					newNode.reverseList(newNode.head);
					System.out.println("The reversed list is: ");
					break;

				case 8:
					System.out.println("Head node is: " + newNode.getHead());
					break;

				case 9:
					System.out.println("Tail node is: " + newNode.getTail());
					break;

				case 10:
					newNode.print();
					
				case 11:
					newNode.removeDup(newNode.head);

				default:
					System.out.println("Not a valid input");

				case 0:
					break;
				}

				System.out.println("Do you want to continue? ");
				cont = num.nextInt();

			}
		} catch (InputMismatchException e) {
			System.out.println("Sorry, you entered an invalid input");
		}
	}

}
