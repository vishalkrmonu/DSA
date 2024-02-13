import java.util.*;
class Pq {
    public static void main(String[] args) {
                // PriorityQueue<Integer>pq=new PriorityQueue<>();  //min heap
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());  //max heap

        //add
        pq.add(5);
                pq.add(7);
        pq.add(9);
        pq.add(11);
System.out.println(pq);

//remove
System.out.println(pq.remove());
System.out.println(pq);
System.out.println(pq.peek());   //peek

    }
}


// class Solution {
//     public int maxProduct(int[] nums) {
//         // Create a max heap (priority queue) to store the elements in descending order
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

//         // Add all elements from the input array to the max heap
//         for (int i = 0; i < nums.length; i++) {
//             pq.add(nums[i]);
//         }
        
//         // Extract the largest element from the max heap
//         int i = pq.peek();  // Largest element
//         pq.remove();       // Remove the largest element from the heap
        
//         // Extract the second largest element from the max heap
//         int j = pq.peek();  // Second largest element
        
//         // Calculate and return the result, which is the product of (i-1) and (j-1)
//         return ((i - 1) * (j - 1));
//     }
// }




//     PriorityQueue<Integer>pq=new PriorityQueue<>();  //min heap
    //     for(int i=0;i<nums.length;i++){
    //     pq.add(nums[i]);
    //     }
    //     for(int i=0;i<nums.length-k;i++){
    //         pq.remove();
    //     }

    //    return pq.peek();
//     }
// }