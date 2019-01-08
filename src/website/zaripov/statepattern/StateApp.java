package website.zaripov.statepattern;

public class StateApp {
    public static void main(String[] args) {
        Package pkg = new Package();
        pkg.printStatus();
        
        pkg.nextState();
        pkg.printStatus();
        
        pkg.nextState();
        pkg.printStatus();
        
        pkg.printStatus();
        pkg.printStatus();
    }
}
