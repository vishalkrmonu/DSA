//Queue using Array
class Queues{
    int arr[];
    int capacity;
    int rear;
    public  Queues(int n){
        capacity=n;
        arr=new int[n];
        rear=-1;
    }
    void enqueue(int data){
        if(rear==capacity-1){
            System.out.println("overflow");
            // throw new Exception();
        }
        rear++;
        arr[rear]=data;
    }
    int dequeue(){
        if(rear==-1){
            System.out.println("empty");
                        // throw new Exception();
        }
        int result=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return result;
    }
    int getfront(){
        if(rear==-1){
            System.out.println("empty");
                        // throw new Exception();
        }
        return arr[0];
    }
    void display() {
        if (rear == -1) {
            System.out.println("Empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
    Queues queue = new Queues(5); // Create a queue with a capacity of 5

    // Enqueue some elements
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);
    queue.display();
    // Dequeue and print elements
    System.out.println("Dequeue: " + queue.dequeue()); // Dequeue: 1
    System.out.println("Dequeue: " + queue.dequeue()); // Dequeue: 2

    // Get the front element without removing it
    System.out.println("Front: " + queue.getfront()); // Front: 3

    // Enqueue more elements
    queue.enqueue(6);
    queue.enqueue(7);

    // Dequeue remaining elements
    while (queue.rear >= 0) {
        System.out.println("Dequeue: " + queue.dequeue());
    }
}
}


//method 2
class CircularArrayQueue{
    int arr[];
    int n;
    int front=-1,rear=-1;
    public CircularArrayQueue(int n){
        this.n=n;
        arr=new int [n];
    }
    void enqueue(int data){
        if((rear+1)%n==front){
             System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
    
    if(front==-1)
    front=0;
    rear=(rear+1)%n;
    arr[rear]=data;
}
int dequeue(){
    if(front==-1){
        System.out.println("throw Exception");
    }
    int result =arr[front];
    if(front==rear){
    front=rear=-1;
    }else{
        front=(front+1)%n;
    }
    return result;
}
 boolean isEmpty() {
        return front == -1 && rear == -1;
    }
boolean isFull() {
        return (rear + 1) % n == front;
    }

    public static void main(String[] args) {
        CircularArrayQueue queue = new CircularArrayQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Dequeuing elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }

        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);

        System.out.println("Dequeuing elements after enqueuing 6, 7, and 8:");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
 