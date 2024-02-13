import java.util.HashMap;
import java.util.*;

class HashMap1 {
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

class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(30);
        set.add(20);
        set.add(40);
        System.out.println(set);
        if(set.contains(30)){
            System.out.println("present");
        }else{
            System.out.println("not present");
        }
        // search-element present or absent
        System.out.println(set.contains(40));

        set.remove(40); // remove
        System.out.println(set);
        System.out.println(set.isEmpty()); //true or false 
        System.out.println(set.size());

    }
}

//union of two number in gfg
//intersection of two number in gfg