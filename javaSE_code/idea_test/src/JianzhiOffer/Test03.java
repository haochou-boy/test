package JianzhiOffer;
import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,0,2,5,3};
        int flag = findRepeatNumber(arr);
        System.out.println(flag);


    }
    public static int findRepeatNumber(int[] nums){
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
}
