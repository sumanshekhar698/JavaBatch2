package com.java8.basics;

public class SLList<T> {
	public int size = 0;
	IntNode head, tail = null;

	// DoubliLinkedList Element - IntNode
	private class IntNode {
		private T data;
		private IntNode previous;
		private IntNode next;

		public IntNode(T data, IntNode previous, IntNode next) {
			this.data = data;
			this.previous = previous;
			this.next = next;
		}

		public IntNode() {
			next = previous = this;
		}

		public IntNode(T data) {
			this.data = data;
		}
	}

	public void addNode(T data) {
		// Create a new node
		IntNode newNode = new IntNode(data);

		// If doubly list is empty
		if (head == null) {
			head = tail = newNode;
			// head's previous will point to null
			head.previous = null;
			// tail's next will point to null, as it is the last node of the list
			tail.next = null;
		} else {
			// newNode will be added after tail such that tail's next will point to newNode
			tail.next = newNode;
			// newNode's previous will point to tail
			newNode.previous = tail;
			// newNode will become new tail
			tail = newNode;
			// As it is last node, tail's next will point to null
			tail.next = null;
		}
	}

//	public SLList() {
//		sentinel = new IntNode();
//	}

	public String turnTostring() {
//		String S = "";
//		for (int x = 0; x < size; x++) {
//			S += x;
//		}
//		return S;
		IntNode current = head;
		if (head == null) {
			return "Empty DLL";
		}
		String list = "null <==> ";

		while (current != null) {
			list += current.data + " <==> ";
			current = current.next;
		}
		list += null;
		return list;
	}

	public static void main(String[] args) {

		SLList<Integer> dl1 = new SLList<Integer>();
		dl1.addNode(3);
		dl1.addNode(34);
		dl1.addNode(36);
		dl1.addNode(333);

		String turnTostring = dl1.turnTostring();
		System.out.println(turnTostring);

	}
}