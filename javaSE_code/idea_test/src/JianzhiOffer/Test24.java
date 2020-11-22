package JianzhiOffer;

public class Test24 {
    public static void main(String[] args) {
        //创建单链表
        ListNode3 head = null;
/*        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);*/
        head = reverseList(head);
        list(head);

    }

    public static ListNode3 reverseList(ListNode3 head) {
        //加入链表为空这个链表中只有一个元素，返回head
        if(head == null || head.next == null){
            return head;
        }
        //定义一个辅助指针
        ListNode3 cur = head;
        ListNode3 next = null;
        //定义一个虚拟的头结点
        ListNode3 reverseHead = new ListNode3(0);
        //遍历原来的链表，每遍历一个元素将其取出
        while( cur != null){
            next = cur.next;
            cur.next = reverseHead.next;
            reverseHead.next = cur;
            cur = next;
        }
        return reverseHead.next;

    }
    /*
    链表遍历方法
    */
    public static void list(ListNode3 head){
        if(head == null){
            System.out.println("链表为空");
            return;
        }
        ListNode3 cur = head;
        while(true){
            if (cur == null){
                break;
            }
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
}
/*
定义节点
*/
class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3(int x) { val = x; }
}
