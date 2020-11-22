package JianzhiOffer;

public class Test17 {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = printNumbers(n);
        showArray(arr);

    }
    public static int[] printNumbers(int n) {
        int[] arr = new int[(int)Math.pow(10,n)-1];
        int max = arr.length;
        for(int i = 0;i < arr.length;i++){
            arr[i] = i+1;
        }
        return arr;

    }
    public static void showArray(int[] arr){
        for(int i = 0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
