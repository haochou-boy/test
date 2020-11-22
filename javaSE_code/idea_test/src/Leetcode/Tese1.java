package Leetcode;

public class Tese1 {
    public static void main(String[] args) {
        //定义了目标数组和目标数据
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(arr,target);

    }
    //定义一个求返回索引的方法
    public static int[] twoSum(int[] nums, int target){
        //遍历数组arr
        int[] arr1= new int[2];
        for(int i=0;i< nums.length;i++){
            for(int j=0;j< nums.length;j++){
                if(target == nums[i]+nums[j]){
                    if(i > j){
                        arr1[0]=j;
                        arr1[1]=i;
                    }else {
                        arr1[0]=i;
                        arr1[1]=j;
                    }
                    break;
                }
            break;
            }
        }
        return arr1;
    }

}

