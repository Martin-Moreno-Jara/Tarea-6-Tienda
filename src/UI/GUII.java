package UI;
import Data.TipoProducto.Accesorio;
import Logic.Instancias;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUII extends JFrame implements ActionListener{

    JButton continuar,continuar_paquetes,continuar_instrumento,continuar_cuerda,continuar_viento,continuar_percusion,
            anterior_producto,anterior_instrumento_cuerda,anterior_accesorio,
            anterior_instrumento_viento,anterior_instrumento_percusion, anterior_producto_paquetes;
    JRadioButton Rinstrumentos,Raccesorios,Rpaquetes,Rcuerda,Rviento,Rpercusion,Rguitarra,Rpiano,Rflauta,Rtrompeta,
    Rbateria,Rxilofono,RpaqGuitarra,RpaqSalsa,RpaqGrande,RpaqPeque;
    JLabel bienvenida,instruccion;
    JPanel productos,accesorios,paquetes,instrumentos,cuerda,viento,percusion,guitarras,
            pianos,flautas,trompetas,baterias,xilofonos,paqguitarra,paqsalsa,paqgrande,paqpeqqueño;


    public GUII(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(550,600);
        setTitle("Tienda");
        setLayout(null);
        setLocationRelativeTo(null);
        iniciar();

    }
    public void iniciar(){
        productos = new JPanel();
        productos.setBackground(Color.CYAN);
        productos.setBounds(5,30,525,220);
        productos.setLayout(null);
        productos.setVisible(true);

        instrumentos = new JPanel();
        instrumentos.setBackground(Color.GREEN);
        instrumentos.setBounds(5,30,525,220);
        instrumentos.setLayout(null);
        instrumentos.setVisible(false);

        accesorios = new JPanel();
        accesorios.setBackground(Color.pink);
        accesorios.setBounds(5,30,525,530);
        accesorios.setLayout(null);
        accesorios.setVisible(false);

        paquetes = new JPanel();
        paquetes.setBackground(Color.ORANGE);
        paquetes.setBounds(5,30,525,220);
        paquetes.setLayout(null);
        paquetes.setVisible(false);

        cuerda = new JPanel();
        cuerda.setBackground(Color.CYAN);
        cuerda.setBounds(5,30,525,220);
        cuerda.setLayout(null);
        cuerda.setVisible(false);

        viento = new JPanel();
        viento.setBackground(Color.CYAN);
        viento.setBounds(5,30,525,220);
        viento.setLayout(null);
        viento.setVisible(false);

        percusion = new JPanel();
        percusion.setBackground(Color.CYAN);
        percusion.setBounds(5,30,525,220);
        percusion.setLayout(null);
        percusion.setVisible(false);

        guitarras = new JPanel();
        percusion.setBackground(Color.CYAN);
        percusion.setBounds(5,30,525,220);
        percusion.setLayout(null);
        percusion.setVisible(false);

        pianos = new JPanel();
        pianos.setBackground(Color.CYAN);
        pianos.setBounds(5,30,525,220);
        pianos.setLayout(null);
        pianos.setVisible(false);



        bienvenida = new JLabel("Bienvenido a la tienda de instrumentos musicales");
        bienvenida.setBounds(5,5,300,23);



        cargar_componentes_productos();
        cargar_componentes_instrumentos();
        cargar_cuerda();
        cargar_viento();
        cargar_percusion();
        cargar_paquetes();
        cargar_accesorios(Instancias.capo(),Instancias.pua(),Instancias.amplificador());

        add(bienvenida);
        add(productos);
        add(instrumentos);
        add(cuerda);
        add(viento);
        add(percusion);
        add(paquetes);
        add(accesorios);

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


        ButtonGroup grupo = new ButtonGroup();
        grupo.add(RpaqGuitarra);
        grupo.add(RpaqGuitarra);


        paquetes.add(instruccion);
        paquetes.add(RpaqGuitarra);
        paquetes.add(RpaqSalsa);
        paquetes.add(RpaqGrande);
        paquetes.add(RpaqPeque);
        paquetes.add(anterior_producto_paquetes);
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


        ButtonGroup grupo = new ButtonGroup();
        grupo.add(Rguitarra);
        grupo.add(Rpiano);


        cuerda.add(instruccion);
        cuerda.add(Rguitarra);
        cuerda.add(Rpiano);
        cuerda.add(anterior_instrumento_cuerda);
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


        ButtonGroup grupo = new ButtonGroup();
        grupo.add(Rflauta);
        grupo.add(Rtrompeta);


        viento.add(instruccion);
        viento.add(Rflauta);
        viento.add(Rtrompeta);
        viento.add(anterior_instrumento_viento);

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


        ButtonGroup grupo = new ButtonGroup();
        grupo.add(Rbateria);
        grupo.add(Rxilofono);


        percusion.add(instruccion);
        percusion.add(Rbateria);
        percusion.add(Rxilofono);
        percusion.add(anterior_instrumento_percusion);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==continuar && Rinstrumentos.isSelected()) {
            productos.setVisible(false);
            instrumentos.setVisible(true);}

            if (e.getSource()==continuar_instrumento && Rcuerda.isSelected()) {
                instrumentos.setVisible(false);
                cuerda.setVisible(true);}

                if(e.getSource()==continuar_cuerda && Rguitarra.isSelected()){
                    cuerda.setVisible(false);
                    guitarras.setVisible(true);
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



    }

    }








