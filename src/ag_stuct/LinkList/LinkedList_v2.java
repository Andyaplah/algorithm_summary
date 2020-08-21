package ag_stuct.LinkList;


//优化add 因为旧的需要处理特殊情况
//可以虚拟头结点 dummyHead
public class LinkedList_v2<E> {

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

    private Node dummyHead;
    private int size;

    public LinkedList_v2(){
        dummyHead = new Node(null,null);
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
        add(0,e);
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
        Node pre = dummyHead;
        for (int i = 0; i < index; i++)
            pre = pre.next;
        Node node = new Node(e);
        node.next = pre.next;
        pre.next = node;
        //pre.next = new Node(e,pre.next);
        size++;
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


    /**
     *
     * @method:get
     * @date: 2020/8/13 15:34
     * @params: index
     * @return: E
     *
     */
    public E get(int index){
        if(index < 0  || index > size)
            throw new IllegalArgumentException("Add failed. Illegal index.");
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++)
            cur = cur.next;
        return cur.e;
    }

    /**
     *
     * @method:getFirst
     * @date: 2020/8/13 16:38
     * @params: null
     * @return: E
     *
     */
    public E getFirst(){
        return get(0);
    }

    /**
     *
     * @method:getLast
     * @date: 2020/8/13 16:38
     * @params: null
     * @return: E
     *
     */
    public E getLast(){
        return get(size-1);
    }


    public void set(int index, E e){
        if(index < 0  || index > size)
            throw new IllegalArgumentException("Set failed. Illegal index.");
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++)
            cur = cur.next;
        cur.e = e;
    }


    public boolean find(E e){
        Node cur = dummyHead.next;
        for (;;){
            if(cur.next == null)
                break;
            else{
                if(cur.e.equals(e))
                    return true;
                else
                    cur = cur.next;
            }
        }
//        while (cur.next!=null){
//            if(cur.e.equals(e))
//                return true;
//            else
//                cur = cur.next;
//        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        //Node cur = dummyHead.next;
        for (Node cur = dummyHead.next; cur != null; cur = cur.next)
            res.append(cur + "->");
//        while (cur != null){
//            res.append(cur + "->");
//            cur = cur.next;
//        }
        res.append("NULL");
        return res.toString();
    }
}
