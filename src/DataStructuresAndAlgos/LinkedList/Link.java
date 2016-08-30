package DataStructuresAndAlgos.LinkedList;

public class Link{
	
	String bookName;
	int millionSold;
	
	Link nextLink= null;
	
	Link(String bookName,int millionSold){
		
		this.bookName=bookName;
		this.millionSold=millionSold;
				
	}
	
	void display(){
		
		System.out.println(bookName+" :"+millionSold+" million copies sold");

	}
	 
	public String toString(){
		 
		return bookName;
		 
	}
	 
	public static void main(String args[]){
		
		LinkList newLinkList= new LinkList();
		newLinkList.insertNewLink("Harry Potter", 200);
		newLinkList.insertNewLink("Lord of the rings", 400);
		newLinkList.insertNewLink("Die another day", 100);
		newLinkList.insertNewLink("Sherlock Holmes", 300);
		newLinkList.insertNewLink("Kite runner", 230);

		newLinkList.display();
	}
	
}

class LinkList{
	
	public Link firstLink;
	
	LinkList(){
		
		firstLink=null;
		
	}
	
	public boolean isEmpty(){
		
		return (firstLink==null);
		
	}
	
	public void insertNewLink(String bookName,int millionSold){
		
		Link newLink= new Link(bookName, millionSold);
		
		newLink.nextLink= firstLink;
		
		firstLink= newLink;
		
	}
	
	public Link removeFirst(){
		
		Link linkReference= firstLink;
		
		if(!isEmpty()){
			
			firstLink= firstLink.nextLink;
			
		}else{
			
			System.out.println("List empty");
			
		}
		
		return linkReference;
	}
	
	public void display(){
		
		Link next=firstLink;
		
			while(next!=null){
				
				next.display();
				
				System.out.println("The next book is: "+next.nextLink);
				
				next= next.nextLink;
				
				System.out.println();
			
		}
		
	}
	
	
	
	public Link search(String bookName){
		
		Link searchLink= firstLink;
		
		if(!isEmpty()){
			
			while(searchLink.bookName!= bookName){
				
				if(searchLink.nextLink==null){
					
					return null;					
					
				}else{
					
					searchLink= searchLink.nextLink;
					
				}
				
			}
			
		}else{
			
			System.out.println("List empty");
			
		}
		
		return searchLink;
		
	}
	
	public Link removeLink(String bookName){
		
		Link currLink, prevLink;
		
		currLink= firstLink;
		prevLink= firstLink;
		
		while(currLink.bookName!= bookName){
			
			if(currLink.nextLink==null){
				
				System.out.println("Book not found");
				
			}else{
				
				prevLink=currLink;
				
				currLink=currLink.nextLink;
				
			}
			
			
		}
		
		if(currLink==firstLink){
			
			firstLink= firstLink.nextLink;
			
		} else{
			
			prevLink.nextLink=currLink.nextLink;					
			
		}
		
		return currLink;
	}
	
	
}
