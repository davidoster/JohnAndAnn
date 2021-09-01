/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import johnandann.models.House;
import johnandann.models.Person;

/**
 *
 * @author George.Pasparakis
 */
public interface PersonActions {
    
    void livesInAHouse(House house); // setter House under Person
    String isLivingInAHouse(); // getter House under Person
    
}
