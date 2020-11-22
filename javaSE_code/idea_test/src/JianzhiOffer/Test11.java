package JianzhiOffer;

public class Test11 {
    public static void main(String[] args) {
        int[] arr = {1,3,5};
        int number = minArray(arr);
        System.out.println(number);

    }
    public static  int minArray(int[] numbers) {
        int a = numbers[0];
        for(int i = 1;i<numbers.length;i++){
            int b=numbers[i];
            if (a > b){
                return b;
            }
            a=b;
        }
        return numbers[0];

    }
}
