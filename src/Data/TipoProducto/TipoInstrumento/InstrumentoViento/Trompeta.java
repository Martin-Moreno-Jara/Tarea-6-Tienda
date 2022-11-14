package Data.TipoProducto.TipoInstrumento.InstrumentoViento;

import Data.TipoProducto.TipoInstrumento.Viento;

public final class Trompeta extends Viento {
    private String estructura;
    private String afinacion;
    private String tamano;

    public Trompeta(final int precio,final int referencia,final String marca,
                    final String modelo,final String color,final String generacion_del_sonido,
                    final String material_instrumento,final String tesitura,final String tipo_embocadura,
                    final String estructura,final String afinacion,final String tamano) {
        super(precio, referencia, marca, modelo, color, generacion_del_sonido, material_instrumento, tesitura, tipo_embocadura);
        this.estructura = estructura;
        this.afinacion = afinacion;
        this.tamano = tamano;
    }

    public Trompeta(final int precio,final int referencia,final String marca,
                    final String modelo,final String color,final String generacion_del_sonido,
                    final String material_instrumento,final String tesitura,final String tipo_embocadura) {
        super(precio, referencia, marca, modelo, color, generacion_del_sonido, material_instrumento, tesitura, tipo_embocadura);

    }
    public String getEstructura() {
        return estructura;
    }

    public void setEstructura(String estructura) {
        this.estructura = estructura;
    }

    public String getAfinacion() {
        return afinacion;
    }

    public void setAfinacion(String afinacion) {
        this.afinacion = afinacion;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String tipo_musica(){
        return "Este instrumento generalmente se utiliza en salsa, cumbia, merengue";
    }
    @Override
    public String toString(){
        return "- Producto: Trompeta marca "+this.getMarca()+" "+this.getModelo()+
                "\n- Número de referencia: #"+this.getReferencia()+
                "\n- Precio: $"+this.getPrecio()+
                "\n- Caracteristicas: "+
                "\n\t* Color: "+this.getColor()+
                "\n\t* Generacióm del sonido: "+this.getGeneracion_del_sonido()+
                "\n\t* Material del instrumento: "+this.getMaterial_instrumento()+
                "\n\t* Tesitura: "+this.getTesitura()+
                "\n\t* Tipo de embocadura: "+this.getTipo_embocadura()+
                "\n\t* Estructura: "+this.getEstructura()+
                "\n\t* Afinación: "+this.getAfinacion()+
                "\n\t* Tamaño: "+this.getTamano()+
                "\n"+tipo_musica();
    }
}
