package com.itheima.sortAlgorithm;

import java.util.Arrays;

/**
 * 冒泡排序(升序排列)
 * 1.需要进行冒泡的次数arr.length-1
 * 2.每一次进行冒泡时从索引为0开始到arr.length-1-i结束
 * 3.设置标志位优化冒泡排序，如果某一次过程中不存在交换则提前结束；若存在交换则需要重置标志位
 */


public class bubbleSort {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {3,9,-1,10,20};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        /*//第一次冒泡
        //定义一个中间变量temp
        int temp = 0;
        for(int i = 0;i<arr.length-1;i++){
            //如果前面一个数大于后面的数则交换次序
            if(arr[i]>arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

        }
        //输出第一次冒泡排序结果:[3, -1, 9, 10, 20]
        System.out.println(Arrays.toString(arr));
        //第二次冒泡
        for(int i = 0;i<arr.length-1-1;i++){
            //如果前面一个数大于后面的数则交换次序
            if(arr[i]>arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

        }
        //输出第二次冒泡排序结果:[3, -1, 9, 10, 20]
        System.out.println(Arrays.toString(arr));
        //第三次冒泡
        for(int i = 0;i<arr.length-1-2;i++){
            //如果前面一个数大于后面的数则交换次序
            if(arr[i]>arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

        }
        //输出第三次冒泡排序结果:[3, -1, 9, 10, 20]
        System.out.println(Arrays.toString(arr));

        //第四次冒泡
        for(int i = 0;i<arr.length-1-3;i++){
            //如果前面一个数大于后面的数则交换次序
            if(arr[i]>arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

        }
        //输出第四次冒泡排序结果:[3, -1, 9, 10, 20]
        System.out.println(Arrays.toString(arr));*/

    }
    //定义一种冒泡排序方法
    public static void bubbleSort(int[] arr){
        int temp = 0;
        //定义标志位，初始化位false
        boolean flag = false;
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                //如果前面一个数大于后面的数则交换次序
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    //发生交换，改变标志位
                    flag = true;
                }
            }
            //假如没有发生交换，则数组为有序，提前退出
            if (!flag) {
                break;
            } else {
                //重置标志位
                flag = false;
            }
            //输出第i次冒泡排序结果:[3, -1, 9, 10, 20]
            System.out.println("输出第" + j + 1 + "次冒泡排序结果: " + Arrays.toString(arr));
        }


    }

}
