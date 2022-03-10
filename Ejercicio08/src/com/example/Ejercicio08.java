package com.example;

/**
 * Para practicar la encapsulación:
 *
 * - Crear clase Persona.
 * - Crear variables las privadas edad, nombre y telefono de la clase Persona.
 * - Crear gets y sets de cada propiedad.
 * - Crear un objeto persona en el main.
 * - Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
 */

public class Ejercicio08 {

    public static void main(String[] args) {

        Person person01 = new Person();

        person01.setAge(20);
        person01.setName("John");
        person01.setPhone("555-555555");

        System.out.println("Nombre: " + person01.getName());
        System.out.println("Edad: " + person01.getAge());
        System.out.println("Teléfono: " + person01.getPhone());

    }
}
