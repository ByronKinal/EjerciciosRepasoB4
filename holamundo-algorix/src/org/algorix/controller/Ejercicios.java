package org.algorix.controller;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Ejercicios {
    Scanner sc = new Scanner(System.in);
    Random R = new Random();
    ArrayList <String> tareas = new ArrayList<>();
    int Cantidad = 0;

    public void ParImpar(){
        do {
        System.out.println("Ingrese el numero a evaluar si es par o impar (solo enteros)");
        Cantidad = sc.nextInt();
        if (Cantidad % 2 == 0){
            System.out.println("es par");
        } else {
            System.out.println("es impar");
        }
        System.out.println("------------------------------------------------------------------------------------------------");
        }while(Pregunta().equals("si"));
    }

    public void Primoono(){
        int Contador = 0;
        do {
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
        }while(Pregunta().equals("si"));
    }
    public void AdivinaAdivinador(){
        do {
        boolean T = false;
        int random = R.nextInt(10)+1;
        while (T == false ) {
            System.out.println("Adivina el numero del 1 al 10");
            Cantidad = sc.nextInt();
            if (Cantidad == random) {
                System.out.println("Correcto Era "+random);
                T = true;
            } else {
                System.out.println("Incorrecto");
            }
        }
        System.out.println("------------------------------------------------------------------------------------------------");
        }while(Pregunta().equals("si"));
    }
    public void Convertidor(){
        do{
            int opcion = 0;
            double temperatura = 0;
            System.out.println("Elija una opcion para convertir");
            System.out.println("1.Fahrenheit a Celsius");
            System.out.println("2.Celsius a Fahrenheit");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad de Fahrenheit");
                    temperatura = sc.nextInt();
                    System.out.println(temperatura);
                    double Conversion = (temperatura - 32) * 5 / 9;
                    System.out.println("La cantidad de Celsius es " + Conversion);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de Celsius");
                    temperatura = sc.nextInt();
                    Conversion = (temperatura * 9 / 5) + 32;
                    System.out.println("La cantidad de Fahrenheit es " + Conversion);
                    break;
            }
            System.out.println("------------------------------------------------------------------------------------------------");
        }while(Pregunta().equals("si"));
    }
    public String Pregunta(){
        sc.nextLine();
        String resultado = "si";
            System.out.println("Quiere continuar si/no (en minuscula)");
            resultado = sc.nextLine();
        return resultado;
    }

    public void BlogTareas (){
        boolean continuar = true;
        do {
            int j = 1;
            System.out.println("Que decea hacer");
            System.out.println("1.Crear tarea");
            System.out.println("2.Listar tareas");
            System.out.println("3.Eliminar tarea");
            System.out.println("4.Editar tarea");
            System.out.println("5.Salir");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de la tarea a crear");
                    String tareaCrear = sc.nextLine();
                    tareas.add(tareaCrear);
                    System.out.println("Tarea '" + tareaCrear + "' creada.");
                    break;
                case 2:
                    System.out.println("Lista de tareas:");
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas creadas.");
                    } else {
                        for (int i = 0; i < tareas.size(); i++) {

                            System.out.println(j+". - " + tareas.get(i));
                            j= j + 1;
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < tareas.size(); i++) {
                        System.out.println(j+". - " + tareas.get(i));
                        j++;
                    }
                    System.out.println("Ingrese el numero de la tarea a eliminar");
                    int tareaEliminar = sc.nextInt() -1;
                    if (tareas.remove(tareas.get(tareaEliminar))) {
                        System.out.println("Tarea " + " eliminada.");
                    } else {
                        System.out.println("Tarea " + " no encontrada.");
                    }
                    break;
                case 4:
                    for (int i = 0; i < tareas.size(); i++) {
                        System.out.println(j+". - " + tareas.get(i));
                        j++;
                    }
                    System.out.println("Ingrese el numero de la tarea a editar");
                    int tareaN = sc.nextInt();
                    System.out.println("Ingrese el nuevo nombre de la tarea");
                    sc.nextLine();
                    String nuevaTarea = sc.nextLine();
                    tareas.set(tareaN - 1, nuevaTarea);
                    System.out.println("Tarea '" + nuevaTarea + "' editada.");
                    break;
                case 5:
                    System.out.println("Saliendo del blog de tareas.");
                    continuar = false;
                    System.out.println("------------------------------------------------------------------------------------------------");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }while (continuar);
    }
}
