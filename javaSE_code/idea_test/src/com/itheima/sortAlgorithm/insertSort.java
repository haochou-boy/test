package com.itheima.sortAlgorithm;

import java.util.Arrays;

/**
 * 插入排序：1：插入的次数等于数组的长度-1
 *         2：从数组的第二个元素开始插入，插入索引为待插入元素的前一个
 *         3：进入循环，查找插入的索引，如果索引处的值大于insertValue，则索引处的值后移，索引前移，到索引为负数或者索引处的值小于等
 *         于插入的值退出循环，insertIndex+1则为插入数值的索引
 *         4.赋值arr[insertIndex+1] = insertValue
 */

public class insertSort {
    public static void main(String[] args) {
        int[] arr = {17,3,25,14,20,9};
        insertSort(arr);
        /*//第一次插入排序
        int insertValue = arr[1];
        int insertIndex = 1-1;
        //跳出循环的条件：
        //            1.索引值小于零
        //             2.待插入的数小于前面的数
        while(insertIndex >= 0 && insertValue < arr[insertIndex]){
            arr[insertIndex+1] = arr[insertIndex];
            //索引前移
            insertIndex--;
        }
        //插入数据
        arr[insertIndex+1] =insertValue;
        System.out.println("第一次插入排序"+ Arrays.toString(arr));

        //第二次插入排序
        insertValue = arr[2];
        insertIndex = 2 - 1;
        //跳出循环的条件：
        //            1.索引值小于零
        //             2.待插入的数小于前面的数
        while(insertIndex >= 0 && insertValue < arr[insertIndex]){
            arr[insertIndex+1] = arr[insertIndex];
            //索引前移
            insertIndex--;
        }
        //插入数据
        arr[insertIndex+1] =insertValue;
        System.out.println("第二次插入排序"+ Arrays.toString(arr));

        //第三次插入排序
        insertValue = arr[3];
        insertIndex = 3 - 1;
        //跳出循环的条件：
        //            1.索引值小于零
        //             2.待插入的数小于前面的数
        while(insertIndex >= 0 && insertValue < arr[insertIndex]){
            arr[insertIndex+1] = arr[insertIndex];
            //索引前移
            insertIndex--;
        }
        //插入数据
        arr[insertIndex+1] =insertValue;
        System.out.println("第三次插入排序"+ Arrays.toString(arr));

        //第四次插入排序
        insertValue = arr[4];
        insertIndex = 4 - 1;
        //跳出循环的条件：
        //            1.索引值小于零
        //             2.待插入的数小于前面的数
        while(insertIndex >= 0 && insertValue < arr[insertIndex]){
            arr[insertIndex+1] = arr[insertIndex];
            //索引前移
            insertIndex--;
        }
        //插入数据
        arr[insertIndex+1] =insertValue;
        System.out.println("第四次插入排序"+ Arrays.toString(arr));

        //第五次插入排序
        insertValue = arr[5];
        insertIndex = 5 - 1;
        //跳出循环的条件：
        //            1.索引值小于零
        //             2.待插入的数小于前面的数
        while(insertIndex >= 0 && insertValue < arr[insertIndex]){
            arr[insertIndex+1] = arr[insertIndex];
            //索引前移
            insertIndex--;
        }
        //插入数据
        arr[insertIndex+1] =insertValue;
        System.out.println("第四次插入排序"+ Arrays.toString(arr));*/
    }
    //定义一种插入排序的方法
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            //定义插入的值
            int insertValue = arr[i];
            //定义插入的索引
            int insertIndex = i - 1;//前一个
            while (insertIndex >= 0 && insertValue < arr[insertIndex]) {
                //值后移
                arr[insertIndex + 1] = arr[insertIndex];
                //索引前移
                insertIndex--;
            }
            //退出循环后，插入索引的位置为insertIndex+1,赋值
            arr[insertIndex + 1] = insertValue;
            System.out.println(Arrays.toString(arr));
        }
    }
}
