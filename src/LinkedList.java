public class LinkedList {

    private class Node{
        public int e;
        public Node next;

        public Node(int e,Node next){
            this.e = e;
            this.next = next;
        }

        public Node(int e){
            this(e,null);
        }

        public Node(){
            this(0,null);
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedList(){
        dummyHead = new Node(0,null);
        size = 0;
    }

    //获取链表中的元素个数
    public int getSize(){
        return size;
    }

    //返回链表是否为空
    public boolean isEmpty(){
        return size == 0;
    }


    //在链表的index位置添加元素e
    public void add(int index, int e){
        if(index < 0 || index > size)
            throw new IllegalArgumentException("Add Failed. Illegal Index.");

        Node prev = dummyHead;
        for(int i = 0; i < index; i++)
            prev = prev.next;
//            Node node = new Node(e);
//            node.next = prev.next;
//            prev.next = node;
        prev.next = new Node(e,prev.next);
        size ++;

    }

    //在链表头添加新的元素e
    public void addFirst(int e){
        add(0,e);
    }

    //在链表末尾添加元素e
    public void addLast(int e){
        add(size,e);
    }

    //获得链表的第index位置的元素
    public int get(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Add Failed. Illegal Index.");
        Node cur = dummyHead.next;
        for(int i = 0; i < index; i++)
            cur = cur.next;
        return cur.e;
    }

    //获得第一个元素
    public int getFirst(){
        return get(0);
    }

    //获得最后一个元素
    public int getLast(){
        return get(size-1);
    }

    //修改链表第index位置的元素为e
    public void set(int index, int e){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Add Failed. Illegal Index.");
        Node cur = dummyHead.next;
        for(int i = 0; i < index; i++)
            cur = cur.next;
        cur.e = e;
    }

    //查找链表中是否有元素e
    public boolean contains(int e){

        Node cur = dummyHead.next;
        while (cur != null){
            if(cur.e == e)
                return true;
            cur = cur.next;
        }
        return false;
    }

    //从链表中删除元素e
    public void removeElement(int e){
        Node prev = dummyHead;
        while(prev.next != null){
            if(prev.next.e == e)
                break;
            prev = prev.next;
        }

        if(prev.next != null){
            Node delNode = prev.next;
            prev.next = delNode.next;
            delNode.next = null;
        }
    }

}
