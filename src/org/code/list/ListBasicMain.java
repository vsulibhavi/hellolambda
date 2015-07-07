package org.code.list;

public class ListBasicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List head = createList(78,56,12,95,100);
		print(head);
		printMiddle(head);
		
	}

	private static void printMiddle(List head) {

		List onex,twox;
		
		onex=head;
		twox = head.next;
		
		
		while(twox != null)
		{
			onex=onex.next;
			twox=twox.next; 
			if(twox!=null) twox=twox.next;
		}
		
		System.out.println("middle element is : "+ onex.value);
		
		
	}

	private static void print(List head) {

		while(head != null )
		{
			System.out.println(head.value);
			head = head.next;
			
		}
	}

	private static List createList(int... values) {
		// TODO Auto-generated method stub
		
		List head;
		head = new List();
		if(values.length == 0) return null;
		head.value  = values[0];
		head.next = null;
		List prev = head;
		for(int i=1;i<values.length;i++)
		{
			
			List node = new List();
			node.value = values[i];
			node.next = null;
			prev.next = node;
			prev=node;
			
		}
		return head;
		
	}

}
