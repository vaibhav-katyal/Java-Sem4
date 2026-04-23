// find kth node from end of linked list without counting the length of LL
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class seven {
    Node head;

    public void add(int data) {
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

    public void findKthFromEnd(int k) {
        Node slow = head;
        Node fast = head;

        for (int i = 0; i < k; i++) {
            if (fast == null) {
                System.out.println("k is greater than the length of the linked list.");
                return;
            }
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // second now points to the kth node from the end
        System.out.println("The " + k + "th node from the end is: " + slow.data);
    }

    public static void main(String[] args) {
        seven list = new seven();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int k = 2;
        list.findKthFromEnd(k);
    }
}