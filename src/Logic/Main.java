package Logic;

import Data.TipoInstrumento.InstrumentoCuerda.Piano;

public class Main {

    public static void main(String [] args) {
        Piano piano = new Piano(1000, 132123, 70, 70, 8, "yamaha",
                "Blanco y negro", "Acústico", "nilon", "percutida",
                "De cola");

        System.out.println(piano.toString());
    }

}