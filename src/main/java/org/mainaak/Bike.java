package org.mainaak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Using the @Component annotation for telling the Spring framework to create an object for this
@Component
public class Bike implements Vehicle {

    /*public Tyre getTyre() {
        return tyre;
    }
*/
    //Autowired automatically calls the constructor of the class you enter below it and links the two classes
    //Autowired by default automatically looks for the class unless you specify using @Qualifier annotation
    @Autowired
    @Qualifier(value = "tyre")
    private Tyre tyre;

    //Implementing the method tyres() in the Vehicle class
    public void tyres() {
        System.out.println("This bike has " + tyre + " tyres");
    }
}
