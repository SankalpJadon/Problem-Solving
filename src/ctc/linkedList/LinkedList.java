package ctc.linkedList;


public class LinkedList {
	private LinkedListNode head;  
	private LinkedListNode tail;
	public int size=0;
	
	public void add(int data)
	 {
		LinkedListNode newNode = new LinkedListNode(data);
		if(head==null){
			head=newNode;
			tail=newNode;
		}
		else{
			tail.next=newNode;
			tail=tail.next;
		}
	     size++;
	 }
	public void addElements(){
		this.add(90);
		this.add(5);
		this.add(30);
		this.add(30);
		this.add(5);
		this.add(90);
		this.add(70);
	}
	
	public LinkedListNode getHead(){
		return head;
	}
	
	public LinkedListNode getTail(){
		return tail;
	}
}
