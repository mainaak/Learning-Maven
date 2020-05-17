package org.mainaak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Using the @Component annotation for dependency injection
@Component
public class Bike implements Vehicle {

    /*public Tyre getTyre() {
        return tyre;
    }
*/
    @Autowired
    private Tyre tyre;

    //Implementing the method tyres() in the Vehicle class
    public void tyres() {
        System.out.println("This bike has " + tyre + " tyres");
    }
}
