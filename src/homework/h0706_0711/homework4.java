package homework.h0706_0711;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/*类型擦除*/
public class homework4 {

    public static void main(String[] args) {
//       example1();
//       example2();
//        testAdd();
        //test();
        ArrayDeque<Integer> integers = new ArrayDeque<>(8);
        integers.add(1);
        System.out.println(integers.size());
    }


    public static void example1(){
        List<String> list1 = new ArrayList<>();
        list1.add("123");

        List<Integer> list2 = new ArrayList<>();
        list2.add(123);

        System.out.println(list1.getClass()==list2.getClass());
        //说明泛型类型String和Integer都被擦除掉了，只剩下原始类型
    }

    public static void example2(){
        /*在程序中定义了一个ArrayList泛型类型实例化为Integer对象，如果直接调用add()方法，那么只能存储整数数据，
        不过当我们利用反射调用add()方法的时候，却可以存储字符串，这说明了Integer泛型实例在编译之后被擦除掉了，只保留了原始类型*/
        try {
            List<Integer> list = new ArrayList<>();
            list.add(123);
            list.getClass().getMethod("add",Object.class).invoke(list,"adg");
            list.getClass().getMethod("add",Object.class).invoke(list,100.0);
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static <T>T add(T a, T b){
        return b;
    }

    public static void testAdd(){
        int i = homework4.add(1,2);
        Number f = homework4.add(1,1.2);
        Object o = homework4.add(1,"asdfsdf");
        System.out.println(i+"   "+f+"    "+o);

//        int ii = homework4.<Integer>add(1,2);
//        int ff = homework4.<Integer>add(1,1.2);
//        Object oo = homework4.<Object>add(1,"asdfsdf");
//        System.out.println(ii+"   "+ff+"    "+oo);
    }


    public static void test(){
        ArrayList<String> list1 = new ArrayList();
        list1.add("1"); //编译通过
        //list1.add(1); //编译错误
        String str1 = list1.get(0); //返回类型就是String

        ArrayList list2 = new ArrayList<String>();
        list2.add("1"); //编译通过
        list2.add(1); //编译通过
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
        Object o = list2.get(0);
    }

}
