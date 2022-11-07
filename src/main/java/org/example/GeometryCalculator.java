package org.example;

public class GeometryCalculator {

    public int area(int length, int width) {
        return length * width;
    }

    public int perimeter(int length, int width) {
        return 2 * (length + width);
    }

    public int isTriangle(int side1, int side2, int side3) {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            return 1;
        } else {
            return 0;
        }
    }
}
