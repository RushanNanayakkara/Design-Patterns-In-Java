package factory.elements;

import java.lang.Math;

public class Square extends EquilateralPolygon {
    

    public Square(double len){
        super(4,len);
    }

    @Override
    public double getArea(){
        return Math.pow(this.len, 2);
    }
    
}
