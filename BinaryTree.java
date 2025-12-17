package app;
import java.util.*;
public class BinaryTree
{
	public static Scanner scan = new Scanner(System.in);
	public static class Node
	{
		int val;
		Node left;
		Node right;
	}
	public static Node root=null;
	public static Node[] que=new Node[100];
	public static int front=0,tail=-1;
	public static void append()
	{
		System.out.println("Enter The Value");
		int val=scan.nextInt();
		Node nn = new Node();
		nn.val = val;
		nn.left=null;
		nn.right=null;
		if(root==null)
		{
			root=nn;
			que[++tail]=nn;
		}
		else
		{
			Node temp = que[front];
			if(temp.left==null)
			{
				temp.left=nn;
				que[++tail]=nn;
			}
			else if(temp.right==null)
			{
				temp.right=nn;
				que[++tail]=nn;
				front++;
			}
		}
	}
	public static void preorder(Node root)
	{
		if(root!=null)
		{
			System.out.println(root.val+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	public static void inorder(Node root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.println(root.val+" ");
			inorder(root.right);
		}
	}
	public static void postorder(Node root)
	{
		if(root!=null)
		{
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.val+" ");
		}
	}
	public static int height(Node root)
	{
		if(root == null)
			return 0;
	   
		return 1+Math.max(height(root.left),height(root.right));
	}
	public static int nodecount(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		return 1+nodecount(root.left)+nodecount(root.right);
	}
	public static int leafcount(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		if (root.left == null && root.right == null)
		{
		        return 1;
		}
		return leafcount(root.left)+leafcount(root.right);
	}
	public static void leafnodes(Node root)
	{
		if(root==null)
		{
			return;
		}
		if (root.left == null && root.right == null)
		{
			System.out.print(root.val+" ");
		}
		leafnodes(root.left);
		leafnodes(root.right);
	}
	public static int maxtree(Node root)
	{
	    if (root == null)
	    {
	        return Integer.MIN_VALUE; 
	    }

	    int x = maxtree(root.left);
	    int y = maxtree(root.right);

	    return Math.max(root.val, Math.max(x, y));
	}
	public static int mintree(Node root)
	{
	    if (root == null)
	    {
	        return Integer.MAX_VALUE; 
	    }

	    int x = mintree(root.left);
	    int y = mintree(root.right);

	    return Math.min(root.val, Math.min(x, y));
	}
	
	public static int sumtree(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		return root.val+sumtree(root.left)+sumtree(root.right);
	}
	public static void main(String args[])
	{
		int n = 1;
		System.out.println("Binary Tree");
		while(n>=1)
		{
			System.out.println("1.Append");
			System.out.println("2.PreOrder Traversal");
			System.out.println("3.InOrder Traversal");
			System.out.println("4.PostOrder Traversal");
			System.out.println("5.Height of the Tree");
			System.out.println("6.Number of Nodes In Tree");
			System.out.println("7.Number of LeafNodes In Tree");
			System.out.println("8.Print all LeafNodes In Tree");
			System.out.println("9.Find the maximum in binary Tree");
			System.out.println("10.Find the minimum in binary Tree");
			System.out.println("11.Sum of All nodes in binary Tree");
			int ch=scan.nextInt();
			switch(ch)
			{
				case 1 -> append();
				case 2 -> {
					System.out.println("PreOrder Traversal");
					preorder(root);
				}
				case 3 ->{
					System.out.println("InOrder Traversal");
					inorder(root);
				}
				case 4 -> {
					System.out.println("PostOrder Traversal");
					postorder(root);
				}
				case 5 ->
				{
					int x=height(root);
					System.out.println("Height of the Tree:"+x);
				}
				case 6->
				{
					int nc=nodecount(root);
					System.out.println("number of Nodes:"+nc);
				}
				case 7 ->
				{
					int lc=leafcount(root);
					System.out.println("Number of LeafNodes In Tree:"+lc);
				}
				case 8 ->
				{
					System.out.println("All leaf Nodes");
					leafnodes(root);
				}
				case 9 ->
				{
					System.out.println(" maximum in binary Tree:"+maxtree(root));
				}
				case 10 ->
				{
					System.out.println(" minimum in binary Tree:"+mintree(root));
				}
				case 11 ->
				{
					System.out.println("Sum of Binary tree"+sumtree(root));
				}
			}
		}
	}
}
