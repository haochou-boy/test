package JianzhiOffer;

import java.util.ArrayList;
import java.util.List;

public class Test32 {
    public static void main(String[] args) {
        //定义节点
        TreeNode root = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        //创建连接
        root.left = node2;
        root.right = node3;
        node3.left = node4;
        node3.right = node5;
        List<List<Integer>> res = new ArrayList();
        res = levelOrder(root);
        System.out.println(res);

    }
    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList();
        recur(root,0,res);
        return res;
    }
    public static void recur(TreeNode root, int k,List<List<Integer>> res){
        if(root != null){
            if(res.size() <= k) {
                res.add(new ArrayList());
            }
            res.get(k).add(root.val);
            recur(root.left,k+1,res);
            recur(root.right,k+1,res);
        }
    }

    //定义一个前序遍历的方法
    public static void preOrder(TreeNode root){
        //输出跟节点
        System.out.println(root.val);
        //如果左子树不为空则向左子树递归
        if(root.left != null){
            preOrder(root.left);
        }
        //如果右子树不为空则向右子树递归
        if(root.right != null){
            preOrder(root.right);
        }
    }


}
//定义节点
class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) {
      val = x; }
}
