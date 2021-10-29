package factory.elements;

public abstract class EquilateralPolygon {
    double len,sides;
    public abstract double getArea();

    protected EquilateralPolygon(int sides, double len){
        this.sides = sides;
        this.len = len;
    }

    public double getTotalSidesLength(){
        return sides*len;
    }
}
