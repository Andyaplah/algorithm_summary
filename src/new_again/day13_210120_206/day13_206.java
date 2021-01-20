package new_again.day13_210120_206;




public class day13_206 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    //1-->2-->3-->4-->null
    //cur
    //null<--1
    // <--2
    // <--3
    // <--4
    public ListNode reverseList(ListNode head) {
       ListNode pre = null;
       ListNode cur = head;
       while (cur!=null){
           ListNode tmp = cur.next;
           cur.next = pre;
           pre = cur;
           cur = tmp;
       }
       return pre;
    }
}
