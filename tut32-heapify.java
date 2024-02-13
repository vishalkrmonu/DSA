//convert the heap
// Java program for building Heap from Array

class Buildheapp{
    public static void heapify(int arr[], int N, int i) {
        int larger = i;
        int l = 2 * i+1;
        int r = 2 * i + 2;
        if (l < N && arr[l] > arr[larger]) {
            larger = l;
        }
        if (r <N && arr[r] > arr[larger]) {
            larger = r;
        }
        if (larger != i) {
            // swap(arr,i,larger);
            int temp = arr[i];
            arr[i] = arr[larger];
            arr[larger] = temp;
                        // Recursively heapify the affected sub-tree
            heapify(arr, N, larger);
        }
    }

   public static void buildHeap(int arr[],int N) {
        for (int i = (N / 2)-1; i >= 0; i--) {
            heapify(arr, N, i);
        }
    }
    static void printHeap(int arr[], int N)
    {
        System.out.println( "Array representation of Heap is:");
 
        for (int i = 0; i < N; ++i)
            System.out.print(arr[i] + " ");
        // System.out.println();
    }
    public static void main(String[] args) {
        // Binary Tree Representation
        // of input array
        //            1
        //         /      \
        //       3        5
        //     /   \       / \
        //  4       6  13 10
        // / \    /  \
        // 9  8  15   17
        int arr[] = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
        int N = arr.length;
        buildHeap(arr, N);
        printHeap(arr, N);
    }
}