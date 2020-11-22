package JianzhiOffer;

public class Test21 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] arr = exchange(nums);
        showArray(arr);

    }

    public static int[] exchange(int[] nums){
        int p = 0;
        int len = nums.length;
        for(int i = 0; i < len; i ++){
            if((nums[i]&1)==1){
                int tmp = nums[i];
                nums[i] = nums[p];
                nums[p++] = tmp;
            }
        }
        return nums;
    }

    public static void showArray(int[] arr){
        for(int i = 0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
