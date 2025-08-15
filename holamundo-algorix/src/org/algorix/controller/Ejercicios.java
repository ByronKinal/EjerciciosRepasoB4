package org.algorix.controller;
import java.util.Scanner;
import java.util.Random;

public class Ejercicios {
    Scanner sc = new Scanner(System.in);
    Random R = new Random();
    int Cantidad = 0;

    public void ParImpar(){
        System.out.println("Ingrese el numero a evaluar si es par o impar (solo enteros)");
        Cantidad = sc.nextInt();
        if (Cantidad % 2 == 0){
            System.out.println("es par");
        } else {
            System.out.println("es impar");
        }
        System.out.println("------------------------------------------------------------------------------------------------");

    }

    public void Primoono(){
        int Contador = 0;

        System.out.println("Ingrese la cantidad para ver si es primo o no");
        Cantidad = sc.nextInt();
        for (int i = 1; i <= Cantidad; i++) {
            if (Cantidad % i == 0) {
                Contador++;
            }
        }
        if (Contador > 2){
            System.out.println("No es primo");
        }else {
            System.out.println("Es Primo");
        }
        System.out.println("------------------------------------------------------------------------------------------------");

    }
    public void AdivinaAdivinador(){
        boolean T = false;
        int random = R.nextInt(10)+1;
        while (T == false ) {
            System.out.println("Adivina el numero del 1 al 10");
            Cantidad = sc.nextInt();
            if (Cantidad == random) {
                System.out.printf("Correcto Era "+random);
                T = true;
            } else {
                System.out.println("Incorrecto");
            }
        }
        System.out.println("------------------------------------------------------------------------------------------------");
    }
    public void Convertidor(){
        int opcion = 0;
        System.out.println("Elija una opcion para convertir");
        System.out.println("1.Fahrenheit a Celsius");
        System.out.println("2.Celsius a Fahrenheit");
        opcion = sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Ingrese la cantidad de Fahrenheit");
                Cantidad = sc.nextInt();
                Cantidad = (Cantidad+32)*(9/5);
            case 2:
                System.out.println("Ingrese la cantidad de Celsius");
                Cantidad = sc.nextInt();
                Cantidad = (Cantidad-32)*(5/9);
        }
    }
}
