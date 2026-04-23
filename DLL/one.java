// implement doubly linked list

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;
 
    DoublyLinkedList() {
        this.head = null;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    void insertAtFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    void deleteNode(int key) {
        Node temp = head;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Change head
            if (head != null) {
                head.prev = null; // Set new head's prev to null
            }
            return;
        }

        // Search for the key to be deleted, keep track of the previous node
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null) return;

        // Unlink the node from linked list
        if (temp.next != null) {
            temp.next.prev = temp.prev; // Change next only if the node to be deleted is NOT the last node
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next; // Change prev only if the node to be deleted is NOT the first node
        }
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class one {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtEnd(1);
        dll.insertAtEnd(2);
        dll.insertAtEnd(3);
        dll.insertAtEnd(4);

        System.out.println("Doubly Linked List:");
        dll.printList();

        System.out.println("\n\nDeleting node with value 3:");
        dll.deleteNode(3);
        dll.printList();
    }
}