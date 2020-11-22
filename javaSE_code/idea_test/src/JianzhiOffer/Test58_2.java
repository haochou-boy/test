package JianzhiOffer;

import java.util.Arrays;

public class Test58_2 {
    public static void main(String[] args) {
        String s = "lrloseumgh";
        int k = 6;
        String s1 = reverseLeftWords(s,k);
        System.out.println(s1);
    }
    public static String reverseLeftWords(String s, int n) {
        String s1 = s.substring(n);
        String s2 = s.substring(0,n);
        return s1+s2;

    }
}
