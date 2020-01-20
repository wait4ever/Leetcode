/*
输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL
 */
package LeetCode;

public class N206ReverseList {
    private static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);


        ListNode pre = null;

        while (head!=null){
            ListNode tmp = head;
            head = head.next;
            tmp.next = pre;
            pre =tmp;
        }

        while (pre != null){
            System.out.println(pre.val);
            pre = pre.next;
        }


    }


}
