package dsa;

public class LinkedListSin<T>{
Node head;
	public LinkedListSin() {
		head=null;
		
	}
	public void add(Object value)
	{
		Node newNode=new Node(value,null);
		Node itr;
		itr=head;
		if(head==null)
		{
			head=newNode;
			
		}
		else
		{
			while(itr.next!=null)	
			{
					itr=itr.next;
			}

			itr.next=newNode;
			newNode.next=null;
		}


	}
	public void del()
	{
		if(head==null)
		{
			System.out.println("The operation can't be performed . Since linked LIst is empty");
		}
		else {

			System.out.println("Deleted the item : "+head.data);
			head=head.next;
		}
	}
	public void display() {
		Node n=head;
		if(n==null) {
			System.out.println("The linked list is empty");
		}
		else {
			while(n!=null) {
				System.out.println((T)n.data);
				n=n.next;
			}
		}
		
	}
	

}
