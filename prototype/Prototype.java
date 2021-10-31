package prototype;

import java.util.ArrayList;

public class Prototype implements Cloneable {
    private ArrayList<Integer> val;
    private int count;

    public Prototype(ArrayList<Integer> val,int count){
        this.val = val; // this val can be something that is hard to compute and uses lot of resouces and time
        this.count = count;
    }
    
    public void addToList(int value){
        this.val.add(value);
    }

    @Override
    public String toString(){
        StringBuffer stringRepresentation = new StringBuffer("Complex : ");
        this.val.forEach(v->stringRepresentation.append(String.format("%d ",v)));
        stringRepresentation.append(String.format("\nNot complex : %d",count));
        return stringRepresentation.toString();
    }

    @Override
    public Prototype clone(){
        ArrayList<Integer> valClone = new ArrayList<>();
        this.val.forEach(v -> valClone.add(Integer.valueOf(v.intValue())));
        return new Prototype(valClone, this.count);
    }

}
