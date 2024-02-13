// question 215 PriorityQueue

// 1464

// 876 linked list leet code question
// 141 cycle linked list
// 206 reverse linked list
// 237 deleteNode in linked list

// normal for node
// class Node{
// int data{
// Node.next;
// Node(int data){
// this.data=data;
// }
// }
// }

// connect the node

// [10]-->[20]-->[30]-->null

// void main(){
// Node n1=new Node(10);
// Node n2=new Node(20);
// Node n3=new Node(30);
// Node.head=n1;
// head.next=n2;
// n2.next=n3;
// n3.next=null;
// }

// simple traverse(one point to another)
// void main(){
// traverse(head);
// }
// void traverse(Node head){
// Node cur==head;
// while(cur!=null){
// print(cur.data);
// cur=cur.next;
// }
// }

// insertion at 3rd position
// void main(){
// insert(30,head,3);
// }
// void insert(int data,Node head,int pos){
// Node toAdd=new Node(data);
// if(pos==0){
// toAdd.next=head;
// head=toAdd;
// return;
// }
// Node prev=head;
// for(int i=0;i<pos-1;i++){
// prev=prev.next;
// }
// toAdd.next=prev.next;
// }

// deletion
// void main(){
// delete(head,3);
// }
// void delete(Node head,int pos){
// if(pos==0){
// head=head.next;
// return;
// }
// Node prev=head;
// for(int i=0;i<pos-1;i++){
// prev=prev.next;
// }
// prev.next=prev.next.next;
// }



class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class link{
    public static void insert(int data, Node head, int pos){
        Node toAdd=new Node(data);
        if(pos==0){
            toAdd.next=head;
            head=toAdd;
            return;
        }
        Node prev=head;
        for(int i=0;i<pos-1;i++){
            prev=prev.next;
        }
        toAdd.next=prev.next;
        prev.next=toAdd;

    }
   void Display(Node head){
    Node cur=head;
    while(cur!=null){
        System.out.print(cur.data +" ");
        cur=cur.next;
    }
    System.out.println();
   }

    public static void main(String[] args) {
link l=new link();
        Node n1=new Node(10);
                Node n2=new Node(20);
        Node n3=new Node(30);
Node head= n1;
n1.next=n2;
n2.next=n3;
n3.next=null;
insert(80, head, 2);
l.Display(head);
}
}

// Input: head = [1,1,2]
// Output: [1,2]
// delete Duplicate node 
// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         ListNode current =head;
//         while(current!=null && current.next!=null){
//             if(current.val ==current.next.val){
//                 current.next=current.next.next;
//             }else{
//                 current= current.next;
//             }
//         }
//         return head;
//     }
// }