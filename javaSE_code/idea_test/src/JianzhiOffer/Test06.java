package JianzhiOffer;

public class Test06 {
    public static void main(String[] args) {
        ListNode2 head = new ListNode2(1);
        head.next = new ListNode2(3);
        head.next.next =new ListNode2(2);
        int[] result = reversePrint(head);
        for(int i = 0;i<result.length;i++){
            System.out.println(result[i]);
        }




    }
    public static int[] reversePrint(ListNode2 head) {
        //先获取链表长度，创建对应长度数组
        ListNode2 currNode = head;
        int len = 0;
        while(currNode != null){
            len ++;
            currNode = currNode.next;
        }
        int[] result = new int[len];
        //再次遍历链表，将值倒序填充至结果数组
        currNode = head;
        while(currNode != null){
            result[len - 1] = currNode.val;
            len --;
            currNode = currNode.next;
        }
        return result;
    }


}

 class ListNode2 {
      int val;
      ListNode2 next;
      ListNode2(int x) {
          val = x;
      }
  }


