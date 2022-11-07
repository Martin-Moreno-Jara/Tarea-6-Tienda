package Data.TipoProducto.TipoInstrumento.InstrumentoPercusion;

import Data.TipoProducto.TipoInstrumento.Percusion;

public final class Xilofono extends Percusion {
    private int numero_laminas;
    private String material_laminas;
    private String tipo_xilofono;

    public Xilofono(int precio,int referencia,String marca,
                    String modelo, String color, String generacion_del_sonido,
                    String manipulacion, String altura, String clasificacion_de_elementos,
                    int numero_laminas, String material_laminas, String tipo_xilofono){

        this.setPrecio(precio);
        this.setReferencia(referencia);
        this.setMarca(marca);

        this.setModelo(modelo);
        this.setColor(color);
        this.setGeneracion_del_sonido(generacion_del_sonido);

        this.setManipulacion(manipulacion);
        this.setAltura(altura);
        this.setClasificacion_de_elementos(clasificacion_de_elementos);

        this.setNumero_laminas(numero_laminas);
        this.setMaterial_laminas(material_laminas);
        this.setTipo_xilofono(tipo_xilofono);
    }

    public Xilofono(int precio,int referencia,String marca,
                    String modelo, String color, String generacion_del_sonido,
                    String manipulacion, String altura){

        this.setPrecio(precio);
        this.setReferencia(referencia);
        this.setMarca(marca);

        this.setModelo(modelo);
        this.setColor(color);
        this.setGeneracion_del_sonido(generacion_del_sonido);

        this.setManipulacion(manipulacion);
        this.setAltura(altura);
    }

    public Xilofono(int precio,int referencia,String marca,
                    String modelo, String color){

        this.setPrecio(precio);
        this.setReferencia(referencia);
        this.setMarca(marca);

        this.setModelo(modelo);
        this.setColor(color);
    }

    public int getNumero_laminas() {
        return this.numero_laminas;
    }

    public void setNumero_laminas(int numero_laminas) {
        this.numero_laminas = numero_laminas;
    }

    public String getMaterial_laminas() {
        return this.material_laminas;
    }

    public void setMaterial_laminas(String material_laminas) {
        this.material_laminas = material_laminas;
    }

    public String getTipo_xilofono() {
        return this.tipo_xilofono;
    }

    public void setTipo_xilofono(String tipo_xilofono) {
        this.tipo_xilofono = tipo_xilofono;
    }

    @Override
    public String toString(){
        return "-----------------------------------------------------------------"+
                "\nEl xilofono marca"+this.getMarca()+
                "\ncon número de referencia "+this.getReferencia()+
                "\ntiene un precio de "+this.getPrecio()+
                "\nmodelo "+this.getModelo()+
                "\ncolor "+this.getColor()+
                "\ngenera un sonido "+this.getGeneracion_del_sonido()+
                "\nsu forma usar es "+this.getManipulacion()+
                "\nde altura "+this.getAltura()+
                "\nclasifica como "+this.getClasificacion_de_elementos()+
                "\nxilofono tipo "+this.getTipo_xilofono()+
                "\nnumero de laminas "+this.getNumero_laminas()+
                "\ncon laminas hechas de "+this.getMaterial_laminas();
    }
}
