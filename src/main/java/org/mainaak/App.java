package org.mainaak;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {

        //Creating object for ApplicationContext for dependency injection
        //The file spring.xml is read from src/main/resources/spring.xml
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        //Creating object for Vehicle class and then setting the RHS to new Bike(); using getBean("bike")
        Vehicle obj = (Vehicle) applicationContext.getBean("bike");
        obj.tyres();

        //Creating object t for Tyre and using getBean("tyre") for new Tyre();
        /*Tyre t = (Tyre) applicationContext.getBean("tyre");
        System.out.println(t);*/
    }
}
