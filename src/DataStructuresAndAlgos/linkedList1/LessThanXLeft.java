package DataStructuresAndAlgos.linkedList1;
//Write code to partition a linked list around a value x, such that all nodes less than x come before alt nodes 
//greater than or equal to x.
public class LessThanXLeft {
	
	public static void partingList(LinkedList ll, LinkNode x){
		ll.print();
		System.out.println("---");
		LinkedList list1=new LinkedList();
		LinkedList list2=new LinkedList();
		LinkNode pass=ll.head;
		while(pass.nextNode!=null){
			LinkNode newNode=pass;
			if(Integer.parseInt(newNode.data)<Integer.parseInt(x.data)){
				if(list1.head!=null){
					list1.head.nextNode=newNode;
				}
				else{
					list1.head=pass;
				}
			}
			else{
				if(list2.head!=null){
					list2.head.nextNode=x;
				}
				else{
					list2.head=x;
				}
				
			}
			pass= pass.nextNode;
		}
		
		
	}

	private static int charAt(String data) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String args[]){
		LinkedList ll= new LinkedList();
		LinkNode a=new LinkNode("5");
		LinkNode b=new LinkNode("1");
		LinkNode c=new LinkNode("6");
		LinkNode d=new LinkNode("4");
		LinkNode e=new LinkNode("8");
		LinkNode f=new LinkNode("2");
		ll.addAtHead(a);
		ll.addAtHead(c);
		ll.addAtHead(b);
		ll.addAtHead(e);
		ll.addAtHead(f);
		ll.addAtHead(d);
		partingList(ll,c);
	}
	
}
