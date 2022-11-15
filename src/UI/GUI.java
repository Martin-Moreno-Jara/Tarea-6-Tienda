package UI;
import Data.TipoProducto.Accesorio;
import Data.TipoProducto.TipoInstrumento.InstrumentoCuerda.Guitarra;
import Data.TipoProducto.TipoInstrumento.InstrumentoCuerda.Piano;
import Data.TipoProducto.TipoInstrumento.InstrumentoPercusion.Bateria;
import Data.TipoProducto.TipoInstrumento.InstrumentoPercusion.Xilofono;
import Data.TipoProducto.TipoInstrumento.InstrumentoViento.Flauta;
import Data.TipoProducto.TipoInstrumento.InstrumentoViento.Trompeta;
import Logic.Instancias;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener{
    JButton continuar,continuar_paquetes,continuar_instrumento,continuar_cuerda,continuar_viento,continuar_percusion,
            anterior_producto,anterior_instrumento_cuerda,anterior_accesorio,anterior_guitarra,anterior_piano,
            anterior_instrumento_viento,anterior_instrumento_percusion, anterior_producto_paquetes,anterior_flauta,anterior_trompeta,
    anterior_bateria,anterior_xilofono,anterior_paq_guitarra,anterior_paq_salsa,anterior_paq_grande,anterior_paq_peq;
    JRadioButton Rinstrumentos,Raccesorios,Rpaquetes,Rcuerda,Rviento,Rpercusion,Rguitarra,Rpiano,Rflauta,Rtrompeta,
    Rbateria,Rxilofono,RpaqGuitarra,RpaqSalsa,RpaqGrande,RpaqPeque;
    JLabel bienvenida,instruccion,creditos;
    JPanel productos,accesorios,paquetes,instrumentos,cuerda,viento,percusion,guitarras,cabecera,footer,
            pianos,flautas,trompetas,baterias,xilofonos,paqguitarra,paqsalsa,paqgrande,paqpeq;
    JScrollPane scroll_guitarras,scroll_pianos,scroll_flautas,scroll_trompetas,scroll_baterias,scroll_xilofono,scroll_paqguitarra,scroll_paqsalsa,
    scroll_paqgrande,scroll_paqpeq,scroll_accesorios;


    public GUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(550,400);
        setTitle("Tienda");
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        iniciar();}
    public void iniciar(){
        productos = new JPanel();
        productos.setBounds(0,75,550,240);
        productos.setLayout(null);
        productos.setVisible(true);

        cabecera = new JPanel();
        cabecera.setBounds(0,0,550,75);
        cabecera.setBackground(Color.CYAN);
        bienvenida = new JLabel("TIENDA DE INSTRUMENTOS MUSICALES");
        bienvenida.setBounds(100,5,500,45);
        bienvenida.setFont(new Font("calibri",Font.BOLD,17));
        cabecera.add(bienvenida);
        cabecera.setVisible(true);

        footer = new JPanel();
        footer.setBounds(0,315,550,46);
        footer.setBackground(Color.CYAN);
        creditos = new JLabel("programación orientada a objetos 2022");
        creditos.setBounds(0,0,500,5);
        footer.add(creditos);
        footer.setVisible(true);

        instrumentos = new JPanel();
        instrumentos.setBounds(0,75,550,240);
        instrumentos.setLayout(null);
        instrumentos.setVisible(false);

        accesorios = new JPanel();
        accesorios.setBounds(0,0,530,400);
        accesorios.setLayout(null);
        accesorios.setVisible(false);
        accesorios.setPreferredSize(new Dimension(550,450));
        scroll_accesorios = new JScrollPane();
        scroll_accesorios.setBounds(0,0,525,380);
        scroll_accesorios.setViewportView(accesorios);
        scroll_accesorios.setVisible(false);

        paquetes = new JPanel();
        paquetes.setBounds(0,75,550,240);
        paquetes.setLayout(null);
        paquetes.setVisible(false);

        cuerda = new JPanel();
        cuerda.setBounds(0,75,550,240);
        cuerda.setLayout(null);
        cuerda.setVisible(false);

        viento = new JPanel();
        viento.setBounds(0,75,550,240);
        viento.setLayout(null);
        viento.setVisible(false);

        percusion = new JPanel();
        percusion.setBounds(0,75,550,240);
        percusion.setLayout(null);
        percusion.setVisible(false);

        guitarras = new JPanel();
        guitarras.setBounds(0,0,550,400);
        guitarras.setPreferredSize(new Dimension(550,820));
        guitarras.setLayout(null);
        guitarras.setVisible(false);
        scroll_guitarras = new JScrollPane();
        scroll_guitarras.setBounds(0,0,525,380);
        scroll_guitarras.setViewportView(guitarras);
        scroll_guitarras.setVisible(false);

        pianos = new JPanel();
        pianos.setBounds(0,0,550,400);
        pianos.setPreferredSize(new Dimension(550,820));
        pianos.setLayout(null);
        pianos.setVisible(false);
        scroll_pianos = new JScrollPane();
        scroll_pianos.setBounds(0,0,525,380);
        scroll_pianos.setViewportView(pianos);
        scroll_pianos.setVisible(false);

        flautas = new JPanel();
        flautas.setBounds(0,0,550,400);
        flautas.setPreferredSize(new Dimension(550,820));
        flautas.setLayout(null);
        flautas.setVisible(false);
        scroll_flautas = new JScrollPane();
        scroll_flautas.setBounds(0,0,525,380);
        scroll_flautas.setViewportView(flautas);
        scroll_flautas.setVisible(false);

        trompetas = new JPanel();
        trompetas.setBounds(0,0,550,400);
        trompetas.setPreferredSize(new Dimension(550,820));
        trompetas.setLayout(null);
        trompetas.setVisible(false);
        scroll_trompetas = new JScrollPane();
        scroll_trompetas.setBounds(0,0,525,380);
        scroll_trompetas.setViewportView(trompetas);
        scroll_trompetas.setVisible(false);

        baterias = new JPanel();
        baterias.setBounds(0,0,550,400);
        baterias.setPreferredSize(new Dimension(550,820));
        baterias.setLayout(null);
        baterias.setVisible(false);
        scroll_baterias = new JScrollPane();
        scroll_baterias.setBounds(0,0,525,380);
        scroll_baterias.setViewportView(baterias);
        scroll_baterias.setVisible(false);

        xilofonos = new JPanel();
        xilofonos.setBounds(0,0,550,400);
        xilofonos.setPreferredSize(new Dimension(550,820));
        xilofonos.setLayout(null);
        xilofonos.setVisible(false);
        scroll_xilofono = new JScrollPane();
        scroll_xilofono.setBounds(0,0,525,380);
        scroll_xilofono.setViewportView(xilofonos);
        scroll_xilofono.setVisible(false);

        paqguitarra = new JPanel();
        paqguitarra.setBounds(0,0,550,400);
        paqguitarra.setPreferredSize(new Dimension(550,820));
        paqguitarra.setLayout(null);
        paqguitarra.setVisible(false);
        scroll_paqguitarra = new JScrollPane();
        scroll_paqguitarra.setBounds(0,0,525,380);
        scroll_paqguitarra.setViewportView(paqguitarra);
        scroll_paqguitarra.setVisible(false);

        paqsalsa = new JPanel();
        paqsalsa.setBounds(0,0,550,400);
        paqsalsa.setPreferredSize(new Dimension(550,820));
        paqsalsa.setLayout(null);
        paqsalsa.setVisible(false);
        scroll_paqsalsa = new JScrollPane();
        scroll_paqsalsa.setBounds(0,0,525,380);
        scroll_paqsalsa.setViewportView(paqsalsa);
        scroll_paqsalsa.setVisible(false);

        paqgrande = new JPanel();
        paqgrande.setBounds(0,0,550,400);
        paqgrande.setPreferredSize(new Dimension(550,820));
        paqgrande.setLayout(null);
        paqgrande.setVisible(false);
        scroll_paqgrande = new JScrollPane();
        scroll_paqgrande.setBounds(0,0,525,380);
        scroll_paqgrande.setViewportView(paqgrande);
        scroll_paqgrande.setVisible(false);

        paqpeq = new JPanel();
        paqpeq.setBounds(0,0,550,400);
        paqpeq.setPreferredSize(new Dimension(550,820));
        paqpeq.setLayout(null);
        paqpeq.setVisible(false);
        scroll_paqpeq = new JScrollPane();
        scroll_paqpeq.setBounds(0,0,525,380);
        scroll_paqpeq.setViewportView(paqpeq);
        scroll_paqpeq.setVisible(false);

        cargar_componentes_productos();
        cargar_componentes_instrumentos();
        cargar_cuerda();
        cargar_viento();
        cargar_percusion();
        cargar_paquetes();
        cargar_accesorios(Instancias.capo(),Instancias.pua(),Instancias.amplificador());
        cargar_guitarras(Instancias.guitarra1(),Instancias.guitarra2(),Instancias.guitarra3());
        cargar_pianos(Instancias.piano1(),Instancias.piano2(),Instancias.piano3());
        cargar_flautas(Instancias.flauta1(),Instancias.flauta2(),Instancias.flauta3());
        cargar_trompetas(Instancias.trompeta1(),Instancias.trompeta2(),Instancias.trompeta3());
        cargar_baterias(Instancias.bateria1(),Instancias.bateria2(),Instancias.bateria3());
        cargar_xilofonos(Instancias.xilofono1(),Instancias.xilofono2(),Instancias.xilofono3());
        cargar_paq_guitarra(Instancias.bundle_guitarra());
        cargar_paq_salsa(Instancias.bundle_salsa());
        cargar_paq_grande(Instancias.instrumentos_grandes());
        cargar_paq_peq(Instancias.instrumentos_pequeños());

        add(productos);
        add(instrumentos);
        add(cuerda);
        add(viento);
        add(percusion);
        add(paquetes);
        add(scroll_accesorios);
        add(scroll_guitarras);
        add(scroll_pianos);
        add(scroll_flautas);
        add(scroll_trompetas);
        add(scroll_baterias);
        add(scroll_xilofono);
        add(scroll_paqguitarra);
        add(scroll_paqsalsa);
        add(scroll_paqgrande);
        add(scroll_paqpeq);
        add(cabecera);
        add(footer);
    }
    public void cargar_componentes_productos(){

        instruccion = new JLabel("Escoge el producto que quieres ver");
        instruccion.setFont(new Font("calibri",Font.PLAIN,19));
        instruccion.setBounds(12,20,500,20);

        Rinstrumentos = new JRadioButton("Instrumentos musicales");
        Rinstrumentos.setFont(new Font("calibri",Font.PLAIN,15));
        Rinstrumentos.setBounds(20,55,300,30);

        Raccesorios = new JRadioButton("Accesorios");
        Raccesorios.setFont(new Font("calibri",Font.PLAIN,15));
        Raccesorios.setBounds(20,85,300,30);

        Rpaquetes = new JRadioButton("Paquetes");
        Rpaquetes.setFont(new Font("calibri",Font.PLAIN,15));
        Rpaquetes.setBounds(20,115,300,30);

        continuar = new JButton("Continuar");
        continuar.setBounds(400,170,110,30);
        continuar.addActionListener(this);



        ButtonGroup grupo = new ButtonGroup();
        grupo.add(Rinstrumentos);
        grupo.add(Raccesorios);
        grupo.add(Rpaquetes);

        productos.add(instruccion);
        productos.add(Rinstrumentos);
        productos.add(Raccesorios);
        productos.add(Rpaquetes);
        productos.add(continuar);
    }
    public void cargar_componentes_instrumentos(){
        instruccion = new JLabel("Escoge que tipo de instrumento quieres ver");
        instruccion.setFont(new Font("calibri",Font.PLAIN,19));
        instruccion.setBounds(12,20,500,20);

        Rcuerda = new JRadioButton("Cuerda");
        Rcuerda.setFont(new Font("calibri",Font.PLAIN,15));
        Rcuerda.setBounds(20,55,300,30);

        Rviento = new JRadioButton("Viento");
        Rviento.setFont(new Font("calibri",Font.PLAIN,15));
        Rviento.setBounds(20,85,300,30);

        Rpercusion = new JRadioButton("Percusión");
        Rpercusion.setFont(new Font("calibri",Font.PLAIN,15));
        Rpercusion.setBounds(20,115,300,30);

        continuar_instrumento = new JButton("Continuar");
        continuar_instrumento.setBounds(400,170,110,30);
        continuar_instrumento.addActionListener(this);

        anterior_producto = new JButton("Anterior");
        anterior_producto.setBounds(275,170,110,30);
        anterior_producto.addActionListener(this);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(Rcuerda);
        grupo.add(Rviento);
        grupo.add(Rpercusion);

        instrumentos.add(instruccion);
        instrumentos.add(Rcuerda);
        instrumentos.add(Rviento);
        instrumentos.add(Rpercusion);
        instrumentos.add(continuar_instrumento);
        instrumentos.add(anterior_producto);
    }
    public void cargar_accesorios(Accesorio a,Accesorio b,Accesorio c){

        JTextPane accesorio1 = new JTextPane();
        accesorio1.setEditable(false);
        accesorio1.setBounds(5,10,490,110);
        JTextPane accesorio2 = new JTextPane();
        accesorio2.setBounds(5,140,490,110);
        accesorio2.setEditable(false);
        JTextPane accesorio3 = new JTextPane();
        accesorio3.setEditable(false);
        accesorio3.setBounds(5,270,490,110);

        accesorio1.setText(a.toString());
        accesorio2.setText(b.toString());
        accesorio3.setText(c.toString());

        anterior_accesorio = new JButton("Anterior");
        anterior_accesorio.setBounds(380,400,110,30);
        anterior_accesorio.addActionListener(this);


        accesorios.add(accesorio1);
        accesorios.add(accesorio2);
        accesorios.add(accesorio3);
        accesorios.add(anterior_accesorio);
    }
    public void cargar_paquetes(){
        instruccion = new JLabel("Escoge el paquete que quieres ver ");
        instruccion.setFont(new Font("calibri",Font.PLAIN,19));
        instruccion.setBounds(12,20,500,20);

        RpaqGuitarra = new JRadioButton("Bundle de guitarra");
        RpaqGuitarra.setFont(new Font("calibri",Font.PLAIN,15));
        RpaqGuitarra.setBounds(20,55,300,30);

        RpaqSalsa = new JRadioButton("Instrumentos de salsa");
        RpaqSalsa.setFont(new Font("calibri",Font.PLAIN,15));
        RpaqSalsa.setBounds(20,85,300,30);

        RpaqGrande = new JRadioButton("Instrumentos grandes");
        RpaqGrande.setFont(new Font("calibri",Font.PLAIN,15));
        RpaqGrande.setBounds(20,115,300,30);

        RpaqPeque = new JRadioButton("Instrumentos pequeños");
        RpaqPeque.setFont(new Font("calibri",Font.PLAIN,15));
        RpaqPeque.setBounds(20,145,300,30);

        anterior_producto_paquetes = new JButton("Anterior ");
        anterior_producto_paquetes.setBounds(275,170,110,30);
        anterior_producto_paquetes.addActionListener(this);

        continuar_paquetes = new JButton("Continuar");
        continuar_paquetes.setBounds(400,170,110,30);
        continuar_paquetes.addActionListener(this);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(RpaqGuitarra);
        grupo.add(RpaqSalsa);
        grupo.add(RpaqGrande);
        grupo.add(RpaqPeque);


        paquetes.add(instruccion);
        paquetes.add(RpaqGuitarra);
        paquetes.add(RpaqSalsa);
        paquetes.add(RpaqGrande);
        paquetes.add(RpaqPeque);
        paquetes.add(anterior_producto_paquetes);
        paquetes.add(continuar_paquetes);
    }
    public void cargar_cuerda(){
        instruccion = new JLabel("Que Instrumento de cuerda quieres escoger");
        instruccion.setFont(new Font("calibri",Font.PLAIN,19));
        instruccion.setBounds(12,20,500,20);

        Rguitarra = new JRadioButton("Guitarra");
        Rguitarra.setFont(new Font("calibri",Font.PLAIN,15));
        Rguitarra.setBounds(20,55,300,30);

        Rpiano = new JRadioButton("Piano");
        Rpiano.setFont(new Font("calibri",Font.PLAIN,15));
        Rpiano.setBounds(20,85,300,30);

        anterior_instrumento_cuerda = new JButton("Anterior ");
        anterior_instrumento_cuerda.setBounds(275,170,110,30);
        anterior_instrumento_cuerda.addActionListener(this);

        continuar_cuerda = new JButton("Continuar");
        continuar_cuerda.setBounds(400,170,110,30);
        continuar_cuerda.addActionListener(this);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(Rguitarra);
        grupo.add(Rpiano);


        cuerda.add(instruccion);
        cuerda.add(Rguitarra);
        cuerda.add(Rpiano);
        cuerda.add(anterior_instrumento_cuerda);
        cuerda.add(continuar_cuerda);
    }
    public void cargar_viento(){
        instruccion = new JLabel("Que Instrumento de viento quieres escoger");
        instruccion.setFont(new Font("calibri",Font.PLAIN,19));
        instruccion.setBounds(12,20,500,20);

        Rflauta = new JRadioButton("Flauta");
        Rflauta.setFont(new Font("calibri",Font.PLAIN,15));
        Rflauta.setBounds(20,55,300,30);

        Rtrompeta = new JRadioButton("Trompeta");
        Rtrompeta.setFont(new Font("calibri",Font.PLAIN,15));
        Rtrompeta.setBounds(20,85,300,30);

        anterior_instrumento_viento = new JButton("Anterior");
        anterior_instrumento_viento.setBounds(275,170,110,30);
        anterior_instrumento_viento.addActionListener(this);

        continuar_viento = new JButton("Continuar");
        continuar_viento.setBounds(400,170,110,30);
        continuar_viento.addActionListener(this);


        ButtonGroup grupo = new ButtonGroup();
        grupo.add(Rflauta);
        grupo.add(Rtrompeta);


        viento.add(instruccion);
        viento.add(Rflauta);
        viento.add(Rtrompeta);
        viento.add(anterior_instrumento_viento);
        viento.add(continuar_viento);

    }
    public void cargar_percusion() {
        instruccion = new JLabel("Que Instrumento de percusión quieres escoger");
        instruccion.setFont(new Font("calibri",Font.PLAIN,19));
        instruccion.setBounds(12,20,500,20);

        Rbateria = new JRadioButton("Bateria");
        Rbateria.setFont(new Font("calibri",Font.PLAIN,15));
        Rbateria.setBounds(20,55,300,30);

        Rxilofono = new JRadioButton("Xilofono");
        Rxilofono.setFont(new Font("calibri",Font.PLAIN,15));
        Rxilofono.setBounds(20,85,300,30);

        anterior_instrumento_percusion = new JButton("Anterior");
        anterior_instrumento_percusion.setBounds(275,170,110,30);
        anterior_instrumento_percusion.addActionListener(this);

        continuar_percusion = new JButton("Continuar");
        continuar_percusion.setBounds(400,170,110,30);
        continuar_percusion.addActionListener(this);


        ButtonGroup grupo = new ButtonGroup();
        grupo.add(Rbateria);
        grupo.add(Rxilofono);


        percusion.add(instruccion);
        percusion.add(Rbateria);
        percusion.add(Rxilofono);
        percusion.add(anterior_instrumento_percusion);
        percusion.add(continuar_percusion);

    }
    public void cargar_guitarras(Guitarra a, Guitarra b, Guitarra c){
        JTextPane guitarra1 = new JTextPane();
        guitarra1.setEditable(false);
        guitarra1.setBounds(5,10,490,240);

        JTextPane guitarra2 = new JTextPane();
        guitarra2.setBounds(5,260,490,240);
        guitarra2.setEditable(false);

        JTextPane guitarra3 = new JTextPane();
        guitarra3.setEditable(false);
        guitarra3.setBounds(5,520,490,240);

        guitarra1.setText(a.toString());
        guitarra2.setText(b.toString());
        guitarra3.setText(c.toString());

        anterior_guitarra = new JButton("Anterior");
        anterior_guitarra.setBounds(370,780,110,30);
        anterior_guitarra.addActionListener(this);


        guitarras.add(guitarra1);
        guitarras.add(guitarra2);
        guitarras.add(guitarra3);
        guitarras.add(anterior_guitarra);
    }
    public void cargar_pianos(Piano a, Piano b, Piano c){
        JTextPane piano1 = new JTextPane();
        piano1.setEditable(false);
        piano1.setBounds(5,10,490,240);

        JTextPane piano2 = new JTextPane();
        piano2.setBounds(5,260,490,240);
        piano2.setEditable(false);

        JTextPane piano3 = new JTextPane();
        piano3.setEditable(false);
        piano3.setBounds(5,520,490,240);

        piano1.setText(a.toString());
        piano2.setText(b.toString());
        piano3.setText(c.toString());

        anterior_piano = new JButton("Anterior");
        anterior_piano.setBounds(370,780,110,30);
        anterior_piano.addActionListener(this);

        pianos.add(piano1);
        pianos.add(piano2);
        pianos.add(piano3);
        pianos.add(anterior_piano);
    }
    public void cargar_flautas(Flauta a, Flauta b, Flauta c){
        JTextPane flauta1 = new JTextPane();
        flauta1.setEditable(false);
        flauta1.setBounds(5,10,490,240);

        JTextPane flauta2 = new JTextPane();
        flauta2.setBounds(5,260,490,240);
        flauta2.setEditable(false);

        JTextPane flauta3 = new JTextPane();
        flauta3.setEditable(false);
        flauta3.setBounds(5,520,490,240);

        flauta1.setText(a.toString());
        flauta2.setText(b.toString());
        flauta3.setText(c.toString());

        anterior_flauta = new JButton("Anterior");
        anterior_flauta.setBounds(370,780,110,30);
        anterior_flauta.addActionListener(this);

        flautas.add(flauta1);
        flautas.add(flauta2);
        flautas.add(flauta3);
        flautas.add(anterior_flauta);
    }
    public void cargar_trompetas(Trompeta a,Trompeta b,Trompeta c){
        JTextPane trompeta1 = new JTextPane();
        trompeta1.setEditable(false);
        trompeta1.setBounds(5,10,490,240);

        JTextPane trompeta2 = new JTextPane();
        trompeta2.setBounds(5,260,490,240);
        trompeta2.setEditable(false);

        JTextPane trompeta3 = new JTextPane();
        trompeta3.setEditable(false);
        trompeta3.setBounds(5,520,490,240);

        trompeta1.setText(a.toString());
        trompeta2.setText(b.toString());
        trompeta3.setText(c.toString());

        anterior_trompeta = new JButton("Anterior");
        anterior_trompeta.setBounds(370,780,110,30);
        anterior_trompeta.addActionListener(this);

        trompetas.add(trompeta1);
        trompetas.add(trompeta2);
        trompetas.add(trompeta3);
        trompetas.add(anterior_trompeta);
    }
    public void cargar_baterias(Bateria a, Bateria b,Bateria c){
        JTextPane bateria1 = new JTextPane();
        bateria1.setEditable(false);
        bateria1.setBounds(5,10,490,240);

        JTextPane bateria2 = new JTextPane();
        bateria2.setBounds(5,260,490,240);
        bateria2.setEditable(false);

        JTextPane bateria3 = new JTextPane();
        bateria3.setEditable(false);
        bateria3.setBounds(5,520,490,240);

        bateria1.setText(a.toString());
        bateria2.setText(b.toString());
        bateria3.setText(c.toString());

        anterior_bateria = new JButton("Anterior");
        anterior_bateria.setBounds(370,780,110,30);
        anterior_bateria.addActionListener(this);

        baterias.add(bateria1);
        baterias.add(bateria2);
        baterias.add(bateria3);
        baterias.add(anterior_bateria);

    }
    public void cargar_xilofonos(Xilofono a,Xilofono b,Xilofono c){
        JTextPane xilofono1 = new JTextPane();
        xilofono1.setEditable(false);
        xilofono1.setBounds(5,10,490,240);

        JTextPane xilofono2 = new JTextPane();
        xilofono2.setBounds(5,260,490,240);
        xilofono2.setEditable(false);

        JTextPane xilofono3 = new JTextPane();
        xilofono3.setEditable(false);
        xilofono3.setBounds(5,520,490,240);

        xilofono1.setText(a.toString());
        xilofono2.setText(b.toString());
        xilofono3.setText(c.toString());

        anterior_xilofono = new JButton("Anterior");
        anterior_xilofono.setBounds(370,780,110,30);
        anterior_xilofono.addActionListener(this);

        xilofonos.add(xilofono1);
        xilofonos.add(xilofono2);
        xilofonos.add(xilofono3);
        xilofonos.add(anterior_xilofono);

    }
    public void cargar_paq_guitarra(ArrayList<Object> a){
        Object elemento1,elemento2,elemento3;
        elemento1 = a.get(0);
        elemento2 = a.get(1);
        elemento3 = a.get(2);

        JTextPane campo1 = new JTextPane();
        campo1.setEditable(false);
        campo1.setBounds(5,10,490,240);

        JTextPane campo2 = new JTextPane();
        campo2.setBounds(5,260,490,200);
        campo2.setEditable(false);

        JTextPane campo3 = new JTextPane();
        campo3.setEditable(false);
        campo3.setBounds(5,470,490,200);

        campo1.setText(elemento1.toString());
        campo2.setText(elemento2.toString());
        campo3.setText(elemento3.toString());

        anterior_paq_guitarra = new JButton("Anterior");
        anterior_paq_guitarra.setBounds(370,780,110,30);
        anterior_paq_guitarra.addActionListener(this);

        paqguitarra.add(campo1);
        paqguitarra.add(campo2);
        paqguitarra.add(campo3);
        paqguitarra.add(anterior_paq_guitarra);

    }
    public void cargar_paq_salsa(ArrayList<Object> a){
        Object elemento1,elemento2,elemento3;
        elemento1 = a.get(0);
        elemento2 = a.get(1);
        elemento3 = a.get(2);

        JTextPane campo1 = new JTextPane();
        campo1.setEditable(false);
        campo1.setBounds(5,10,490,240);

        JTextPane campo2 = new JTextPane();
        campo2.setBounds(5,260,490,240);
        campo2.setEditable(false);

        JTextPane campo3 = new JTextPane();
        campo3.setEditable(false);
        campo3.setBounds(5,520,490,240);

        campo1.setText(elemento1.toString());
        campo2.setText(elemento2.toString());
        campo3.setText(elemento3.toString());

        anterior_paq_salsa = new JButton("Anterior");
        anterior_paq_salsa.setBounds(370,780,110,30);
        anterior_paq_salsa.addActionListener(this);

        paqsalsa.add(campo1);
        paqsalsa.add(campo2);
        paqsalsa.add(campo3);
        paqsalsa.add(anterior_paq_salsa);

    }
    public void cargar_paq_grande(HashMap<String,Object> a){
        Object elemento1,elemento2,elemento3;
        elemento1 = a.get("piano grande");
        elemento2 = a.get("bateria grande");
        elemento3 = a.get("guitarra grande");

        JTextPane campo1 = new JTextPane();
        campo1.setEditable(false);
        campo1.setBounds(5,10,490,240);

        JTextPane campo2 = new JTextPane();
        campo2.setBounds(5,260,490,240);
        campo2.setEditable(false);

        JTextPane campo3 = new JTextPane();
        campo3.setEditable(false);
        campo3.setBounds(5,520,490,240);

        campo1.setText(elemento1.toString());
        campo2.setText(elemento2.toString());
        campo3.setText(elemento3.toString());

        anterior_paq_grande = new JButton("Anterior");
        anterior_paq_grande.setBounds(370,780,110,30);
        anterior_paq_grande.addActionListener(this);

        paqgrande.add(campo1);
        paqgrande.add(campo2);
        paqgrande.add(campo3);
        paqgrande.add(anterior_paq_grande);
    }
    public void cargar_paq_peq(HashMap<String,Object> a){
        Object elemento1,elemento2,elemento3;
        elemento1 = a.get("xilofono pequeño");
        elemento2 = a.get("flauta pequeña");
        elemento3 = a.get("trompeta pequeña");

        JTextPane campo1 = new JTextPane();
        campo1.setEditable(false);
        campo1.setBounds(5,10,490,240);

        JTextPane campo2 = new JTextPane();
        campo2.setBounds(5,260,490,240);
        campo2.setEditable(false);

        JTextPane campo3 = new JTextPane();
        campo3.setEditable(false);
        campo3.setBounds(5,520,490,240);

        campo1.setText(elemento1.toString());
        campo2.setText(elemento2.toString());
        campo3.setText(elemento3.toString());

        anterior_paq_peq = new JButton("Anterior");
        anterior_paq_peq.setBounds(370,780,110,30);
        anterior_paq_peq.addActionListener(this);

        paqpeq.add(campo1);
        paqpeq.add(campo2);
        paqpeq.add(campo3);
        paqpeq.add(anterior_paq_peq);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //botones continuar
        //----------------------------------------------------ver instrumentos
        if(e.getSource()==continuar && Rinstrumentos.isSelected()) {
            productos.setVisible(false);
            instrumentos.setVisible(true);}
        //----------------------------------------------------ver accesorios
            else if(e.getSource()==continuar && Raccesorios.isSelected()){
                productos.setVisible(false);
                cabecera.setVisible(false);
                footer.setVisible(false);
                scroll_accesorios.setVisible(true);
                accesorios.setVisible(true);}
        //-----------------------------------------------------ver paquetes
            else if(e.getSource()==continuar && Rpaquetes.isSelected()){
                productos.setVisible(false);
                paquetes.setVisible(true);}
        //----------------------------------------------------ver instrumentos de cuerda
        if (e.getSource()==continuar_instrumento && Rcuerda.isSelected()) {
            instrumentos.setVisible(false);
            cuerda.setVisible(true);}
        //---------------------------------------------------ver instrumentos de viento
            else if(e.getSource()==continuar_instrumento && Rviento.isSelected()){
                instrumentos.setVisible(false);
                viento.setVisible(true);}
        //---------------------------------------------------ver isntrumentos de percusión
            else if(e.getSource()==continuar_instrumento && Rpercusion.isSelected()){
                instrumentos.setVisible(false);
                percusion.setVisible(true);}
        //--------------------------------------------------ver guitarras
        if(e.getSource()==continuar_cuerda && Rguitarra.isSelected()){
            cuerda.setVisible(false);
            cabecera.setVisible(false);
            footer.setVisible(false);
            guitarras.setVisible(true);
            scroll_guitarras.setVisible(true);}
        //-------------------------------------------------ver pianos
            else if(e.getSource()==continuar_cuerda && Rpiano.isSelected()){
                cuerda.setVisible(false);
                cabecera.setVisible(false);
                footer.setVisible(false);
                pianos.setVisible(true);
                scroll_pianos.setVisible(true);}
        //-------------------------------------------------ver flautas
        if(e.getSource()==continuar_viento && Rflauta.isSelected()){
            viento.setVisible(false);
            cabecera.setVisible(false);
            footer.setVisible(false);
            flautas.setVisible(true);
            scroll_flautas.setVisible(true);}
        //-------------------------------------------------ver trompetas
            else if(e.getSource()==continuar_viento && Rtrompeta.isSelected()){
                viento.setVisible(false);
                cabecera.setVisible(false);
                footer.setVisible(false);
                trompetas.setVisible(true);
                scroll_trompetas.setVisible(true);}
        //-------------------------------------------------ver baterias
        if(e.getSource()==continuar_percusion && Rbateria.isSelected()){
            percusion.setVisible(false);
            cabecera.setVisible(false);
            footer.setVisible(false);
            baterias.setVisible(true);
            scroll_baterias.setVisible(true);}
        //-------------------------------------------------ver xilofonos
            else if(e.getSource()==continuar_percusion && Rxilofono.isSelected()){
                percusion.setVisible(false);
                cabecera.setVisible(false);
                footer.setVisible(false);
                xilofonos.setVisible(true);
                scroll_xilofono.setVisible(true);}
        //---------------------------------------------------ver bundle guitarra
        if(e.getSource()==continuar_paquetes && RpaqGuitarra.isSelected()){
            paquetes.setVisible(false);
            cabecera.setVisible(false);
            footer.setVisible(false);
            paqguitarra.setVisible(true);
            scroll_paqguitarra.setVisible(true);}
        //----------------------------------------------------ver salsa
            else if(e.getSource()==continuar_paquetes && RpaqSalsa.isSelected()){
                paquetes.setVisible(false);
                cabecera.setVisible(false);
                footer.setVisible(false);
                paqsalsa.setVisible(true);
                scroll_paqsalsa.setVisible(true);}
        //------------------------------------------------------ver instrumentos grandes
            else if(e.getSource()==continuar_paquetes && RpaqGrande.isSelected()){
                paquetes.setVisible(false);
                cabecera.setVisible(false);
                footer.setVisible(false);
                paqgrande.setVisible(true);
                scroll_paqgrande.setVisible(true);}
        //------------------------------------------------------ver instrumentos pequeños
            else if(e.getSource()==continuar_paquetes && RpaqPeque.isSelected()){
                paquetes.setVisible(false);
                cabecera.setVisible(false);
                footer.setVisible(false);
                paqpeq.setVisible(true);
                scroll_paqpeq.setVisible(true);}
        //----------------------------------------------------------------------------------------------------------------------------------------------

        //botones anterior
        //-------------------------------------------------------------------------------------------retorceder a menú productos
        if(e.getSource()==anterior_producto){
            productos.setVisible(true);
            instrumentos.setVisible(false);}
        if(e.getSource()==anterior_producto_paquetes){
            productos.setVisible(true);
            paquetes.setVisible(false);}
        if(e.getSource()==anterior_accesorio){
            productos.setVisible(true);
            cabecera.setVisible(true);
            footer.setVisible(true);
            scroll_accesorios.setVisible(false);
            accesorios.setVisible(false);}
        //-------------------------------------------------------------------------------------------retorceder a menú instumentos
        else if(e.getSource()==anterior_instrumento_cuerda){
            productos.setVisible(false);
            cuerda.setVisible(false);
            instrumentos.setVisible(true);}
        if(e.getSource()==anterior_instrumento_viento){
            productos.setVisible(false);
            instrumentos.setVisible(true);
            viento.setVisible(false);}
        if(e.getSource()==anterior_instrumento_percusion){
            productos.setVisible(false);
            instrumentos.setVisible(true);
            percusion.setVisible(false);}
        //-------------------------------------------------------------------------------------------retorceder a menú instrumentos de cuerda
        if(e.getSource()==anterior_guitarra){
            guitarras.setVisible(false);
            cabecera.setVisible(true);
            footer.setVisible(true);
            scroll_guitarras.setVisible(false);
            cuerda.setVisible(true);}
        if(e.getSource()==anterior_piano){
            pianos.setVisible(false);
            cabecera.setVisible(true);
            footer.setVisible(true);
            scroll_pianos.setVisible(false);
            cuerda.setVisible(true);}
        //-------------------------------------------------------------------------------------------retorceder a menú instrumentos de viento
        if(e.getSource()==anterior_flauta){
            scroll_flautas.setVisible(false);
            flautas.setVisible(false);
            cabecera.setVisible(true);
            footer.setVisible(true);
            viento.setVisible(true);}
        if(e.getSource()==anterior_trompeta){
            scroll_trompetas.setVisible(false);
            cabecera.setVisible(true);
            footer.setVisible(true);
            trompetas.setVisible(false);
            viento.setVisible(true);}
        //-------------------------------------------------------------------------------------------retorceder a menú instrumentos de percusión
        if(e.getSource()==anterior_bateria){
            scroll_baterias.setVisible(false);
            baterias.setVisible(false);
            cabecera.setVisible(true);
            footer.setVisible(true);
            percusion.setVisible(true);}
        if(e.getSource()==anterior_xilofono){
            scroll_xilofono.setVisible(false);
            xilofonos.setVisible(false);
            cabecera.setVisible(true);
            footer.setVisible(true);
            percusion.setVisible(true);}
        //------------------------------------------------------------------------------------------retroceder a menú paquetes
        if(e.getSource()==anterior_paq_guitarra){
            scroll_paqguitarra.setVisible(false);
            cabecera.setVisible(true);
            footer.setVisible(true);
            paqguitarra.setVisible(false);
            paquetes.setVisible(true);}
        if(e.getSource()==anterior_paq_salsa){
            scroll_paqsalsa.setVisible(false);
            cabecera.setVisible(true);
            footer.setVisible(true);
            paqsalsa.setVisible(false);
            paquetes.setVisible(true);}
        if(e.getSource()==anterior_paq_grande){
            scroll_paqgrande.setVisible(false);
            cabecera.setVisible(true);
            footer.setVisible(true);
            paqgrande.setVisible(false);
            paquetes.setVisible(true);}
        if(e.getSource()==anterior_paq_peq){
            scroll_paqpeq.setVisible(false);
            cabecera.setVisible(true);
            footer.setVisible(true);
            paqpeq.setVisible(false);
            paquetes.setVisible(true);}
        }
    }