package Data.TipoProducto.TipoInstrumento.InstrumentoViento;

import Data.TipoProducto.TipoInstrumento.Viento;

public final class Flauta extends Viento {
    private String tipo_flauta;
    private int numero_Huecos;
    private int longitud;

    public Flauta(final int precio, final int referencia,final String marca,
                  final String modelo,final String color,final String generacion_del_sonido,
                  final String material_instrumento,final String tesitura,final String tipo_embocadura,
                  final String tipo_flauta,final int numero_Huecos,final int longitud) {
        super(precio, referencia, marca, modelo, color, generacion_del_sonido, material_instrumento, tesitura, tipo_embocadura);
        this.tipo_flauta = tipo_flauta;
        this.numero_Huecos = numero_Huecos;
        this.longitud = longitud;
    }
    public Flauta(final int precio, final int referencia,final String marca,
                  final String modelo,final String color,final String generacion_del_sonido,
                  final String material_instrumento,final String tesitura,final String tipo_embocadura) {
        super(precio, referencia, marca, modelo, color, generacion_del_sonido, material_instrumento, tesitura, tipo_embocadura);
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

