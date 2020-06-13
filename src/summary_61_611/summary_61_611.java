package summary_61_611;

public class summary_61_611 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }

    //6_1 A删除数组重复元素   思路：快慢指针
    //  1   2  2  3  4  4
    //  j   i  2  3  4  4
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[j] != nums[i]){
                j++;
                nums[j] = nums[i];
            }
        }
        return nums.length==0?0:j+1;
    }

    //6_1 B两数之和  嵌套循环  判断nums[i] == target-nums[j]
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(arr[i] == target-j){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }

        return arr;
    }

    //6_2爬楼梯  (1)  递归 公式法   斐波拉切数列
    public static int climbStairs(int n) {
        if(n ==1 || n==2)
            return n;
        return climbStairs(n-1)+climbStairs(n-2);
    }
    //6_2爬楼梯  (2)  迭代法
    public static int climbStairs1(int n) {
        if(n ==1 || n==2)
            return n;
        int first = 1;
        int second = 2;
        int temp = 0;
        for (int i = 3; i < n; i++) {
            temp = first + second;
            first = second;
            second = temp;
        }
        return temp;
    }

    //6_8链表反转
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
