/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnandann.models;

import interfaces.PersonActions;
import johnandann.models.Human;

/**
 *
 * @author George.Pasparakis
 */
public class Person extends Human implements PersonActions {
    private House house; // Association, Aggregation, Composition
    
    public Person() {}
    
    public Person(String name, Gender gender) {
        this.name   = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public void someOtherMethod() {
        System.out.println("Some Other Method!!!");
    }

    @Override
    public void walk() {
        System.out.println("Person " + this.getName() + " walks!");
    }

    @Override
    public void livesInAHouse(House house) { // setter House
        this.house = house;
//        System.out.println("Person " + this.getName() + " lives in house " + house.getName());
    }

    @Override
    public String isLivingInAHouse() { // getter House
        if(this.house != null) {
            return(this.house.getName());
        }
        else {
            return("None");
        }
        
    }
    
    
}
