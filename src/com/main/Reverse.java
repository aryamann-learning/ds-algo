package com.main;

public class Reverse {
	static Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {

			data = d;
			next = null;
		}
	}

	Node reverse(Node node, Node prev, Node next, Node current) {
		prev = null;
		current = head;
		next = null;
		while (current != null)
			next = current.next;
		current.next = prev;
		prev = current;
		current = next;

		node = prev;
		return node;
	}

	void printList(Node node) {

		System.out.print(node.data + " ");
		node = node.next;
	}

	public static void main(String[] args) {
		// TODO: implement main method
	}
}
