package UI;

import Data.TipoProducto.Accesorio;
import Data.TipoProducto.TipoInstrumento.InstrumentoCuerda.Guitarra;

import java.util.Scanner;
public class UI {

    public static void Bienvenida(){
        System.out.println("Bienvenido a la tienda de instrumentos musicales ");
    }

    public static  int seleccionar_producto(){
        Scanner scan = new  Scanner(System.in);
        System.out.println("¿Que producto deseas ver?\n Escribe 1 para ver instrumentos musicales" +
                "\nEscribe 2 para ver accesorios\n");
        System.out.print("Tu selección: ");
        int seleccion = scan.nextInt();

        return seleccion;
    }

    public static int seleccionar_instrumento(){
        Scanner scan = new  Scanner(System.in);
        System.out.println("¿Qué tipo de instrumento deseas ver?");
        System.out.println("Escribe 1 para instrumentos de cuerda" +
                "\nEcribe 2 para instrumentos de viento" +
                "\nEscribe 3 para instrumentos de percusión");
        System.out.print("Tu selección: ");
        int seleccion = scan.nextInt();
        return seleccion;
    }

    public static int seleccionar_instrumento_de_cuerda(){
        Scanner scan = new  Scanner(System.in);
        System.out.println("¿Qué instrumento de cuerda quieres ver?");
        System.out.println("Escribe 1 para guitarra\nEscribe 2 para piano");
        System.out.print("Tu selección: ");
        int seleccion = scan.nextInt();
        return seleccion;
    }

    public static int seleccionar_instrumento_de_viento(){
        Scanner scan = new  Scanner(System.in);
        System.out.println("¿Qué instrumento de viento quieres ver?");
        System.out.println("Escribe 1 para flauta\nEscribe 2 para trompeta");
        System.out.print("Tu selección: ");
        int seleccion = scan.nextInt();
        return seleccion;
    }

    public static int seleccionar_instrumento_de_percusion(){
        Scanner scan = new  Scanner(System.in);
        System.out.println("¿Qué instrumento de percusión quieres ver?");
        System.out.println("Escribe 1 para bateria\nEscribe 2 para xilofono");
        System.out.print("Tu selección: ");
        int seleccion = scan.nextInt();
        return seleccion;
    }

    public static void imprimir_guitarras(Guitarra guitarra1, Guitarra guitarra2,Guitarra guitarra3){
        System.out.println(guitarra1);
        System.out.println(guitarra2);
        System.out.println(guitarra3);
    }
    public static void imprimir_accesorios(Accesorio accesorio1,Accesorio accesorio2,Accesorio accesorio3){
        System.out.println(accesorio1);
        System.out.println(accesorio2);
        System.out.println(accesorio3);
    }
}
