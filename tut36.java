import java.util.*;

// class Node {
//     int data;
//     Node next;
//     public Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

class LinkedList2{
    Node head;
    // Insertion at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    // Deletion of a node by value
    public void delete(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        Node previous = null;
        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            return; // Node with the given data not found
        }
        previous.next = current.next;
    }
    // Display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Original Linked List:");
        list.display();

        list.delete(2);
        System.out.println("Linked List after deleting 2:");
        list.display();

        list.delete(1);
        System.out.println("Linked List after deleting 1:");
        list.display();
    }
}






class linked{
    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    void insert(int data, Node head, int posi) {
        Node temp = new Node(data);
        if (posi == 0) {
            temp.next = head;
            head = temp;
        }
        Node cur = head;
        for (int i = 0; i < posi - 1; i++) {
            cur = cur.next;
        }
        temp.next = cur.next;
        cur.next = temp;
    }

    void delete(Node head, int posi) {
        if (posi == 0) {
            head = head.next;
        }
        Node cur = head;
        for (int i = 0; i < posi - 1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
    }
    void Display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

public static void main(String[] args){
    linked l=new linked();
    l.head=new Node(10);
    // l.head.next=new Node(20);
    // l.head.next.next=new Node(40);
    // l.head.next.next.next=new Node(50);
         l.insert(20,head,1);
     l.insert(20,head,2);
     l.insert(40,head,3);
     l.insert(50,head,4);
     l.Display(head);
     System.out.println();
     l.insert(30,head,2);
     l.Display(head);
     System.out.println();
     l.delete(head,4);
     l.Display(head);
}
}





class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    // Insert a node at a specific position
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        int currentPosition = 0;
        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }
        if (current == null) {
            System.out.println("Invalid position. Insertion not possible.");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

public void delete(int value) {
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Node not found.");
            return;
        }

        current.next = current.next.next;
    }


    // Display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtPosition(1, 0); // Insert 1 at the beginning
        list.insertAtPosition(3, 1); // Insert 3 at position 1
        list.insertAtPosition(2, 1); // Insert 2 at position 1
        list.display();                            // Display the linked list: 1 2 3
        list.insertAtPosition(40, 2);
        list.display(); 
        list.delete(3);
        list.display(); 
    }
}
