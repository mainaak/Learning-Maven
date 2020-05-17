package org.mainaak;

import org.springframework.stereotype.Component;

//Using the @Component annotation for dependency injection
@Component
public class Car implements Vehicle{

    //Implementing the method tyres() in the Vehicle class
    public void tyres(){
        System.out.println("This car has Michelin tyres");
    }
}
