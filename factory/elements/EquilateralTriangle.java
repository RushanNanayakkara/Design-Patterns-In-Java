package factory.elements;

import java.lang.Math;

public class EquilateralTriangle extends EquilateralPolygon {
    

    public EquilateralTriangle(double len){
        super(3,len);
    }

    @Override
    public double getArea(){
        return Math.sqrt(3)/4*Math.pow(this.len, 2);
    }

}
