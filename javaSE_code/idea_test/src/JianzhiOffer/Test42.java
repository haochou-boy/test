package JianzhiOffer;

public class Test42 {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int max = maxSubArray(arr);
        System.out.println(max);

    }
    /*public static int maxSubArray(int[] nums) {
        int max = nums[0];
        for(int j = 0;j<nums.length;j++){
            int sum = 0;
            int maxTemp=nums[j];
            for(int i = j;i<nums.length;i++){
                sum += nums[i];
                if(sum>maxTemp){
                    maxTemp = sum;
                }
            }
            if(maxTemp>max){
                max = maxTemp;
            }

        }
        return max;
    }*/
    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }

}
