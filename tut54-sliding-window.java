// Input: arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, K = 3 
// Output: 3 3 4 5 5 5 6
// Explanation: Maximum of 1, 2, 3 is 3
//                        Maximum of 2, 3, 1 is 3
//                        Maximum of 3, 1, 4 is 4
//                        Maximum of 1, 4, 5 is 5
//                        Maximum of 4, 5, 2 is 5 
//                        Maximum of 5, 2, 3 is 5
//                        Maximum of 2, 3, 6 is 6

// Input: arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13}, K = 4 
// Output: 10 10 10 15 15 90 90    

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;





class Method1 {
    // Method to find the maximum for
    // each and every contiguous
    // subarray of size K.
    static void printKMax(int arr[], int N, int K)
    {
        int j, max;
 
        for (int i = 0; i <= N - K; i++) {
 
            max = arr[i];
 
            for (j = 1; j < K; j++) {
                if (arr[i + j] > max)
                    max = arr[i + j];
            }
            System.out.print(max + " ");
        }
    }
 
    // Driver's code
    public static void main(String args[])
    {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int K = 3;
       
          // Function call
        printKMax(arr, arr.length, K);
    }
}


class Method2{
    static ArrayList<Integer> findMaxElement(int[] arr,int n,int k){
                PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

    ArrayList<Integer> res =new ArrayList<>();
    int i=0;
    for(;i<k;i++)
queue.add(arr[i]);
res.add(queue.peek());
queue.remove(arr[0]);
for(;i<n;i++){
queue.add(arr[i]);
res.add(queue.peek());
queue.remove(arr[i-k+1]);
}
return res;
    }
    
    public static void main(String[] args) {
         int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int K = 3;
       
          // Function call
          System.out.println(findMaxElement(arr, arr.length, K));
    }
}



// Java Program to find the maximum for
// each and every contiguous subarray of size K.

 
class SlidingWindow {
 
    // A Dequeue (Double ended queue)
    // based method for printing
    // maximum element of
    // all subarrays of size K
    static void printMax(int arr[], int N, int K)
    {
 
        // Create a Double Ended Queue, Qi
        // that will store indexes of array elements
        // The queue will store indexes of
        // useful elements in every window and it will
        // maintain decreasing order of values
        // from front to rear in Qi, i.e.,
        // arr[Qi.front[]] to arr[Qi.rear()]
        // are sorted in decreasing order
        Deque<Integer> Qi = new LinkedList<Integer>();
 
        /* Process first k (or first window)
        elements of array */
        int i;
        for (i = 0; i < K; ++i) {
 
            // For every element, the previous
            // smaller elements are useless so
            // remove them from Qi
            while (!Qi.isEmpty()
                   && arr[i] >= arr[Qi.peekLast()])
 
                // Remove from rear
                Qi.removeLast();
 
            // Add new element at rear of queue
            Qi.addLast(i);
        }
 
        // Process rest of the elements,
        // i.e., from arr[k] to arr[n-1]
        for (; i < N; ++i) {
 
            // The element at the front of the
            // queue is the largest element of
            // previous window, so print it
            System.out.print(arr[Qi.peek()] + " ");
 
            // Remove the elements which
            // are out of this window
            while ((!Qi.isEmpty()) && Qi.peek() <= i - K)
                Qi.removeFirst();
 
            // Remove all elements smaller
            // than the currently
            // being added element (remove
            // useless elements)
            while ((!Qi.isEmpty())
                   && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();
 
            // Add current element at the rear of Qi
            Qi.addLast(i);
        }
 
        // Print the maximum element of last window
        System.out.print(arr[Qi.peek()]);
    }
 
    // Driver's code
    public static void main(String[] args)
    {
        int arr[] = { 12, 1, 78, 90, 57, 89, 56 };
        int K = 3;
       
          // Function call
        printMax(arr, arr.length, K);
    }
}