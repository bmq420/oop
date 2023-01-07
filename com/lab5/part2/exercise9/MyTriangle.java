package com.lab5.part2.exercise9;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1 = " + v1 +
                ", v2 = " + v2 +
                ", v3 = " + v3 +
                ']';
    }

    public double getPerimeter() {
        double edge1 = v1.distance(v2);
        double edge2 = v2.distance(v3);
        double edge3 = v3.distance(v1);
        return edge1 + edge2 + edge3;
    }

    public String getType() {
        double edge1 = v1.distance(v2);
        double edge2 = v2.distance(v3);
        double edge3 = v3.distance(v1);
        if (edge1 == edge2 && edge2 == edge3) {
            return "Equilateral";
        } else if (edge1 == edge2 || edge2 == edge3 || edge1 == edge3) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}
