package com.example;

/*
    Primera parte:

- Crear una función con tres parámetros que sean números que se suman entre sí.
- Llamar a la función en el main y darle valores.

    Segunda parte:

- Crear una clase coche.
- Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
- Una función que incremente el número de puertas que tiene el coche.
- Crear un objeto miCoche en el main y añadirle una puerta.
- Mostrar el número de puertas que tiene el objeto.

 */

public class Ejercicio03 {

    public static void main(String[] args) {

        //Primera parte
        sumar(5, 10, 15);


        //Segunda parte
        Coche car = new Coche();

        System.out.println(car.sumarPuerta(5));

    }

    // Primera parte
    public static void sumar(int param01, int param02, int param03){
        System.out.println(param01 + param02 + param03);
    }
}

    // Segunda parte
class Coche {

    int puertas = 0;
    
    public int sumarPuerta(int masPuertas){
       puertas += masPuertas;
       return puertas;
    }
}
