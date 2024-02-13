// Java program for implement deletion in Heaps
class deletionHea {
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[].Nn is size of heap
    static void heapify(int arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;
 
        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
 
    // Function to delete the root from Heap
    static int deleteRoot(int arr[], int n)
    {
        // Get the last element
        int lastElement = arr[n - 1];
 
        // Replace root with first element
        arr[0] = lastElement;
 
        // Decrease size of heap by 1
        n = n - 1;
 
        // heapify the root node
        heapify(arr, n, 0);
 
        // return new size of Heap
        return n;
    }
 
    /* A utility function to print array of size N */
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
 
    // Driver Code
    public static void main(String args[])
    {
        // Array representation of Max-Heap
        // 10
        //    /  \
        // 5    3
        //  / \
        // 2   4
        int arr[] = { 10, 5, 3, 2, 4 };
 
        int n = arr.length;
 
        n = deleteRoot(arr, n);
 
        printArray(arr, n);
    }
}


// Java program for implementing insertion in Heaps
class insertionHeap {
 
    // Function to heapify ith node in a Heap
    // of size n following a Bottom-up approach
    static void heapify(int[] arr, int n, int i)
    {
        // Find parent
        int parent = (i - 1) / 2;
     
        if (arr[parent] > 0) {
            // For Max-Heap
            // If current node is greater than its parent
            // Swap both of them and call heapify again
            // for the parent
            if (arr[i] > arr[parent]) {
                 
                  // swap arr[i] and arr[parent]
                int temp = arr[i];
                arr[i] = arr[parent];
                arr[parent] = temp;
               
                // Recursively heapify the parent node
                heapify(arr, n, parent);
            }
        }
    }
 
    // Function to insert a new node to the heap.
    static int insertNode(int[] arr, int n, int Key)
    {
        // Increase the size of Heap by 1
        n = n + 1;
     
        // Insert the element at end of Heap
        arr[n - 1] = Key;
     
        // Heapify the new node following a
        // Bottom-up approach
        heapify(arr, n, n - 1);
         
        // return new size of Heap
        return n;
    }
 
    /* A utility function to print array of size n */
    static void printArray(int[] arr, int n)
    {
        for (int i = 0; i < n; ++i)
            System.out.println(arr[i] + " ");
 
        System.out.println();
    }
 
    // Driver Code
    public static void main(String args[])
    {
        // Array representation of Max-Heap
        // 10
        //    /  \
        // 5    3
        //  / \
        // 2   4
         
        // maximum size of the array
        int MAX = 1000;
        int[] arr = new int[MAX];
         
        // initializing some values
        arr[0] = 10;
        arr[1] = 5;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 4;
         
        // Current size of the array
        int n = 5;
 
        // the element to be inserted
        int Key = 15;
         
        // The function inserts the new element to the heap and
        // returns the new size of the array
        n = insertNode(arr, n, Key);
 
        printArray(arr, n);
        // Final Heap will be:
        // 15
        //    /   \
        // 5     10
        //  / \   /
        // 2   4 3
    }
}