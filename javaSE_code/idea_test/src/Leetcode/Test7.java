package Leetcode;
import java.lang.Math;
public class Test7 {
    public static void main(String[] args) {
        int x = 1534236469;
        int test =reverse(x);
        System.out.println(test);

    }
    public static int reverse(int x) {
        if(x<0){
                int y = Math.abs(x);
                int[] arr = new int[32];
                for(int i=0;i< arr.length;i++){
                    arr[arr.length-1-i]=(int)(y/Math.pow(10,i))%10;
                }
                for(int i=0;i< arr.length;i++){
                    System.out.println(arr[i]);
                }
                for(int i=0;i< arr.length;i++){
                    if(arr[i]!=0){
                        for (int start = i, end = arr.length - 1; start <= end; start++, end--) {
                            int temp = arr[start];
                            arr[start] = arr[end];
                            arr[end] = temp;
                        }
                        break;
                    }
                }
                long sum=0;
                for(int i=0;i< arr.length;i++){
                    sum = sum+(long)Math.pow(10,i)*arr[arr.length-1-i];
                }
                if(sum>Math.pow(-2,31) && sum<Math.pow(2,31)-1){
                    x=(int)sum;
                }else{
                    x=0;
                }
        }else{
                int y = x;
                int[] arr = new int[32];
                for(int i=0;i< arr.length;i++){
                    arr[arr.length-1-i]=(int)(y/Math.pow(10,i))%10;
                }
                for(int i=0;i< arr.length;i++){
                    if(arr[i]!=0){
                        for (int start = i, end = arr.length - 1; start <= end; start++, end--) {
                            int temp = arr[start];
                            arr[start] = arr[end];
                            arr[end] = temp;
                        }
                        break;
                    }
                }
                long sum=0;
                for(int i=0;i< arr.length;i++){
                    sum = sum+(long)Math.pow(10,i)*arr[arr.length-1-i];
                }
                if(sum>Math.pow(-2,31) && sum<Math.pow(2,31)-1){
                    x=(int)sum;
                }else{
                    x=0;
                }
            }
        return x;
    }

}

