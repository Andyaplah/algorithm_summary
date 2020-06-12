package ag_stuct;

public class LinkedList_dummy<E> {

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

//    private Node head;
    private Node dummyHead;
    private int size;
    public LinkedList_dummy(){
        this.dummyHead = new Node(null,null);
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

    //链表中间添加元素
    public void add(int index,E e){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Add failed");
        }
        Node pre = dummyHead;
        for (int i = 0; i < size; i++) {
           pre = pre.next;
           Node node = new Node(e);
           node.next = pre.next;
           pre.next = node;
           //pre.next = node;
           //node.next = pre.next;
           size++;
        }

    }

    //链表头添加元素
    public void addFirst(E e){
        add(0,e);
    }

    //链表尾部添加元素
    public void addLast(E e){
        add(size,e);
    }

    //获取链表
    public E get(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Get failed");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++)
            cur = cur.next;
        return cur.e;
    }

    //获取第一个元素
    public E getFirst(){
        return get(0);
    }

    //获取最后一个元素
    public E getLast(){
        return get(size-1);
    }

    //获取链表
    public void set(int index,E e){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Get failed");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++)
            cur = cur.next;
        cur.e = e;
    }

}

