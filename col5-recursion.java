import java.util.Scanner;
import java.util.*;
class recursion {
    public static int sumOf(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumOf(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = sumOf(n);
        System.out.println(ans);
    }
}

class factorial {
    public static int fact(int n) {
        if (n == 1 || n == 0)
            return 1;
        else
            return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);
    }
}

class Febonacci{
    // time complexity 2^n
    public static int fab(int n){
        if(n==0)
        return 0;
        else if(n==1)
        return 1;
        else
        return fab(n-1)+fab(n-2);
 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fab(n);
        System.out.println(ans);
    }
}


// class pali{
//     static boolean  palindrome(int[]arr,int i,int j){
//         if(i>=j)
//            // if(arr[i]==arr[j]){
//                 return true;

//                 if(arr[i]!= arr[j]){
//                     return false;
//                 }
// return palindrome(arr,i+1,j-1);
//             }
                
//          public static void main(String[] args) {
//             int[] arr={1,2,9,6,1};
//             int i=0;
//         int j=arr.length-1;
//         int c=0;
//             System.out.print(palindrome(arr,i,j));
// }
// }

class palindrom {
    public static boolean pal(int[] arr, int n) {
        int i;
        for (i = 0; i <= n/2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
               return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1 };
        int n = arr.length;
        System.out.println(pal(arr, n));
    }
}