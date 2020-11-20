package com.company;

public class MyPoint {
    private final double x;
    private final double y;


    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint mp){
        return Math.sqrt((mp.getX() - x) * (mp.getX() - x)
                            + (mp.getY() - y) * (mp.getY() - y));
    }

    public double distance(double _x, double _y){
        MyPoint m1 = new MyPoint(_x, _y);
        return distance(m1);
    }

    public static double distance(MyPoint m1, MyPoint m2){
        return m1.distance(m2);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
