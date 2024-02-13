import java.util.*;

class HashMap2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("india", 141);
        map.put("USA", 33);
        map.put("Russia", 14);
        System.out.println(map);

        map.put("india", 142);
        System.out.println(map);
        map.put("pakistan", 22);
        System.out.println(map);
        map.remove("pakistan", 22); // for remove pair
        System.out.println(map);
        System.out.println(map.containsKey("india")); // for search
        System.out.println(map.containsKey("pakistan")); // for search
        if (map.containsKey("india")) {
            System.out.println("india is present");
        }
        System.out.println(map.size()); // number of pair
        System.out.println(map.get("india")); // get value of a key
        System.out.println(map.get("USA"));

    }
}

class HashSet2 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(30);
        set.add(20);
        set.add(40);
        System.out.println(set);
        if (set.contains(30)) {
            System.out.println("present");
        } else {
            System.out.println("not present");
        }
        // search-element present or absent
        System.out.println(set.contains(40));

        set.remove(40); // remove
        System.out.println(set);
        System.out.println(set.isEmpty()); // true or false
        System.out.println(set.size());

    }
}

// union of two number in gfg
// intersection of two number in gfg

// count distinct elements
class count {
    public static int CountDistinct(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int element : arr) {
            set.add(element);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 60, 3, 6, 5, 9 };
        System.out.println(CountDistinct(arr));
    }
}

// union of two arrays
class union {
    public static int Union(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr1) {
            set.add(x);
        }
        for (int y : arr2) {
            set.add(y);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6 };
        int arr2[] = { 3, 4, 5, 2 };
        System.out.println(Union(arr1, arr2));
    }
}

// intersection of two arrays
class intersection {
    public static int Intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int x : arr1) {
            set.add(x);
        }
        for (int x : arr2) {
            if (set.contains(x)) {
                count++;
                set.remove(x);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 3, 4, 5, 6, 7 };
        int arr2[] = { 2, 7, 8, 6 };
        System.out.println(Intersection(arr1, arr2));
    }
}

// print the union of two array
class print {
    public static void printt(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr1) {
            set.add(x);
        }
        for (int y : arr2) {
            set.add(y);
        }
        System.out.println("num of element after union " + set.size());
        System.out.println("element is ");
        System.out.println(set); // for print
        System.out.println(set.toString()); // for print
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 3, 4, 5 };
        int arr2[] = { 1, 2, 3, 4, 9 };
        printt(arr1, arr2);
    }
}