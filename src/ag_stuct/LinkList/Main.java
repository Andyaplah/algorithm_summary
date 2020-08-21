package ag_stuct.LinkList;

public class Main {

    public static void main(String[] args) {
        LinkedList_v2<Integer> list = new LinkedList_v2<>();
        for (int i = 0; i < 5; i++) {
            list.addFirst(i);
            System.out.println(list);
        }
        list.add(2,66);
        System.out.println(list);
        System.out.println(list.find(5));
        System.out.println(list.find(1));
    }
}
