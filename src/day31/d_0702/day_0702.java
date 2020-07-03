package day31.d_0702;



public class day_0702 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public int kthToLast(ListNode head, int k) {

        ListNode fast = head;
        ListNode slow = head;

        while (k!=0){
            fast = fast.next;
            k--;
        }

        while (fast!=null){
            fast = fast.next;
            slow = slow.next;
        }

        return slow.val;
    }
}
