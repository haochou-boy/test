package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        System.out.println(solution.solveNQueens(8));
    }
    private List<Integer> seq;
    private boolean[] visited1, visited2, visited3;
    private int n;
    private List<List<String>> ans;
    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        ans = new ArrayList<>();
        seq = new ArrayList<>();
        visited1 = new boolean[n];
        visited2 = new boolean[n * 2];
        visited3 = new boolean[n * 2];
        dfs(0);
        return ans;
    }

    public void dfs(int index){
        if(index == n){
            List<String> list = new ArrayList<>();
            for(int i = 0; i < n; ++i){
                StringBuilder s = new StringBuilder();
                for(int j = 0; j < n; ++j){
                    if(j == seq.get(i)){
                        s.append('Q');
                    }
                    else{
                        s.append('.');
                    }
                }
                list.add(s.toString());
            }
            ans.add(list);
            return;
        }
        for(int i = 0; i < n; ++i){
            //判断棋子间是否在对角线上，只需判断【横纵坐标之和】、【横坐标加上棋盘长度减去纵坐标之和】是否已经出现即可。
            if(visited1[i] == false && visited2[index + (n - i)] == false && visited3[index + i] == false){
                seq.add(i);
                visited1[i] = true;
                visited2[index + (n - i)] = true;
                visited3[index + i] = true;
                dfs(index + 1);
                visited3[index + i] = false;
                visited2[index + (n - i)] = false;
                visited1[i] = false;
                seq.remove(seq.size() - 1);
            }
        }
    }
}
