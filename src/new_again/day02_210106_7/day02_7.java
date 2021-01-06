package new_again.day02_210106_7;


/*给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转
假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0
*/



public class day02_7 {

    public static int reverse(int x) {
        //Integer.MAX_VALUE  2147483647
        //Integer.MIN_VALUE  -2147483648
        //System.out.println(Integer.MAX_VALUE);
        //System.out.println(Integer.MIN_VALUE);
        //1: ans * 10 + pop > MAX_VALUE
            //1>ans > MAX_VALUE/10  溢出
            //2>ans == MAX_VALUE/10 且 pop > 7 溢出
        //2: ans * 10 + pop < MIN_VALUE
            //1>ans < MIN_VALUE/10
            //2>ans == MIN_VALUE/10 且 pop < -8溢出
        //21
        int ans = 0;
        int pop = 0;
        while (x!=0){
            pop = x % 10;
            if(ans > Integer.MAX_VALUE/10 || (ans == Integer.MAX_VALUE/10 && pop > 7))
                return 0;
            if(ans < Integer.MIN_VALUE/10 || (ans == Integer.MIN_VALUE/10 && pop < -8))
                return 0;
            ans = ans * 10 + pop;
            System.out.println(ans);
            x = x / 10;
        }

        return ans;
    }

    public static void main(String[] args) {
       //reverse(21);
       // System.out.println(178888%10);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
