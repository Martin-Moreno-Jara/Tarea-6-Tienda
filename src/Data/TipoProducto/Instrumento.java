package Data.TipoProducto;

import Data.Producto;

public abstract class Instrumento extends Producto {

    private String modelo;
    private String color;
    private String generacion_del_sonido;

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGeneracion_del_sonido() {
        return this.generacion_del_sonido;
    }

    public void setGeneracion_del_sonido(String generacion_del_sonido) {
        this.generacion_del_sonido = generacion_del_sonido;
    }

}
