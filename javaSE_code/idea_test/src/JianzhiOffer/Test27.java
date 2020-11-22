package JianzhiOffer;

public class Test27 {
    public static void main(String[] args) {
        //创建节点
        TreeNode27 root = new TreeNode27(4);
        TreeNode27 node1 = new TreeNode27(2);
        TreeNode27 node2 = new TreeNode27(7);
        TreeNode27 node3 = new TreeNode27(1);
        TreeNode27 node4 = new TreeNode27(3);
        TreeNode27 node5= new TreeNode27(6);
        TreeNode27 node6 = new TreeNode27(9);
        //搭建树
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        mirrorTree(root);
        preOrder(root);

    }
   /* public static TreeNode27 mirrorTree(TreeNode27 root) {
        //判断是否为空树
        if(root == null || root.left == null || root.right == null){
            return root;
        }
        dg(root);
        return root;

    }*/
    //定义一个递归方法
    public static TreeNode27 mirrorTree(TreeNode27 root) {
        if(root == null) return null;
        TreeNode27 tmp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmp);
        return root;
    }


    public static void dg(TreeNode27 root){
        if(root.left.left == null){
            TreeNode27 temp = root.left;
            root.left = root.right;
            root.right = temp;
        }else{
            TreeNode27 temp = root.left;
            root.left = root.right;
            root.right = temp;
            dg(root.left);
            dg(root.right);
        }

    }
    //定义一个前序遍历的方法
    private static void preOrder(TreeNode27 root){
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

}
//定义一个树的节点
class TreeNode27 {
    int val;
    TreeNode27 left;
    TreeNode27 right;
    TreeNode27(int x) {
        val = x; }
 }
