/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Facade.Facade;
import java.util.Date;
import javax.persistence.Persistence;

/**
 *
 * @author Steffen
 */
public class SchemaBuilder {

    public static void main(String[] args) {
        Persistence.generateSchema("JPA1", null);
        
        Facade f = new Facade();
        f.createUser("Steffen", "something@gmail.com", new Date());
        f.createUser("Lars", "email@gmail.com", new Date());
        
        f.getAllUsers();
    }

}
