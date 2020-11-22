package com.itheima.sortAlgorithm;

import java.util.Arrays;

public class shellSort {
    public static void main(String[] args) {
        int[] arr = {8,9,1,7,2,3,5,4,6,0};
        shellSort2(arr);

    }
    //交换式shell排序
    public static void shellSort(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int temp = 0;
        for (int gap = (l + r) / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                //共有5组
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;

                    }
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
    //移位式
    public static void shellSort2(int[] arr) {
        for (int gap = arr.length / 2;gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                //共有5组
                int j = i;
                int temp = arr[j];
                if(arr[j]<arr[j-gap]){
                    while(j-gap >= 0 && temp<arr[j-gap]){
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                }
                arr[j] = temp;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
        /*//第一轮shell排序
        for(int i = 5;i< arr.length;i++){
            //共有5组
            for(int j = i-5;j>=0;j-=5){
                if(arr[j]>arr[j+5]){
                    temp = arr[j];
                    arr[j] = arr[j+5];
                    arr[j+5] = temp;

                }
            }
        }
        gap = gap/2;
        //第二轮shell排序
        for(int i = 2;i< arr.length;i++){
            //共有两组
            for(int j = i-2;j>=0;j-=2){
                if(arr[j]>arr[j+2]){
                    temp = arr[j];
                    arr[j] = arr[j+2];
                    arr[j+2] = temp;

                }
            }
        }

        //第三轮shell排序
        for(int i = 1;i< arr.length;i++){
            //共有两组
            for(int j = i-1;j>=0;j-=1){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));*/
}
