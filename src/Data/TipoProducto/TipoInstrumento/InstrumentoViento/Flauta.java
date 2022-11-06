package Data.TipoProducto.TipoInstrumento.InstrumentoViento;

import Data.TipoProducto.TipoInstrumento.Viento;

public final class Flauta extends Viento {
    private String tipo_flauta;
    private int numero_Huecos;
    private int longitud;

    public Flauta (int precio, int referencia, String marca,
                   String modelo, String color, String generacion_del_sonido,
                   String material_instrumento, String tesitura, String tipo_embocadura,
                   String tipo_flauta,int longitud,int numero_Huecos){

        this.setPrecio(precio);
        this.setReferencia(referencia);
        this.setMarca(marca);

        this.setModelo(modelo);
        this.setColor(color);
        this.setGeneracion_del_sonido(generacion_del_sonido);

        this.setMaterial_instrumento(material_instrumento);
        this.setTesitura(tesitura);
        this.setTipo_embocadura(tipo_embocadura);

        this.setTipo_flauta(tipo_flauta);
        this.setLongitud(longitud);
        this.setNumero_Huecos(numero_Huecos);

    }
    public Flauta (int precio, int referencia, String marca,
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
    public Flauta (int precio, int referencia, String marca,
                   String modelo, String color){

        this.setPrecio(precio);
        this.setReferencia(referencia);
        this.setMarca(marca);

        this.setModelo(modelo);
        this.setColor(color);

    }


    public String getTipo_flauta() {
        return tipo_flauta;
    }

    public void setTipo_flauta(String tipo_flauta) {
        this.tipo_flauta = tipo_flauta;
    }

    public int getNumero_Huecos() {
        return numero_Huecos;
    }

    public void setNumero_Huecos(int numero_Huecos) {
        this.numero_Huecos = numero_Huecos;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "-----------------------------------------------------------------" +
                "\nLa flauta marca" + this.getMarca() +
                "\ncon número de referencia " + this.getReferencia() +
                "\ntiene un precio de $" + this.getPrecio() +
                "\nmodelo " + this.getModelo() +
                "\ncolor " + this.getColor() +
                "\ngenera un sonido " + this.getGeneracion_del_sonido() +

                "\nesta hecho de " + this.getMaterial_instrumento() +
                "\ntiene un tesitura " + this.getTesitura() +
                "\ncon una embocadura " + this.getTipo_embocadura() +

                "\nes una flauta de tipo" + this.getTipo_flauta() +
                "\ncon una longitud de " + this.getLongitud() +
                "\nnumero de huecos" + this.getNumero_Huecos();
    }
}

