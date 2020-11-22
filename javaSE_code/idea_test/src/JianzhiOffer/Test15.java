package JianzhiOffer;

public class Test15 {
    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        int count = hammingWeight(n);
        System.out.println(count);



    }
    public static int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            count += n & 1;
            n >>>= 1;
        }
        return count;


    }
}
