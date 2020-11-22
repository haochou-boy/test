package JianzhiOffer;

public class Test10_2 {
    public static void main(String[] args) {
        int n = 1;
        int result = numWays(n);
        System.out.println(result);

    }
    public static int numWays(int n) {
        int a = 1;
        int b = 1;
        int sum = 1;
        for(int i = 1;i<n;i++){
            sum = (a+b)%(1000000007);
            a = b;
            b = sum;
        }
        return sum;

    }
}
