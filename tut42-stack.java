// Find the nearest smaller numbers on left side(previous side) in an array
// Input:  arr[] = {1, 6, 4, 10, 2, 5}
// Output:         {-1, 1, 1,  4, 1, 2}

// Input: arr[] = {1, 3, 0, 2, 5}
// Output:        {-1, 1, -1, 0, 2}
import java.util.Stack;

class prevSmall {
    public static void previousSmallerElement(int arr[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && s.peek() >= arr[i]) {
                s.pop();
            }
            //// Find the nearest greatest numbers on left side(previous side) in an array
            //  while (!s.isEmpty() && s.peek() <= arr[i]) {
            //     s.pop();
            // }
            if (s.isEmpty()) {
                System.out.print("-1 ,");
            } else {
                System.out.print(s.peek() + ",");
            }
            s.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, 0, 2, 5 };
        previousSmallerElement(arr);
    }
}


//Next small Element (NGE) for every element in given Array
class nextsmall {
    public static void NextSmallerElement(int arr[]) {
        Stack<Integer> s = new Stack<>();
        //start from end
        for (int i = arr.length-1; i >=0; i--) {
            while (!s.isEmpty() && s.peek() >= arr[i]) {
                s.pop();
            }
            //// Find the nearest greatest numbers on left side(previous side) in an array
            //  while (!s.isEmpty() && s.peek() <= arr[i]) {
            //     s.pop();
            // }
            if (s.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(s.peek() + " ");
            }
            s.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 3,10,5,1,15,10,7,6};
        NextSmallerElement(arr);
    }
}