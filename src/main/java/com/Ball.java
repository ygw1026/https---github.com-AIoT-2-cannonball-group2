package com;

public class Ball {
    int x = 1;
    int y = 1;
    int radius = 10;

    public Ball (int x, int y, int radius) {

        if (radius <= 0) {
            throw new InvalidSizeException();
        }

        if (((long) x + radius > Integer.MAX_VALUE)
                || ((long) x - radius < Integer.MIN_VALUE)
                || ((long) y + radius > Integer.MAX_VALUE)
                || ((long) y - radius < Integer.MIN_VALUE)) {
                    throw new OutOfBoundsException();
                }

        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public int getMinX() {
        return getX() - getRadius();
    }

    public int getMaxX() {
        return getX() + getRadius();
    }

    public int getMinY() {
        return getY() - getRadius();
    }

    public int getMaxY() {
        return getY() + getRadius();
    }

    public int getWidth() {
        return getRadius() * 2;
    }

    public int getHeight() {
        return getRadius() * 2;
    }

    @Override
    public String toString() {
        return String.format("[(%d,%d),%d]", x, y, radius);
    }

    public static void main(String[] args) {
    }
}