package JianzhiOffer;

public class Test39 {
    public static void main(String[] args) {
        int[] arr = {6,5,5};
        int num = moleVote(arr);
        System.out.println(num);


    }
    //定义一种遍历数组的方法
    public static void ArrayList(int[] nums){
        for(int i = 0;i< nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    //定义一种返回数组中有一个数字出现的次数超过数组长度的一半
    public static int majorityElement(int[] nums) {
        //先冒泡排序一下
        for (int i = 0;i<nums.length-1;i++){
            for (int j = 0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }

        }
        return nums[nums.length/2];

    }
    //摩尔投票法
    public static int moleVote(int[] nums){
        int mode = 0;
        int num=0;

        for (int i=0; i<nums.length; i++)
        {
            if ( num==0 )
            {
                mode = nums[i];
                num++;
            }
            else if ( mode == nums[i] )
            {
                num++;
            }
            else
            {
                num--;
            }
        }

        return mode;
    }
}
