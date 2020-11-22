package JianzhiOffer;

public class Test29 {
    public static void main(String[] args) {
        int[][] matrix = {{6,9,7}};
        int[] arr = spiralOrder(matrix);
        for(int i = 0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    public static int[] spiralOrder(int[][] matrix) {
        //假设矩阵为空
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        //定义行
        int column = matrix.length;
        int row = matrix[0].length;
        //初始化一个数组
        int[] arr = new int[column*row];
        int index = 0;
        //初始化参数
        int left = 0,right=row-1;
        int top = 0,bottom = column-1;
        while(left <= right && top <= bottom){
            //从左到右
            for(int j = left ;j <= right;j++){
                arr[index++] = matrix[top][j];
            }
            //从上到下
            for(int i = top+1;i<=bottom;i++){
                arr[index++] = matrix[i][right];
            }
            //另外两种
            if(left < right && top < bottom){
                //从右到左
                for(int j = right-1;j>=left;j--){
                    arr[index++] = matrix[bottom][j];
                }
                //从下到上
                for(int i=bottom-1;i>top;i--){
                    arr[index++] = matrix[i][left];
                }
            }

            left++;
            top++;
            right--;
            bottom--;
        }
        return arr;
    }
}
