import java.util.Arrays;

class prime {
    public static boolean[] primenumber(int n) {
        boolean isprime[] = new boolean[n + 1];
        Arrays.fill(isprime, true);
        isprime[0] = false;
        isprime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i; j <= n; j += i) {
                isprime[j] = false;
            }
        }
        return isprime;
    }

    public static void main(String[] args) {
        boolean isprime[] = primenumber(20);
        for (int i = 0; i <= 20; i++) {
            System.out.println(i + " " + isprime[i]);
        }
    }
}

// greatest comman divisor
class comman {
    public static int gcd(int a, int b) {
        // if (b == 0)
        //     return a;
        // return gcd(b, a % b);
        return a%b==0?b:gcd(b,a%b);

    }

    public static void main(String[] args) {
        System.out.println(gcd(15, 27));

    }
}


// Modulo arithmetics
class modulo{
    static long fastPower(int a,long b,int n){
        long res=1;
        while(b>0){
            if((b&1)!=0){  //odd condition
                res=(res*a%n)%n;
            }
            a=(a%n*a%n)%n;
            b=b>>1;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(fastPower(2567,3,9999));
    }
}