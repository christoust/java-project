package linkedlist;

public class Linkedlist {
	Node head;
	
	public Linkedlist()
	{
		this.head=null;
	}
	
	public void add(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
	 Node current = head;
	 while(current.next!=null)
	 {
		 current =current.next;
	 }
	 current.next = newNode;
	}
	
	public void printlist()
	{
		Node current = head;
		while(current!=null) {
			System.out.println(current.data + " ");
			current = current.next;
			
		}
		System.out.println();
	}

}
