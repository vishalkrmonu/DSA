import java.util.*;
class queue{
   // public static int queueimplemention(int []a)
   int queue[]=new int[5];
   int rar=-1;
   int front;
   public void insert(int x){
    rar++;
    queue[rar]=x;
    if(rar==queue.length-1){
        System.out.println("full");
    }
   }

   public int remove(){
        front=queue[0];
    for(int i=0;i<rar;i++){
        queue[i]=queue[i+1];
    }
    rar--;
     remove();
    return front;
   }

   public int peek(){
    return(queue[0]);
   }

   public void print(){
    for(int i=0;i<=rar;i++){
        System.out.print(queue[i]+" ");
    }
    System.out.println();
}

public static void main(String[] args) {
  queue q=new queue();
  q.insert(3);
  q.insert(7);
  q.insert(9);
    q.print();
    System.out.println(q.remove());
    q.print();
System.out.println(q.peek());

}
}

class queue1{
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(4);       
         q.add(6);
        q.add(7);
        q.add(9);
        q.add(45);
        System.out.println(q);

        System.out.println("remove element is ="+q.remove());
        System.out.println(q);

        System.out.println("peek element ="+q.peek());

         System.out.println("size of queue ="+q.size());

}
}

// implementation of stack using queue in leetcode