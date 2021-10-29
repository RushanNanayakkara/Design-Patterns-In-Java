package factory;

import factory.elements.*;
public class EquilateralPolygonFactory {
    
    public static enum PolygonType{
        TRIANGLE,
        SQUARE
    }

    public static EquilateralPolygon getInstance(PolygonType type,double len) {
        switch (type) {
            case TRIANGLE:
                return new EquilateralTriangle(len);
            case SQUARE:
                return new Square(len);
            default:
                return null;
        }
    }
}
