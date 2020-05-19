package org.mainaak;

import org.springframework.stereotype.Component;

//The component annotation tells Spring that a singleton object of this class has to be created
//By default it takes the value of the classname in lowercase unless we specify using the value attribute
@Component (value = "tyre")
public class Tyre {

    private String brand;

    /*public Tyre(String brandInConstructor) {
        this.brand = brandInConstructor;
    }*/

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Tyre{" + "brand='" + getBrand() + '\'' + '}';
    }
}
