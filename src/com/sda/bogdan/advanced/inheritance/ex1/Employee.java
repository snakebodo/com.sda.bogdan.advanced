package com.sda.bogdan.advanced.inheritance.ex1;

import java.util.Objects;

public class Employee {
    private int yearOfEmployment;
    private double annualSalary;
    private String nino;
    private Person person;

    public Employee(int yearOfEmployment, double annualSalary, String nino, Person person) {
        this.yearOfEmployment = yearOfEmployment;
        this.annualSalary = annualSalary;
        this.nino = nino;
        this.person = person;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public void setYearOfEmployment(int yearOfEmployment) {
        this.yearOfEmployment = yearOfEmployment;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public String getNino() {
        return nino;
    }

    public void setNino(String nino) {
        this.nino = nino;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return yearOfEmployment == employee.yearOfEmployment && Double.compare(employee.annualSalary, annualSalary) == 0 && Objects.equals(nino, employee.nino) && person.equals(employee.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfEmployment, annualSalary, nino, person);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "yearOfEmployment: " + yearOfEmployment +
                "\nannualSalary:   " + annualSalary +
                "\nnino:           " + nino +
                "\nperson:         " + person;
    }
}
