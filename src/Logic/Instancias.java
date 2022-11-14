package Logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import Data.TipoProducto.Accesorio;
import Data.TipoProducto.TipoInstrumento.InstrumentoCuerda.Guitarra;
import Data.TipoProducto.TipoInstrumento.InstrumentoCuerda.Piano;
import Data.TipoProducto.TipoInstrumento.InstrumentoPercusion.Bateria;
import Data.TipoProducto.TipoInstrumento.InstrumentoPercusion.Xilofono;
import Data.TipoProducto.TipoInstrumento.InstrumentoViento.Flauta;
import Data.TipoProducto.TipoInstrumento.InstrumentoViento.Trompeta;
import UI.*;


public class Instancias {

    public static Accesorio capo(){
        final Accesorio capo = new Accesorio(25000,120102,"A-corde");
        capo.setNombre_del_accesorio("Capo");
        capo.setInstrumento("Guitarra");
        capo.setTipo_de_accesorio("Modificador del tono");

        return capo;
    }
    public static Accesorio amplificador(){
        final Accesorio amplificador = new Accesorio(500000,120101,"Marshall");
        amplificador.setTipo_de_accesorio("Amplificación");
        amplificador.setInstrumento("Guitarra");
        amplificador.setNombre_del_accesorio("Amplificador");

        return amplificador;
    }
    public static Accesorio pua(){
        final Accesorio pua = new Accesorio(8000,120100,"Ibanez","Púa",
                "Guitarra","De rasgueo");
        return pua;
    }

    public static Piano piano1(){
        final Piano piano1 = new Piano(4500000,111201,"Yamaha","PSR E273","Blanco y negro",
                "Eléctrico",0,"N/A","Cuerda percutida"
                ,61,5,"Teclado");
        return piano1;
    }
    public static Piano piano2(){
        final Piano piano2 = new Piano(7000000,111202,"Fazioli","F308","Blanco y negro",
                "Acústico",88,"Acero al carbono templado",
                "Cuerda percutida");
        piano2.setNumero_teclas(88);
        piano2.setNumero_octavas(7);
        piano2.setDistribucion("De cola");

        return piano2;
    }
    public static Piano piano3(){
        final Piano piano3 = new Piano(5800000,111203,"Samick","JS-121","Blanco y negro",
                "Acústico",88,"Alambre tensado","Cuerda percutida");
        piano3.setNumero_teclas(88);
        piano3.setNumero_octavas(7);
        piano3.setDistribucion("De pared");

        return piano3;
    }

    public static Guitarra guitarra1(){
        final Guitarra guitarra1 = new Guitarra(1200000,111101,"Fender","Stratocaster","Rojo",
                "Electrica",6,"Acero","Cuerda pulsada",
                24, 3,"Fresno");
        return guitarra1;
    }
    public static Guitarra guitarra2(){
        final Guitarra guitarra2 = new Guitarra(980000,111102,"Martin","11XL1","Marrón",
                "Acústica",12,"Nilon","Cuerda pulsada");
        guitarra2.setNumero_trastes(19);
        guitarra2.setNumero_pastillas(0);
        guitarra2.setTipo_madera("Caoba");
        return guitarra2;
    }
    public static Guitarra guitarra3(){
        final Guitarra guitarra3 = new Guitarra(1150000,111103,"Gibson","Les Paul","Cafe claro","Eléctrica",6,"Acero",
                "Cuerda pulsada");
        guitarra3.setNumero_trastes(24);
        guitarra3.setNumero_pastillas(2);
        guitarra3.setTipo_madera("Arce");
        return guitarra3;
    }

    public static Flauta flauta1(){
        final Flauta flauta1 = new Flauta(32000,112101,"Yamaha","Yrs23","Blanco",
                "Acústico", "Madera","Soprano","Bisel",
                "Dulce",32,8);
        return flauta1;

    }
    public static Flauta flauta2(){


        final Flauta flauta2 = new Flauta(475000,112102,"Aileen","AFL-202","Plateado",
                "Acústico", "Metal","Soprano","Bisel");
        flauta2.setTipo_flauta("Traversa");
        flauta2.setLongitud(67);
        flauta2.setNumero_Huecos(16);
        return flauta2;


    }
    public static Flauta flauta3(){
        final Flauta flauta3 = new Flauta(120000,112103,"Bundy","BFL-105","Plateado",
                "Acústico","Metal","Sopranino","Bisel");
        flauta3.setTipo_flauta("Piccolo");
        flauta3.setLongitud(15);
        flauta3.setNumero_Huecos(8);
        return flauta3;
    }

    public static Trompeta trompeta1(){
        final Trompeta trompeta1 = new Trompeta(880000,112201,"Fides Symphony","FTR-700",
                "Plateada","Acústico","Latón galvonizado",
                "Soprano","Boquilla","De válvulas","Do 4",
                "Estandar");
        return trompeta1;
    }
    public static Trompeta trompeta2(){
        final Trompeta trompeta2 = new Trompeta(650000,112202,"J. Michael","TRS-01",
                "Dorado","Acústico","Latón galvanizado",
                "Mezzosoprano","Boquilla");
        trompeta2.setEstructura("De varas");
        trompeta2.setAfinacion("Si bemol 3");
        trompeta2.setTamano("Estandar");
        return trompeta2;
    }
    public static Trompeta trompeta3(){
        final Trompeta trompeta3 = new Trompeta(570000,112203,"STOMVI","JBMT-500L",
                "Dorado","Acústico","Latón Galvonizado","Sopranino",
                "Boquilla");
        trompeta3.setEstructura("De válvulas");
        trompeta3.setAfinacion("Si bemol 4");
        trompeta3.setTamano("Pocket");
        return trompeta3;
    }

    public static Bateria bateria1(){
        final Bateria bateria1 = new Bateria(1600000,113101,"BOSS","jbp-0803","Rojo",
                "Acústico","Golpeado","Indefinido",
                "Híbrido",5,2,1);
        return bateria1;
    }
    public static Bateria bateria2(){
        final Bateria bateria2 = new Bateria(3000000,113102,"Yamaha","Rydeen 5","Rojo",
                "Acústico","Golpeado","Indefinido","Hibrido");
        bateria2.setNumero_tambores(8);
        bateria2.setNumero_platillos(4);
        bateria2.setNumero_pedales(3);
        return bateria2;
    }
    public static Bateria bateria3(){
        final Bateria bateria3 = new Bateria(2700000,113103,"Alesis","Nitro Mesh Kit","Negro",
                "Eléctrica","Golpeado","Indefinido","Hibrido");
        bateria3.setNumero_tambores(5);
        bateria3.setNumero_platillos(3);
        bateria3.setNumero_pedales(2);
        return bateria3;
    }

    public static Xilofono xilofono1(){
        final Xilofono xilofono1 = new Xilofono(140000,113201,"Raonzena","Glockenspiel 42 note",
                "Plateado","Acústico","Golpeado","Definido",
                "Barras y placas",42, "Metal","Cromático");
        return xilofono1;
    }
    public static Xilofono xilofono2(){

        final Xilofono xilofono2 = new Xilofono(90000,113202,"Adams","XS1HA","Arcoiris",
                "Acústico","Golpeado",
                "Definido","Barras y placas");
        xilofono2.setNumero_laminas(252);
        xilofono2.setMaterial_laminas("Madera");
        xilofono2.setTipo_xilofono("Diatónico");
        return xilofono2;
    }
    public static Xilofono xilofono3(){
        final Xilofono xilofono3 = new Xilofono(45000,113203,"JVC","xl5","Arcoiris",
                "Acústico","Golpeado","Definido",
                "Barras de placas");
        xilofono3.setNumero_laminas(15);
        xilofono3.setMaterial_laminas("Plástico");
        xilofono3.setTipo_xilofono("Infantil");
        return xilofono3;
    }



    public static ArrayList<Object> bundle_guitarra(){
        ArrayList<Object> bundle_guitarra = new ArrayList<Object>();
        bundle_guitarra.add(guitarra1());
        bundle_guitarra.add(amplificador());
        bundle_guitarra.add(pua());
        return bundle_guitarra;
    }
    public static ArrayList<Object> bundle_salsa(){
        ArrayList<Object> bundle_salsa = new ArrayList<Object>();
        bundle_salsa.add(trompeta1());
        bundle_salsa.add(piano2());
        bundle_salsa.add(bateria1());
        return bundle_salsa;
    }

    public static HashSet<Object> bundle_rock(){
        HashSet<Object> bundle_rock = new HashSet<Object>();
        bundle_rock.add(guitarra1());
        bundle_rock.add(guitarra1());
        bundle_rock.add(bateria3());
        return bundle_rock;
    }
    public static HashSet<Object> bundle_infantil(){
        HashSet<Object> bundle_infantil = new HashSet<Object>();
        bundle_infantil.add(flauta1());
        bundle_infantil.add(xilofono2());
        bundle_infantil.add(xilofono3());
        return bundle_infantil;
    }

    public static  HashMap<String,Object> instrumentos_pequeños(){
        HashMap<String,Object> instrumentos_pequeños = new HashMap<String,Object>();
        instrumentos_pequeños.put("xilofono pequeño",xilofono3());
        instrumentos_pequeños.put("flauta pequeña",flauta3());
        instrumentos_pequeños.put("trompeta pequeña",trompeta3());
        return instrumentos_pequeños;
    }
    public static  HashMap<String,Object> instrumentos_grandes(){
        HashMap<String,Object> instrumentos_grandes = new HashMap<String,Object>();
        instrumentos_grandes.put("piano grande",piano2());
        instrumentos_grandes.put("bateria grande",bateria2());
        instrumentos_grandes.put("guitarra grande",guitarra1());
        return instrumentos_grandes;
    }







}
