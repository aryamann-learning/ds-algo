/*package com.main;

public class Insert {

	static Node GetNode(int data)
	{
		return new Node();
	}
	static Node Insertpos(Node head,int pos,int data)
	{      Node node= GetNode(0);
	if(position<1)
	{
		System.out.println("invalid position");
	}
	if(position==1)
	{    Node newnode=new Node();
	newnode.next =headnode;
	headnode=newnode;
	}
	while(position--!=0)
	{ if(position==1)
	{ Node newnode = new Node();
	newnode.next = headnode.next;
	headnode.next=newnode;
	break;
	}
	headnode= headnode.next;
	}
	if(position!=1)
	{
		System.out.println("position out of range");
	}
	return head;
	}
	public static viod main(String[]args)
	{
		Node head= GetNode(3);
		head.next = GetNode(12);
		head.next.next = GetNode(6);
		head.next.next.next = GetNode(18);
		System.out.println("linked list before insertion :");
		printList(head);
		int data=8 , pos =2;
		head= InsertAnypos(head , pos, data);
		System.out.println("linked list after: "+"insertion of 8 at position 2");
	}
}







*/