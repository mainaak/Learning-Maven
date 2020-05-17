package org.mainaak;

import org.springframework.stereotype.Component;

@Component
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
