import java.util.*;

class bubblesort {
    public static void bubbleSort(int[] arr, int n) { // no need to create obj because here is static used
                                                      // when use the int then write the return (in int)
                                                      // when use the void then dont write the return
        System.out.println("acending order is =");
        for (int i = 0; i < n; i++) { // itration
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    swap(arr, j + 1, j);
                }
            }
            if (!swapped) {
                // System.out.println("already sorted");
                break;
            }
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = 5;
        bubbleSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

// selection sort
class selection {
    public static void selectionSort(int[] arr, int n) {
        System.out.println("acending  order =");
        for (int i = 0; i < n - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            // swap(i,smallest)
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }
  
    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 8, 2 };
        int n = 5;
        selectionSort(arr, n); // calling for function
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


   
class insertion {
    public static void insertionSort(int[] arr, int n) {
        System.out.println("acending order =");
        for (int i = 1; i < n; i++) {
            // int temp = arr[i];
            // int j;
            // for (j = i - 1; j >= 0; j--) {
            // if (temp < arr[j]) {
            // arr[j + 1] = arr[j];
            // }
            // else {
            // break;
            // }
            // }
            // arr[j + 1] = temp;

            // 2nd method
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;

        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 8, 2 };
        int n = 5;
        insertionSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//      QuickSort
class Quick{
    public static int findpivot(int arr[],int low,int high){
int pivot=arr[high];
int i=low-1;
for(int j=low;j<high;j++){
if(arr[j]<pivot){
    i++;
    // swap
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
}
i++;
//swap(i,high)
int temp=arr[i];
    arr[i]=arr[high];
    arr[high]=temp;  
    return i;
    } 
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pi=findpivot(arr, low, high);
            quickSort(arr, low, pi-1);      //left quicksort   
            quickSort(arr, pi+1, high);        //right quicksort
        }
    }
    public static void main(String[] args) {
     int arr[]={4,3,9,7,5};
     int n=arr.length;   
     quickSort(arr, 0, n-1);
     for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");
     }
    }
}




// "static void main" must be defined in a public class.
class Mergesort { 
    public static void merge(int[] arr,int s,int m,int e){
        int n1 = m-s+1;
        int n2 = e-m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0 ; i<n1 ; i++){
            L[i] = arr[s+i];
        }
        for(int j=0 ; j<n2 ; j++){
            R[j] = arr[m+1+j];
        }

        int i=0;
        int j=0;
        int k=s;

        while(i<n1 && j<n2){
            if(L[i]<R[j]){
                arr[k] = L[i];
                i++;
                k++;
            }
            else{
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        while(i<n1){ //R is completed , elements still remaining in L
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){ //L is completed , elements still remaining in R
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void divide(int arr[], int s, int e)
    {
        if(s<e){
            int m = (s+e)/2;
            divide(arr,s,m); //left -> s to m
            divide(arr,m+1,e); //right -> m+1 to e

            merge(arr,s,m,e);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,3,9,7,5};
        int n = arr.length;
        divide(arr , 0 , n-1);
        for(int i=0 ; i<n ; i++)
                System.out.print(arr[i]+" ");
    }
}