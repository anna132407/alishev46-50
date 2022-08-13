public class Test2 {
    public static void main(String[] args) {
        counter(3);
        System.out.println(fac(4));
    }

    private static void counter(int n) {
        System.out.println(n);
        if (n==0)
            return;
        counter(n-1);
    }

    private static int fac(int m){
        if(m==1)
            return 1;
        return m*fac(m-1);
    }
}
