package com.company;

public class Main {

    public static void main(String[] args) {
        MyPoint m1 = new MyPoint(8, 15);
        MyPoint m0 = new MyPoint();
        System.out.println(m1.distance(m0));
        System.out.println(MyPoint.distance(m1, m0));
        System.out.println(m1.distance(m0.getX(), m0.getY()));
    }
}
