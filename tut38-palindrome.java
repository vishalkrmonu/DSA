class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class PalindromeLinkedList {
    public boolean Palindrome(Node head) {
        if (head == null)
            return true;
        Node mid = middle(head);
        Node last = Reverse(mid.next);
        Node cur = head;
        while (last != null) {
            if (last.data != cur.data)
                return false;
            last = last.next;
            cur = cur.next;
        }
        return true;
    }

    Node middle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // method 2(recursive)
    Node Reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = Reverse(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;
        return newHead;
    }

    void Display(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PalindromeLinkedList l = new PalindromeLinkedList();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(10);
        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = null;
        System.out.println(l.Palindrome(head));
        // l.Palindrome(head);
        l.Display(head);
    }
}
