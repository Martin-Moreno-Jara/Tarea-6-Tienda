package Logic;

import Data.TipoProducto.Accesorio;
import Data.TipoProducto.TipoInstrumento.InstrumentoCuerda.Guitarra;
import Data.TipoProducto.TipoInstrumento.InstrumentoCuerda.Piano;
import Data.TipoProducto.TipoInstrumento.InstrumentoPercusion.Bateria;
import Data.TipoProducto.TipoInstrumento.InstrumentoPercusion.Xilofono;
import Data.TipoProducto.TipoInstrumento.InstrumentoViento.Flauta;
import Data.TipoProducto.TipoInstrumento.InstrumentoViento.Trompeta;
import UI.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String [] args) {

        //------------------------------------------------------------------------------------------------ instanciación de piano
    final Piano piano1 = new Piano(4500000,111201,"Yamaha","PSR E273","Blanco y negro",
                            "Eléctrico",0,"N/A","Cuerda percutida"
                             ,61,5,"Teclado");

    final Piano piano2 = new Piano(7000000,111202,"Fazioli","F308","Blanco y negro",
                            "Acústico",88,"Acero al carbono templado",
            "Cuerda percutida");
                            piano2.setNumero_teclas(88);
                            piano2.setNumero_octavas(7);
                            piano2.setDistribucion("De cola");

    final Piano piano3 = new Piano(5800000,111203,"Samick","JS-121","Blanco y negro",
            "Acústico",88,"Alambre tensado","Cuerda percutida");
                            piano3.setNumero_teclas(88);
                            piano3.setNumero_octavas(7);
                            piano3.setDistribucion("De pared");
        //------------------------------------------------------------------------------------------------ instanciación de guitarra
    final Guitarra guitarra1 = new Guitarra(1200000,111101,"Fender","Stratocaster","Rojo",
                        "Electrica",6,"Acero","Cuerda pulsada",
                        24, 3,"Fresno");

    final Guitarra guitarra2 = new Guitarra(980000,111102,"Martin","11XL1","Marrón",
                        "Acústica",12,"Nilon","Cuerda pulsada");
                            guitarra2.setNumero_trastes(19);
                            guitarra2.setNumero_pastillas(0);
                            guitarra2.setTipo_madera("Caoba");

    final Guitarra guitarra3 = new Guitarra(1150000,111103,"Gibson","Les Paul","Cafe claro","Eléctrica",6,"Acero",
                        "Cuerda pulsada");
                            guitarra3.setNumero_trastes(24);
                            guitarra3.setNumero_pastillas(2);
                            guitarra3.setTipo_madera("Arce");
        //------------------------------------------------------------------------------------------------ instanciación de flauta
    final Flauta flauta1 = new Flauta(32000,112101,"Yamaha","Yrs23","Blanco",
                    "Acústico", "Madera","Soprano","Bisel",
                    "Dulce",32,8);

    final Flauta flauta2 = new Flauta(475000,112102,"Aileen","AFL-202","Plateado",
                    "Acústico", "Metal","Soprano","Bisel");
                            flauta2.setTipo_flauta("Traversa");
                            flauta2.setLongitud(67);
                            flauta2.setNumero_Huecos(16);

    final Flauta flauta3 = new Flauta(120000,112103,"Bundy","BFL-105","Plateado",
            "Acústico","Metal","Sopranino","Bisel");
                            flauta3.setTipo_flauta("Piccolo");
                            flauta3.setLongitud(15);
                            flauta3.setNumero_Huecos(8);
        //------------------------------------------------------------------------------------------------ instanciación de trompeta
        final Trompeta trompeta1 = new Trompeta(880000,112201,"Fides Symphony","FTR-700",
                            "Plateada","Acústico","Latón galvonizado",
                            "Soprano","Boquilla","De válvulas","Do 4",
                            "Estandar");

        final Trompeta trompeta2 = new Trompeta(650000,112202,"J. Michael","TRS-01",
                            "Dorado","Acústico","Latón galvanizado",
                            "Mezzosoprano","Boquilla");
                            trompeta2.setEstructura("De varas");
                            trompeta2.setAfinacion("Si bemol 3");
                            trompeta2.setTamano("Estandar");

        final Trompeta trompeta3 = new Trompeta(570000,112203,"STOMVI","JBMT-500L",
                            "Dorado","Acústico","Latón Galvonizado","Sopranino",
                            "Boquilla");
                            trompeta3.setEstructura("De válvulas");
                            trompeta3.setAfinacion("Si bemol 4");
                            trompeta3.setTamano("Pocket");
        //------------------------------------------------------------------------------------------------ instanciación de bateria
        final Bateria bateria1 = new Bateria(1600000,113101,"BOSS","jbp-0803","Rojo",
                            "Acústico","Golpeado","Indefinido",
                            "Híbrido",5,2,1);

        final Bateria bateria2 = new Bateria(3000000,113102,"Yamaha","Rydeen 5","Rojo",
                            "Acústico","Golpeado","Indefinido","Hibrido");
                            bateria2.setNumero_tambores(8);
                            bateria2.setNumero_platillos(4);
                            bateria2.setNumero_pedales(3);

        final Bateria bateria3 = new Bateria(2700000,113103,"Alesis","Nitro Mesh Kit","Negro",
                "Eléctrica","Golpeado","Indefinido","Hibrido");
                            bateria3.setNumero_tambores(5);
                            bateria3.setNumero_platillos(3);
                            bateria3.setNumero_pedales(2);

        //------------------------------------------------------------------------------------------------ instanciación de xilofono
        final Xilofono xilofono1 = new Xilofono(140000,113201,"Raonzena","Glockenspiel 42 note",
                            "Plateado","Acústico","Golpeado","Definido",
                            "Barras y placas",42, "Metal","Cromático");

        final Xilofono xilofono2 = new Xilofono(90000,113202,"Adams","XS1HA","Arcoiris",
                            "Acústico","Golpeado",
                            "Definido","Barras y placas");
                            xilofono2.setNumero_laminas(252);
                            xilofono2.setMaterial_laminas("Madera");
                            xilofono2.setTipo_xilofono("Diatónico");

        final Xilofono xilofono3 = new Xilofono(45000,113203,"JVC","xl5","Arcoiris",
                            "Acústico","Golpeado","Definido",
                            "Barras de placas");
                            xilofono3.setNumero_laminas(15);
                            xilofono3.setMaterial_laminas("Plástico");
                            xilofono3.setTipo_xilofono("Infantil");

        //------------------------------------------------------------------------------------------------ instanciación de accesorios
        final Accesorio pua = new Accesorio(8000,120100,"Ibanez","Púa",
                        "Guitarra","De rasgueo");

        final Accesorio amplificador = new Accesorio(500000,120101,"Marshall");
                            amplificador.setTipo_de_accesorio("Amplificación");
                            amplificador.setInstrumento("Guitarra");
                            amplificador.setNombre_del_accesorio("Amplificador");

        final Accesorio capo = new Accesorio(25000,120102,"A-corde");
                            capo.setNombre_del_accesorio("Capo");
                            capo.setInstrumento("Guitarra");
                            capo.setTipo_de_accesorio("Modificador del tono");

        //------------------------------------------------------------------------------------------------Arraylist
        ArrayList<Object> bundle_guitarra = new ArrayList<Object>();
        bundle_guitarra.add(guitarra1);
        bundle_guitarra.add(amplificador);
        bundle_guitarra.add(pua);

        ArrayList<Object> bundle_salsa = new ArrayList<Object>();
        bundle_salsa.add(trompeta1);
        bundle_salsa.add(piano2);
        bundle_salsa.add(bateria1);
        //------------------------------------------------------------------------------------------------hashset
        HashSet<Object> bundle_rock = new HashSet<Object>();
        bundle_rock.add(guitarra1);
        bundle_rock.add(guitarra1);
        bundle_rock.add(bateria3);

        HashSet<Object> bundle_infantil = new HashSet<Object>();
        bundle_infantil.add(flauta1);
        bundle_infantil.add(xilofono2);
        bundle_infantil.add(xilofono3);

        //------------------------------------------------------------------------------------------------hashmap
        HashMap<String,Object> instrumentos_pequeños = new HashMap<String,Object>();
        instrumentos_pequeños.put("xilofono pequeño",xilofono3);
        instrumentos_pequeños.put("flauta pequeña",flauta3);
        instrumentos_pequeños.put("trompeta pequeña",trompeta3);

        HashMap<String,Object> instrumentos_grandes = new HashMap<String,Object>();
        instrumentos_grandes.put("piano grande",piano2);
        instrumentos_grandes.put("bateria grande",bateria2);
        instrumentos_grandes.put("guitarra grande",guitarra1);

        //------------------------------------------------------------------------------------------------
        boolean verificador = true;
        boolean verificador_instrumento;
        boolean verificador_instrumento_final;
        boolean verificador_coleccion;

        //Aquí comienza el programa --------------------------------------------------------

        UI.Bienvenida();
        while(verificador){
            verificador_instrumento = true;
        int eleccion_producto = UI.seleccionar_producto();
        //Se selecciona que tipo de producto quiere ver el usuario
        switch (eleccion_producto) {//switch para seleccionar el tipo de producto
            case 1:
                while(verificador_instrumento) {
                    int seleccion_intrumento = UI.seleccionar_instrumento();
                    switch (seleccion_intrumento) {//Switch para seleccionar el tipo de instumento
                        case 1:
                            int seleccion_cuerda = UI.seleccionar_instrumento_de_cuerda();
                                //Se selecciona instrumento de cuerda
                            switch (seleccion_cuerda) {//Switch para seleccionar instrumento de cuerda
                                case 1:
                                    verificador_instrumento_final = true;
                                    int seleccion_guitarra = UI.imprimir_guitarras(guitarra1, guitarra2, guitarra3);

                                    while(verificador_instrumento_final){
                                        //se selecciona que se quiere hacer despues de ver guitarras

                                        switch (seleccion_guitarra){
                                            case 1:
                                                verificador_instrumento_final=false;
                                                break;
                                            case 2:
                                                verificador_instrumento_final=false;
                                                verificador_instrumento=false;
                                                break;
                                            default:
                                                verificador_instrumento_final =false;
                                                verificador_instrumento=false;
                                                verificador = false;
                                                break;
                                        }


                                    }

                                    break;
                                case 2:
                                    verificador_instrumento_final = true;
                                    int seleccion_piano = UI.imprimir_pianos(piano1, piano2, piano3);
                                    while(verificador_instrumento_final){
                                        switch (seleccion_piano){
                                            case 1:
                                                verificador_instrumento_final =false;
                                                break;
                                            case 2:
                                                verificador_instrumento_final =false;
                                                verificador_instrumento=false;
                                                break;
                                            default:
                                                verificador_instrumento_final =false;
                                                verificador_instrumento=false;
                                                verificador = false;
                                                break;
                                        }

                                    }
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
                            //Se selecciona instrumento de viento
                            int seleccion_viento = UI.seleccionar_instrumento_de_viento();
                            switch (seleccion_viento) {
                                case 1:
                                    verificador_instrumento_final = true;
                                    int seleccion_flauta = UI.imprimir_flautas(flauta1,flauta2,flauta3);
                                    while(verificador_instrumento_final) {
                                        switch (seleccion_flauta) {
                                            case 1:
                                                verificador_instrumento_final = false;
                                                break;
                                            case 2:
                                                verificador_instrumento_final = false;
                                                verificador_instrumento = false;
                                                break;
                                            default:
                                                verificador_instrumento_final = false;
                                                verificador_instrumento = false;
                                                verificador = false;
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    verificador_instrumento_final = true;
                                    int seleccion_trompeta = UI.imprimir_trompetas(trompeta1,trompeta2,trompeta3);
                                    while(verificador_instrumento_final) {
                                        switch (seleccion_trompeta) {
                                            case 1:
                                                verificador_instrumento_final = false;
                                                break;
                                            case 2:
                                                verificador_instrumento_final = false;
                                                verificador_instrumento = false;
                                                break;
                                            default:
                                                verificador_instrumento_final = false;
                                                verificador_instrumento = false;
                                                verificador = false;
                                                break;
                                        }
                                    }
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
                            //Se selecciona instrumento de percusión
                            int seleccion_percusion = UI.seleccionar_instrumento_de_percusion();
                            switch (seleccion_percusion) {
                                case 1:
                                    verificador_instrumento_final = true;
                                    int seleccion_bateria = UI.imprimir_baterias(bateria1,bateria2,bateria3);
                                    while(verificador_instrumento_final) {
                                        switch (seleccion_bateria) {
                                            case 1:
                                                verificador_instrumento_final = false;
                                                break;
                                            case 2:
                                                verificador_instrumento_final = false;
                                                verificador_instrumento = false;
                                                break;
                                            default:
                                                verificador_instrumento_final = false;
                                                verificador_instrumento = false;
                                                verificador = false;
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    verificador_instrumento_final = true;
                                    int seleccion_xilofonos=UI.imprimir_xilofonos(xilofono1,xilofono2,xilofono3);

                                    while(verificador_instrumento_final) {
                                        switch (seleccion_xilofonos) {
                                            case 1:
                                                verificador_instrumento_final = false;
                                                break;
                                            case 2:
                                                verificador_instrumento_final = false;
                                                verificador_instrumento = false;
                                                break;
                                            default:
                                                verificador_instrumento_final = false;
                                                verificador_instrumento = false;
                                                verificador = false;
                                                break;
                                        }
                                    }
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
                        case 4:
                            //Opción para volver al menu
                            verificador_instrumento=false;
                            break;
                        default:
                            verificador_instrumento=false;
                            verificador = false;
                            break;
                    }
                }
                break;

            case 2:
                //Se selecciona ver los accesorios
                int seleccion_accesorio = UI.imprimir_accesorios(capo, amplificador, pua);
                switch (seleccion_accesorio){
                    case 1:
                        break;
                    default:
                        verificador=false;
                }
                break;
            case 3:
                verificador_coleccion=true;
                while(verificador_coleccion) {
                int seleccion_paquetes = UI.seleccionar_coleccion();
                    switch (seleccion_paquetes) {
                        case 1:
                            verificador_instrumento_final=true;
                            int seleccion_paquete_guitarra = UI.imprimir_paquete_guitarra(bundle_guitarra);
                            while(verificador_instrumento_final) {
                                //se selecciona que se quiere hacer despues de ver guitarras
                                switch (seleccion_paquete_guitarra) {
                                    case 1:
                                        verificador_instrumento_final = false;
                                        break;
                                    case 2:
                                        verificador_instrumento_final = false;
                                        verificador_coleccion = false;
                                        break;
                                    default:
                                        verificador_instrumento_final = false;
                                        verificador_coleccion = false;
                                        verificador = false;
                                        break;
                                }
                            }
                            break;
                        case 2:
                            verificador_instrumento_final=true;
                            int seleccion_paquete_salsa = UI.imprimir_paquete_salsa(bundle_salsa);
                            while(verificador_instrumento_final) {
                                //se selecciona que se quiere hacer despues de ver guitarras
                                switch (seleccion_paquete_salsa) {
                                    case 1:
                                        verificador_instrumento_final = false;
                                        break;
                                    case 2:
                                        verificador_instrumento_final = false;
                                        verificador_coleccion = false;
                                        break;
                                    default:
                                        verificador_instrumento_final = false;
                                        verificador_coleccion = false;
                                        verificador = false;
                                        break;
                                }
                            }
                            break;
                        case 3:
                            verificador_instrumento_final=true;
                            int seleccion_instrumentos_grandes = UI.imprimir_instrumentos_grandes(instrumentos_grandes);
                            while(verificador_instrumento_final) {
                                //se selecciona que se quiere hacer despues de ver guitarras
                                switch (seleccion_instrumentos_grandes) {
                                    case 1:
                                        verificador_instrumento_final = false;
                                        break;
                                    case 2:
                                        verificador_instrumento_final = false;
                                        verificador_coleccion = false;
                                        break;
                                    default:
                                        verificador_instrumento_final = false;
                                        verificador_coleccion = false;
                                        verificador = false;
                                        break;
                                }
                            }
                            break;
                        case 4:
                            verificador_instrumento_final=true;
                            int seleccion_instrumentos_pequeños = UI.imprimir_instrumentos_pequeños(instrumentos_pequeños);
                            while(verificador_instrumento_final) {
                                //se selecciona que se quiere hacer despues de ver guitarras
                                switch (seleccion_instrumentos_pequeños) {
                                    case 1:
                                        verificador_instrumento_final = false;
                                        break;
                                    case 2:
                                        verificador_instrumento_final = false;
                                        verificador_coleccion = false;
                                        break;
                                    default:
                                        verificador_instrumento_final = false;
                                        verificador_coleccion = false;
                                        verificador = false;
                                        break;
                                }
                            }
                            break;
                        case 5:
                            verificador_coleccion=false;
                            break;
                        default:
                            verificador_coleccion=false;
                            verificador=false;
                            break;
                    }
                }
                break;

            default:
                //Salir de la tienda
                verificador=false;
                break;
            }
        }
    }

}