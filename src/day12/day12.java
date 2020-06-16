package day12;

import summary_61_611.summary_61_611;

public class day12 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

//    public boolean isPalindrome(ListNode head) {
//        if (head == null || head.next == null)
//            return false;
//        ListNode fast = head;
//        ListNode slow = head;
//        while (fast != null && fast.next.next != null) {
//            ListNode tmp = slow;
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//
//    }



    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur!=null){
            ListNode tmp = cur.next;   //反转需要知道三个节点才可以反转 否者找不到next即引用
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }

        return pre;
    }
}
