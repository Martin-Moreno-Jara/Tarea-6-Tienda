package Data.TipoProducto;

import Data.Producto;

public final class Accesorio extends Producto {

    private String instrumento;
    private String tipo_de_accesorio;

    public Accesorio(String instrumento, String tipo_de_accesorio, String nombre_del_accesorio) {
        this.instrumento = instrumento;
        this.tipo_de_accesorio = tipo_de_accesorio;
        this.nombre_del_accesorio = nombre_del_accesorio;
    }

    public Accesorio(String instrumento,String nombre_del_accesorio) {
        this.instrumento = instrumento;
        this.nombre_del_accesorio = nombre_del_accesorio;
    }

    public Accesorio(String nombre_del_accesorio) {
        this.nombre_del_accesorio = nombre_del_accesorio;
    }

    private String nombre_del_accesorio;

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
        return "----------------------------------------------------------------------"+
                "\nEl accesorio "+this.getNombre_del_accesorio()+" de la marca "+this.getMarca()+", del instrumento "
                + this.getInstrumento()+  "de tipo "+this.getTipo_de_accesorio() +" y con número de referencia "
                +this.getReferencia()+" tiene un precio de "+this.getPrecio();
    }
}
