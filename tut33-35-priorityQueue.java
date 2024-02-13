
// import java.util.PriorityQueue;
import java.util.*;

//work in min heap(by default)
class priority {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(15);
        pq.add(10);
        System.out.println("size is " + pq.size());
        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.poll(); // this is use to remove top element
        }
    }
}

// for max heap
class priority1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(5);
        pq.add(15);
        pq.add(10);
        System.out.println("size is " + pq.size());
        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.poll(); // this is use to remove top element
        }
    }
}

// print kth largest element in an array
class large {
    public static int largest(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (pq.peek() < arr[i]) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int arr[] = { 20, 10, 60, 30, 50, 40 };
        int k = 3;
        System.out.println(largest(arr, k));
    }
}

// print kth smallest element in an array
class small {
    public static int smallest(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (pq.peek() > arr[i]) {
                // pq.poll(); //remove the element
                pq.remove();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int arr[] = { 20, 10, 60, 30, 50, 40 };
        int k = 3;
        System.out.println(smallest(arr, k));
    }
}

// find the min cost after connect all ropes(tut34)
class ropes {
    public static int Mincost(int arr[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int ans = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            int sum = first + second;
            ans += sum;
            pq.add(sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 4, 8, 6, 9 };
        System.out.println(Mincost(arr));
    }
}

// find the median of a number stream(tut35)
class medianOfStream {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public void insertNum(int num) {
        if (maxHeap.isEmpty() || maxHeap.peek() >= num) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }
        // either both the heap will have equal num of element of max heap will have one
        // more element than the min heap
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (maxHeap.size() < minHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }
    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return maxHeap.peek() / 2.0 + minHeap.peek() / 2.0; // even num of element
        }
        return maxHeap.peek();
    }
    public static void main(String[] args) {
        medianOfStream mos = new medianOfStream();
        mos.insertNum(3);
        mos.insertNum(1);
        System.out.println(mos.findMedian());
        mos.insertNum(5);
        System.out.println(mos.findMedian());
        mos.insertNum(4);
        System.out.println(mos.findMedian());
    }
}