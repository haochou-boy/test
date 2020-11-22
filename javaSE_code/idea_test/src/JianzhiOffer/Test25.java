package JianzhiOffer;

public class Test25 {
    //定义函数入口
    public static void main(String[] args) {
        //创建两个单链表
        ListNode25 l1 = new ListNode25(1);
        l1.next = new ListNode25(2);
        l1.next.next = new ListNode25(4);
        ListNode25 l2 = new ListNode25(1);
        l2.next = new ListNode25(3);
        l2.next.next = new ListNode25(4);
        l2 = mergeTwoLists(l1,l2);
        list(l2);

    }
    //输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的
    public static ListNode25 mergeTwoLists(ListNode25 l1, ListNode25 l2) {
        //定义一个辅助指针和一个虚拟头结点
        ListNode25 dum = new ListNode25(0);
        ListNode25 cur = dum;
        while(!(l1 == null || l2 == null)){
            if (l1.val > l2.val){
                cur.next = l2;
                l2 = l2.next;
            }else{
                cur.next = l1;
                l1 = l1.next;
            }
            cur = cur.next;

        }
        if (l1 == null){
            cur.next = l2;
        }else{
            cur.next = l1;
        }
        return dum.next;

    }
    /*
    链表遍历方法
    */
    public static void list(ListNode25 head){
        if(head == null){
            System.out.println("链表为空");
            return;
        }
        ListNode25 cur = head;
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
class ListNode25 {
    int val;
    ListNode25 next;
    ListNode25(int x) { val = x; }
 }