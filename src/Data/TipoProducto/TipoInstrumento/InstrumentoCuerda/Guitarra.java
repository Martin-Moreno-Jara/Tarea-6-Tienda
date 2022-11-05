package Data.TipoProducto.TipoInstrumento.InstrumentoCuerda;

import Data.TipoProducto.TipoInstrumento.Cuerda;

public final class Guitarra extends Cuerda {

    private int numero_trastes;
    private int numero_pastillas;
    private String tipo_madera;

    public Guitarra(int precio,int referencia,int numero_cuerda,int numero_trastes,int numero_pastillas,String marca
            ,String color,String generacion_del_sonido,String material_de_cuerda,String tecnica, String tipo_madera){

        this.setPrecio(precio);
        this.setReferencia(referencia);
        this.setNumero_de_cuerdas(numero_cuerda);
        this.setNumero_trastes(numero_trastes);
        this.setNumero_pastillas(numero_pastillas);
        this.setMarca(marca);
        this.setColor(color);
        this.setGeneracion_del_sonido(generacion_del_sonido);
        this.setMaterial_de_cuerda(material_de_cuerda);
        this.setTecnica(tecnica);
        this.setTipo_madera(tipo_madera);

    }

    public Guitarra(int precio,int referencia,int numero_cuerda,int numero_trastes,int numero_pastillas,String marca
            ,String generacion_del_sonido, String tipo_madera){

        this.setPrecio(precio);
        this.setReferencia(referencia);
        this.setNumero_de_cuerdas(numero_cuerda);
        this.setNumero_trastes(numero_trastes);
        this.setNumero_pastillas(numero_pastillas);
        this.setMarca(marca);
        this.setGeneracion_del_sonido(generacion_del_sonido);
        this.setTipo_madera(tipo_madera);

    }

    public Guitarra(int precio,int referencia,int numero_cuerda,int numero_trastes,String marca){

        this.setPrecio(precio);
        this.setReferencia(referencia);
        this.setNumero_de_cuerdas(numero_cuerda);
        this.setNumero_trastes(numero_trastes);
        this.setMarca(marca);

    }
    public int getNumero_trastes() {
        return this.numero_trastes;
    }

    public void setNumero_trastes(int numero_trastes) {
        this.numero_trastes = numero_trastes;
    }

    public int getNumero_pastillas() {
        return this.numero_pastillas;
    }

    public void setNumero_pastillas(int numero_pastillas) {
        this.numero_pastillas = numero_pastillas;
    }

    public String getTipo_madera() {
        return this.tipo_madera;
    }

    public void setTipo_madera(String tipo_madera) {
        this.tipo_madera = tipo_madera;
    }

    @Override
    public String toString(){
        return "-----------------------------------------------------------------"
                +"\nLa guitarra marca "+this.getMarca()+" y número de referencia "+
                this.getReferencia()+" tiene un precio de "+this.getPrecio()+
                "\nAdemás tiene las siguientes caracteristicas: "+
                "\nGeneración del sonido: "+this.getGeneracion_del_sonido()+
                "\nMaterial de la cuerda: "+this.getMaterial_de_cuerda()+
                "\nTécnica con la cuerda: "+this.getTecnica()+
                "\nNúmero de cuerdas: "+this.getNumero_de_cuerdas()+
                "\nNúmero de trastes: "+this.getNumero_trastes()+
                "\nNúmero de pastillas: "+this.getNumero_pastillas()+
                "\nColor: "+this.getColor()+
                "\nTipo de madera: "+this.getTipo_madera();
    }

}
