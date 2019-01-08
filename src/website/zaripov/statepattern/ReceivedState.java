/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.zaripov.statepattern;

/**
 *
 * @author vadim
 */
public class ReceivedState implements PackageState {

    @Override
    public void next(Package pkg) {
        System.out.println("The package is already received by a client");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package received by a client");
    }
}
