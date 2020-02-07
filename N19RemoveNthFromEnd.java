package LeetCode;

public class N19RemoveNthFromEnd {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    private static ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode p = head;
        while(head!=null){
            count++;
            head = head.next;
        }
        head = p;
        if(count == n){
            return head.next;
        }
        // count = 8 n=2 6
        for(int i=0;i<count-n-1;i++){
            p = p.next;
        }
        p.next = (p.next==null)?null:p.next.next;
        return head;
    }



    public static void main(String[] args) {

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(3);
        l2.next.next.next = new ListNode(4);
        l2.next.next.next.next = new ListNode(5);

        ListNode listNode= removeNthFromEnd(l2,2);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode= listNode.next;
        }

    }
}
