package Logic;

import Data.TipoProducto.Accesorio;
import Data.TipoProducto.TipoInstrumento.InstrumentoCuerda.Guitarra;
import Data.TipoProducto.TipoInstrumento.InstrumentoCuerda.Piano;
import Data.TipoProducto.TipoInstrumento.InstrumentoPercusion.Bateria;
import Data.TipoProducto.TipoInstrumento.InstrumentoPercusion.Xilofono;
import Data.TipoProducto.TipoInstrumento.InstrumentoViento.Flauta;
import Data.TipoProducto.TipoInstrumento.InstrumentoViento.Trompeta;
import UI.*;


public class Instancias {

    public static Accesorio capo(){
        final Accesorio capo = new Accesorio(25000,120102,"A-corde");
        capo.setNombre_del_accesorio("Capo");
        capo.setInstrumento("Guitarra");
        capo.setTipo_de_accesorio("Modificador del tono");

        return capo;
    }
    public static Accesorio amplificador(){
        final Accesorio amplificador = new Accesorio(500000,120101,"Marshall");
        amplificador.setTipo_de_accesorio("Amplificación");
        amplificador.setInstrumento("Guitarra");
        amplificador.setNombre_del_accesorio("Amplificador");

        return amplificador;
    }
    public static Accesorio pua(){
        final Accesorio pua = new Accesorio(8000,120100,"Ibanez","Púa",
                "Guitarra","De rasgueo");
        return pua;
    }
}
