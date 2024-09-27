package org.example.exlist;

public class SteckStretegy<T> implements ListStretegy<T> {
    @Override
    public MyNode<T> add(MyNode<T> head, MyNode<T> newNode) {
        if (head == null) {
            head = newNode;
        } else {
            MyNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }

    public MyNode<T> remove(MyNode<T> head) {


        MyNode<T> current = head;
        while (current != null)
        {

            current = current.next;
            head = current;
            return head;
        }

        return head;
    }

}

