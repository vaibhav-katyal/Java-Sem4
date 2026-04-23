// find pair with given sum in DLL
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

    boolean findPairWithSum(int sum) {
        if (head == null) {
            return false;
        }
        Node left = head;
        Node right = head;

        // Move right to the end of the list
        while (right.next != null) {
            right = right.next;
        }

        while (left != right) {
            int currentSum = left.data + right.data;
            if (currentSum == sum) {
                return true; // Pair found
            } else if (currentSum < sum) {
                left = left.next; // Move left pointer to the right
            } else {
                right = right.prev; // Move right pointer to the left
            }
        }
        return false; // No pair found
    }
}

public class two {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtEnd(1);
        dll.insertAtEnd(2);
        dll.insertAtEnd(3);
        dll.insertAtEnd(4);
        dll.insertAtEnd(5);

        int sum = 7;
        if (dll.findPairWithSum(sum)) {
            System.out.println("Pair with sum " + sum + " found in the doubly linked list.");
        } else {
            System.out.println("No pair with sum " + sum + " found in the doubly linked list.");
        }
    }
}