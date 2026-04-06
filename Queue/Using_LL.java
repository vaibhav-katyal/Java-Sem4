class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class LLImplemenation{
    Node front,rear;

    void enqueue(int ele){
        Node newNode = new Node(ele);

        if(rear == null){                                // if rear is null means there is no element in the queue
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    int dequeue(){
        if(front == null){                  // if front is null then the queue is empty 
            System.out.println("Undeflow");
            return -1;
        }

        int val = front.data;
        front = front.next;

        if(front == null){         // this means that queue is over now but the rear still points to the last element so we have to fix that
            rear = null;
        }

        return val;
    }

    int peek(){
        if(front == null){                  // if front is null then the queue is empty 
            System.out.println("Undeflow");
            return -1;
        }

        return front.data;
    }

    boolean isEmpty(){
        return front == null;
    }
}

public class Using_LL{
    public static void main(String[] args) {
        LLImplemenation ai = new LLImplemenation();
        ai.enqueue(10);
        ai.enqueue(20);
        ai.enqueue(30);
        ai.enqueue(40);
        ai.enqueue(60);
        ai.enqueue(70);

        System.out.println(ai.dequeue());
        System.out.println(ai.dequeue());

        System.out.println(ai.peek());
        System.out.println(ai.dequeue());
        System.out.println(ai.dequeue());
        System.out.println(ai.peek());
        System.out.println(ai.isEmpty());
    }
}