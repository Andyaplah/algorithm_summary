package day32.d_0703;

public class day_0703 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public ListNode findMidNode(ListNode head){
        if(head == null)
            return null;
        ListNode pre = null;
        ListNode fast = head;
        ListNode slow = head;

        while (fast!=null && fast.next!=null){
            pre = slow;
            fast = fast.next.next;
            slow = slow.next;
        }

        if(pre!=null){
            pre.next = null;
        }

        return slow;
    }


    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)
            return null;

        ListNode midNode = findMidNode(head);
        TreeNode treeNode = new TreeNode(midNode.val);
        if(head == midNode){
            return treeNode;
        }
        treeNode.left = sortedListToBST(head);
        treeNode.right = sortedListToBST(midNode.next);

        return treeNode;

    }
}
