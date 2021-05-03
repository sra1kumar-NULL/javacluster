package dsa;

public class LinkedListDou<T> {
	NodeDou head;
	public LinkedListDou() {
		head=null;	
	}
	public void add(Object value) {
		NodeDou newNode = new NodeDou(value,null,null);
		NodeDou itr;
		itr=head;
		if(head==null) {
			head=newNode;
		}
		else {
			while(itr.next!=null) {
				itr=itr.next;
			}
			itr.next=newNode;
			newNode.next=null;
			newNode.prev=itr;
		}
	}
	public void del()
	{
		if(head==null)
		{
			System.out.println("We cannot delete from an empty list");
		}
		else
		{
			System.out.println("Deleted the element"+(T)head.data);
			head=head.next;
			head.prev=null;
		}
	}
	public void displayFromBeg()
	{
		if(head==null) {
			System.out.println("the Double Linked List is Empty");
		}
		else
		{
			NodeDou itr = head;
			while(itr!=null)
			{
				System.out.println((T)itr.data);
				itr=itr.next;
			}
		}
	}
	public void displayFromBack()
	{
////		if(head==null) {
////			System.out.println("the Double Linked List is Empty");
////		}
////		else
//		
			NodeDou it = head;
//			
			while(it.next!=null) {
				it=it.next;
		
			}
    	    while(it!=head) {
    				     			
				System.out.println((T)it.data);
				it=it.prev;
			
		}
    	System.out.println(it.data);
	}

}
