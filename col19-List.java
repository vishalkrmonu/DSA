import java.util.*;
class ArrayList1
{
    public static void main(String[] args) {
        
        ArrayList <Integer> L = new ArrayList<>();

        //add
        L.add(10);
        L.add(20);
        L.add(30);
        L.add(50);
        L.add(80);
        L.add(70);
        L.add(90);
System.out.println(L);

//remove
L.remove(0);
L.remove(Integer.valueOf(30));
System.out.println(L);

//Size
System.out.println(L.size());
System.out.println(L.isEmpty());
System.out.println(L.get(4));

//insert 8 at index 2
L.add(2,8);
System.out.println(L);
//replace an element
L.set(0,7);
System.out.println(L);

    }
}