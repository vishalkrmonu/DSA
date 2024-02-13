class fibo1{
    public static int fibo(int n){
        int[] fib=new int[n+1];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<=n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        //bottom up approach
        int n=7;
        System.out.println(fibo(n));
    }
}


class fibo2{
    public static int fibo(int n){
        int a=0;
        int b=1;
        int c=a+b;
        for(int i=2;i<=n;i++){
           c=a+b;
           a=b;
           b=c;
    }
    return c;
}

    public static void main(String[] args) {
        // up bottom approach
        int n=7;
        System.out.println(fibo(n));
    }
}