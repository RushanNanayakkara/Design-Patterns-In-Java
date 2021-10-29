package singleton;

public class SingletonItem{
    private static SingletonItem instance;
    private static int count = 0;

    private int id;

    private SingletonItem(){
        count++;
        this.id = count;
        if(instance==null){
            instance = this;
        }
    }

    public int getId(){
        return this.id;
    }

    public static SingletonItem getSingletonInstance(){
        if(instance==null){
            synchronized(SingletonItem.class){
                if(instance==null){
                    instance = new SingletonItem();
                }
            }
        }
        return instance;
    }

    public static SingletonItem getNonSingletonInstance() {
        return new SingletonItem();
    }

}