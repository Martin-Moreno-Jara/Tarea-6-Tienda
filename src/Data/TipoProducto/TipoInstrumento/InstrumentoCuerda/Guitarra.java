package Data.TipoProducto.TipoInstrumento.InstrumentoCuerda;

import Data.TipoProducto.TipoInstrumento.Cuerda;

public final class Guitarra extends Cuerda {

    private int numero_trastes;
    private int numero_pastillas;
    private String tipo_madera;

    public Guitarra(int precio,int referencia,String marca, String modelo,String color,String generacion_del_sonido,
                    int numero_cuerda,   String material_de_cuerda,String tecnica, int numero_trastes,int numero_pastillas,
                    String tipo_madera){

        this.setPrecio(precio);
        this.setReferencia(referencia);
        this.setMarca(marca);

        this.setModelo(modelo);
        this.setColor(color);
        this.setGeneracion_del_sonido(generacion_del_sonido);

        this.setNumero_de_cuerdas(numero_cuerda);
        this.setMaterial_de_cuerda(material_de_cuerda);
        this.setTecnica(tecnica);

        this.setNumero_trastes(numero_trastes);
        this.setNumero_pastillas(numero_pastillas);
        this.setTipo_madera(tipo_madera);

    }

    public Guitarra(int precio,int referencia,String marca, String modelo,String color,String generacion_del_sonido,
                    int numero_cuerda,   String material_de_cuerda){

        this.setPrecio(precio);
        this.setReferencia(referencia);
        this.setMarca(marca);

        this.setModelo(modelo);
        this.setColor(color);
        this.setGeneracion_del_sonido(generacion_del_sonido);

        this.setNumero_de_cuerdas(numero_cuerda);
        this.setMaterial_de_cuerda(material_de_cuerda);

    }

    public Guitarra(int precio,int referencia,String marca, String modelo,String color){

        this.setPrecio(precio);
        this.setReferencia(referencia);
        this.setMarca(marca);

        this.setModelo(modelo);
        this.setColor(color);

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
