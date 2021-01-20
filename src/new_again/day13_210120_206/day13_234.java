package new_again.day13_210120_206;

public class day13_234 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode halfNode = halfNode(head);
        ListNode reserverHalfNode = reserverNode(halfNode.next);

        ListNode p1 = head;
        ListNode p2 = reserverHalfNode;
        boolean res = true;

        while (res && p2!=null){
            if(p1.val != p2.val)
                res = false;
            p1 = p1.next;
            p2 = p2.next;
        }
        //halfNode = reserverNode(reserverHalfNode);
        return res;
    }

    public ListNode halfNode(ListNode node){
        ListNode fast = node;
        ListNode slow = node;

        while (fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reserverNode(ListNode node){
        ListNode pre = null;
        ListNode cur = node;

        while (cur!=null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }

        return pre;
    }
}



