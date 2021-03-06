package ag_stuct;

public class LinkedList<E> {

    public class Node{
        public E e;
        public Node next;

        public Node(E e,Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e,null);
        }

        public Node(){
            this(null,null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node head;
    private int size;
    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    //返回链表长度
    public int getSize(){
        return size;
    }

    //判断链表是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    //链表头添加元素
    public void addFirst(E e){
        Node node = new Node(e);
        node.next = head;
        head = node;
        size++;
    }

    //

    //链表中间添加元素
    public void add(int index,E e){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Add failed");
        }
        if(size == 0){
            addFirst(e);
        }else{
            Node pre = head;
            for (int i = 0; i < size - 1; i++) {
               pre = pre.next;
               Node node = new Node(e);
               node.next = pre.next;
               pre.next = node;
               //pre.next = node;
               //node.next = pre.next;
               size++;
            }
        }
    }

    //链表尾部添加元素
    public void addLast(E e){
        add(size,e);
    }

}

