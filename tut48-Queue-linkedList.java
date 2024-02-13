import java.util.LinkedList;
import java.util.Queue;
//  https://www.geeksforgeeks.org/queue-interface-java/

//quque using linked list
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}
class Queuee{
    Node front,rear;
    void Enqueue(int data){
        Node newNode=new Node(data);
        if(front==null){
            front=rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }
   int dequeue(){
        if(front==null){
            System.out.println("node is empty");
            return -1;
        }
        int result=front.data;
        front=front.next;
        return result;
    }

     void displayQueue() {
        Node current = front;
        System.out.print("Queue elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
       Queuee q = new Queuee();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.displayQueue(); // Print all elements in the queue
       System.out.println("Dequeued: " + q.dequeue()); // Dequeue and print the front element (10)
        System.out.println("Dequeued: " + q.dequeue()); // Dequeue and print the front element (20)
    }
}
