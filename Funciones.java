package com.academiafibonacci;

import static com.academiafibonacci.Calculdora.suma;

public class Funciones {

    public static void main(String[] args) {




        //Opción 1: funcion sin parametros y sin tipos de retorno
        //showMenu();
        //showMenu();

        //Opción 2: funcion sin parametros y con tipo de retorno

        System.out.println(getMenu());

        String menu = getMenu();

        System.out.println(menu);

        double price = getPrice();
        System.out.println(price);

        //Opción 3: funcion con parametros y sin tipo de retorno

        imprimirBuenosDias("Academia Fibonacci");

        //Opción 4: función con parametro y con tipo de retorno
        String nombre = "Luis";
        String apellido = "Xutuc";
        String saludo = obtenerSaludo(nombre, apellido);
        System.out.println(saludo);

        int resultadoSuma = suma(50,200);

        System.out.println(resultadoSuma);



    }

     static String obtenerSaludo(String nombre, String apellido) {
        return "Buenas Tardes "+nombre+" "+apellido;
    }

    static void imprimirBuenosDias(String nombre) {
        System.out.println("Buenos días "+nombre);
    }

    static double getPrice() {
        return 100.99;
    }

    //Void indica que no devuelve nada
    static void showMenu(){
        System.out.println("Bienvenidos al E-Comerce de Zapatillas");
        System.out.println("1 - Ver Zapatillas");
        System.out.println("2 - Comprar Zapatillas");
        System.out.println("3 - Salir");
    }

    static String getMenu(){
        System.out.println("Imprimiendo texto de prueba");
        return "Bienvenidos al E-Comerce de Zapatillas \n1. - Ver Zapatillas";
    }
}
