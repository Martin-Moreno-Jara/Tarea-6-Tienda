package Logic;

import Data.TipoProducto.Accesorio;
import Data.TipoProducto.TipoInstrumento.InstrumentoCuerda.Guitarra;
import Data.TipoProducto.TipoInstrumento.InstrumentoCuerda.Piano;
import UI.*;

public class Main {

    public static void main(String [] args) {

        //------------------------------------------------------------------------------------------------ instanciación de piano
    Piano piano1 = new Piano(4500000,111201,"Yamaha","PSR E273","Blanco y negro",
                            "Eléctrico",0,"N/A","Cuerda percutida"
                             ,61,5,"Teclado");

    Piano piano2 = new Piano(7000000,111202,"Fazioli","F308","Blanco y negro",
                            "Acústico",88,"Acero al carbono templado");
                            piano2.setTecnica("Cuerda percutida");
                            piano2.setNumero_teclas(88);
                            piano2.setNumero_octavas(7);
                            piano2.setDistribucion("De cola");

    Piano piano3 = new Piano(5800000,111203,"Samick","JS-121","Blanco y negro");
                            piano3.setGeneracion_del_sonido("Acústico");
                            piano3.setNumero_de_cuerdas(88);
                            piano3.setMaterial_de_cuerda("Alambre tensado");
                            piano3.setTecnica("Cuerda percutida");
                            piano3.setNumero_teclas(88);
                            piano3.setNumero_octavas(7);
                            piano3.setDistribucion("De pared");
        //------------------------------------------------------------------------------------------------ instanciación de guitarra

        //------------------------------------------------------------------------------------------------ instanciación de flauta

        //------------------------------------------------------------------------------------------------ instanciación de trompeta

        //------------------------------------------------------------------------------------------------ instanciación de bateria

        //------------------------------------------------------------------------------------------------ instanciación de xilofono

        //------------------------------------------------------------------------------------------------ instanciación de accesorios


        UI.Bienvenida();
       int eleccion_producto = UI.seleccionar_producto();

        if(eleccion_producto == 1){
            int eleccion_instrumento = UI.seleccionar_instrumento();
            if(eleccion_instrumento ==1){
                int eleccion_cuerda = UI.seleccionar_instrumento_de_cuerda();
                if(eleccion_cuerda==1){

                }
            }
            else if(eleccion_instrumento==2){
                int eleccion_viento = UI.seleccionar_instrumento_de_viento();
            }
            else if(eleccion_instrumento==3){
                int eleccion_percusion = UI.seleccionar_instrumento_de_percusion();
            }
        }
        else if(eleccion_producto == 2){
        }
    }

}