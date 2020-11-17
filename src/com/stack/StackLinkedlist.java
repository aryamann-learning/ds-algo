package com.stack;

public class StackLinkedlist {
	StackNode top;

	StackLinkedlist() {
		this.top = null;
	}
	public void push(int x)
	{
		StackNode temp = new StackNode();
		if (temp == null) {
			System.out.print("\nStack Overflow");
	      return;
		}
		temp.data = x;
		temp.root = top;
		top = temp;
	}
	public boolean isEmpty() {
		return top == null;
	}

	public int peek() {
		if (!isEmpty()) {
			return top.data;
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public void pop() {
		if (top == null) {
			System.out.print("\nStack Underflow");
			return;
		}
		top = (top).root;
	}

	public void display() {
		if (top == null) {
			System.out.printf("\nStack Underflow");
			return;
		} else {
			StackNode temp = top;
			while (temp != null) {
				System.out.printf("%d->", temp.data);
				temp = temp.root;
			}
		}
	}

	public static void main(String[] args) {
		StackLinkedlist obj = new StackLinkedlist();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);

		obj.display();

		System.out.printf("\nTop element is %d\n", obj.peek());

		obj.pop();
		obj.pop();
		
		obj.display();
		System.out.printf("\nTop element is %d\n", obj.peek());
	}
}
