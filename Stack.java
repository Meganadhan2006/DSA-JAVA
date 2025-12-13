package app;
import java.util.*;

public class Stack
{
    static Scanner scan = new Scanner(System.in);
    static class Node
    {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    static Node top = null;  
    public static void push()
    {
        System.out.print("Enter the element: ");
        int val = scan.nextInt();
        Node nn = new Node(val);
        nn.next = top;
        top = nn;
        System.out.println("Value pushed successfully");
    }
    public static void pop()
    {
        if (top == null)
        {
            System.out.println("Stack is Empty");
        } 
        else
        {
            System.out.println("Removed element is: " + top.val);
            top = top.next;
        }
    }

    public static void peek()
    {
        if (top == null)
        {
            System.out.println("Stack is Empty");
        } 
        else
        {
            System.out.println("Peek element is: " + top.val);
        }
    }

    public static void main(String[] args)
    {
        int choice = 1;
        System.out.println("<--> Stack using Linked List <-->");
        while (choice != 4) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            choice = scan.nextInt();
            switch (choice)
            {
                case 1 -> push();
                case 2 -> pop();
                case 3 -> peek();
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
