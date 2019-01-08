package website.zaripov.singleton;

public class TestSingleton {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.createSingletonObject();   //Reference
        Singleton singleton = Singleton.createSingletonObject(); 

        System.out.println(singleton == singleton1); //True
        System.out.println(singleton.equals(singleton1)); //True

        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();

        System.out.println(eagerSingleton == eagerSingleton1); //True
        System.out.println(eagerSingleton.equals(eagerSingleton1)); //True

    }
}
