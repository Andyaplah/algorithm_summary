package ag_stuct;

public class MainTest {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            LinkedList_dummy<Integer> linkedList = new LinkedList_dummy();
            linkedList.add(i,i);
            System.out.println("i-->"+linkedList.get(i));
        }

    }
}
