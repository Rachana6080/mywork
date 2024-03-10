package week1week1;

public class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class LinkedList {
	    Node head;

	    public LinkedList() {
	        this.head = null;
	    }

	    public void append(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node current = head;
	        while (current.next != null) {
	            current = current.next;
	        }
	        current.next = newNode;
	    }

	    public static LinkedList mergeSortedLists(LinkedList list1, LinkedList list2) {
	        LinkedList mergedList = new LinkedList();
	        Node current1 = list1.head;
	        Node current2 = list2.head;

	        while (current1 != null && current2 != null) {
	            if (current1.data < current2.data) {
	                mergedList.append(current1.data);
	                current1 = current1.next;
	            } else {
	                mergedList.append(current2.data);
	                current2 = current2.next;
	            }
	        }

	        while (current1 != null) {
	            mergedList.append(current1.data);
	            current1 = current1.next;
	        }

	        while (current2 != null) {
	            mergedList.append(current2.data);
	            current2 = current2.next;
	        }

	        return mergedList;
	    }

	    public void display() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }
	}

	


