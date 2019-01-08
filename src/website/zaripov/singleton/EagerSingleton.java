/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.zaripov.singleton;

/**
 *
 * @author vadim
 */
public class EagerSingleton {
    private static EagerSingleton EAGER_SINGLETON = null;
    
    private EagerSingleton() {
        System.out.println("Eager Singelton instance created");
    }
    
    public static EagerSingleton getInstance() {
        if(EAGER_SINGLETON == null) {
            EAGER_SINGLETON = new EagerSingleton();
        }
        return EAGER_SINGLETON;
    }
}
