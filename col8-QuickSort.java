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