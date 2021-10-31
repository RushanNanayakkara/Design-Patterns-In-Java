package prototype;

import java.util.ArrayList;

public class PrototypeExample{
    public static void main(String[] args) {
        ArrayList<Integer> complexValue = new ArrayList<>();
        int notComplexValue = 10;
        
        complexValue.add(10);
        complexValue.add(20);
        
        Prototype prototype = new Prototype(complexValue, notComplexValue);
        Prototype prototype2 = prototype.clone();

        prototype2.addToList(123);

        System.out.println(prototype);
        System.out.println(prototype2);
    }
}