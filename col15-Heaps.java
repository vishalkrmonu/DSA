// Heap 

// Input:  arr[] = {90, 15, 10, 7, 12, 2}
// Output: True
// The given array represents below tree
//        90
//      /    \
//    15      10
//   /  \     /
// 7    12  2
// The tree follows max-heap property as every
// node is greater than all of its descendants.
// class Solution {
//     public boolean countSub(long arr[], long n)
//     {
//         // Your code goes here
//         for(int i=0;i<n;i++){
//             int left=2*i+1;
//             int right=2*i+2;
//             if(left<n&&arr[i]<arr[left]){
//             return false;
//             }
//             if(right<n&&arr[i]<arr[right]){
//                 return false;
//             }
            
//         }
//         return true;
//     }
// }

        //insert element at last position

import java.util.*;

//this is binary tree topic
//array reperesentation using heap
class heap {
    public boolean countSub(long arr[], long n)
    {
     n=arr.length;
        for(int i=0;i<n;i++){
            int left=2*i+1;
            int right=2*i+2;
            if(left<n&&arr[i]<arr[left]){
                return false;
            }
            if(right<n&&arr[i]<arr[right]){
                return false;
            }
        }
                return true;  
    }
    public static void main(String[] args) {
        heap s=new heap();
        long arr[]={90,80,70,30,23,14,15};
        long n=arr.length;
        System.out.println(s.countSub(arr,n));
    }
}


class heap1{
    int heap[]=new int [100];  //heap ke ander 100 element aa sakte hai
    int n=0;
    public void swap(int i,int j){
        int  temp=heap[i];
        heap[i]=heap[j];
        heap[j]=temp;
    }
public void insertelement(int  x){
    // inset element in last position
    n++;
    heap[n-1]=x;
    int i=n-1;
    while( i>0&&heap[i]<heap[(i-1)/2]){
        
        swap(i,(i-1)/2);
        i=(i-1)/2;
    }
}
}
class heapimplementation{
public static void main(String[] args) {
    heap1 h=new heap1();
    h.insertelement(5);    
    h.insertelement(9);    
    h.insertelement(7);
    h.insertelement(11);
    h.insertelement(13);
    h.insertelement(15);
    h.insertelement(17);    
    h.insertelement(20); 
    }
}



// min heap
class heap2{
    int heap[]=new int [100];  //heap ke ander 100 element aa sakte hai
    int n=0;
    public void swap(int i,int j){
        int  temp=heap[i];
        heap[i]=heap[j];
        heap[j]=temp;
    }
public void insertelement(int  x){
    // inset element in last position
    n++;
    heap[n-1]=x;
    int i=n-1;
    while( i>0&&heap[i]<heap[(i-1)/2]){
        
        swap(i,(i-1)/2);
        i=(i-1)/2;
    }
}
public int delete(){
int deleted=heap[0];
//put last index at fist position
heap[0]=heap[n-1];
n--;
int i=0;
while(i<=(n-1)/2){
    if(heap[2*i+1]<heap[i]||heap[2*i+2]<heap[i]){
        int min=(heap[2*i+1]<heap[2*i+1]) ? 2*i+1:2*i+2;
        swap(i,min);
        i=min;
    }
}
return deleted;
}
public void print(){
    for(int i =0;i<n;i++)
{
 System.out.print(heap[i]+" ");
} 
}
}
class heapimplementation1{
public static void main(String[] args) {
    heap2 h=new heap2();
    int heap[]={5,9,7,11,10,13,15,17,20};
    for(int i=0;i<heap.length;i++ ){
        h.insertelement(heap[i]);  
    }
    // h.insertelement(5);   
    //  h.insertelement(9);
    // h.insertelement(5);   
    //  h.insertelement(5);
    // h.insertelement(5);
    // h.insertelement(5);
    // h.insertelement(5);
h.print();
h.delete();
// System.out.println(h.delete());
h.print();
}
}
