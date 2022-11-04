package Data.TipoInstrumento.InstrumentoCuerda;

import Data.TipoInstrumento.Cuerda;

public class Piano extends Cuerda {

    private int numero_teclas;
    private int numero_octavas;
    private String distribucion;

    public int getNumero_teclas() {
        return this.numero_teclas;
    }

    public void setNumero_teclas(int numero_teclas) {
        this.numero_teclas = numero_teclas;
    }

    public int getNumero_octavas() {
        return this.numero_octavas;
    }

    public void setNumero_octavas(int numero_octavas) {
        this.numero_octavas = numero_octavas;
    }

    public String getDistribucion() {
        return this.distribucion;
    }

    public void setDistribucion(String distribucion) {
        this.distribucion = distribucion;
    }



}
