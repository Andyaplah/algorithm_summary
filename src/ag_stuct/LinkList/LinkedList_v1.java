package ag_stuct.LinkList;

import javax.print.DocFlavor;

public class LinkedList_v1<E> {

    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next){
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
        public String toString(){
            return e.toString();
        }
    }

    private Node head;
    int size;

    public LinkedList_v1(){
        head = null;
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    /**
     *
     * @method:addFirst
     * @date: 2020/8/13 11:52
     * @params: e
     * @return: void
     *
     */
    public void addFirst(E e){
        Node node = new Node(e);
        node.next = head;
        head = node;
        //head = new Node(e,head);
        size++;
    }


    /**
     *
     * @method:add
     * @date: 2020/8/13 15:05
     * @params: index
     * @params: e
     * @return: void
     *
     */
    public void add(int index, E e) {
        if(index < 0  || index > size)
            throw new IllegalArgumentException("Add failed. Illegal index.");
        if(index == 0)
            addFirst(e);
        else{
            Node pre = head;
            for (int i = 0; i < index-1; i++)
                pre = pre.next;
            Node node = new Node(e);
            node.next = pre.next;
            pre.next = node;
            //pre.next = new Node(e,pre.next);
            size++;
        }
    }

    /**
     *
     * @method:addLast
     * @date: 2020/8/13 15:12
     * @params: e
     * @return: void
     *
     */
    public void addLast(E e){
        add(size,e);
    }

    //优化add 因为旧的需要处理特殊情况
    //可以虚拟头结点 dummyHead


}
