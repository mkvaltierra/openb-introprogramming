package com.example;


/***
 * Crea una clase Persona con las siguientes variables:
 *
 * - La edad.
 * - El nombre.
 * - El teléfono.
 * Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
 * esta nueva clase tendrá la variable credito solo para esa clase.
 *
 * Crea ahora un objeto de la clase Cliente que debe tener como propiedades
 * la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
 *
 * Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
 * y con una variable salario que solo tenga la clase Trabajador.
 */

public class Person {

    private int age;
    private String name;
    private String phone;


    public Person() {}


    public void setAge(int age){
        this.age =  age;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return this.phone;
    }


}
