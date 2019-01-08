/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.zaripov.factorymethod;

/**
 *
 * @author vadim
 */
public abstract class ComputerFactoryAbstract {
    public abstract Computer getComputer(String type, String ram, String hdd, String cpu);
}
