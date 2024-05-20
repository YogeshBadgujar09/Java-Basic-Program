package com.infogalaxy.interface_use;

public class AreaOfRectangle implements IAreaInterface{

    /**
     * function define only for follow interface property
     * @param radius
     */
    @Override
    public void area(double radius) {

    }

    /**
     *
     * here Developer select that function , in which he will actually work
     * Now Developer Work on Area of Rectangle so he will implement only area( int radius)
     * @param length
     * @param width
     */
    @Override
    public void area(double length, double width) {

        double areaOfRectangle = length * width ;
        System.out.println("Area of Rectangle :" + areaOfRectangle);
    }

    public static void main(String[] args) {

        AreaOfRectangle obj = new AreaOfRectangle();
        obj.area(30,10);
    }
}
