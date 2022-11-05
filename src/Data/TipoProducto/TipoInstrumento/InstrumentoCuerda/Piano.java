package Data.TipoProducto.TipoInstrumento.InstrumentoCuerda;

import Data.TipoProducto.TipoInstrumento.Cuerda;

public final class Piano extends Cuerda {

    private int numero_teclas;
    private int numero_octavas;
    private String distribucion;

    public Piano(int precio,int referencia,int numero_cuerda,int numero_teclas,int numero_octavas,String marca
            ,String color,String generacion_del_sonido,String material_de_cuerda,String tecnica, String distribucion){

        this.setPrecio(precio);
        this.setReferencia(referencia);
        this.setNumero_de_cuerdas(numero_cuerda);
        this.setNumero_teclas(numero_teclas);
        this.setNumero_octavas(numero_octavas);
        this.setMarca(marca);
        this.setColor(color);
        this.setGeneracion_del_sonido(generacion_del_sonido);
        this.setMaterial_de_cuerda(material_de_cuerda);
        this.setTecnica(tecnica);
        this.setDistribucion(distribucion);

    }
    public Piano(int precio,int referencia,int numero_teclas, String marca,
                 String generacion_del_sonido,String distribucion){
        this.setPrecio(precio);
        this.setReferencia(referencia);
        this.setNumero_teclas(numero_teclas);
        this.setMarca(marca);
        this.setGeneracion_del_sonido(generacion_del_sonido);
        this.setDistribucion(distribucion);
    }
    public Piano(int precio,int referencia,int numero_teclas, String marca){
        this.setPrecio(precio);
        this.setReferencia(referencia);
        this.setNumero_teclas(numero_teclas);
        this.setMarca(marca);
    }

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

    @Override
    public String toString(){
        return "-----------------------------------------------------------------"
                +"\nEl piano marca "+this.getMarca()+" de distribución "+this.getDistribucion()+" y número de referencia "+
                this.getReferencia()+" tiene un precio de "+this.getPrecio()+"\nAdemás tiene las siguientes caracteristicas: "+
                "\nGeneración del sonido: "+this.getGeneracion_del_sonido()+
                "\nMaterial de la cuerda: "+this.getMaterial_de_cuerda()+
                "\nTécnica con la cuerda: "+this.getTecnica()+
                "\nNúmero de cuerdas: "+this.getNumero_de_cuerdas()+
                "\nNúmero de teclas: "+this.getNumero_teclas()+
                "\nNúmero de octavas: "+this.getNumero_octavas()+
                "\nColor: "+this.getColor();
    }


}
