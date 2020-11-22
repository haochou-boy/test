package com.itheima.sortAlgorithm;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {-9,78,0,23,0,70};
//        int[] arr = {-567, -9, 0, 0, 23, 70, 78};
        QuickSort(arr,0, arr.length-1);
    }
    public static void QuickSort(int[] arr,int left,int right){
        int l = left;
        int r = right;
        int mid = (left + right) / 2;
        //定义一个中间变量，用于数据交换
        int temp = 0;
        //开始循环，当l》=r时退出循环
        while(l<r){
            //在左边找到大于mid的值
            while(arr[l]<arr[mid]){
                l++;
            }
            //在右边找到小于mid的值
            while(arr[r]>arr[mid]){
                r--;
            }
            //假如l>=r说明左边的元素已经小于中间的值，或者右边的元素已经大于中间的值
            //数组已经是有序的就不需要进行交换
            if(l >= r){
                break;
            }
            //进行交换
            temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;

            if(arr[l] == arr[mid]){
                r--;
            }
            if(arr[r] == arr[mid]){
                l++;
            }
        }
        if(l==r){
            l++;
            r--;
        }
        //向左递归
        if(left<r){
            QuickSort(arr,left,r);
        }
        //向右递归
        if(right<l){
            QuickSort(arr,l,right);
        }
        System.out.println(Arrays.toString(arr));

    }
}
