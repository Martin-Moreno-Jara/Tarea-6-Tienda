package UI;

import Data.TipoProducto.Accesorio;
import Data.TipoProducto.TipoInstrumento.InstrumentoCuerda.Guitarra;
import Data.TipoProducto.TipoInstrumento.InstrumentoCuerda.Piano;
import Data.TipoProducto.TipoInstrumento.InstrumentoPercusion.Bateria;
import Data.TipoProducto.TipoInstrumento.InstrumentoPercusion.Xilofono;
import Data.TipoProducto.TipoInstrumento.InstrumentoViento.Flauta;
import Data.TipoProducto.TipoInstrumento.InstrumentoViento.Trompeta;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class UI {

    public static String diferenciador_menus(){
        return "--------------------------------------------------------------------------------------------------------";
    }

    public static void no_seleccionado(){
        JOptionPane.showMessageDialog(null,"No se ha seleccionado ninguna opción","Error",JOptionPane.ERROR_MESSAGE);}

    public static String leyenda(String tipo) {
        String leyenda = String.format("Selecciona el %s que quieres ver", tipo);
        return leyenda;}
}
