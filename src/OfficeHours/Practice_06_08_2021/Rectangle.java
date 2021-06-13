package OfficeHours.Practice_06_08_2021;

public class Rectangle extends Shape{
    double length;
    double width;

    @Override
    public void calculateArea() {
        area = length * width;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
//C extends B and B extends A, C will have A data? --> yes
