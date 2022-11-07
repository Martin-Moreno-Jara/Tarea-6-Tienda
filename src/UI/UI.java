package UI;

import Data.TipoProducto.Accesorio;
import Data.TipoProducto.TipoInstrumento.InstrumentoCuerda.Guitarra;
import Data.TipoProducto.TipoInstrumento.InstrumentoCuerda.Piano;
import Data.TipoProducto.TipoInstrumento.InstrumentoPercusion.Bateria;
import Data.TipoProducto.TipoInstrumento.InstrumentoPercusion.Xilofono;
import Data.TipoProducto.TipoInstrumento.InstrumentoViento.Flauta;
import Data.TipoProducto.TipoInstrumento.InstrumentoViento.Trompeta;

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
    public static void imprimir_pianos(Piano piano1,Piano piano2,Piano piano3){
        System.out.println(piano1);
        System.out.println(piano2);
        System.out.println(piano3);
    }
    public static void imprimir_flautas(Flauta flauta1,Flauta flauta2,Flauta flauta3){
        System.out.println(flauta1);
        System.out.println(flauta2);
        System.out.println(flauta3);
    }
    public static void imprimir_trompetas(Trompeta tr1,Trompeta tr2,Trompeta tr3){
        System.out.println(tr1);
        System.out.println(tr2);
        System.out.println(tr3);
    }

    public static void imprimir_baterias(Bateria btr1,Bateria btr2,Bateria btr3){
        System.out.println(btr1);
        System.out.println(btr2);
        System.out.println(btr3);
    }

    public static void imprimir_xilofonos(Xilofono xlf1,Xilofono xlf2,Xilofono xlf3){
        System.out.println(xlf1);
        System.out.println(xlf2);
        System.out.println(xlf3);
    }


    public static void imprimir_accesorios(Accesorio accesorio1,Accesorio accesorio2,Accesorio accesorio3){
        System.out.println(accesorio1);
        System.out.println(accesorio2);
        System.out.println(accesorio3);
    }
}
