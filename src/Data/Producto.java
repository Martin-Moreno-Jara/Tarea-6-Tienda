package Data;

public abstract class Producto {

    private int precio;
    private int referencia;
    private String marca;

    public Producto(int precio, int referencia, String marca) {
        this.precio = precio;
        this.referencia = referencia;
        this.marca = marca;
    }

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



}
