// import java.util.Arrays;
import java.io.*;
class palindrome {
    public static void pal(int[] arr, int n) {
        int i;
        int flag = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("array is not palindrome");
        } else {
            System.out.println("array is palindrome");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 3, 1 };
        int n = arr.length;
        pal(arr, n);
    }
}

class segregate {  //odd even
    public static void segregat(int arr[], int n) {
        int i, temp;
        int j = -1;
        for (i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                j++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }           
    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 5, 4, 7 };
        int n = arr.length;
        int i;
        segregat(arr, n);
         for (i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
                }
    }
}

