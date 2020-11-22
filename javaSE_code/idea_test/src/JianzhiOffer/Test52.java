package JianzhiOffer;

public class Test52 {
    public static void main(String[] args) {
        //创建两个单链表
        ListNode52 headA = new ListNode52(4);
        headA.next = new ListNode52(1);
        headA.next.next = new ListNode52(8);
        headA.next.next.next = new ListNode52(4);
        headA.next.next.next.next = new ListNode52(5);
        ListNode52 headB = new ListNode52(5);
        headB.next = new ListNode52(0);
        headB.next.next = new ListNode52(1);
        headB.next.next.next = new ListNode52(8);
        headB.next.next.next.next = new ListNode52(4);
        headB.next.next.next.next.next = new ListNode52(5);
        ListNode52 result  = getIntersectionNode(headA,headB);
        list(result);




    }
    //定义一个遍历链表的方法
    public static void list(ListNode52 head){
        if(head == null){
            return;
        }
        ListNode52 cur = head;
        while(cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    //定义一个链表翻转的方法
    public static ListNode52 listReverse(ListNode52 head){
        //加入链表为空这个链表中只有一个元素，返回head
        if(head == null || head.next == null){
            return head;
        }
        //定义一个辅助指针
        ListNode52 cur = head;
        ListNode52 next = null;
        //定义一个虚拟的头结点
        ListNode52 reverseHead = new ListNode52(0);
        //遍历原来的链表，每遍历一个元素将其取出
        while( cur != null){
            next = cur.next;
            cur.next = reverseHead.next;
            reverseHead.next = cur;
            cur = next;
        }
        return reverseHead.next;
    }

    //定义一个返回公共节点的方法
    public static ListNode52 getIntersectionNode(ListNode52 headA, ListNode52 headB) {
        int lenA = length(headA), lenB = length(headB);

        //如果节点长度不一样，节点多的先走，直到他们的长度一样为止
        while (lenA != lenB) {
            if (lenA > lenB) {
                //如果链表A长，那么链表A先走
                headA = headA.next;
                lenA--;
            } else {
                //如果链表B长，那么链表B先走
                headB = headB.next;
                lenB--;
            }
        }

        //然后开始比较，如果他俩不相等就一直往下走
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        //走到最后，最终会有两种可能，一种是headA为空，
        //也就是说他们俩不相交。还有一种可能就是headA
        //不为空，也就是说headA就是他们的交点
        return headA;
    }

    //统计链表的长度
    private static int length(ListNode52 node) {
        int length = 0;
        while (node != null) {
            node = node.next;
            length++;
        }
        return length;
    }


}

class ListNode52 {
    int val;
    ListNode52 next;
    ListNode52(int x) {
        val = x;
        next = null;
    }
 }
