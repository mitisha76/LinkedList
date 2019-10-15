package Assesm;
import java.util.*;
public class LinkedList {
	class Node
	{
		int key;
		Node next;
		
		Node(int key)
		{
			this.key=key;
		next=null;
		}
	}
	void insert(int key)
	{
		Node temp=new Node(key);
		if(head==null)
		{
		head=temp;
			return;
		}
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=temp;
	}
	void display(Node head)
	{
		Node current=head;
		
		while(current!=null)
		{
			System.out.print(current.key+" ");
			current=current.next;
		}
	}
	void delete(int a)
	{
		Node temp=head;
		if(temp.key==a)
		{
			head=temp.next;
			return;
		}
		else
		{
			while(temp.next!=null)
			{
				if(temp.next.key==a)
				{
					temp.next=temp.next.next;
					return;
				}
				else
					temp=temp.next;
			}
		}
	}
	void reverse(Node head)
	{
//		Node current=head;
//		Node previous=null;
		if(head==null)
			return;

		reverse(head.next);
		System.out.println(head.key);
	}
	Node head;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		LinkedList l=new LinkedList();
		boolean t=true;
		while(t)
		{
		System.out.println("enter 1 to insert");
		System.out.println("enter 2 to delete");
		System.out.println("enter 3 to traverse first to last");
		System.out.println("enter 4 to traverse last to first");
			int x=sc.nextInt();
			switch(x)
			{
			case 1:
				l.insert(sc.nextInt());
				break;
			
			case 2:
				System.out.println("enter elemnt to be deleted");
				int g=sc.nextInt();
				l.delete(g);
				break;
			case 3:
				l.display(l.head);
				break;
			case 4:
				l.reverse(l.head);
				l.display(l.head);
				break;
			
			}
			//l.display(l.head);
			System.out.println("press 1 to continue and 0 to exit");
			int c=sc.nextInt();
			if(c==1)
				t=true;
			else
				t=false;
		}
		
	}

}
