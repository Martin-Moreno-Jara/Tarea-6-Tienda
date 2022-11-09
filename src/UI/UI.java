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

    public static String diferenciador_menus(){
        return "-----------------------------------------------------------------------------------";
    }
    public static void Bienvenida(){
        System.out.println("\t\t\t\t*|| Bienvenido a la tienda de instrumentos musicales" +
                " ||*");
    }

    public static  int seleccionar_producto(){
        Scanner scan = new  Scanner(System.in);
        System.out.println(diferenciador_menus());
        System.out.println("- ¿Que producto deseas ver? -");
        System.out.println("\t* |1| para ver instrumentos musicales" +
                            "\n\t* |2| para ver accesorios" +
                            "\n\n\t* Cualquier otro número para salir de la tienda");
        System.out.println();
        System.out.print("Tu elección: ");
        int seleccion = scan.nextInt();

        return seleccion;
    }

    public static int seleccionar_instrumento(){
        Scanner scan = new  Scanner(System.in);
        System.out.println(diferenciador_menus());
        System.out.println("\t- ¿Qué tipo de instrumento deseas ver? -");
        System.out.println("\t\t* |1| para instrumentos de cuerda" +
                "\n\t\t* |2| para instrumentos de viento" +
                "\n\t\t* |3| para instrumentos de percusión" +
                "\n\n\t\t* |4| para regresar al menu anterior" +
                "\n\t\t* Cualquier otro número para salir de la tienda");
        System.out.println();
        System.out.print("Tu selección: ");
        int seleccion = scan.nextInt();
        return seleccion;
    }

    public static int seleccionar_instrumento_de_cuerda(){
        Scanner scan = new  Scanner(System.in);
        System.out.println(diferenciador_menus());
        System.out.println("\t\t- ¿Qué instrumento de cuerda quieres ver? -");
        System.out.println("\t\t\t* |1| para guitarra" +
                            "\n\t\t\t* |2| para piano" +
                            "\n\n\t\t\t* |3| para regresar a la selección de instrumeto" +
                            "\n\t\t\t* |4| para regresar a la selección de producto" +
                            "\n\t\t\t* Cualquier otro número para salir de la tienda");
        System.out.println();
        System.out.print("Tu selección: ");
        int seleccion = scan.nextInt();
        return seleccion;
    }

    public static int seleccionar_instrumento_de_viento(){
        Scanner scan = new  Scanner(System.in);
        System.out.println(diferenciador_menus());
        System.out.println("\t\t- ¿Qué instrumento de viento quieres ver? -");
        System.out.println("\t\t\t* |1| para flauta" +
                            "\n\t\t\t* |2| para trompeta" +
                            "\n\n\t\t\t* |3| para regresar a la selección de instrumento" +
                            "\n\t\t\t* |4| para regresar a la selección de producto" +
                            "\n\t\t\t* Cualquier otro número para salir de la tienda");
        System.out.println();
        System.out.print("Tu selección: ");
        int seleccion = scan.nextInt();
        return seleccion;
    }

    public static int seleccionar_instrumento_de_percusion(){
        Scanner scan = new  Scanner(System.in);
        System.out.println(diferenciador_menus());
        System.out.println("\t\t- ¿Qué instrumento de percusión quieres ver? -");
        System.out.println("\t\t\t* |1| para bateria" +
                            "\n\t\t\t* |2| para xilofono" +
                            "\n\n\t\t\t* |3| para regresar a la selección de instrumento" +
                            "\n\t\t\t* |4| para regresar a la selección de producto" +
                            "\n\t\t\t* Cualquier otro número para salir de la tienda");
        System.out.println();
        System.out.print("Tu selección: ");
        int seleccion = scan.nextInt();
        return seleccion;
    }


    public static int imprimir_guitarras(Guitarra guitarra1, Guitarra guitarra2,Guitarra guitarra3){
        Scanner scan = new  Scanner(System.in);
        System.out.println(guitarra1);
        System.out.println(guitarra2);
        System.out.println(guitarra3);

        System.out.println("\n\n¿Qué deseas hacer ahora?");
        System.out.println("\n1 para regresar al menu de tipo de instrumento" +
                "\n2 para regresar al menu de producto" +
                "\nCualquier otro número para salir de la tienda");
        System.out.print("\n\nTu elección: ");
        int eleccion = scan.nextInt();
        return eleccion;

    }
    public static int imprimir_pianos(Piano piano1,Piano piano2,Piano piano3){
        Scanner scan = new  Scanner(System.in);
        System.out.println(piano1);
        System.out.println(piano2);
        System.out.println(piano3);
        System.out.println("\n\n¿Qué deseas hacer ahora?");
        System.out.println("\n1 para regresar al menu de tipo de instrumento" +
                "\n2 para regresar al menu de producto" +
                "\nCualquier otro número para salir de la tienda");
        System.out.print("\n\nTu elección: ");
        int eleccion = scan.nextInt();
        return eleccion;
    }
    public static int imprimir_flautas(Flauta flauta1,Flauta flauta2,Flauta flauta3){
        Scanner scan = new  Scanner(System.in);
        System.out.println(flauta1);
        System.out.println(flauta2);
        System.out.println(flauta3);

        System.out.println("\n\n¿Qué deseas hacer ahora?");
        System.out.println("\n1 para regresar al menu de tipo de instrumento" +
                "\n2 para regresar al menu de producto" +
                "\nCualquier otro número para salir de la tienda");
        System.out.print("\n\nTu elección: ");
        int eleccion = scan.nextInt();
        return eleccion;
    }
    public static int imprimir_trompetas(Trompeta tr1,Trompeta tr2,Trompeta tr3){
        Scanner scan = new  Scanner(System.in);
        System.out.println(tr1);
        System.out.println(tr2);
        System.out.println(tr3);

        System.out.println("\n\n¿Qué deseas hacer ahora?");
        System.out.println("\n1 para regresar al menu de tipo de instrumento" +
                "\n2 para regresar al menu de producto" +
                "\nCualquier otro número para salir de la tienda");
        System.out.print("\n\nTu elección: ");
        int eleccion = scan.nextInt();
        return eleccion;
    }

    public static int imprimir_baterias(Bateria btr1,Bateria btr2,Bateria btr3){
        Scanner scan = new  Scanner(System.in);
        System.out.println(btr1);
        System.out.println(btr2);
        System.out.println(btr3);

        System.out.println("\n\n¿Qué deseas hacer ahora?");
        System.out.println("\n1 para regresar al menu de tipo de instrumento" +
                "\n2 para regresar al menu de producto" +
                "\nCualquier otro número para salir de la tienda");
        System.out.print("\n\nTu elección: ");
        int eleccion = scan.nextInt();
        return eleccion;
    }

    public static int imprimir_xilofonos(Xilofono xlf1,Xilofono xlf2,Xilofono xlf3){
        Scanner scan = new  Scanner(System.in);
        System.out.println(xlf1);
        System.out.println(xlf2);
        System.out.println(xlf3);

        System.out.println("\n\n¿Qué deseas hacer ahora?");
        System.out.println("\n1 para regresar al menu de tipo de instrumento" +
                "\n2 para regresar al menu de producto" +
                "\nCualquier otro número para salir de la tienda");
        System.out.print("\n\nTu elección: ");
        int eleccion = scan.nextInt();
        return eleccion;
    }


    public static int imprimir_accesorios(Accesorio accesorio1,Accesorio accesorio2,Accesorio accesorio3){
        Scanner scan = new  Scanner(System.in);
        System.out.println(accesorio1);
        System.out.println(accesorio2);
        System.out.println(accesorio3);

        System.out.println("\n\n¿Qué deseas hacer ahora?");
        System.out.println("\n1 para regresar al menu de tipo de producto" +
                "\nCualquier otro número para salir de la tienda");
        System.out.print("\n\nTu elección: ");
        int eleccion = scan.nextInt();
        return eleccion;
    }
}
