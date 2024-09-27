package org.example.exlist;

public interface ListStretegy<T> {
    MyNode<T> add(MyNode<T> head, MyNode<T> newMyNode);
    MyNode<T> remove(MyNode<T> head);

}
