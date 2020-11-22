package JianzhiOffer;

import java.util.Arrays;

public class Test57 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] result = twoSum2(arr,target);
        System.out.println(Arrays.toString(result));

    }
    public static int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        int k = 0;
        for(int i = nums.length-1;i>=0;i--){
            if(nums[i] < target){
                k = i+1;
                break;
            }
        }
        for(int i = 0;i<k;i++){
            for(int j = 0;j<k;j++){
                if(nums[i]+nums[j] == target){
                    result[0] = nums[i];
                    result[1] = nums[j];
                    return result;
                }
            }
        }
        return result;

    }
    public static int[] twoSum2(int[] nums, int target) {
        //如果为空数组
        if(nums.length == 0){
            int[] a = new  int[0];
            return a;
        }
        int[] result = new int[2];
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum < target){
                i++;
            }else if(sum > target){
                j--;

            }else if(sum == target){
                result[0] = nums[i];
                result[1] = nums[j];
                return result;
             }
        }
        return result;


    }
}
