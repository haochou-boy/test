package JianzhiOffer;

public class Test55_2 {
    public static void main(String[] args) {
        //创建节点
        TreeNode55_2 root = new TreeNode55_2(1);
        TreeNode55_2 node1 = new TreeNode55_2(2);
        TreeNode55_2 node2 = new TreeNode55_2(2);
        TreeNode55_2 node3 = new TreeNode55_2(3);
        TreeNode55_2 node4 = new TreeNode55_2(3);
        TreeNode55_2 node5 = new TreeNode55_2(4);
        TreeNode55_2 node6 = new TreeNode55_2(4);
        //搭建树
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node3.left = node5;
        node3.right = node6;
        System.out.println(isBalanced(root));
    }
    //判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
    public static boolean isBalanced(TreeNode55_2 root) {
        //判断是否为空
        if(root == null){
            return true;
        }
        int leftDepth = findDepth(root.left);
        int rightDepth = findDepth(root.right);
        //如果某二叉树中任意节点的左右子树的深度相差不超过1返回true
        return Math.abs(leftDepth-rightDepth)<=1 && isBalanced(root.left) && isBalanced(root.right);

    }
    //定义一个前序遍历的方法
    private static void preOrder(TreeNode55_2 root){
        //判断树是否为空
        if (root == null){
            return;
        }
        System.out.println(root.val);
        if(root.left != null){
            //向左子树递归
            preOrder(root.left);
        }
        if(root.right != null){
            //向右子树递归
            preOrder(root.right);
        }
    }

    //定义一个计算树的深度的方法
    public static int findDepth(TreeNode55_2 root){
        //假如为空 返回0
        if(root == null){
            return 0;
        }
        //分别计算该节点的左子树和右子树的深度
        int leftDepth = findDepth(root.left);
        int rightDepth = findDepth(root.right);
        //取该节点的左子树和右子树的最大值作为该节点的深度
        return leftDepth>rightDepth?leftDepth+1:rightDepth+1;
    }

}
//定义一个树的节点
class TreeNode55_2 {
    int val;
    TreeNode55_2 left;
    TreeNode55_2 right;
    TreeNode55_2(int x) {
        val = x; }
}