package Logic;

import Data.TipoProducto.Accesorio;
import Data.TipoProducto.TipoInstrumento.InstrumentoCuerda.Guitarra;
import Data.TipoProducto.TipoInstrumento.InstrumentoCuerda.Piano;
import Data.TipoProducto.TipoInstrumento.InstrumentoPercusion.Bateria;
import Data.TipoProducto.TipoInstrumento.InstrumentoPercusion.Xilofono;
import Data.TipoProducto.TipoInstrumento.InstrumentoViento.Flauta;
import Data.TipoProducto.TipoInstrumento.InstrumentoViento.Trompeta;
import UI.*;

public class Main {

    public static void main(String [] args) {

        //------------------------------------------------------------------------------------------------ instanciación de piano
    Piano piano1 = new Piano(4500000,111201,"Yamaha","PSR E273","Blanco y negro",
                            "Eléctrico",0,"N/A","Cuerda percutida"
                             ,61,5,"Teclado");

    Piano piano2 = new Piano(7000000,111202,"Fazioli","F308","Blanco y negro",
                            "Acústico",88,"Acero al carbono templado");
                            piano2.setTecnica("Cuerda percutida");
                            piano2.setNumero_teclas(88);
                            piano2.setNumero_octavas(7);
                            piano2.setDistribucion("De cola");

    Piano piano3 = new Piano(5800000,111203,"Samick","JS-121","Blanco y negro");
                            piano3.setGeneracion_del_sonido("Acústico");
                            piano3.setNumero_de_cuerdas(88);
                            piano3.setMaterial_de_cuerda("Alambre tensado");
                            piano3.setTecnica("Cuerda percutida");
                            piano3.setNumero_teclas(88);
                            piano3.setNumero_octavas(7);
                            piano3.setDistribucion("De pared");
        //------------------------------------------------------------------------------------------------ instanciación de guitarra
    Guitarra guitarra1 = new Guitarra(1200000,111101,"Fender","Stratocaster","Rojo",
                        "Electrica",6,"Acero","Cuerda pulsada",
                        24, 3,"Fresno");

    Guitarra guitarra2 = new Guitarra(980000,111102,"Martin","11XL1","Marrón",
                        "Acústica",12,"Nilon");
                            guitarra2.setTecnica("Cuerda pulsada");
                            guitarra2.setNumero_trastes(19);
                            guitarra2.setNumero_pastillas(0);
                            guitarra2.setTipo_madera("Caoba");

    Guitarra guitarra3 = new Guitarra(1150000,111103,"Gibson","Les Paul","Cafe claro");
                            guitarra3.setGeneracion_del_sonido("Eléctrica");
                            guitarra3.setNumero_de_cuerdas(6);
                            guitarra3.setMaterial_de_cuerda("Acero");
                            guitarra3.setTecnica("Cuerda pulsada");
                            guitarra3.setNumero_trastes(24);
                            guitarra3.setNumero_pastillas(2);
                            guitarra3.setTipo_madera("Arce");
        //------------------------------------------------------------------------------------------------ instanciación de flauta
    Flauta flauta1 = new Flauta(32000,112101,"Yamaha","Yrs23","Blanco",
                    "Acústico", "Madera","Soprano","Bisel",
                    "Dulce",32,8);

    Flauta flauta2 = new Flauta(475000,112102,"Aileen","AFL-202","Plateado",
                    "Acústico", "Metal","Soprano");
                            flauta2.setTipo_embocadura("Bisel");
                            flauta2.setTipo_flauta("Traversa");
                            flauta2.setLongitud(67);
                            flauta2.setNumero_Huecos(16);

    Flauta flauta3 = new Flauta(120000,112103,"Bundy","BFL-105","Plateado");
                            flauta3.setGeneracion_del_sonido("Acústico");
                            flauta3.setMaterial_instrumento("Metal");
                            flauta3.setTesitura("Sopranino");
                            flauta3.setTipo_embocadura("Bisel");
                            flauta3.setTipo_flauta("Piccolo");
                            flauta3.setLongitud(15);
                            flauta3.setNumero_Huecos(8);
        //------------------------------------------------------------------------------------------------ instanciación de trompeta
        Trompeta trompeta1 = new Trompeta(880000,112201,"Fides Symphony","FTR-700",
                            "Plateada","Acústico","Latón galvonizado",
                            "Soprano","Boquilla","De válvulas","Do 4",
                            "Estandar");

        Trompeta trompeta2 = new Trompeta(650000,112202,"J. Michael","TRS-01",
                            "Dorado","Acústico","Latón galvanizado",
                            "Mezzosoprano");
                            trompeta2.setTipo_embocadura("Boquilla");
                            trompeta2.setEstructura("De varas");
                            trompeta2.setAfinacion("Si bemol 3");
                            trompeta2.setTamano("Estandar");

        Trompeta trompeta3 = new Trompeta(570000,112203,"STOMVI","JBMT-500L",
                            "Modelo");
                            trompeta3.setGeneracion_del_sonido("Acústico");
                            trompeta3.setMaterial_instrumento("Latón galvonizado");
                            trompeta3.setTesitura("Sopranino");
                            trompeta3.setTipo_embocadura("Boquilla");
                            trompeta3.setEstructura("De válvulas");
                            trompeta3.setAfinacion("Si bemol 4");
                            trompeta3.setTamano("Pocket");
        //------------------------------------------------------------------------------------------------ instanciación de bateria
        Bateria bateria1 = new Bateria(1600000,113101,"BOSS","jbp-0803","Rojo",
                            "Acústico","Golpeado","Indefinido",
                            "Híbrido",5,2,1);

        Bateria bateria2 = new Bateria(3000000,113102,"Yamaha","Rydeen 5","Rojo",
                            "Acústico","Golpeado","Indefinido");
                            bateria2.setClasificacion_de_elementos("Híbrido");
                            bateria2.setNumero_tambores(8);
                            bateria2.setNumero_platillos(4);
                            bateria2.setNumero_pedales(3);

        Bateria bateria3 = new Bateria(2700000,113103,"Alesis","Nitro Mesh Kit","Negro");
                            bateria3.setGeneracion_del_sonido("Eléctrica");
                            bateria3.setManipulacion("Golpeado");
                            bateria3.setAltura("Indefinido");
                            bateria3.setClasificacion_de_elementos("Híbrido");
                            bateria3.setNumero_tambores(5);
                            bateria3.setNumero_platillos(3);
                            bateria3.setNumero_pedales(2);

        //------------------------------------------------------------------------------------------------ instanciación de xilofono
        Xilofono xilofono1 = new Xilofono(140000,113201,"Raonzena","Glockenspiel 42 note",
                            "Plateado","Acústico","Golpeado","Definido",
                            "Barras y placas",42, "Metal","Cromático");

        Xilofono xilofono2 = new Xilofono(90000,113202,"Adams","XS1HA","Arcoiris",
                            "Acústico","Golpeado","Definido");
                            xilofono2.setClasificacion_de_elementos("Barras y placas");
                            xilofono2.setNumero_laminas(252
                            );
                            xilofono2.setMaterial_laminas("Madera");
                            xilofono2.setTipo_xilofono("Diatónico");

        Xilofono xilofono3 = new Xilofono(45000,113203,"JVC","xl5","Arcoiris");
                            xilofono3.setGeneracion_del_sonido("Acústico");
                            xilofono3.setManipulacion("Golpeado");
                            xilofono3.setAltura("Definido");
                            xilofono3.setClasificacion_de_elementos("Barras y placas");
                            xilofono3.setNumero_laminas(15);
                            xilofono3.setMaterial_laminas("Plástico");
                            xilofono3.setTipo_xilofono("Infantil");

        //------------------------------------------------------------------------------------------------ instanciación de accesorios
        Accesorio pua = new Accesorio(8000,120100,"Ibanez","Púa",
                        "Guitarra","De rasgueo");

        Accesorio amplificador = new Accesorio(500000,120101,"Marshall","Amplificador",
                                "Guitarra");
                            amplificador.setTipo_de_accesorio("Amplificación");

        Accesorio capo = new Accesorio(25000,120102,"A-corde","Capo");
                            capo.setInstrumento("Guitarra");
                            capo.setTipo_de_accesorio("Modificador del tono");

        UI.Bienvenida();
  /*     int eleccion_producto = UI.seleccionar_producto();

        if(eleccion_producto == 1){
            int eleccion_instrumento = UI.seleccionar_instrumento();

            if(eleccion_instrumento ==1){
                int eleccion_cuerda = UI.seleccionar_instrumento_de_cuerda();
                if(eleccion_cuerda==1){
                    UI.imprimir_guitarras(guitarra1,guitarra2,guitarra3);
                }
                else if(eleccion_cuerda==2){
                    UI.imprimir_pianos(piano1,piano2,piano3);
                }
            }
            else if(eleccion_instrumento==2){
                int eleccion_viento = UI.seleccionar_instrumento_de_viento();
                if(eleccion_viento==1){
                    UI.imprimir_flautas(flauta1,flauta2,flauta3);
                }
                else if(eleccion_viento==2){
                    UI.imprimir_trompetas(trompeta1,trompeta2,trompeta3);
                }
            }
            else if(eleccion_instrumento==3){
                int eleccion_percusion = UI.seleccionar_instrumento_de_percusion();
                    if(eleccion_percusion==1){
                        UI.imprimir_baterias(bateria1,bateria2,bateria3);
                    }
                    else if(eleccion_percusion==2){
                        UI.imprimir_xilofonos(xilofono1,xilofono2,xilofono3);
                    }
            }
        }
        else if(eleccion_producto == 2){
            UI.imprimir_accesorios(pua,amplificador,capo);
        }

   */
        boolean verificador = true;
        boolean verificador_instrumento;

        while(verificador){
            verificador_instrumento = true;
        int eleccion_producto = UI.seleccionar_producto();
        switch (eleccion_producto) {
            case 1:
                while(verificador_instrumento) {

                    int seleccion_intrumento = UI.seleccionar_instrumento();
                    switch (seleccion_intrumento) {
                        case 1:
                            int seleccion_cuerda = UI.seleccionar_instrumento_de_cuerda();

                            switch (seleccion_cuerda) {
                                case 1:
                                    UI.imprimir_guitarras(guitarra1, guitarra2, guitarra3);
                                    break;
                                case 2:
                                    UI.imprimir_pianos(piano1, piano2, piano3);
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    verificador_instrumento = false;
                                    break;

                                default:
                                    verificador_instrumento = false;
                                    verificador = false;
                                    break;
                            }
                            break;
                        case 2:
                            int seleccion_viento = UI.seleccionar_instrumento_de_viento();
                            switch (seleccion_viento) {
                                case 1:
                                    UI.imprimir_flautas(flauta1,flauta2,flauta3);
                                    break;
                                case 2:
                                    UI.imprimir_trompetas(trompeta1,trompeta2,trompeta3);
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    verificador_instrumento = false;
                                    break;

                                default:
                                    verificador_instrumento = false;
                                    verificador = false;
                                    break;
                            }
                            break;
                        case 3:
                            int seleccion_percusion = UI.seleccionar_instrumento_de_percusion();
                            break;
                        case 4:
                            break;
                        default:
                            verificador = false;
                            break;
                    }
                }
                break;

            case 2:
                System.out.println("ERROR....");
                UI.imprimir_accesorios(capo, amplificador, pua);
                break;

            default:
                verificador=false;
                break;
        }
        }
    }

}