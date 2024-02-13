class Node {
    int data;         // This variable stores the data for the current node.
    Node next;        // This variable is a reference to the next node in the linked list.

    public Node(int data) {
        this.data = data;  // Constructor: Initialize the data of the node with the provided value.
        this.next = null;  // Initialize the 'next' reference to null, as this node is initially not connected to any other node.
    }
}

class ReverseLinkedList{
    Node head; // Reference to the head of the linked list

    // Function to reverse a linked list and return the new head
    //method 1
    /*public Node Reverse(Node head) {
        Node cur = head;
        Node prev = null;
        while (cur != null) {
            Node temp = cur.next; // Store the next node
            cur.next = prev;     // Reverse the current node
            prev = cur;          // Move prev to the current node
            cur = temp;          // Move to the next node
        }
        return prev; // The new head of the reversed linked list
    }*/

    //method 2(recursive)
    Node Reverse(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead = Reverse(head.next);
        Node headNext =head.next;
        headNext.next=head;
        head.next=null;
        return newHead;
    }

    // Function to display the linked list
    public void display() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(40);

        System.out.println("Original Linked List:");
        list.display();

        Node reversedHead = list.Reverse(list.head); // Reverse the linked list
        list.head = reversedHead; // Update the head to the new head of the reversed list

        System.out.println("Reversed Linked List:");
        list.display();
    }
}
