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
        return "-----------------------------------------------------------------"+
                "\nLa trompeta marca"+this.getMarca()+
                "\ncon número de referencia "+this.getReferencia()+
                "\ntiene un precio de $"+this.getPrecio()+
                "\nmodelo "+this.getModelo()+
                "\ncolor "+this.getColor()+
                "\ngenera un sonido "+this.getGeneracion_del_sonido()+

                "\nesta hecho de "+this.getMaterial_instrumento()+
                "\ntiene un tesitura "+this.getTesitura()+
                "\ncon una embocadura "+this.getTipo_embocadura()+

                "\nde estructura "+this.getEstructura()+
                "\ncon una afinacion en"+this.getAfinacion()+
                "\nde tamaño "+this.getTamano()+
                "\n"+tipo_musica();
    }
}
