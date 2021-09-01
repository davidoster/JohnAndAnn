/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnandann.models;

import interfaces.HumanActions;

/**
 *
 * @author George.Pasparakis
 */
public abstract class Human implements HumanActions {
    protected String name;
    protected Gender gender;
    
    public void someMethod() {
        System.out.println("Some Method");
    }
    
    protected abstract void someOtherMethod();
}
