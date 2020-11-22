package JianzhiOffer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test40 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,1};
        int k = 1;
        int[] result = getLeastNumbers(arr,k);
        for(int i = 0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }
    public static int[] getLeastNumbers(int[] arr, int k) {
        int[] result = new int[k];
        Arrays.sort(arr);
        /*//冒泡排序
        for(int i =1;i<arr.length;i++){
            for(int j = 0;j< arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                }

            }
        }*/
        for(int i = 0;i<k;i++){
            result[i]=arr[i];
        }
        return result;


    }
}
