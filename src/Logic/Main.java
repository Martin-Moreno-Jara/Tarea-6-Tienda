package Logic;

import Data.TipoProducto.Accesorio;
import Data.TipoProducto.TipoInstrumento.InstrumentoCuerda.Guitarra;
import Data.TipoProducto.TipoInstrumento.InstrumentoCuerda.Piano;
import UI.*;

public class Main {

    public static void main(String [] args) {

        //------------------------------------------------------------------------------------------------ instanciación de piano
        Piano piano1 = new Piano(1000, 132123, 70, 70, 8, "yamaha",
                "Blanco y negro", "Acústico", "nilon", "percutida",
                "De cola");
        Piano piano2 = new Piano(1500,4457,50,"Casio");
        Piano piano3 = new Piano(800,8885,45,"Yamaha");
        //------------------------------------------------------------------------------------------------ instanciación de guitarra
        Guitarra guitarra1 = new Guitarra(2500,54898,6,24,4,"Fender","Stratocaster",
                "Negro","Electrica","Metal","Tocada","Roble");
        Guitarra guitarra2 = new Guitarra(4000,55898,7,22,"Gibson");
        Guitarra guitarra3 = new Guitarra(4500,88455,6,24,"Gibson");
        //------------------------------------------------------------------------------------------------ instanciación de accesorios
        Accesorio pua = new Accesorio(400,"Mertens","Púa 5 mm");
        Accesorio amplificador = new Accesorio(5000,"vox","Amplificador 55A");
        Accesorio capo = new Accesorio(2600,"fender","Capo grande");

        UI.Bienvenida();
       int eleccion_producto = UI.seleccionar_producto();

        if(eleccion_producto == 1){
            int eleccion_instrumento = UI.seleccionar_instrumento();
            if(eleccion_instrumento ==1){
                int eleccion_cuerda = UI.seleccionar_instrumento_de_cuerda();
                if(eleccion_cuerda==1){
                    UI.imprimir_guitarras(guitarra1,guitarra2,guitarra3);
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
            UI.imprimir_accesorios(pua,amplificador,capo);
        }
    }

}