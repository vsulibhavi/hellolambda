package org.code.tree;

import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

 class Node {

	int value;
	Node nright;
	Node nleft;

	public Node(int value, Node nleft, Node nright) {

		this.value = value;
		this.nleft = nleft;
		this.nright = nright;

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return new Integer(value).toString();
	
	}

}

public class NodeRead {
	
	
	
	
	public static void main(String[] args) {
		
		
	   Node node = 	readFromString("10 324 2 5 6 9 4 1");
	//	printInOrder(node);
	//	morrisonTraversal(node);
	   System.out.println(maxDepth(node));
	//	System.out.println(sizeOfTree(node));
	   printPaths(node, new Stack<Node>());
	}

	private static void printPaths(Node node, Stack<Node> stack) {
		
		if(node == null)
		{
			return;
		}
		if(node.nleft  == null && node.nright == null)
		{
			stack.push(node);
			System.out.println(stack.toString());
			if(!stack.isEmpty())stack.pop();
			return;
		}
		stack.push(node);
		printPaths(node.nleft, stack);
		printPaths(node.nright, stack);
		stack.pop();
	}

	private static int maxDepth(Node node) {

		if(node == null)
			return 0;
		
		return 1+ Math.max(maxDepth(node.nleft), maxDepth(node.nright));
	}

	private static int sizeOfTree(Node node) {

		if(node == null)
		{
			return 0;
		}
		if(node.nleft == null && node.nright == null)
		{
			return 1;
			
		}
		
		return sizeOfTree(node.nleft) + 1 + sizeOfTree(node.nright); 
		
	}

	private static void morrisonTraversal(Node node) {

		
		while(node != null)
		{
			if(node.nleft == null)
			{
				System.out.println(node.value);
				node = node.nright;
				
			}
			else
			{
				Node pre = node.nleft;
				while(pre.nright !=null && pre.nright != node)
				{
				 	pre = pre.nright;
				}
				
				if(pre.nright == null)
				{
					pre.nright = node;
					node = node.nleft;
					
				}
				else
				{
					pre.nright = null;
					System.out.println(node.value);
					node = node.nright;
				}
				
			}
		}
		
	}

	public static Node readFromString(String nodesString) {
		Node root = null;
		int[] nodeValues =    Arrays.stream(nodesString.split(" ")).mapToInt(Integer::parseInt).toArray();

		for (int nodeValue : nodeValues) {

			Node temp = root;
			Node parentofTemp = root;
			
			while (temp != null) {

				
				if(nodeValue > temp.value)
				{
					parentofTemp = temp;
					temp = temp.nright;
				}
				else
				{
					parentofTemp = temp;
					temp= temp.nleft;
				}
			}

			if (root == null) {
				root = new Node(nodeValue, null, null);

			} else {

				if(nodeValue <= parentofTemp.value)
				{
					parentofTemp.nleft = new Node(nodeValue, null, null);
				}
				else
				{
					parentofTemp.nright = new Node(nodeValue, null, null);;
				}
				
			}

		}

		return root;

	}

	public static void printInOrder(Node root)
	{
		
		if(root ==null)
		return;
		
		printInOrder(root.nleft);
		System.out.println(root.value);
		printInOrder(root.nright);
			
			
	}
	
	
	
	
	@Override
	public String toString() {

		
			
		
		return super.toString();
	}
	
}