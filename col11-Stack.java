import java.util.*;

class Stack {
    int[] stack = new int[5];
    int top = -1;

    public void push(int x) {
        if (top == stack.length - 1) {
            System.out.println("stack overflow");
            return;
        }
        top++;
        stack[top] = x;
    }

    public int pop() {
        int popped = stack[top];
        // top--/;
        // return popped;
        if (top == -1) {
            System.out.println("stack is underflow");
        }
        return popped;
    }

    public int peek() {
        if (top == -1) {
            System.out.println("can not peek");
        }
        return stack[top];
    }

    public void printStack() {
        for (int i = 0; i < top; i++) {
            System.out.println(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(3);
        st.push(5);
        st.push(7);
        st.push(9);
        st.push(11);
        st.printStack();
        st.pop();
        st.printStack();
        System.out.println(st.peek());
        st.pop();
        st.pop();
        st.pop();
    }
}

// class Stack1{
// public static void main(String[] args) {
// Stack<Integer> st= new Stack<>();
// st.push(3);
// st.push(5);
// st.push(7);
// System.out.println(st);
// st.pop();
// System.out.println(st);
// System.out.println(st.peek());

// //size
// System.out.println(st.size());
// //isEmpty
// System.out.println(st.isEmpty());
// }
// }


