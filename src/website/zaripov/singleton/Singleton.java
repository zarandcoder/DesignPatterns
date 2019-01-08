package website.zaripov.singleton;

public class Singleton {
    private static Singleton singObj = null;
    
    private Singleton() {
        /*Private Constructor will prevent 
     * the instantiation of this class directly*/
        System.out.println("Private Constructor");
    }
    
    public static Singleton createSingletonObject() {
        /*This logic will ensure that no more than
     * one object can be created at a time */
        if(singObj == null) {
            singObj = new Singleton();
        }
        return singObj;
    }
    
    public void display() {
        System.out.println("Singleton Object created");
    }
}
