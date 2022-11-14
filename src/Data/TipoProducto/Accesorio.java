package Data.TipoProducto;

import Data.Producto;

public final class Accesorio extends Producto {

    private String nombre_del_accesorio;
    private String instrumento;
    private String tipo_de_accesorio;

    public Accesorio(int precio, int referencia, String marca,
                     String nombre_del_accesorio, String instrumento, String tipo_de_accesorio) {
        super(precio, referencia, marca);
        this.nombre_del_accesorio = nombre_del_accesorio;
        this.instrumento = instrumento;
        this.tipo_de_accesorio = tipo_de_accesorio;
    }

    public Accesorio(int precio, int referencia, String marca) {
        super(precio, referencia, marca);
    }

    public String getInstrumento() {
        return this.instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public String getTipo_de_accesorio() {
        return this.tipo_de_accesorio;
    }

    public void setTipo_de_accesorio(String tipo_de_accesorio) {
        this.tipo_de_accesorio = tipo_de_accesorio;
    }

    public String getNombre_del_accesorio() {
        return this.nombre_del_accesorio;
    }

    public void setNombre_del_accesorio(String nombre_del_accesorio) {
        this.nombre_del_accesorio = nombre_del_accesorio;
    }

    @Override
    public String toString(){
        return "- Producto: Accesorio \""+this.getNombre_del_accesorio()+"\" de la marca "+this.getMarca()+
                "\n- Número de referencia: #"+this.getReferencia()+
                "\n- Precio: $"+this.getPrecio()+
                "\n- Instrumento al que pertenece: " + this.getInstrumento()+
                "\n- Tipo de accesorio: "+this.getTipo_de_accesorio();
    }
}
