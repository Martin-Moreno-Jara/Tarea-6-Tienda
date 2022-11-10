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
        return "----------------------------------------------------------------------------------------"+
                "\n- Producto: Xilofono marca "+this.getMarca()+" "+this.getModelo()+
                "\n- Número de referencia: #"+this.getReferencia()+
                "\n- Precio: $"+this.getPrecio()+
                "\n- Caracteristicas: "+
                "\n\t* Color: "+this.getColor()+
                "\n\t* Generación del sonido: "+this.getGeneracion_del_sonido()+
                "\n\t* su forma usar es: "+this.getManipulacion()+
                "\n\t* de altura: "+this.getAltura()+
                "\n\t* clasifica como: "+this.getClasificacion_de_elementos()+
                "\n\t* xilofono tipo: "+this.getTipo_xilofono()+
                "\n\t* numero de laminas: "+this.getNumero_laminas()+
                "\n\t* con laminas hechas de: "+this.getMaterial_laminas()+
                "\n"+tipo_musica();
    }
}
