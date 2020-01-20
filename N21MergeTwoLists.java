/*
将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 

示例：

输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4

 */
package LeetCode;

public class N21MergeTwoLists {
    private static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }

    static ListNode mergeTwoList(ListNode l1,ListNode l2){
        if(l1==null){
            return l2;
        }
        if (l2 ==null){
            return l1;
        }

        ListNode head;
        if(l1.val>l2.val){
            head = l2;
            head.next = mergeTwoList(l1,l2.next);
        }else{
            head = l1;
            head.next = mergeTwoList(l1.next,l2);
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);


        ListNode result = mergeTwoList(l1,l2);
        while(result!=null){
            System.out.println(result.val);
            result = result.next;
        }





    }
    
}
