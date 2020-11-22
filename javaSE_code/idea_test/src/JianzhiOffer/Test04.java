package JianzhiOffer;

public class Test04 {
    public static void main(String[] args) {
        int target = 5;
        int[][] arr = {{1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        boolean flag = findNumberIn2DArray2(arr,target);
        System.out.println(flag);
    }
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        for(int i = 0;i< matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if (matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;

    }
    public static boolean findNumberIn2DArray2(int[][] matrix, int target){
        //判断矩阵是否为空
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        //获取矩阵的行
        int row = matrix.length;
        //获取矩阵的列
        int column = matrix[0].length;
        //取右上角的数开始线性查找,因为这个数的下一行比它大 下一列比它小
        int i = 0;int j = column - 1;
        while(i < row && j >= 0){
            if (matrix[i][j] == target){
                return true;
            }else if(matrix[i][j]>target){
                j--;
            }else if(matrix[i][j]<target){
                i++;
            }
        }
        return false;
    }

}



