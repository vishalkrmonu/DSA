class binary1 {
    public static int binarySearch(int[] arr, int x) { // function
        int s = 0;
        int e = arr.length - 1;
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
        // int n = arr.length;
        int[] arr = { 3, 5, 7, 9, 11, 13 };
        int x = 9;
        System.out.println("index is " + binarySearch(arr, x));
    }
}

// with the help of recursion
class binary2 {
    public static int BinarySearch(int arr[], int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (key > arr[mid]) {
            return BinarySearch(arr, key, mid + 1, high);
        } else {
            return BinarySearch(arr, key, low, mid - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 6, 7, 8 };
        int key = 5;
        int low = 0;
        int high = arr.length - 1;
        System.out.println(BinarySearch(arr, key, low, high));
    }
}

// find the element in infinite sorted array
class infinite {
    public static int SearchInfinite(int arr[], int key) {
        int low = 0;
        int high = 1;
        while (arr[high] < key) {
            low = high;
            high = 2 * high;
        }
        return BinarySearch(arr, key, low, high);
    }

    public static int BinarySearch(int arr[], int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (key > arr[mid]) {
            return BinarySearch(arr, key, mid + 1, high);
        } else {
            return BinarySearch(arr, key, low, mid - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 6, 7, 8 };
        int key = 7;
        System.out.println(SearchInfinite(arr, key));
    }
}

// Search an element in a sorted and rotated array
class RotateSearch {
    public static int Bsearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[low] < arr[mid]) {
                if (key >= arr[low] && key < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (key > arr[mid] && key <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = high - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 20, 30, 40, 50, 60, 5, 10 };
        int key = 5;
        System.out.println(Bsearch(arr, key));
    }
}




// allocated min pages
class Page {
    // Function to find the minimum number of pages to allocate to students
    public static int minPages(int arr[], int k) {
        // int min=maxOf(arr);
        // int max=sumOf(arr);
        int n = arr.length;
        int min = 0;
        int max = 0;
        // Calculate the maximum and sum of pages in the array
        for (int i = 0; i < n; i++) {
            max += arr[i];
            min = Math.max(min, arr[i]);
        }
        int res = -1;
        while (min <= max) {
            int mid = (min + max) / 2;

            // Check if it's feasible to allocate pages to students with a maximum of 'mid' pages per student
            if (isFeasible(arr, k, mid)) {
                res = mid;
                max = mid - 1; // Update the maximum
            } else {
                min = mid + 1; // Update the minimum
            }
        }
        return res; // Return the minimum number of pages
    }
    // Function to check if it's feasible to allocate pages to students
    public static boolean isFeasible(int arr[], int k, int res) {
        int students = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > res) {
                students++; // Increase the student count
                sum = arr[i]; // Start a new student with 'arr[i]' pages
            } else {
                sum += arr[i]; // Add pages to the current student
            }
        }
        return students <= k; // Check if the number of students is less than or equal to 'k'
    }
    public static void main(String[] args) {
        int arr[] = {10, 5, 20};
        int k = 2;
        System.out.println(minPages(arr, k)); // Print the minimum number of pages
    }
}