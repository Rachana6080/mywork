package week1week1;

public class MergeSortedLinkedLists {
	    public static void main(String[] args) {
	        // Create a new linked list called "list1"

	        LinkedList list1 = new LinkedList();
	        list1.append(2);
	        list1.append(7);
	        list1.append(9);

	        LinkedList list2 = new LinkedList();
	        list2.append(3);
	        list2.append(8);
	        list2.append(6);

	        System.out.println("List 1:");
	        list1.display();
	        System.out.println("List 2:");
	        list2.display();

	        LinkedList mergedList = LinkedList.mergeSortedLists(list1, list2);

	        System.out.println("Merged List:");
	        mergedList.display();
	    }
	}

