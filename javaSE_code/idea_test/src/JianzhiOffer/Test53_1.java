package JianzhiOffer;

import javax.print.DocFlavor;

public class Test53_1 {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 0;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int i = 0;
        int j =nums.length-1;
        //当i==j时退出循环
        while(i < j && !(nums[i]==target && nums[j]== target)){
            if(nums[i] != target){
                i++;
            }
            if(nums[j] != target){
                j--;
            }
        }
        if(i>j){
            return 0;
        }else if (i == j){
            if(nums[i] == target){
                return 1;
            }else{
                return 0;
            }
        }else{
            return j-i+1;
        }



    }
    /*public static int search(int[] nums, int target){
        //初始化两个指针
        int i = 0;
        int j =nums.length-1;
        //当i==j时退出循环
        while(i != j || (nums[i]==target && nums[j]== target)){
            if(nums[i] != target){
                i++;
            }
            if(nums[j] != target){
                j--;
            }
        }
        return j-i;
        
    }*/
}
