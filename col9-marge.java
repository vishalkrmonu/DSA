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