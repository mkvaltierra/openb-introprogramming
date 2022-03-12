package com.example;

public class Main {
    public static void main(String[] args) {

        Client cliente = new Client();

        cliente.setAge(20);
        cliente.setName("John Doe");
        cliente.setPhone("555-55555");
        cliente.setCredit(20000);

        System.out.println("Cliente: " + cliente.getName());
        System.out.println("Edad: " + cliente.getAge());
        System.out.println("Teléfono: " + cliente.getPhone());
        System.out.println("Crédito: " + cliente.getCredit() + " $");
        System.out.println();

        Worker trabajador = new Worker();

        trabajador.setAge(35);
        trabajador.setName("Daisy Doe");
        trabajador.setPhone("777-77775");
        trabajador.setSalary(2000);

        System.out.println();
        System.out.println("Trabajador: " + trabajador.getName());
        System.out.println("Edad: " + trabajador.getAge());
        System.out.println("Teléfono: " + trabajador.getPhone());
        System.out.println("Salario: " + trabajador.getSalary() + " $");
    }
}
