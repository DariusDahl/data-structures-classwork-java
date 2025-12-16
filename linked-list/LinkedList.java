package Linked_List;

public class Linked_List {
	
	Node head;
	Node tail;
	
	public Linked_List() {
		head = tail = null;
	}
	
	public void addNode(Node tempNode) {
		//first case where head is null
		if (head == null) {
			head = tempNode;
			tail = head;
		}
		else {
			//head is not null
			tail.next = tempNode;
			tail = tail.next;
		}
	}
	
	//add a remove Node method
	//basically delete a Node by skipping one
	//head = head.next; (?)
	
	public Node getNodeAt(int index) {
		Node current = head;
		int count = 0;
		while (current != null) {
			if (index == count) {
				return current;
			}
			current = current.next;
			count++;
		}
		System.out.println("Error: Index out of bounds!");
		return null;
	}
	
	public void printAll() {
		Node current = head;
		while (current != null) {
			System.out.println(current.info);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		Linked_List myLinkedList = new Linked_List();

		for (int i = 0; i < 10; i++) {
			myLinkedList.addNode(new Node((i + 1) * 10));
		}
		
		myLinkedList.printAll();
		
		Node tempNode = myLinkedList.getNodeAt(5);
		System.out.println("5th Node: " + tempNode.info);
	}

}
