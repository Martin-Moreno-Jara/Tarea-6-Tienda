package Data.TipoProducto.TipoInstrumento.InstrumentoCuerda;

import Data.TipoProducto.TipoInstrumento.Cuerda;

public final class Piano extends Cuerda {

    private int numero_teclas;
    private int numero_octavas;
    private String distribucion;

    public Piano(final int precio, final int referencia, final String marca,
                 final String modelo, final String color, final String generacion_del_sonido,
                 final int numero_de_cuerdas, final String material_de_cuerda, final String tecnica,
                 final int numero_teclas, final int numero_octavas, final String distribucion) {
        super(precio, referencia, marca, modelo, color, generacion_del_sonido, numero_de_cuerdas,
                material_de_cuerda, tecnica);
        this.numero_teclas = numero_teclas;
        this.numero_octavas = numero_octavas;
        this.distribucion = distribucion;
    }
    public Piano(final int precio, final int referencia, final String marca,
                 final String modelo, final String color, final String generacion_del_sonido,
                 final int numero_de_cuerdas, final String material_de_cuerda, final String tecnica) {
        super(precio, referencia, marca, modelo, color, generacion_del_sonido, numero_de_cuerdas,
                material_de_cuerda, tecnica);
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

    public String tocar(){
        return "Estás tocando el piano";
    }

    @Override
    public String tipo_musica(){
        return "Este instrumento generalmente se utiliza en la música clásica, música sinfónica";

    }

    @Override
    public String toString(){
        return "----------------------------------------------------------------------------------------"
                +"\n- Producto: Piano marca "+this.getMarca()+" "+this.getModelo()+
                "\n- Número de referencia: #"+ this.getReferencia()+
                "\n- Precio: $"+this.getPrecio()+
                "\n- Caracteristicas: "+
                "\n\t* Distribución: "+this.getDistribucion()+
                "\n\t* Generación del sonido: "+this.getGeneracion_del_sonido()+
                "\n\t* Material de la cuerda: "+this.getMaterial_de_cuerda()+
                "\n\t* Técnica con la cuerda: "+this.getTecnica()+
                "\n\t* Número de cuerdas: "+this.getNumero_de_cuerdas()+
                "\n\t* Número de teclas: "+this.getNumero_teclas()+
                "\n\t* Número de octavas: "+this.getNumero_octavas()+
                "\n\t* Color: "+this.getColor()+
                "\n"+tipo_musica();
    }


}
