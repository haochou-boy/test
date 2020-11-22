package com.itheima.sortAlgorithm;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {53,3,542,748,14,214,1002};
        RadixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void RadixSort(int[] arr){
        //得到数组中最大的数
        int max = arr[0];
        for(int i = 1;i< arr.length;i++){
            if(arr[i] > max ){
                max = arr[i];
            }
        }
        //获取最大数的长度
        int maxLength  = (max+"").length();
        //创建二维数组
        int[][] bucket = new int[10][arr.length];
        //创建一个一维数组用于记录每个桶中存放的元素个数,初始化为0
        int[] countElement = new int[10];
        for(int i = 0,n=1;i<maxLength;i++,n *= 10){
            for(int j = 0;j< arr.length;j++){
                //取个位
                int geWei = arr[j]/n%10;
                bucket[geWei][countElement[geWei]] = arr[j];
                countElement[geWei]++;
            }
            //取出第一轮的数字
            int index = 0;
            for(int k = 0;k<10;k++){
                if(countElement[k]!= 0){
                    for(int l = 0;l<countElement[k];l++){
                        arr[index] = bucket[k][l];
                        index++;
                    }
                }
                countElement[k] = 0;
            }

        }


    }
}
