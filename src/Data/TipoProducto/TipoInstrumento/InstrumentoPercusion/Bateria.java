package Data.TipoProducto.TipoInstrumento.InstrumentoPercusion;

import Data.TipoProducto.TipoInstrumento.Percusion;

public final class Bateria extends Percusion {
    private int numero_tambores;
    private int numero_platillos;
    private int numero_pedales;

    public Bateria( int precio,int referencia ,String marca,
                    String modelo, String color, String generacion_del_sonido,
                    String manipulacion, String altura, String clasificacion_de_elementos,
                    int numero_tambores, int numero_platillos, int numero_pedales){

        this.setPrecio(precio);
        this.setReferencia(referencia);
        this.setMarca(marca);

        this.setModelo(modelo);
        this.setColor(color);
        this.setGeneracion_del_sonido(generacion_del_sonido);

        this.setManipulacion(manipulacion);
        this.setAltura(altura);
        this.setClasificacion_de_elementos(clasificacion_de_elementos);

        this.setNumero_tambores(numero_tambores);
        this.setNumero_platillos(numero_platillos);
        this.setNumero_pedales(numero_pedales);

    }

    public Bateria( int precio,int referencia ,String marca,
                    String modelo, String color, String generacion_del_sonido,
                    String manipulacion, String altura){

        this.setPrecio(precio);
        this.setReferencia(referencia);
        this.setMarca(marca);

        this.setModelo(modelo);
        this.setColor(color);
        this.setGeneracion_del_sonido(generacion_del_sonido);

        this.setManipulacion(manipulacion);
        this.setAltura(altura);

    }

    public Bateria( int precio,int referencia ,String marca,
                    String modelo, String color){

        this.setPrecio(precio);
        this.setReferencia(referencia);
        this.setMarca(marca);

        this.setModelo(modelo);
        this.setColor(color);
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
                "\nnumero de pedales "+this.getNumero_pedales();}
}
