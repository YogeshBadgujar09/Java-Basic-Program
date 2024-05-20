package com.infogalaxy.interface_use;

public class AreaOfCircle implements IAreaInterface {

    /**
     * here Developer select that function , in which he will actually work
     * Now Developer Work on Area of Circle so he will implement only area( int radius)
     * @param radius
     */
    @Override
    public void area(double radius) {

        double areaOfCircle = PI * radius * radius;
        System.out.println("Area of Circle :" + areaOfCircle);

    }

    /**
     *function define only for follow interface property
     * @param length
     * @param width
     */
    @Override
    public void area(double length, double width) {

    }

    public static void main(String[] args) {

        AreaOfCircle obj = new AreaOfCircle();
        obj.area(10);


    }
}
