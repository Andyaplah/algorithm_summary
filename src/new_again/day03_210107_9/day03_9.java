package new_again.day03_210107_9;

public class day03_9 {
    public static boolean isPalindrome(int x) {
        int index = x;
        int ans = 0;
        while (x != 0){
            int pop = x % 10;
            if(ans > Integer.MAX_VALUE/10 || (ans == Integer.MAX_VALUE/10 && pop > 7))
                return false;
            if(ans < Integer.MIN_VALUE/10 || (ans == Integer.MIN_VALUE/10 && pop < -8))
                return false;
            ans = ans * 10 + pop;
            x = x /10;
        }
        if (index == ans)
            return true;
        return false;
    }


    public static boolean isPalindrome1(int x) {
        if (x < 0)
            return false;
        int cur = 0;
        int num = x;
        while (num != 0){
            cur = cur * 10 + num % 10;
            num = num / 10;
        }
        return cur == x;
    }

    public static void main(String[] args) {
        isPalindrome(121);
    }
}
