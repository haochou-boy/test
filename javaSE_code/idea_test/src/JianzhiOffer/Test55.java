package JianzhiOffer;

public class Test55 {
    public static void main(String[] args) {
        //创建二叉树
        //定义节点
        TreeNode55 root = new TreeNode55(3);
        TreeNode55 node2 = new TreeNode55(9);
        TreeNode55 node3 = new TreeNode55(20);
        TreeNode55 node4 = new TreeNode55(15);
        TreeNode55 node5 = new TreeNode55(7);
        //创建连接
        root.left = node2;
        root.right = node3;
        node3.left = node4;
        node3.right = node5;
        int res = maxDepth(root);
        System.out.println(res);

    }
    //定义一个递归方法
    public static int maxDepth(TreeNode55 root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}
class TreeNode55 {
    int val;
    TreeNode55 left;
    TreeNode55 right;
    TreeNode55(int x) {
        val = x; }
}
