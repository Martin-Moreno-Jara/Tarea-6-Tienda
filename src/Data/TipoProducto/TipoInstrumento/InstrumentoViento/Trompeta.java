package Data.TipoProducto.TipoInstrumento.InstrumentoViento;

import Data.TipoProducto.TipoInstrumento.Viento;

public final class Trompeta extends Viento {
    private String estructura;
    private String afinacion;
    private String tamano;

    public Trompeta (int precio, int referencia, String marca,
                     String modelo, String color, String generacion_del_sonido,
                     String material_instrumento, String tesitura, String tipo_embocadura,
                     String estructura, String afinacion, String tamano){

        this.setPrecio(precio);
        this.setReferencia(referencia);
        this.setMarca(marca);

        this.setModelo(modelo);
        this.setColor(color);
        this.setGeneracion_del_sonido(generacion_del_sonido);

        this.setMaterial_instrumento(material_instrumento);
        this.setTesitura(tesitura);
        this.setTipo_embocadura(tipo_embocadura);

        this.setEstructura(estructura);
        this.setAfinacion(afinacion);
        this.setTamano(tamano);
    }

    public Trompeta (int precio, int referencia, String marca,
                     String modelo, String color, String generacion_del_sonido,
                     String material_instrumento, String tesitura){

        this.setPrecio(precio);
        this.setReferencia(referencia);
        this.setMarca(marca);

        this.setModelo(modelo);
        this.setColor(color);
        this.setGeneracion_del_sonido(generacion_del_sonido);

        this.setMaterial_instrumento(material_instrumento);
        this.setTesitura(tesitura);
    }

    public Trompeta (int precio, int referencia, String marca,
                     String modelo, String color){

        this.setPrecio(precio);
        this.setReferencia(referencia);
        this.setMarca(marca);

        this.setModelo(modelo);
        this.setColor(color);
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
                "\nde tamaño "+this.getTamano();
    }
}
