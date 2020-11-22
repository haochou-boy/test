package JianzhiOffer;

public class Test10 {
    public static void main(String[] args) {
        int n = 3;
        int result = fib(n);
        System.out.println(result);

    }
    public static int fib(int n) {
 /*       if(n == 0) return 0;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
            dp[i] %= 1000000007;
        }
        return dp[n];*/
        if(n==0){
            return 0;
        }
        int a = 0;
        int b = 1;
        int sum=1;
        for(int i = 1;i<n;i++){
            sum = (a+b)%1000000007;
            a=b;
            b=sum;
        }
        return sum;



    }
}
