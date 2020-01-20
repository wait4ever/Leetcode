/*
2. 两数相加

给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

示例：

输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

package LeetCode;

public class N02AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode head= new ListNode(0);
        ListNode pointer = head;
        int carryNum = 0;
        while(l1!=null || l2!=null){
            int v1 = (l1 !=null)? l1.val : 0;
            int v2 = (l2 != null)? l2.val :0;
            int sum = v1 + v2 + carryNum;
            carryNum = sum/10;
            head.next = new ListNode(sum%10);
            head= head.next;
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 = l2.next;
            }
        }
        if(carryNum!=0){
            head.next = new ListNode(carryNum);
        }

        return pointer.next;
    }



    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);


        N02AddTwoNumbers addTwoNumbers = new N02AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(l1,l2);
        while (result!=null){
            System.out.print(result.val+" ");
            result = result.next;
        }




    }
}
