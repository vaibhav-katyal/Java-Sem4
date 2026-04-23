// circular linked list make, detect circular linked list and remove circular linked list
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class eight{
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Creating a circular linked list by connecting the last node to the second node
        head.next.next.next.next.next = head.next;

        // Detecting circular linked list using Floyd's Tortoise and Hare algorithm
        Node slow = head;
        Node fast = head;
        boolean isCircular = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                isCircular = true;
                break;
            }
        }

        if (isCircular) {
            System.out.println("The linked list is circular.");
            // Removing circular linked list
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            // Now both slow and fast point to the start of the loop
            // To remove the loop, we need to find the last node in the loop
            Node temp = slow;
            while (temp.next != slow) {
                temp = temp.next;
            }
            temp.next = null; // Removing the loop
            System.out.println("The circular linked list has been removed.");
        } else {
            System.out.println("The linked list is not circular.");
        }
    }
}
