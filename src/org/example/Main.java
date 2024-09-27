package org.example;

import org.example.exlist.MyList;
import org.example.exlist.SteckStretegy;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>(new SteckStretegy<>());


        list.add(10);
        list.add(20);
        list.add(30);


        list.size();
        System.out.println(list);

        System.out.println("Size of the list: " + list.size());


        System.out.println("Is the list empty? " + list.isEmpty());


        list.remove();
        System.out.println(list);


        list.size();


        System.out.println("Size of the list after removing 20: " + list.size());


        System.out.println("Is the list empty? " + list.isEmpty());
    }
}