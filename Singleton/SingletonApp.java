import java.util.*;

public class SingletonApp{
    public static void main(String[] args) {

        SingletonItem nonSingItem1 = SingletonItem.getNonSingletonInstance();
        SingletonItem nonSingItem2 = SingletonItem.getNonSingletonInstance();

        System.out.println("Non Singleton Instance 1 id : " + nonSingItem1.getId());
        System.out.println("Non Singleton Instance 2 id : " + nonSingItem2.getId());

        SingletonItem item1 = SingletonItem.getSingletonInstance();
        SingletonItem item2 = SingletonItem.getSingletonInstance();

        System.out.println("Singleton Instance 1 id : " + item1.getId());
        System.out.println("Singleton Instance 2 id : " + item2.getId());
    }
}

