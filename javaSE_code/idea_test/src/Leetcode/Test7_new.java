package Leetcode;

public class Test7_new {
    public static void main(String[] args) {
        int x = -120;
        int test =reverse(x);
        System.out.println(test);

    }
    public static int reverse(int x) {
        int res = 0;
        while(x != 0){
            int tmp = x%10;
            res = res*10+tmp;
            if (res>214748364 || (res==214748364 && tmp>7)) {
                return 0;
            }
            //判断是否 小于 最小32位整数
            if (res<-214748364 || (res==-214748364 && tmp<-8)) {
                return 0;
            }
            x /= 10;
        }
        return res;

    }

}
