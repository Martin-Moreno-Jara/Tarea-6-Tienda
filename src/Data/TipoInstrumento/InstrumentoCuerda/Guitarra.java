package Data.TipoInstrumento.InstrumentoCuerda;

import Data.TipoInstrumento.Cuerda;

public class Guitarra extends Cuerda {

    private int numero_trastes;
    private int numero_pastillas;
    private String tipo_madera;

    public int getNumero_trastes() {
        return this.numero_trastes;
    }

    public void setNumero_trastes(int numero_trastes) {
        this.numero_trastes = numero_trastes;
    }

    public int getNumero_pastillas() {
        return this.numero_pastillas;
    }

    public void setNumero_pastillas(int numero_pastillas) {
        this.numero_pastillas = numero_pastillas;
    }

    public String getTipo_madera() {
        return this.tipo_madera;
    }

    public void setTipo_madera(String tipo_madera) {
        this.tipo_madera = tipo_madera;
    }



}
