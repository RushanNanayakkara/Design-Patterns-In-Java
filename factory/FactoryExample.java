package factory;

import factory.elements.*;

public class FactoryExample {
    public static void main(String[] args) {
        
        EquilateralPolygon triangle = EquilateralPolygonFactory.getInstance(EquilateralPolygonFactory.PolygonType.TRIANGLE,3);
        EquilateralPolygon squire = EquilateralPolygonFactory.getInstance(EquilateralPolygonFactory.PolygonType.SQUARE,4);

        System.out.println("Area of triangle : " + triangle.getArea());
        System.out.println("Area of squire : " + squire.getArea());
    }
}
