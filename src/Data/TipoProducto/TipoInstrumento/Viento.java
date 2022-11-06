package Data.TipoProducto.TipoInstrumento;

import Data.TipoProducto.Instrumento;

public abstract class Viento extends Instrumento {

    private String material_instrumento;
    private String tesitura;
    private String tipo_embocadura;

    public String getMaterial_instrumento() {
        return this.material_instrumento;
    }

    public void setMaterial_instrumento(String material_instrumento) {
        this.material_instrumento = material_instrumento;
    }

    public String getTesitura() {
        return this.tesitura;
    }

    public void setTesitura(String tesitura) {
        this.tesitura = tesitura;
    }

    public String getTipo_embocadura() {
        return this.tipo_embocadura;
    }

    public void setTipo_embocadura(String tipo_embocadura) {
        this.tipo_embocadura = tipo_embocadura;
    }


}
