package day02;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class day02 {
    /*
    * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

    每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

    注意：给定 n 是一个正整数
    * */

    public static void main(String[] args) {
        System.out.println("------递归----");
        getTime();
        for (int i = 1; i < 50; i++) {
            //System.out.println(i+"---->"+climb1(i));
            //System.out.println(i+"---->"+climb3(i));
            climb1(i);
        }
        getTime();
//        System.out.println("------遍历法----");
//        getTime();
//        for (int i = 1; i < 100; i++) {
//            //System.out.println(i+"---->"+climb1(i));
//            //System.out.println(i+"---->"+climb2(i));
//            climb2(i);
//        }
//        getTime();
//        System.out.println("------动态规划----");
//        getTime();
//        for (int i = 1; i < 100; i++) {
//            //System.out.println(i+"---->"+climb1(i));
//            //System.out.println(i+"---->"+climb3(i));
//            climb3(i);
//        }
//        getTime();

    }

    public static void getTime(){
        Calendar Cld1 = Calendar.getInstance();
        int mm1 = Cld1.get(Calendar.MINUTE);
        int SS1 = Cld1.get(Calendar.SECOND);
        int MI1 = Cld1.get(Calendar.MILLISECOND);
        System.out.println(mm1 + ":" + SS1 + ":" + MI1);
    }

    private static int climb(int n){
        System.out.println();
        return (n == 1 || n == 2) ? n : climb(n - 2) + climb(n - 1);
    }


    /*
    *
    * 递归方式
    * */
    private static int climb1(int n){
        if(n==1 || n==2){
            return n;
        }else{
            return climb1(n-1)+climb1(n-2);
        }
    }

    /*
     *
     * 遍历法
     * */
    private static int climb2(int n){
        if(n==1 || n==2){
            return n;
        }
        int temp = 0;
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            temp = first + second;
            first = second;
            second = temp;
        }
        return temp;
    }


    /*
    *
    * 动态规划
    *
    * 最优子结构   n-1  n-2
    * 边界   f1=1   f2=2
    * 状态转移方程   n-1   +   n-2
    * */
    private static int climb3(int n){
        if(n==1 || n==2){
            return n;
        }
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];

    }
}
