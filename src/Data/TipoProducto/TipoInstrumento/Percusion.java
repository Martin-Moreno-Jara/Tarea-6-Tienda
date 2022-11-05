package Data.TipoProducto.TipoInstrumento;

import Data.TipoProducto.Instrumento;

public abstract class Percusion extends Instrumento {

    private String manipulacion;
    private String altura;
    private String clasificacion_de_elementos;

    public String getManipulacion() {
        return this.manipulacion;
    }

    public void setManipulacion(String manipulacion) {
        this.manipulacion = manipulacion;
    }

    public String getAltura() {
        return this.altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getClasificacion_de_elementos() {
        return this.clasificacion_de_elementos;
    }

    public void setClasificacion_de_elementos(String clasificacion_de_elementos) {
        this.clasificacion_de_elementos = clasificacion_de_elementos;
    }

}
