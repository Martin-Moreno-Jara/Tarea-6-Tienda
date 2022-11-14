package Logic;

import UI.*;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.plaf.synth.SynthLookAndFeel;

public class Main extends Instancias{

    public static void main(String [] args) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        GUI gui = new GUI();
        gui.setVisible(true);

/*
        //------------------------------------------------------------------------------------------------Arraylist

        //------------------------------------------------------------------------------------------------
        boolean verificador = true;
        boolean verificador_instrumento;
        boolean verificador_instrumento_final;
        boolean verificador_coleccion;

        //Aquí comienza el programa --------------------------------------------------------




/*
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
                                    int seleccion_guitarra = UI.imprimir_guitarras(guitarra1(),guitarra2(),guitarra3());

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
                                    int seleccion_piano = UI.imprimir_pianos(piano1(),piano2(),piano3());
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
                                    int seleccion_flauta = UI.imprimir_flautas(flauta1(),flauta2(),flauta3());
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
                                    int seleccion_trompeta = UI.imprimir_trompetas(trompeta1(),trompeta2(),trompeta3());
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
                                    int seleccion_bateria = UI.imprimir_baterias(bateria1(),bateria2(),bateria3());
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
                                    int seleccion_xilofonos=UI.imprimir_xilofonos(xilofono1(),xilofono2(),xilofono3());

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
                int seleccion_accesorio = UI.imprimir_accesorios(capo(),amplificador(),pua());
                switch (seleccion_accesorio){
                    case 1:
                        break;
                    default:
                        verificador=false;
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
*/
            }
}