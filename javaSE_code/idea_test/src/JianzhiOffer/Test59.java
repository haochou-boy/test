package JianzhiOffer;

import java.util.Arrays;

public class Test59 {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = new int[nums.length - k + 1];
        //定义一个最大值的下标和一个最大值
        int maxIndex = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0;i < nums.length - k + 1;i++) {
            if (maxIndex >= i) {
                //判断最后一个值和最大值的大小
                if (nums[i + 2] > max) {
                    max = nums[i + 2];
                    maxIndex = i + 2;
                }
            } else {
                for (int j = i; j < i + 3; j++) {
                    if (nums[j] > max) {
                        max = nums[j];
                        maxIndex = j;
                    }
                }
            }
            result[i] = max;

        }
        System.out.println(Arrays.toString(result));
    }
}
        /*//第一个窗口
        int i = 0;
        for (int j = i; j < i + 3; j++) {
            if (nums[j] > max) {
                max = nums[j];
                maxIndex = j;
            }

        }
        result[0] = max;
        System.out.println(maxIndex);
        System.out.println(Arrays.toString(result));

        //第二个窗口
        i = 1;
        //判断最大值是不是在第二个窗口内
        if (maxIndex <= i + 2) {
            //判断最后一个值和最大值的大小
            if (nums[i + 2] > max) {
                max = nums[i + 2];
                maxIndex = i + 2;
            }
        } else {
            for (int j = i; j < i + 3; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                    maxIndex = j;
                }

            }
        }
        result[1] = max;
        System.out.println(maxIndex);
        System.out.println(Arrays.toString(result));

        //第三个窗口
        i = 2;
        //判断最大值是不是在第二个窗口内
        if (maxIndex <= i + 2) {
            //判断最后一个值和最大值的大小
            if (nums[i + 2] > max) {
                max = nums[i + 2];
                maxIndex = i + 2;
            }
        } else {
            for (int j = i; j < i + 3; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                    maxIndex = j;
                }

            }
        }
        result[2] = max;
        System.out.println(maxIndex);
        System.out.println(Arrays.toString(result));
    }*/


/*    public static int[] maxSlidingWindow(int[] nums, int k) {

    }*/

