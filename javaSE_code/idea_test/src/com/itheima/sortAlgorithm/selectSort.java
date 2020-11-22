package com.itheima.sortAlgorithm;
/**
 * 1.将数组分成有序和无序两个部分
 * 2.每次选择排序找出该序列的最小值，与第一个元素交换
 * 3.获取最小值的值和索引的方法；初始化最小值和最小值索引（以第一次为例）：min = arr[0];minIndex = 0;找到最小值后
 *   假设索引i处为最小值，获取该点的索引值，min = arr[i]；minIndex = i ;然后和第一个交换数据，arr[i] = arr[0];
 *   arr[0] = min
 */

import java.util.Arrays;

public class selectSort {
    public static void main(String[] args) {
        int[] arr = {8,3,2,1,7,4,6,5};
        selectSort(arr);
        /*//第一次选择排序
        int min  = arr[0];
        int minIndex = 0;
        for(int i = 1 ;i<arr.length;i++){
            //找到最小就交换
            if(arr[i] < min){
                min = arr[i];
                minIndex = i;

            }
        }
        //退出循环找到了最小值和其对应的索引值，进行交换
        arr[minIndex] = arr[0];
        arr[0] = min;
        System.out.println(Arrays.toString(arr));

        //第二次选择排序
        min = arr[1];
        minIndex = 1;
        for(int i = 1+1 ;i<arr.length;i++){
            //找到最小就交换
            if(arr[i] < min){
                min = arr[i];
                minIndex = i;

            }
        }
        //退出循环找到了最小值和其对应的索引值，进行交换
        arr[minIndex] = arr[1];
        arr[1] = min;
        System.out.println(Arrays.toString(arr));*/


    }
    public static void selectSort(int[] arr){
        for(int j = 0;j< arr.length-1;j++){
            int min = arr[j];
            int minIndex = j;
            for(int i = 1+j ;i<arr.length;i++){
                //找到最小就交换
                if(arr[i] < min){
                    min = arr[i];
                    minIndex = i;

                }
            }
            //退出循环找到了最小值和其对应的索引值，进行交换
            if(minIndex != j){
                arr[minIndex] = arr[j];
                arr[j] = min;
            }
            System.out.println(Arrays.toString(arr));

        }
    }
}
