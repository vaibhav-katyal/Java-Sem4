// insert at a specific position in a linked list
public class six{
    public Node insertAtPosition(Node head, int data, int position){
        Node newNode = new Node(data);
        if(position == 1){
            newNode.next = head;
            return newNode;
        }
        Node temp = head;
        for(int i = 1; i < position - 1 && temp != null; i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Position out of bounds");
            return head;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
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

        six list = new six();
        System.out.println("Original LinkedList:");
        list.display(head); 
        head = list.insertAtPosition(head, 25, 3);
        System.out.println("After inserting 25 at position 3:");
        list.display(head);
    }
}