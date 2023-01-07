package com.lab5.part2.exercise10;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint botRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.botRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint botRight) {
        this.topLeft = topLeft;
        this.botRight = botRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBotLeft() {
        MyPoint botLeft = new MyPoint(topLeft.getX(), botRight.getY());
        return botLeft;
    }

    public MyPoint getBotRight() {
        return botRight;
    }

    public void setBotRight(MyPoint botRight) {
        this.botRight = botRight;
    }

    public MyPoint getTopRight() {
        MyPoint topRight = new MyPoint(botRight.getX(), topLeft.getY());
        return topRight;
    }

    @Override
    public String toString() {
        return "MyRectangle[" +
                "topLeft = " + topLeft +
                ", botRight = " + botRight +
                ']';
    }

    public double getArea() {
        double edge1 = topLeft.distance(getTopRight());
        double edge2 = topLeft.distance(getBotLeft());
        return edge1 * edge2;
    }

    public double getPerimeter() {
        double edge1 = topLeft.distance(getTopRight());
        double edge2 = topLeft.distance(getBotLeft());
        return 2 * (edge1 + edge2);
    }
}
