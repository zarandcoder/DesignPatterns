package website.zaripov.statepattern;

public interface PackageState {
    void next(Package pkg);
    void prev(Package pkg);
    void printStatus();
}
