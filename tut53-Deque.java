import java.util.ArrayDeque;

class Dequq{
    public static void main(String[] args) {
        ArrayDeque<Integer> q=new ArrayDeque<>();
   q.offer(10);
      q.push(20); 
   q.addFirst(30);
      q.addLast(40);
System.out.println(q);
System.out.println(  "pop element is "+ q.pop());
   System.out.println(q);
   System.out.println("peek element is "+q.peek());

    }
} 