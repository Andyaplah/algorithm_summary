package ag_stuct;

public class Array<E> {
    private E[] data;
    private int size;

    public Array(int Capacity){
//        data = new int[Capacity];
        data = (E[]) new Object[Capacity];
        size = 0;
    }

    public Array(){
        this(10);
    }

    public int getSize(){
        return size;
    }

    public int getCapacity(){
        return data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void addLast(E e){
//        if(size == data.length)
//            throw new IllegalArgumentException("Add Failed,the Array is Fulled");
//        data[size] = e;
//        size++;
        add(size,e);
    }

    public void addFirst(E e){
        add(0,e);
    }

    public void add(int index, E e){
//        if(size == data.length)
//            throw new IllegalArgumentException("Add Failed,the Array is Fulled");
        if(index < 0 || index > size )
            throw new IllegalArgumentException("Add Failed.Require index >=0 and index <= size");
        if(size == data.length)
            resize(2*data.length);
        //1  3   5   7   8
        //1  x   3   5   7   8
        for (int i = size-1; i >= index; i--)
            data[i+1] = data[i];
        data[index] = e;
        size++;
    }

    //扩容
    private void resize(int newCapacity) {
        E[] newData = (E[])new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public E getFirst(){
        return data[0];
    }

    public E getLast(){
        return data[size-1];
    }


    public E get(int index){
        if(index < 0 || index >= size)
            throw  new IllegalArgumentException("Get Failed.Index is illegal");
        return data[index];
    }

    public void set(int index,E e){
        if(index < 0 || index >= size)
            throw  new IllegalArgumentException("Get Failed.Index is illegal");
        data[index] = e;
    }

    public boolean contains(E e){
        for (int i = 0; i < size; i++) {
//            if (data[i] == e)
            if (data[i].equals(e))
                return true;
        }
        return false;
    }


    public int find(E e) {
        for (int i = 0; i < size; i++) {
//            if(data[i] == e)
            if (data[i].equals(e))
                return i;
        }
        return -1;
    }


    public E remove(int index){
        if(index < 0 || index >= size)
            throw  new IllegalArgumentException("Remove Failed.Index is illegal");
        E ret = data[index];
        for (int i = index+1; i < size; i++)
            data[i-1] = data[i];
        size--;
        if(size == data.length/2)
            resize(data.length/2);
        return ret;
    }

    public E removeFirst(){
        return remove(0);
    }

    public E removeLast(){
        return remove(size-1);
    }

    public void removeElement(E e){
        int index = find(e);
        if(index != -1)
            remove(index);
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d, capacity = %d\n",size,data.length));
        res.append('[');
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if(i != size-1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }

}
