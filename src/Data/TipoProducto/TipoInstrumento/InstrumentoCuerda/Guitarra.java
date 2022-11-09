package Data.TipoProducto.TipoInstrumento.InstrumentoCuerda;

import Data.TipoProducto.TipoInstrumento.Cuerda;

public final class Guitarra extends Cuerda {

    private int numero_trastes;
    private int numero_pastillas;
    private String tipo_madera;


    public Guitarra(final int precio,final int referencia,final String marca,
                    final String modelo,final String color,final String generacion_del_sonido,
                    final int numero_de_cuerdas,final String material_de_cuerda,final String tecnica,
                    final int numero_trastes,final int numero_pastillas,final String tipo_madera) {
        super(precio, referencia, marca, modelo, color, generacion_del_sonido,
                numero_de_cuerdas, material_de_cuerda, tecnica);
        this.numero_trastes = numero_trastes;
        this.numero_pastillas = numero_pastillas;
        this.tipo_madera = tipo_madera;
    }

    public Guitarra(final int precio,final int referencia,final String marca,
                    final String modelo,final String color,final String generacion_del_sonido,
                    final int numero_de_cuerdas,final String material_de_cuerda,final String tecnica){

        super(precio, referencia, marca, modelo, color, generacion_del_sonido,
                numero_de_cuerdas, material_de_cuerda, tecnica);
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

    public String tocar(){
        return "Estás tocando la guitarra";
    }

    @Override
    public String toString(){
        return "-----------------------------------------------------------------"
                +"\nLa guitarra marca "+this.getMarca()+" "+this.getModelo() +" y número de referencia "+
                this.getReferencia()+" tiene un precio de $"+this.getPrecio()+
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
