package LeetCode;

import java.util.List;

public class N24SwapPairs {


    public static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }


    public static ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode p = head;
        ListNode q = head.next;
        ListNode ans = q;

        while(p!=null && q!=null){
            ListNode tmp = (q.next!=null)?q.next:null;
            p.next = (tmp!=null && tmp.next!=null)?tmp.next:tmp;
            q.next = p;
            p = tmp;
            if(p!=null){
                q = p.next;
            }else{
                q = null;
            }

        }
        return ans;
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(5);
        l1.next.next.next.next = new ListNode(7);
        l1.next.next.next.next.next = new ListNode(8);

        ListNode l = swapPairs(l1);
        while (l!=null){
            System.out.println(l.val);
            l = l.next;
        }

    }

}
