public class five{
    public Node insertAtHead(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    public void insertAtEnd(Node head, int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        five list = new five();
        System.out.println("Original LinkedList:");
        list.display(head); 
        head = list.insertAtHead(head, 5);
        System.out.println("After inserting 5 at head:");
        list.display(head);
        list.insertAtEnd(head, 60);
        System.out.println("After inserting 60 at end:");
        list.display(head);

    }
}