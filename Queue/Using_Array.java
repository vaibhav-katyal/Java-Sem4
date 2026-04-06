class ArrayImplementation{
    int arr[];
    int front, rear, size;

    ArrayImplementation(int size){
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = -1;                                        
    }

    void enqueue(int ele){
        if(rear == size-1){                                
            System.out.println("Overflowed");
            return;
        }

        arr[++rear] = ele;
    }

    int dequeue(){
        if(front > rear){                               // if front crosses rear, it means that there happened more dequqeus than enqueues, so the elements are over
            System.out.println("Underflow");
            return -1;                
        }

        return arr[front++];
    }

    int peek(){
        if(front > rear){                               // if front crosses rear, it means that there happened more dequqeus than enqueues, so the elements are over
            System.out.println("Underflow");
            return -1;                
        }

        return arr[front];
    }

    boolean isEmpty(){
        return front>rear;
    }

    boolean isFull(){
        return rear==size-1;
    }
}

public class Using_Array{
    public static void main(String[] args) {
        ArrayImplementation ai = new ArrayImplementation(5);
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
        System.out.println(ai.isEmpty());
        System.out.println(ai.isFull());
    }
}