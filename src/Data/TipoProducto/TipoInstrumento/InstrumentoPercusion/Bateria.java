package Data.TipoProducto.TipoInstrumento.InstrumentoPercusion;

import Data.TipoProducto.TipoInstrumento.Percusion;

public final class Bateria extends Percusion {
    private int numero_tambores;
    private int numero_platillos;
    private int numero_pedales;

    public Bateria(final int precio,final int referencia,final String marca,
                   final String modelo,final String color,final String generacion_del_sonido,
                   final String manipulacion,final String altura,final String clasificacion_de_elementos,
                   final int numero_tambores,final int numero_platillos,final int numero_pedales) {
        super(precio, referencia, marca, modelo, color, generacion_del_sonido, manipulacion, altura, clasificacion_de_elementos);
        this.numero_tambores = numero_tambores;
        this.numero_platillos = numero_platillos;
        this.numero_pedales = numero_pedales;
    }
    public Bateria(final int precio,final int referencia,final String marca,
                   final String modelo,final String color,final String generacion_del_sonido,
                   final String manipulacion,final String altura,final String clasificacion_de_elementos
                   ) {
        super(precio, referencia, marca, modelo, color, generacion_del_sonido, manipulacion, altura, clasificacion_de_elementos);

    }
    public int getNumero_tambores() {
        return numero_tambores;
    }

    public void setNumero_tambores(int numero_tambores) {
        this.numero_tambores = numero_tambores;
    }

    public int getNumero_platillos() {
        return numero_platillos;
    }

    public void setNumero_platillos(int numero_platillos) {
        this.numero_platillos = numero_platillos;
    }

    public int getNumero_pedales() {
        return numero_pedales;
    }

    public void setNumero_pedales(int numero_pedales) {
        this.numero_pedales = numero_pedales;
    }

    @Override
    public String tipo_musica(){
        return "Este instrumento generalmente se utiliza en rock, salsa, jazz, blues o música instrumental";
    }

    @Override
    public String toString(){
        return "-----------------------------------------------------------------"+
                "\nLa bateria marca"+this.getMarca()+
                "\ncon número de referencia "+this.getReferencia()+
                "\ntiene un precio de $"+this.getPrecio()+
                "\nmodelo "+this.getModelo()+
                "\ncolor "+this.getColor()+
                "\ngenera un sonido "+this.getGeneracion_del_sonido()+
                "\nsu forma usar es "+this.getManipulacion()+
                "\nde altura "+this.getAltura()+
                "\nclasifica como "+this.getClasificacion_de_elementos()+
                "\nnumero de tambores "+this.getNumero_tambores()+
                "\nnumero de platillos "+this.getNumero_platillos()+
                "\nnumero de pedales "+this.getNumero_pedales()+
                "\n"+tipo_musica();}
}
