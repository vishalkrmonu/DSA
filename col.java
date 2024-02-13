import java.util.Scanner;
// import java.util.Arrays;

class col {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        System.out.println("enter the number");
        for (i = 0; i < 5; i++) {
            x[i] = sc.nextInt();
        }
        System.out.println("reverse number");
        for (i = 4; i >= 0; i--) {
            System.out.println(x[i]);

        }

    }
}

class col1 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        // int[] x = new int[6];
        // System.out.println("enter the number");
        // for (i = 0; i < 6; i++) {
        // x[i] = sc.nextInt();
        // }
        int x[] = { 1, 4, 3, 2, 9, 6 };

        System.out.println("output");
        for (i = 0; i < 6; i++) {
            if ((i == 0 || x[i] > x[i - 1]) && (i == 6 - 1 || x[i] > x[i + 1])) {
                System.out.println(x[i]);
            }
        }
    }
}

class col2 {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        System.out.println("first matrix ");
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("even array");
        for (i = 0; i < a.length; i = i + 2) {
            for (j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }
        System.out.println("odd array");

        for (i = 1; i < a.length; i = i + 2) {
            for (j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }

        }
    }
}

class col3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        marks = sc.nextInt();
        switch (marks) {
            case 75:
                System.out.println("better");
                break;
            case 50:
                System.out.println("just pass");
                break;
        }
    }
}



