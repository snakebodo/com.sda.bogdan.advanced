package com.sda.bogdan.advanced.inheritance.ex1;

/**
 * Create a class called Employee whose objects are records for an employee.
 * This class will be a derived class of the class Person which you will have to copy into a file of your own and compile.
 * An employee record has an employee's name (inherited from the class Person),
 *       an annual salary represented as a single value of type double,
 *       a year the employee started work as a single value of type int and a national insurance number,
 *       which is a value of type String.
 * 	Your class should have a reasonable number of constructors and accessor methods,
 * 	        as well as an equals method.
 * 	Write another class containing a main method to fully test your class definition.
 */
public class Main {
    public static void main(String[] args) {
        Person person =  new Person("Tudor", "Andrei");
        Employee employee = new Employee(2000, 25.233, "SS1234", person);
        System.out.println(person);
    }
}
