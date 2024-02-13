import java.util.Scanner;

class Subset {
    public static void generate(String s, int index, String ans) {
        if (index == s.length()) {
            System.out.print(ans + " ");
            return;
        }
        generate(s, index + 1, ans + s.charAt(index));
        generate(s, index + 1, ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // String s="123";
        int n = s.length();
        generate(s, 0, " ");
    }
}

class sum {
    public static void main(String[] args) {
        int n = 123;
        int r;
        int sum = 0;
        while (n > 0) {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        System.out.println(sum);
    }
}

class sum2 {
    public static int func(int n) {
        if (n == 0)
            return 0;
        else
            return n % 10 + func(n / 10);
    }
    public static void main(String[] args) {
        int n = 123;
        // int ans=func(n);
        System.out.println(func(n));
    }
}

class Solu {
    public static double myPow(double x, int n) {
        if(n==0)
return 1;
Double a =myPow(x,n/2);
//if n is even
if(n%2==0)
return a*a;

//if n is negative
else if(n<0)
return 1/myPow(x,-n);

//if n is odd
else
return a*a*x;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double x=sc.nextDouble();
        int n=sc.nextInt();
        System.out.println(myPow(x,n));

    }
}

class bubblesor {
    public static void bubbleSort(int[] arr, int n) {
        //System.out.println("acending order is =");
        if(n==0)
            return;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            bubbleSort(arr, n-1);
        }
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, 4 };
        int n = 5;
        bubbleSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}