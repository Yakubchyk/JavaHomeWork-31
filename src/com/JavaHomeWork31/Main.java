package com.JavaHomeWork31;

public class Main {
    public static void main(String[] args) {

        ListCollection listCollection = new ListCollection();

        listCollection.add(1, 0,0);
        listCollection.add(2, 1,1);
        listCollection.add(3, 2,2);
        listCollection.add(4, 3,3);
        listCollection.add(5, 4,4);


        listCollection.print();


        for (int i : listCollection) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }
}
