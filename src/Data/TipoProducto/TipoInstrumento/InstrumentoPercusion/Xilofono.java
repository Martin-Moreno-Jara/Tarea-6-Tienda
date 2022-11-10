package Data.TipoProducto.TipoInstrumento.InstrumentoPercusion;

import Data.TipoProducto.TipoInstrumento.Percusion;

public final class Xilofono extends Percusion {
    private int numero_laminas;
    private String material_laminas;
    private String tipo_xilofono;

    public Xilofono(final int precio,final int referencia,final String marca,
                    final String modelo,final String color,final String generacion_del_sonido,
                    final String manipulacion,final String altura,final String clasificacion_de_elementos,
                    final int numero_laminas,final String material_laminas,final String tipo_xilofono) {
        super(precio, referencia, marca, modelo, color, generacion_del_sonido,
                manipulacion, altura, clasificacion_de_elementos);
        this.numero_laminas = numero_laminas;
        this.material_laminas = material_laminas;
        this.tipo_xilofono = tipo_xilofono;
    }
    public Xilofono(final int precio,final int referencia,final String marca,
                    final String modelo,final String color,final String generacion_del_sonido,
                    final String manipulacion,final String altura,final String clasificacion_de_elementos) {
        super(precio, referencia, marca, modelo, color, generacion_del_sonido,
                manipulacion, altura, clasificacion_de_elementos);
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
    public String tipo_musica(){
        return "Este instrumento generalmente se utiliza en música tropical, música infantil";
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
                "\ncon laminas hechas de "+this.getMaterial_laminas()+
                "\n"+tipo_musica();
    }
}
