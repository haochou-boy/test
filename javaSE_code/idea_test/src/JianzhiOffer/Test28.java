package JianzhiOffer;

public class Test28 {
    public static void main(String[] args) {
        //创建节点
        TreeNode28 root = new TreeNode28(1);
        TreeNode28 node1 = new TreeNode28(2);
        TreeNode28 node2 = new TreeNode28(2);
        TreeNode28 node3 = new TreeNode28(3);
        TreeNode28 node4 = new TreeNode28(3);

        //连接节点
        root.left =node1;
        root.right =node2;
        node1.right =node3;
        node2.right =node4;


        System.out.println(isSymmetric(root));



    }
    //定义一个方法判断该树是不是对称树
    public static boolean isSymmetric(TreeNode28 root) {
        //判断是否为空
        if(root == null){
            return true;
        }else{
            return recur(root.left,root.right);
        }


    }
    public static boolean recur(TreeNode28 L,TreeNode28 R){
        //加入同时为空返回true
        if(L == null && R == null){
            return true;
        }
        //其中一个为空或者值不相同，返回false
        if( L==null || R==null || L.val != R.val){
            return false;
        }
        //递归判断
        return recur(L.left,R.right) && recur(L.right,R.left);
    }
/*    //定义一个方法返回镜像树
    public static TreeNode28 Mirror(TreeNode28 root){
        //判断是否为空
        if(root == null){
            return null;
        }
        //不为空交换左右子树
        TreeNode28 temp = root.left;
        root.left = Mirror(root.right);
        root.right = Mirror(temp);
        //交换之后返回该节点
        return root;
    }*/
    //定义一个前序遍历的方法
    public static void preOrder(TreeNode28 root){
        //判断是否为空
        if(root == null){
            return;
        }
        //输出当前节点
        System.out.println(root.val);
        //向左子树递归
        if(root.left != null){
            preOrder(root.left);
        }
        //向右子树递归
        if(root.right != null){
            preOrder(root.right);
        }
    }
}
//定义节点
class TreeNode28 {
    int val;
    TreeNode28 left;
    TreeNode28 right;
    TreeNode28(int x) {
        val = x; }
 }
