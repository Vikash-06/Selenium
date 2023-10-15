package collectionsframework;

//A linked list in Java is a dynamic data structure whose size increases as you add the elements and decreases as you remove the elements from the list
//singly linkedlist:
//Each element in the list is called a node.
//each node has divided in two parts first is for data and the second is called pointer which points to the next node in the list.
//first node is referred to the head of the list and the last node points to the null


//how to create your own list

public class LinkedListConcept {
	Node head;

	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			next = null;

		}
	}

	public void printlinkedlist() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;

		}

	}

	public static void main(String[] args) {
		LinkedListConcept ll = new LinkedListConcept();

//create a Node
		Node first = ll.new Node("vikash");
		ll.head = first;

		Node second = ll.new Node("aakash");
		first.next = second;
		Node third = ll.new Node("sonal");
		second.next = third;
		ll.printlinkedlist();
	}

}
