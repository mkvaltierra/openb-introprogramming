package com.example;

public class Worker extends Person {

    private double salary;

    public Worker(){}

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }
}
