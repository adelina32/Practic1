package org.example.exlist;

public class MyNode<T> {
    private T value;

    public T getValue() {
        return value;
    }

    MyNode<T> next;
    public MyNode(T value){
        this.value = value;
    }
}
