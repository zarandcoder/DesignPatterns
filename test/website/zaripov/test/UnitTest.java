/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website.zaripov.test;

import static org.hamcrest.CoreMatchers.instanceOf;
import org.junit.Test;
import static org.junit.Assert.*;
import website.zaripov.statepattern.*;
/**
 *
 * @author vadim
 */
public class UnitTest {
   @Test 
   public void givenNewPackage_whenPackageReceived_thenStateReceived() {
        website.zaripov.statepattern.Package pkg = new website.zaripov.statepattern.Package();
       
       assertThat(pkg.getState(), instanceOf(OrderedState.class));
       pkg.nextState();
       
       assertThat(pkg.getState(), instanceOf(DeliveredState.class));
       pkg.nextState();
       
       assertThat(pkg.getState(), instanceOf(ReceivedState.class));
   }
   
   @Test
   public void givenDeliveredPackage_whenPrevState_thenStateOrdered() {
       website.zaripov.statepattern.Package pkg = new website.zaripov.statepattern.Package();
       pkg.setState(new DeliveredState());
       pkg.previousState();
       
       assertThat(pkg.getState(), instanceOf(OrderedState.class));
   }
    
   

   
}
