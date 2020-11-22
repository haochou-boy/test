package Leetcode;

public class Test9 {
    public static void main(String[] args) {
        int x=-10;
        boolean flag = isPalindrome(x);
        System.out.println(flag);

    }
    public  static boolean isPalindrome(int x) {
        if (x>=0){
            int res = 0;
            int y = x;
            while(y != 0) {
                int tmp = y % 10;
                res = res * 10 + tmp;
                y /= 10;
            }
            if (res == x) {
                return true;
            } else {
                return false;
            }

        }else{
           return false;
        }
    }
}
