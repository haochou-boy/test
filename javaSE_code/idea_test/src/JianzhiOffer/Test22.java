package JianzhiOffer;

public class Test22 {
    //入口
    public static void main(String[] args) {
        //创建链表
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        list(head);
        head=getKthFromEnd(head ,5);
        list(head);

    }
    //输入倒数k个节点的方法
    public static ListNode getKthFromEnd(ListNode head, int k) {
        //假如链表为空，返回空
        if(head == null){
            return null;
        }
        //定义一个辅助指针
        ListNode cur = head;
        //计算链表的长度
        //定义一个链表长度的计数器
        int len = 0;
        while(cur != null){
            len++;
            cur = cur.next;
        }
        ListNode cur1 = head;
        if(len < k){
            return null;
        }else{
            int count = 0;
            while(cur1 != null){
                if(count == len-k){
                    return cur1;
                }
                count++;
                cur1 = cur1.next;
            }


        }
        return null;

    }

    /*
    链表遍历方法
    */
    public static void list(ListNode head){
        if(head == null){
            System.out.println("链表为空");
            return;
        }
        ListNode cur = head;
        while(true){
            if (cur == null){
                break;
            }
            System.out.println(cur.val);
            cur = cur.next;
        }
    }



}
//定义节点
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }