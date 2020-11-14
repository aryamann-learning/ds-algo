package com.stack;

public class Stack {
	int arr[];
	int top;
	int MAX;

	Stack(int size) {
		MAX = size;
		top = -1;
		arr = new int[size];
	}

	public void push(int ele) throws Exception {
		if (isFull()) {
			throw new Exception("stack overflow");
		}
		top = top + 1;
		arr[top] = ele;
	}
    public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("stack underflow");
		}
		int ele = arr[top];
		top = top - 1;
		return ele;
	}
	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}
	public boolean isFull() {
		if (top == MAX - 1) {
			return true;
		}
		return false;
	}
	public void print() {
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
    public static void main(String[] args) throws Exception {
		Stack stack = new Stack(5);
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		stack.print();
		stack.pop();
		stack.print();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.print();
		
	}
}
