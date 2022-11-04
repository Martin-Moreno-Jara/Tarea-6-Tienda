package Logic;

import Data.TipoInstrumento.InstrumentoCuerda.Guitarra;
import Data.TipoInstrumento.InstrumentoCuerda.Piano;

public class Main {

    public static void main(String [] args) {
        Piano piano1 = new Piano(1000, 132123, 70, 70, 8, "yamaha",
                "Blanco y negro", "Acústico", "nilon", "percutida",
                "De cola");
        Piano piano2 = new Piano(1500,4457,50,"Casio");
        Piano piano3 = new Piano(800,8885,45,"Yamaha");

        Guitarra guitarra = new Guitarra(2500,54898,6,24,4,"Fender",
                "Negro","Electrica","Metal","Tocada","Roble");


        System.out.println(piano1);
        System.out.println(piano2);
        System.out.println(piano3);
    }

}