package ag_stuct;

import day57_0727.DoubleLinkedList;

public class MainTest {


    public static void main(String[] args) {
        TestBean testBean = new TestBean();
        testBean.setFlag(99);
        System.out.println(testBean);
        add(testBean);
        System.out.println(testBean);
        add(testBean);
        System.out.println(testBean);
    }


    public static void add(TestBean bean){
        bean.setFlag(100);
    }

    public static void add2(TestBean bean){
        bean = new TestBean();
        bean.setFlag(101);
    }

//    public static void main(String[] args) {
//        StringBuffer sMain = new StringBuffer("init");
//        System.out.println("sMain=" + sMain.toString());//sMain=init
//        add(sMain);
//        System.out.println("sMain=" + sMain.toString());//sMain=init_add
//        changeRef(sMain);
//        System.out.println("sMain=" + sMain.toString());//sMain=init_add
//    }
//
//    //参数为对象，不改变引用的值
//    public static void add(StringBuffer s) {
//        s.append("_add");
//    }
//    //参数为对象，改变引用的值
//    public static void changeRef(StringBuffer s) {
//        s = new StringBuffer("Java");
//    }
}
