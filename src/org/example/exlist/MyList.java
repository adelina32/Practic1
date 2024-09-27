package exlist;

public class MyList<T> {
    private MyNode<T> head;
    private int size;

    private ListStretegy<T> stretegy;

    public MyList() {
        stretegy = new SteckStretegy<>();
    }
    public MyList(ListStretegy<T> stretegy) {
        this.stretegy = stretegy;
    }

    public void add(T element){
        MyNode<T> newNode = new MyNode<>(element);
        if (head != null) {
            head = stretegy.add(head, newNode);
        } else {
            head = newNode;
        }
        size++;

    }
    public void remove(){

        if (head != null) {
            head = stretegy.remove(head);
            size--;
        }


    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        MyNode<T> iter = head;
        while (iter != null) {
            sb.append(iter.getValue());
            sb.append(" ");
            iter = iter.next;
        }
        sb.append("]");
        return sb.toString();
    }
}