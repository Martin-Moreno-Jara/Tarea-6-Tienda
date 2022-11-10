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

    @Override
    public String tipo_musica(){
        return "Este instrumento generalmente se utiliza en el rock, jazz, metal, instrumental";
    }


    @Override
    public String toString(){
        return "----------------------------------------------------------------------------------------"
                +"\n- Producto: Guitarra marca "+this.getMarca()+" "+this.getModelo() +
                "\n- Número de referencia: #"+ this.getReferencia()+
                "\n- Precio: $"+this.getPrecio()+
                "\n- Caracteristicas: "+
                "\n\t* Generación del sonido: "+this.getGeneracion_del_sonido()+
                "\n\t* Material de la cuerda: "+this.getMaterial_de_cuerda()+
                "\n\t* Técnica con la cuerda: "+this.getTecnica()+
                "\n\t* Número de cuerdas: "+this.getNumero_de_cuerdas()+
                "\n\t* Número de trastes: "+this.getNumero_trastes()+
                "\n\t* Número de pastillas: "+this.getNumero_pastillas()+
                "\n\t* Color: "+this.getColor()+
                "\n\t* Tipo de madera: "+this.getTipo_madera()+
                "\n"+tipo_musica();
    }

}
