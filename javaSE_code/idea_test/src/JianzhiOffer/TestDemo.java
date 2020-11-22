package JianzhiOffer;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr = new int[] {2,3,1,9,2,5,3};
//        int ret = solution1(arr);
//        System.out.println("ret1 = "+ret);
        int ret = solution2(arr);
        System.out.println("ret2 = "+ret);
    }

    // 方法一：
    // 先将整个数组排序，然后遍历查找即可
    public static int solution1(int[] arr) {
        // 冒泡排序
        for(int i = 0; i < arr.length-2; i++) {
            for(int j = i; j < arr.length-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        // 遍历整个数组
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]) {
                return arr[i];
            }
        }
        return -1;
    }

    // 方法二：
    // 依次遍历数组，假设第i个元素的值为m，如果i与m相等，跳过本次循环，如果不相等，便将m与数组中下标为m的元素进行判断，如果相等，返回m，不相等，便将他们交换
    public static int solution2(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == i) {
                continue;
            }
            if(arr[i] == arr[arr[i]]) {
                return arr[i];
            }
            int tmp = arr[i];
            arr[i] = arr[arr[i]];
            arr[arr[i]] = tmp;
        }
        return -1;
    }
}
