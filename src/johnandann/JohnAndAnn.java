/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnandann;

import johnandann.models.Gender;
import johnandann.models.House;
import johnandann.models.Person;

/**
 *
 * @author George.Pasparakis
 */
public class JohnAndAnn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person john = new Person("John", Gender.MALE);
//        john.name = "aNN";
        System.out.println(john.getName());
        john.someOtherMethod();
        john.walk();
        House house = new House("John's House");
        john.livesInAHouse(house); // setter house
        System.out.println("Person " + john.getName() + " lives in " + john.isLivingInAHouse());
        
        Person ann = new Person("Ann", Gender.FEMALE);
        System.out.println("Person " + ann.getName() + " lives in " + ann.isLivingInAHouse());
    }
    
}
