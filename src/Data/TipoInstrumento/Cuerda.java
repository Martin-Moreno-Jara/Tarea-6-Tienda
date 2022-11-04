package Data.TipoInstrumento;

import Data.Instrumento;

public abstract class Cuerda extends Instrumento {

    private int numero_de_cuerdas;
    private String material_de_cuerda;
    private String tecnica;

    public int getNumero_de_cuerdas() {
        return this.numero_de_cuerdas;
    }

    public void setNumero_de_cuerdas(int numero_de_cuerdas) {
        this.numero_de_cuerdas = numero_de_cuerdas;
    }

    public String getMaterial_de_cuerda() {
        return this.material_de_cuerda;
    }

    public void setMaterial_de_cuerda(String material_de_cuerda) {
        this.material_de_cuerda = material_de_cuerda;
    }

    public String getTecnica() {
        return this.tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }


}
