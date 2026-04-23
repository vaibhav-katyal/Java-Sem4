// split a circular linked list into two halves
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    CircularLinkedList() {
        this.head = null;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head; // Point to itself to make it circular
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head; // Point to head to maintain circular structure
    }

    void splitList() {
        if (head == null || head.next == head) {
            System.out.println("List is too short to split.");
            return;
        }

        Node slow = head;
        Node fast = head;

        // Use the fast and slow pointer technique to find the middle
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Now slow is at the midpoint
        Node secondHalfHead = slow.next; // Start of the second half
        slow.next = head; // End of the first half points back to head

        // Find the end of the second half and point it back to secondHalfHead
        Node temp = secondHalfHead;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = secondHalfHead; // End of the second half points back to its start

        // Print the two halves
        System.out.println("First Half:");
        printList(head);
        System.out.println("Second Half:");
        printList(secondHalfHead);
    }


    void printList(Node node) {
        if (node == null) return;
        Node temp = node;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != node);
        System.out.println();
    }
}

public class one {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtEnd(1);
        cll.insertAtEnd(2);
        cll.insertAtEnd(3);
        cll.insertAtEnd(4);
        cll.insertAtEnd(5);

        System.out.println("Original List:");
        cll.printList(cll.head);

        cll.splitList();
    }
}