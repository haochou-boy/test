package JianzhiOffer;

public class Test53 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,9};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        int flag = 0;
        for(int i=0;i< nums.length;i++){
            if(nums[i] == flag) {
                flag++;
            }else{
                return flag;
            }
        }

        return -1;
    }

}
