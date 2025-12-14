package app;
import java.util.*;
public class QueueLL
{
	public static Scanner scan = new Scanner(System.in);
	static class Node
	{
		int val;
		Node next;
	}
	public static Node head=null;
	public static void push()
	{
		Node nn = new Node();
		System.out.println("Enter the element");
		int val = scan.nextInt();
		nn.val=val;
		nn.next=null;
		if(head==null)
		{
			head=nn;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=nn;	
		}
		System.out.println("Element Inserted Succesfully");
	}
	public static void pop()
	{
		if(head==null)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			System.out.println("Poped Element:"+head.val);
			head=head.next;
		}
	}
	public static void peek()
	{
		if(head==null)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			System.out.println("Peek Element:"+head.val);
		}
	}
	public static void main(String args[])
	{
		int x=1;
		System.out.println("Queue Using Linked List");
		while(x>=1)
		{
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Exit");
			int n=scan.nextInt();
			switch(n)
			{
			  case 1 -> push();
              case 2 -> pop();
              case 3 -> peek();
              case 4 ->
              {
            	  System.out.println("Exiting...");
            	  x=0;
              }
              
			}
		}

	}
}
