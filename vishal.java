// import java.util.Scanner;
// class Opp{
//     public static void Oppdigit(int n){
// if(n==1){
//     System.out.println(1);
//     return;
// }
// System.out.print(n +"");
// Oppdigit(n-1);
// }  
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int n=sc.nextInt();
//        Oppdigit(n);
//     }
// }

// class num{
//     public static void digit(int n){
// if(n==1){
//     System.out.println(1);
//     return ;
// }

// digit(n-1);
// System.out.println(n +"");
// }  
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println("number is ");
//        digit(n);
      
//     }
// }

// class m{
//     public static void main(String[] args) {
//         String s="vishal is good and bad boy";
//         for(int i=0;i<3;i++){
//             System.out.print(s.charAt(i)+" ");
//         }
//     }
// }


import java.util.*;
class Infix{
    public static void main(String[] args) {
        String str = "9-5+3*4/6";
        Stack<Integer>val = new Stack<>();
        Stack<Character>op = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) val.push(ascii-48);
            else if (op.size() == 0) op.push(ch);
            else {
                if (ch == '+' || ch == '-') {
                    //work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (op.peek() == '-') val.push(v1 - v2);
                    if (op.peek() == '+') val.push(v1 + v2);
                    if (op.peek() == '*') val.push(v1 * v2);
                    if (op.peek() == '/') val.push(v1 / v2);
                    op.pop();
                    op.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if (op.peek() == '-') val.push(v1 - v2);
                        if (op.peek() == '+') val.push(v1 + v2);
                        if (op.peek() == '*') val.push(v1 * v2);
                        if (op.peek() == '/') val.push(v1 / v2);
                        op.push(ch);
                    } else op.push(ch);
                }
            }
        }
        //val stack size>1w
        while(val.size()>1) {
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peek()=='-')val.push(v1-v2);
            if(op.peek()=='+')val.push(v1+v2);
            if(op.peek()=='*')val.push(v1*v2);
            if(op.peek()=='/')val.push(v1/v2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}