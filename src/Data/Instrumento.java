package Data;

public class Instrumento {

    private int precio;
    private int referencia;
    private String marca;
    private String color;
    private String generacion_del_sonido;

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getReferencia() {
        return this.referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
