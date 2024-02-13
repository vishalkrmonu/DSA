//        50
//      /    \
//    30      40
//   /  \     / \
// 10    5  20   30
//binary tree given
// https://www.geeksforgeeks.org/insertion-and-deletion-in-heaps/
//insert the element
class tut31 {
    public static void insert(int arr[], int n, int value) {
        n = n + 1; // Increment the size of the array
        arr[n] = value; // Insert the new element at the end
        int i = n; // Index of the newly inserted element
        while (i > 1) {
            int parent = i / 2; // Calculate the parent index
            if (arr[parent] < arr[i]) {
                // Swap elements if the parent is smaller
                //swap(arr,parent,i)
                int temp = arr[parent];
                arr[parent] = arr[i];
                arr[i] = temp;
                i = parent; // Move to the parent index
            } else {
                break; // Max-heap property is restored
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 50, 30, 40, 10, 5, 20, 30 };
        int n = 7;
        int value = 60;
        insert(arr, n, value);
        // Print the updated array
        for (int i = 0; i < n + 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


class del{
    public static void delete(int arr[],int n){
arr[1]=arr[n];
n=n-1;
int i=1;
while(i<n){
    int left=arr[2*i];
    int right=arr[2*i+1];
    int larger;
    // int larger=left>right ? 2*i : 2*i+1;
    if(left>right){
        larger=2*i;
    }
    else{
        larger= 2*i+1;
    }
    if(arr[i]<arr[larger]){
        // swap(arr,i,larger);
         int temp = arr[i];
                arr[i] = arr[larger];
                arr[larger] = temp;
        i=larger;
    }else{
        return;
    }
}

    }
    public static void main(String[] args) {
         int arr[] = { 50, 30, 40, 10, 5, 20, 30 };
        int n = 7;
        // int value = 60;
        delete(arr, n);
        // Print the updated array
        for (int i = 0; i < n -1; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}