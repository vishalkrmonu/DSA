import java.util.LinkedList;
import java.util.*;
import java.util.Stack;

//  https://www.geeksforgeeks.org/queue-interface-java/
class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // add elements to the queue
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");

        // print the queue
        System.out.println("Queue: " + queue);

        // remove the element at the front of the queue
        String front = queue.remove();
        System.out.println("Removed element: " + front);

        // print the updated queue
        System.out.println("Queue after removal: " + queue);

        // add another element to the queue
        queue.add("date");

        // peek at the element at the front of the queue
        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);

        // print the updated queue
        System.out.println("Queue after peek: " + queue);
    }
}

// tut50
class queueJava {
    public static void main(String[] args) {
        // Queue<Integer> q=new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20); // also used add()--> generate throw exception
        q.offer(30);
        System.out.println(q);
        System.out.println(q.poll()); // also used remove --> generate throw exception
        System.out.println(q.peek()); // also used element() --> generate throw exception
        System.out.println(q.size());
        System.out.println(q.isEmpty());

    }
}

// tut51
// implement Queue using Stack
// import java.util.*;
// import java.util.LinkedList;



class MyQueue1{
    Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        public void push(int data){
            s1.add(data);
        }
        int pop(){
            while(!s1.empty()){
                s2.add(s1.pop());
            }
            int ans=s2.pop();
            while(!s2.isEmpty()){
                s1.add(s2.pop());
            }
            return ans;
        }

    public static void main(String[] args) {
        MyQueue1 mq=new MyQueue1();
       mq.push(7);
        mq.push(9);
        mq.push(11);
        System.out.println(mq.pop());
                System.out.println(mq.pop());
        System.out.println(mq.pop()); 
    }
}




class MyStack1{
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public void push(int data) {
      while(!q1.isEmpty()){
        q2.add(q1.poll());
      }
      q1.add(data);  //new element add
      while(!q2.isEmpty()){
        q1.add(q2.poll());
      }
    }
    int pop(){
        return q1.poll();
    }
    int peek(){
       return q1.peek();
    }
    public static void main(String[] args) {
         MyStack1 m = new MyStack1();
        m.push(7);
        m.push(9);
        m.push(11);
        System.out.println(m.peek() + " ");
        m.pop();
        System.out.println(m.peek() + " ");

    }
}