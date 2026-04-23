class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}


public class four{

    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while(current != null) {
            next = current.next;      
            current.next = prev;       
            prev = current;            
            current = next;            
        }
        return prev;  
    }
    
    public static void printList(Node head) {
        Node temp = head;
        while(temp != null) {
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
        
        System.out.println("Original LinkedList:");
        printList(head);
        
        // Reverse the linked list
        head = reverseList(head);
        
        System.out.println("Reversed LinkedList:");
        printList(head);
    }
}