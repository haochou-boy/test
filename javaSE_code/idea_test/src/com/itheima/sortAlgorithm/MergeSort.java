package com.itheima.sortAlgorithm;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,4,5,7,1,3,6,2};
        int[] temp = new int[arr.length];
        mergeSort(arr,0, arr.length-1,temp);
        System.out.println(Arrays.toString(arr));

    }
    //分
    public static void mergeSort(int[] arr,int left,int right,int[] temp){
        if(left<right){
            int mid = (left+right)/2;
            //向左递归
            mergeSort(arr,left,mid,temp);
            //向右递归
            mergeSort(arr,mid+1,right,temp);
            //合并
            merge(arr,left,right,mid,temp);
        }
    }
    //合
    public static void merge(int[] arr,int left,int right,int mid,int[] temp){
        int i = left;
        int j = mid+1;
        int t = 0;
        //当i>= mid 或者j》=right停止循环
        while(i<=mid && j<=right){
            if(arr[i]<arr[j]){
                temp[t] = arr[i];
                i++;
                t++;
            }else{
                temp[t] = arr[j];
                j++;
                t++;
            }
        }
        //将剩余数据的一遍全部搬到temp数组中
        while(j<=right){
            temp[t] = arr[j];
            j++;
            t++;
        }
        while(i<=mid){
            temp[t] = arr[i];
            i++;
            t++;
        }
        //将temp数组的元素拷贝到原数组中
        t = 0;
        int tempLeft = left;
        while(tempLeft<=right){
            arr[tempLeft] = temp[t];
            t++;
            tempLeft++;
        }

    }

}
