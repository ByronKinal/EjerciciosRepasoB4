import java.util.Scanner;
import org.algorix.controller.Ejercicios;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicios I = new Ejercicios();
        int Opcion = 0;
        do{
        System.out.println("Bienvenido a el programa algorix");
        System.out.println("Elige una opcion para comenzar" );
        System.out.println("1.Resivir un numero e indicar si es par o impar");
        System.out.println("2.Indicar si es primo o no que solo se divide entre 1 y el mismo");
        System.out.println("3.Generar un numero aleatorio y adivinar el numero 1 al 10");
        System.out.println("4.convertir frarengid y centígrados y alreves");
        System.out.println("5.hacer un crud de lista de tareas crear listar y eliminar editar tareas");
        System.out.println("6.Salir");
        Opcion = sc.nextInt();

        switch (Opcion){
            case 1:
                I.ParImpar();
                break;
            case 2:
                I.Primoono();
                break;
            case 3:
                I.AdivinaAdivinador();
                break;
            case 4:
                I.Convertidor();
                break;
            case 5:
                break;
            case 6:
                System.out.println("Saliendo del programa");
                break;
            default:
                System.out.println("Error con la opcion");
                break;
        }
    }while(Opcion != 6);

    }
}