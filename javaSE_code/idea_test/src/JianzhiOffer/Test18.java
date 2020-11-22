package JianzhiOffer;

public class Test18 {
    public static void main(String[] args) {
        //创建节点
        ListNode1 head = new ListNode1(4);

        head.next = new ListNode1(5);
        list(head);
        head.next.next = new ListNode1(1);
        head.next.next.next = new ListNode1(9);

        list(head);
        head = deleteNode(head,1);
        list(head);



    }
    /*
    链表遍历方法
    */
    public static void list(ListNode1 head){
        if(head == null){
            System.out.println("链表为空");
            return;
        }
        ListNode1 cur = head;
        while(true){
            if (cur == null){
                break;
            }
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
    /*
    链表删除节点
    */
    public static ListNode1 deleteNode(ListNode1 head, int val) {
        ListNode1 cur = head;
        //是否找到的标志位
        boolean flag = false;
        while(true){
            if(cur.next == null){
                break;
            }
            if(cur.val == val){//当删除的是头结点
                return cur.next;
            }
            if(cur.next.val == val){
                flag = true;
                break;
            }
            cur = cur.next;

        }
        if(flag){
            cur.next = cur.next.next;
        }
        return head;

    }

}
 class ListNode1 {
     int val;
     ListNode1 next;
     ListNode1(int x) {
         val = x;
     }

     @Override
     public String toString() {
         return "ListNode1{" +
                 "val=" + val +
                 ", next=" + next +
                 '}';
     }
 }
