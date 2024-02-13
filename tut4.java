// Find the element that appears once in an array where every other element appears twice
//solve with recursion

class tut {
    public static int OneElement(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    c++;
                }
            }
            if (c == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 2, 1, 4, 4, 1, 9, 3 };
        int n = arr.length;
        System.out.println(OneElement(arr, n));
    }
}

class tut1 {
    public static int singleElement(int arr[], int n) {
        int res = arr[0];
        for (int i = 1; i < n; i++) {
            res = res ^ arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 4, 5, 3, 4 };
        int n = arr.length;
        System.out.println("Element occurring once is " + singleElement(arr, n));
    }
}

// Find the two non-repeating elements in an array of repeating elements/ Unique Numbers 2
class UniqueNumbers{
    // This function sets the values of
    // *x and *y to non-repeating elements
    // in an array arr[] of size n
    public static void UniqueNumbers2(int[] arr, int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            // Xor  all the elements of the array
            // all the elements occurring twice will
            // cancel out each other remaining
            // two unique numbers will be xored
            sum = (sum ^ arr[i]);
        }
        // Bitwise & the sum with it's 2's Complement
        // Bitwise & will give us the sum containing
        // only the rightmost set bit
        sum = (sum & -sum);

        // sum1 and sum2 will contains 2 unique
        // elements initialized with 0 box
        // number xored with 0 is number itself
        int sum1 = 0;
        int sum2 = 0;
 
        // traversing the array again
        for (int i = 0; i < arr.length; i++) {
 
            // Bitwise & the arr[i] with the sum
            // Two possibilities either result == 0
            // or result > 0
            if ((arr[i] & sum) > 0) {
 
                // if result > 0 then arr[i] xored
                // with the sum1
                sum1 = (sum1 ^ arr[i]);
            }
            else {
                // if result == 0 then arr[i]
                // xored with sum2
                sum2 = (sum2 ^ arr[i]);
            }
        }
 
        // print the two unique numbers
        System.out.println("The non-repeating elements are "
                           + sum1 + " and " + sum2);
                           }
 
    public static void main(String[] args)
    {
        int[] arr = new int[] { 2, 3, 7, 9, 11, 2, 3, 11 };
        int n = arr.length;
        UniqueNumbers2(arr, n);
    }
}

// Unique element in an array where all elements occur k times except one
class GFG {
    static int findUnique(int a[], int n, int k)
    {
        // Create a count array to store count of
        // numbers that have a particular bit set.
        // count[i] stores count of array elements
        // with i-th bit set.
        byte sizeof_int = 4;
        int INT_SIZE = 8 * sizeof_int;
        int count[] = new int[INT_SIZE];
 
        // AND(bitwise) each element of the array
        // with each set digit (one at a time)
        // to get the count of set bits at each
        // position
        for (int i = 0; i < INT_SIZE; i++)
            for (int j = 0; j < n; j++)
                if ((a[j] & (1 << i)) != 0)
                    count[i] += 1;
 
        // Now consider all bits whose count is
        // not multiple of k to form the required
        // number.
        int res = 0;
        for (int i = 0; i < INT_SIZE; i++)
            res += (count[i] % k) * (1 << i);
 
        // Before returning the res we need
        // to check the occurrence  of that
        // unique element and divide it
        res = res / (n % k);
 
        return res;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int a[] = { 6, 2, 5, 2, 2, 6, 6 };
        int n = a.length;
        int k = 3;
        System.out.println(findUnique(a, n, k));
    }
}