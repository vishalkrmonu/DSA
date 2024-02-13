// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//     }
// }
class detect{
Node detectCycle(Node head){
    Node slow =head;
    Node fast= head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            return slow;
        }
    }
    return null;
}

Node detectFirstNode(Node head){
    Node meet=detectCycle(head);
     if (meet == null) {
            return null; // No cycle detected
        }
    Node start=head;
    while(start!=meet){
        start=start.next;
        meet=meet.next;
    }
    return start;
}
    public static void main(String[] args) {
        detect l = new detect();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(10);
        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n1;
         Node firstNodeInCycle = l.detectFirstNode(head);
        if (firstNodeInCycle != null) {
            System.out.println("First Node in the Cycle: " + firstNodeInCycle.data);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}

// tut40
//Duplicate a Linked list with random pointer

// Node duplicate(Node head){
//     Node cur =head;
//     while(cur!=null){
//         Node temp=cur.next;
//         cur.next=new Node(cur.data);
//         cur.next.next=temp;
//         cur=temp;
//     }
//     cur =head;


// while(cur!=null){
//     if(cur.next!=null){
//         cur.next.random=(cur.random!=null)?cur.random.next:null;

//     }
//     cur=cur.next.next;
// }
//     Node orig=head,copy=head.next;
//     Node temp=copy;//seperate both the linked lists
//     while(orig!=null){
//         orig.next=orig.next.next;
//         copy.next=copy.next.next;
//         orig=orig.next;
//         copy=copy.next;
//     }
//     return temp;
// }