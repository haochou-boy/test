package JianzhiOffer;

public class Test62 {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        int p = 0;
        for (int i = 2; i <= n; i++) {
            p = (p + m) % i;
        }


    }
}
