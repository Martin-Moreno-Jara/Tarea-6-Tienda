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

    JLabel bienvenida,instruccion;

    JPanel productos,accesorios,paquetes,instrumentos,cuerda,viento,percusion,guitarras,
            pianos,flautas,trompetas,baterias,xilofonos,paqguitarra,paqsalsa,paqgrande,paqpeq;

    JScrollPane scroll_guitarras,scroll_pianos,scroll_flautas,scroll_trompetas,scroll_baterias,scroll_xilofono,scroll_paqguitarra,scroll_paqsalsa,
    scroll_paqgrande,scroll_paqpeq;


    public GUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(550,550);
        setTitle("Tienda");
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        iniciar();}


    public void iniciar(){
        productos = new JPanel();
        productos.setBackground(Color.CYAN);
        productos.setBounds(5,30,525,475);
        productos.setLayout(null);
        productos.setVisible(true);

        instrumentos = new JPanel();
        instrumentos.setBackground(Color.GREEN);
        instrumentos.setBounds(5,30,525,475);
        instrumentos.setLayout(null);
        instrumentos.setVisible(false);

        accesorios = new JPanel();
        accesorios.setBackground(Color.pink);
        accesorios.setBounds(5,30,525,530);
        accesorios.setLayout(null);
        accesorios.setVisible(false);

        paquetes = new JPanel();
        paquetes.setBackground(Color.ORANGE);
        paquetes.setBounds(5,30,525,475);
        paquetes.setLayout(null);
        paquetes.setVisible(false);

        cuerda = new JPanel();
        cuerda.setBackground(Color.YELLOW);
        cuerda.setBounds(5,30,525,475);
        cuerda.setLayout(null);
        cuerda.setVisible(false);

        viento = new JPanel();
        viento.setBackground(Color.red);
        viento.setBounds(5,30,525,475);
        viento.setLayout(null);
        viento.setVisible(false);

        percusion = new JPanel();
        percusion.setBackground(Color.blue);
        percusion.setBounds(5,30,525,475);
        percusion.setLayout(null);
        percusion.setVisible(false);

        guitarras = new JPanel();
        guitarras.setBackground(Color.GREEN);
        guitarras.setBounds(5,30,525,475);
        guitarras.setPreferredSize(new Dimension(525,820));
        guitarras.setLayout(null);
        guitarras.setVisible(false);
        scroll_guitarras = new JScrollPane();
        scroll_guitarras.setBounds(5,30,525,475);
        scroll_guitarras.setViewportView(guitarras);
        scroll_guitarras.setVisible(false);

        pianos = new JPanel();
        pianos.setBackground(Color.CYAN);
        pianos.setBounds(5,30,525,530);
        pianos.setPreferredSize(new Dimension(525,820));
        pianos.setLayout(null);
        pianos.setVisible(false);
        scroll_pianos = new JScrollPane();
        scroll_pianos.setBounds(5,30,525,530);
        scroll_pianos.setViewportView(pianos);
        scroll_pianos.setVisible(false);

        flautas = new JPanel();
        flautas.setBackground(Color.CYAN);
        flautas.setBounds(5,30,525,530);
        flautas.setPreferredSize(new Dimension(525,820));
        flautas.setLayout(null);
        flautas.setVisible(false);
        scroll_flautas = new JScrollPane();
        scroll_flautas.setBounds(5,30,525,530);
        scroll_flautas.setViewportView(flautas);
        scroll_flautas.setVisible(false);

        trompetas = new JPanel();
        trompetas.setBackground(Color.CYAN);
        trompetas.setBounds(5,30,525,530);
        trompetas.setPreferredSize(new Dimension(525,820));
        trompetas.setLayout(null);
        trompetas.setVisible(false);
        scroll_trompetas = new JScrollPane();
        scroll_trompetas.setBounds(5,30,525,530);
        scroll_trompetas.setViewportView(trompetas);
        scroll_trompetas.setVisible(false);

        baterias = new JPanel();
        baterias.setBackground(Color.CYAN);
        baterias.setBounds(5,30,525,530);
        baterias.setPreferredSize(new Dimension(525,820));
        baterias.setLayout(null);
        baterias.setVisible(false);
        scroll_baterias = new JScrollPane();
        scroll_baterias.setBounds(5,30,525,530);
        scroll_baterias.setViewportView(baterias);
        scroll_baterias.setVisible(false);

        xilofonos = new JPanel();
        xilofonos.setBackground(Color.CYAN);
        xilofonos.setBounds(5,30,525,530);
        xilofonos.setPreferredSize(new Dimension(525,820));
        xilofonos.setLayout(null);
        xilofonos.setVisible(false);
        scroll_xilofono = new JScrollPane();
        scroll_xilofono.setBounds(5,30,525,530);
        scroll_xilofono.setViewportView(xilofonos);
        scroll_xilofono.setVisible(false);

        paqguitarra = new JPanel();
        paqguitarra.setBackground(Color.CYAN);
        paqguitarra.setBounds(5,30,525,530);
        paqguitarra.setPreferredSize(new Dimension(525,820));
        paqguitarra.setLayout(null);
        paqguitarra.setVisible(false);
        scroll_paqguitarra = new JScrollPane();
        scroll_paqguitarra.setBounds(5,30,525,530);
        scroll_paqguitarra.setViewportView(paqguitarra);
        scroll_paqguitarra.setVisible(false);

        paqsalsa = new JPanel();
        paqsalsa.setBackground(Color.CYAN);
        paqsalsa.setBounds(5,30,525,530);
        paqsalsa.setPreferredSize(new Dimension(525,820));
        paqsalsa.setLayout(null);
        paqsalsa.setVisible(false);
        scroll_paqsalsa = new JScrollPane();
        scroll_paqsalsa.setBounds(5,30,525,530);
        scroll_paqsalsa.setViewportView(paqsalsa);
        scroll_paqsalsa.setVisible(false);

        paqgrande = new JPanel();
        paqgrande.setBackground(Color.CYAN);
        paqgrande.setBounds(5,30,525,530);
        paqgrande.setPreferredSize(new Dimension(525,820));
        paqgrande.setLayout(null);
        paqgrande.setVisible(false);
        scroll_paqgrande = new JScrollPane();
        scroll_paqgrande.setBounds(5,30,525,530);
        scroll_paqgrande.setViewportView(paqgrande);
        scroll_paqgrande.setVisible(false);

        paqpeq = new JPanel();
        paqpeq.setBackground(Color.CYAN);
        paqpeq.setBounds(5,30,525,530);
        paqpeq.setPreferredSize(new Dimension(525,820));
        paqpeq.setLayout(null);
        paqpeq.setVisible(false);
        scroll_paqpeq = new JScrollPane();
        scroll_paqpeq.setBounds(5,30,525,530);
        scroll_paqpeq.setViewportView(paqpeq);
        scroll_paqpeq.setVisible(false);

        bienvenida = new JLabel("TIENDA DE INSTRUMENTOS MUSICALES");

        bienvenida.setBounds(155,5,300,23);

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

        add(bienvenida);
        add(productos);
        add(instrumentos);
        add(cuerda);
        add(viento);
        add(percusion);
        add(paquetes);
        add(accesorios);
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
    }
    public void cargar_componentes_productos(){

        instruccion = new JLabel("Que producto quieres escoger");
        instruccion.setBounds(5,10,300,20);

        Rinstrumentos = new JRadioButton("Instrumentos musicales");
        Rinstrumentos.setBounds(8,40,300,20);

        Raccesorios = new JRadioButton("Accesorios");
        Raccesorios.setBounds(8,70,300,20);

        Rpaquetes = new JRadioButton("Paquetes");
        Rpaquetes.setBounds(8,100,300,20);

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

        instruccion = new JLabel("Que Instrumento quieres escoger");
        instruccion.setBounds(5,10,300,20);

        Rcuerda = new JRadioButton("Instrumentos de cuerda");
        Rcuerda.setBounds(8,40,300,20);

        Rviento = new JRadioButton("Instrumentos de viento");
        Rviento.setBounds(8,70,300,20);

        Rpercusion = new JRadioButton("Instrumentos de percusión");
        Rpercusion.setBounds(8,100,300,20);

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
        anterior_accesorio.setBounds(250,500,110,30);
        anterior_accesorio.addActionListener(this);


        accesorios.add(accesorio1);
        accesorios.add(accesorio2);
        accesorios.add(accesorio3);
        accesorios.add(anterior_accesorio);
    }
    public void cargar_paquetes(){
        instruccion = new JLabel("Que paquetes quieres escoger");
        instruccion.setBounds(5,10,300,20);

        RpaqGuitarra = new JRadioButton("Paquete de guitarra");
        RpaqGuitarra.setBounds(8,40,300,20);

        RpaqSalsa = new JRadioButton("Paquete de salsa");
        RpaqSalsa.setBounds(8,70,300,20);

        RpaqGrande = new JRadioButton("Paquete de instrumentos grandes");
        RpaqGrande.setBounds(8,100,300,20);

        RpaqPeque = new JRadioButton("Paquete de instrumentos pequeños");
        RpaqPeque.setBounds(8,130,300,20);

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
        instruccion.setBounds(5,10,300,20);

        Rguitarra = new JRadioButton("Guitarra");
        Rguitarra.setBounds(8,40,300,20);

        Rpiano = new JRadioButton("Piano");
        Rpiano.setBounds(8,70,300,20);

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
        instruccion.setBounds(5,10,300,20);

        Rflauta = new JRadioButton("Flauta");
        Rflauta.setBounds(8,40,300,20);

        Rtrompeta = new JRadioButton("Trompeta");
        Rtrompeta.setBounds(8,70,300,20);

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
        instruccion.setBounds(5, 10, 300, 20);

        Rbateria = new JRadioButton("Bateria");
        Rbateria.setBounds(8, 40, 300, 20);

        Rxilofono = new JRadioButton("Xilofono");
        Rxilofono.setBounds(8, 70, 300, 20);

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
        anterior_guitarra.setBounds(250,780,110,30);
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
        anterior_piano.setBounds(250,780,110,30);
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
        anterior_flauta.setBounds(250,780,110,30);
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
        anterior_trompeta.setBounds(250,780,110,30);
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
        anterior_bateria.setBounds(250,780,110,30);
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
        anterior_xilofono.setBounds(250,780,110,30);
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
        campo2.setBounds(5,260,490,240);
        campo2.setEditable(false);

        JTextPane campo3 = new JTextPane();
        campo3.setEditable(false);
        campo3.setBounds(5,520,490,240);

        campo1.setText(elemento1.toString());
        campo2.setText(elemento2.toString());
        campo3.setText(elemento3.toString());

        anterior_paq_guitarra = new JButton("Anterior");
        anterior_paq_guitarra.setBounds(250,780,110,30);
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
        anterior_paq_salsa.setBounds(250,780,110,30);
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
        anterior_paq_grande.setBounds(250,780,110,30);
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
        anterior_paq_peq.setBounds(250,780,110,30);
        anterior_paq_peq.addActionListener(this);

        paqpeq.add(campo1);
        paqpeq.add(campo2);
        paqpeq.add(campo3);
        paqpeq.add(anterior_paq_peq);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //botones continuar
        if(e.getSource()==continuar && Rinstrumentos.isSelected()) {
            productos.setVisible(false);
            instrumentos.setVisible(true);}

            if (e.getSource()==continuar_instrumento && Rcuerda.isSelected()) {
                instrumentos.setVisible(false);
                cuerda.setVisible(true);}

                if(e.getSource()==continuar_cuerda && Rguitarra.isSelected()){
                    cuerda.setVisible(false);
                    guitarras.setVisible(true);
                    scroll_guitarras.setVisible(true);
                }
            else if(e.getSource()==continuar_instrumento && Rviento.isSelected()){
                instrumentos.setVisible(false);
                viento.setVisible(true);}

            else if(e.getSource()==continuar_instrumento && Rpercusion.isSelected()){
                instrumentos.setVisible(false);
                percusion.setVisible(true);}

        else if(e.getSource()==continuar && Raccesorios.isSelected()){
            productos.setVisible(false);
            accesorios.setVisible(true);
                }
        else if(e.getSource()==continuar && Rpaquetes.isSelected()){
            productos.setVisible(false);
            paquetes.setVisible(true);
        }
        else if(e.getSource()==continuar_cuerda && Rguitarra.isSelected()){
            cuerda.setVisible(false);
            guitarras.setVisible(true);
            scroll_pianos.setVisible(true);}

        else if(e.getSource()==continuar_cuerda && Rpiano.isSelected()){
            cuerda.setVisible(false);
            pianos.setVisible(true);
            scroll_pianos.setVisible(true);}
        else if(e.getSource()==continuar_viento && Rflauta.isSelected()){
            viento.setVisible(false);
            flautas.setVisible(true);
            scroll_flautas.setVisible(true);}
        else if(e.getSource()==continuar_viento && Rtrompeta.isSelected()){
            viento.setVisible(false);
            trompetas.setVisible(true);
            scroll_trompetas.setVisible(true);}
        else if(e.getSource()==continuar_percusion && Rbateria.isSelected()){
            percusion.setVisible(false);
            baterias.setVisible(true);
            scroll_baterias.setVisible(true);}
        else if(e.getSource()==continuar_percusion && Rxilofono.isSelected()){
            percusion.setVisible(false);
            xilofonos.setVisible(true);
            scroll_xilofono.setVisible(true);}
        else if(e.getSource()==continuar_paquetes && RpaqGuitarra.isSelected()){
            paquetes.setVisible(false);
            paqguitarra.setVisible(true);
            scroll_paqguitarra.setVisible(true);
                }
        else if(e.getSource()==continuar_paquetes && RpaqSalsa.isSelected()){
            paquetes.setVisible(false);
            paqsalsa.setVisible(true);
            scroll_paqsalsa.setVisible(true);
                }
        else if(e.getSource()==continuar_paquetes && RpaqGrande.isSelected()){
            paquetes.setVisible(false);
            paqgrande.setVisible(true);
            scroll_paqgrande.setVisible(true);
                }
        else if(e.getSource()==continuar_paquetes && RpaqPeque.isSelected()){
            paquetes.setVisible(false);
            paqpeq.setVisible(true);
            scroll_paqpeq.setVisible(true);
                }

                //botones anterior
        else if(e.getSource()==anterior_producto){
            productos.setVisible(true);
            instrumentos.setVisible(false);}

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

        if(e.getSource()==anterior_producto_paquetes){
            productos.setVisible(true);
            paquetes.setVisible(false);}

        if(e.getSource()==anterior_accesorio){
            productos.setVisible(true);
            accesorios.setVisible(false);}

        if(e.getSource()==anterior_guitarra){
            guitarras.setVisible(false);
            scroll_guitarras.setVisible(false);
            cuerda.setVisible(true);}

        if(e.getSource()==anterior_piano){
            pianos.setVisible(false);
            scroll_pianos.setVisible(false);
            cuerda.setVisible(true);}

        if(e.getSource()==anterior_flauta){
            scroll_flautas.setVisible(false);
            flautas.setVisible(false);
            viento.setVisible(true);}

        if(e.getSource()==anterior_trompeta){
            scroll_trompetas.setVisible(false);
            trompetas.setVisible(false);
            viento.setVisible(true);}

        if(e.getSource()==anterior_bateria){
            scroll_baterias.setVisible(false);
            baterias.setVisible(false);
            percusion.setVisible(true);}

        if(e.getSource()==anterior_xilofono){
            scroll_xilofono.setVisible(false);
            xilofonos.setVisible(false);
            percusion.setVisible(true);}
        if(e.getSource()==anterior_paq_guitarra){
            scroll_paqguitarra.setVisible(false);
            paqguitarra.setVisible(false);
            paquetes.setVisible(true);}
        if(e.getSource()==anterior_paq_salsa){
            scroll_paqsalsa.setVisible(false);
            paqsalsa.setVisible(false);
            paquetes.setVisible(true);}
        if(e.getSource()==anterior_paq_grande){
            scroll_paqgrande.setVisible(false);
            paqgrande.setVisible(false);
            paquetes.setVisible(true);}
        if(e.getSource()==anterior_paq_peq){
            scroll_paqpeq.setVisible(false);
            paqpeq.setVisible(false);
            paquetes.setVisible(true);}
        }
    }