import java.util.Scanner;

class binary {
    public static int binarySearch(int[] arr, int n, int x) { // function
        int s = 0;
        int e = n - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (x == arr[m]) {
                return m;  
            } else if (x > arr[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 6;
        int[] arr = { 3, 5, 7, 9, 11, 13  };
        int x = 5;
        System.out.println("index is " + binarySearch(arr, n, x));
    }
}

// 2D matrix
class Solution{
    public boolean searchMatrix(int[][] matrix,int target){   //need to create obj because we do not use static in function
        int n=matrix[0].length-1;
        for(int i=0;i<matrix.length;i++){
            if (target<=matrix[i][n]){
                int low=0;
                int high=n;
                while(low<=high){
                    int mid=(low+high)/2;
                    if(matrix[i][mid]==target){
                        return true;
                    }
                    else if(matrix[i][mid]<target){
                        low=low+1;
                    }
                    else{
                        high=high-1;
                    }
                }
            }}
            return false;
        }
    
    public static void main(String[] args) {
        Solution s=new Solution();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9} };
        int target = 45;
        boolean result=s.searchMatrix(matrix,target);
         System.out.println("Result: " + result);
    }}




class Sqrt {
    public int mySqrt(int x) {
        if (x==0)
        return 0;
    if (x>0 && x<4)
        return 1;        
    int left = 1, right = x/2;
    while (true) {
        int mid = (left + right)/2;            
        if (mid > 0 && mid > x/mid) {
            right = mid-1;
        } else if ((mid+1) > x/(mid+1)) {
            return mid;
        } else {
            left = mid+1;
        }
    }
    }
    public static void main(String[] args) {
        int x=8;
        Sqrt s=new Sqrt();
        System.out.println(s.mySqrt(x));
    }
}