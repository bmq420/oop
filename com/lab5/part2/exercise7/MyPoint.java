package com.lab5.part2.exercise7;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("(").append(x).append(", ").append(y).append(")");
        return build.toString();
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(Math.pow(Math.abs(xDiff), 2) + Math.pow(Math.abs(yDiff), 2));
    }

    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(Math.pow(Math.abs(xDiff), 2) + Math.pow(Math.abs(yDiff), 2));
    }

    public double distance() {
        return distance(0, 0);
    }
}
