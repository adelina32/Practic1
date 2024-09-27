package exlist;

public class MySteck<T> {
    private MyNode<T> head;

    public void addHead(T element) {
        MyNode<T> newNode = new MyNode<>(element);
        newNode.next = head;
        head = newNode;
    }

    public void remove() {
        MyNode<T> newNode;
        newNode = head.next;
        head.next = null;
    }
}
