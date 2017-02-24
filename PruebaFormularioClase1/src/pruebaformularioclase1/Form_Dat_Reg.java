/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaformularioclase1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author C.andres
 */
public class Form_Dat_Reg extends JFrame implements ActionListener, KeyListener {

    public JButton Boton_verde, Boton_amarillo, Boton_rojo;
    protected JLabel lab_Nom, lab_nom2,lab_ndoc,lab_registro, lab_Apll, lab_Apll2, lab_tdoc, lab_numdoc, lab_genero, lab_tel, lab_Dir, lab_email, lab_hobbies, lab_comentar;
    protected JTextField telefono,direccion,email,primerapellido,segundoapellido,segundonombre,primernombre,estado, txt_numdoc;
    protected JComboBox tdoc;
    protected JRadioButton generoM, generoF, generoOtro;
    protected JCheckBox checkMusica, checkLectura, checkDepor, checkOtro;
    protected JTextArea cuadrotexto;
    protected JButton btn_Aceptar;
    protected JPanel Formu;
//    protected JMenuBar Submenu, Submenu1,contacto;
//    protected JMenu contenedor,contenedor1,contec;
//    protected JMenuItem Info, Salir, Telefono,direc;
    
    
    

    //Constructores
    public Form_Dat_Reg() {
        super("DATOS REGISTRADOS");
       JDesktopPane principal = new JDesktopPane();
//     
//        Submenu = new JMenuBar();
//        
//        contenedor= new JMenu("CrÃ©ditos");
//        this.setJMenuBar(Submenu);
//        
//         contacto = new JMenuBar();
//         Submenu.add(contenedor);
//         Info = new JMenuItem ("Nicolas");
//        contenedor.add(Info);
//        
//        contenedor= new JMenu("Contactos");
//        this.setJMenuBar(Submenu);
//        Submenu.add(contenedor);
//        Submenu.add(contenedor);
//         Info = new JMenuItem ("johan98niko@gmail.com");
//   contenedor.add(Info);
//        
//        
//        contenedor= new JMenu("PÃ¡gina");
//        this.setJMenuBar(Submenu);
//        Submenu.add(contenedor);
//        
//        Info = new JMenuItem ("www.Nicolas.com");
//        Salir= new JMenuItem("Salir");
//        contenedor.add(Info);
//        contenedor.addSeparator();
//        contenedor.add(Salir);
        
        //Submenu1= new JMenuBar();
        //contenedor1= new JMenu("Contactenos");
        //this.setJMenuBar (Submenu1);
        //Submenu.add(contenedor1);
        //Telefono= new JMenuItem("Telefono");
        //direc= new JMenuItem("DirecciÃ³n");
        //contenedor1.add(Telefono);
        //contenedor.addSeparator();
        //contenedor.add(direc);
        
        lab_registro = new JLabel("",10);
        lab_registro.setBounds(150, 20, 80, 20);

        lab_Nom = new JLabel("Primer nombre");
        lab_Nom.setBounds(170, 80, 80, 20);
        primernombre = new JTextField("", 10);
        primernombre.setBounds(100, 30, 80, 20);

        lab_nom2 = new JLabel("Segundo nombre");
        lab_nom2.setBounds(50, 110, 80, 20);
        segundonombre = new JTextField("", 10);
        segundonombre.setBounds(150, 80, 80, 20);

        lab_Apll = new JLabel("Primer apellido");
        lab_Apll.setBounds(50, 140, 80, 20);
        primerapellido = new JTextField("", 10);
        primerapellido.setBounds(150, 80, 80, 20);

        lab_Apll2 = new JLabel("Segundo apellido");
        lab_Apll2.setBounds(50, 170, 80, 20);
        segundoapellido = new JTextField("", 10);
        segundoapellido.setBounds(150, 80, 80, 20);

        lab_tel = new JLabel("Numero de telefono");
        lab_tel.setBounds(150, 80, 80, 20);
        telefono = new JTextField("", 10);
        telefono.setBounds(50, 80, 80, 20);

        lab_Dir = new JLabel("Direccion");
        lab_Dir.setBounds(150, 80, 80, 20);
        direccion = new JTextField("", 10);
        direccion.setBounds(50, 80, 80, 20);

        lab_email = new JLabel("Email");
        lab_email.setBounds(150, 80, 80, 20);
        email = new JTextField("", 10);
        email.setBounds(50, 80, 80, 20);

        //Documento
        lab_tdoc = new JLabel("");
        lab_tdoc.setBounds(200, 150, 80, 20);
        tdoc = new JComboBox();
        tdoc.addItem(null);
        tdoc.addItem("C.C");
        tdoc.addItem("T.I");
        tdoc.addItem("C.E");
        estado = new JTextField("", 10);
        estado.setBounds(120, 200, 80, 20);
        lab_ndoc = new JLabel("Numero de documento");
        lab_tdoc.setBounds(200, 150, 80, 20);
        //Genero
        lab_genero = new JLabel("Genero");
        lab_tdoc.setBounds(50, 140, 80, 20);
        generoF = new JRadioButton("Femenino");
        generoM = new JRadioButton("Masculino");
        generoM.setBackground(Color.cyan);
        generoF.setBackground(Color.cyan);
        generoM.setBackground(Color.cyan);
       
        generoOtro = new JRadioButton("Otro");
        
        
        //Seleccionar solo uno
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(generoM);
        grupo.add(generoF);
        grupo.add(generoOtro);
        
 generoOtro.setBackground(Color.cyan);
        //Mensaje oculto
        lab_genero.setToolTipText("Seleccione el genero al que pertenece");

        //Hobbies
        lab_hobbies= new JLabel("Hobbies");
        checkLectura = new JCheckBox("Lectura");
        checkDepor = new JCheckBox("Deportes");
        checkMusica = new JCheckBox("Musica");
        checkOtro = new JCheckBox("Otros");

        
         checkOtro.setBackground(Color.cyan);
          checkMusica.setBackground(Color.cyan);
           checkDepor.setBackground(Color.cyan);
            checkLectura.setBackground(Color.cyan);
         
         
         
         
        lab_comentar= new JLabel("Comentario");
        cuadrotexto= new JTextArea(0,0);
        cuadrotexto.setEditable(true);
        
       /* this.Boton_verde= new JButton("Aceptar");
        this.Boton_verde.setBackground(Color.GREEN);
        Boton_verde.setBounds(40,700,100,30);
        this.add(this.Boton_verde);
        Boton_verde.addActionListener(this);
        
        this.Boton_amarillo= new JButton("Siguiente");
        this.Boton_amarillo.setBackground(Color.YELLOW);
        Boton_amarillo.setBounds(180,700,100,30);
        this.add(this.Boton_amarillo);
        Boton_amarillo.addActionListener(this);
        
        this.Boton_rojo= new JButton("Cancelar");
        this.Boton_rojo.setBackground(Color.RED);
        Boton_rojo.setBounds(320,700,100,30);
        this.add(this.Boton_rojo);
        Boton_rojo.addActionListener(this);*/
        
        
//Panel
      //  principal.setBackground(Color.GRAY);
        Formu = new JPanel();
        TitledBorder title1;
        title1= BorderFactory.createTitledBorder("Datos Ingresados");
        Formu.setBorder(title1);
       Formu.setBackground(Color.cyan);
        Formu.setBounds(70, 60, 300, 630);
        //btn_Aceptar.addActionListener(this);

        //Formu.setLayout(null);
        Formu.setLayout(new BoxLayout(Formu, BoxLayout.Y_AXIS));
        //Formu.setLayout(new GridLayout(22,5,7,7));
        Formu.add(lab_registro);

        Formu.add(lab_registro);
        Formu.add(lab_Nom);
        Formu.add(primernombre);
        Formu.add(lab_nom2);
        Formu.add(segundonombre);
        Formu.add(lab_Apll);
        Formu.add(primerapellido);
        Formu.add(lab_Apll2);
        Formu.add(segundoapellido);
        Formu.add(lab_tel);
        Formu.add(telefono);
        Formu.add(lab_Dir);
        Formu.add(direccion);
        Formu.add(lab_email);
        Formu.add(email);
        Formu.add(lab_tdoc);
       // Formu.add(tdoc);
        Formu.add( lab_ndoc);
        Formu.add(estado);
        Formu.add(lab_genero);
        Formu.add(generoM);
        Formu.add(generoF);
        Formu.add(generoOtro);
        Formu.add(lab_hobbies);
        Formu.add(checkDepor);
        Formu.add(checkLectura);
        Formu.add(checkMusica);
        Formu.add(checkOtro);
        Formu.add(lab_comentar);
        Formu.add(cuadrotexto);
        //Formu.add(Boton_verde);
        //Formu.add(Boton_amarillo);
        //Formu.add(Boton_rojo);
        //Formu.add(btn_Aceptar);
        add(Formu);
       
   
        this.add(principal, BorderLayout.CENTER);
        this.setLocale(null);
        this.setSize(450, 815);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        //botonVerde.addActionListener(this);
        //botonRojo.addActionListener(this);

    }
        //metodo para validar espacios en blanco text de nombre
       
        //metodo para validar espacios en blanco genero
       
                //metodo para validar espacios en blanco genero
       
        
    @Override
    public void actionPerformed(ActionEvent e) {

        int val1=0, val2=0, val3=0, val4=0;
        
        if(e.getSource()==Boton_verde){
          //   captura();
        //Aqui instancia la  ventana nueva
            // Form_Dat_Reg fdr = new Form_Dat_Reg();
          //   Registro rg = new Registro();
            
  //  fdr.estado.setText(txt_doc.getText());
            
            
      
          
    }

}
    
  

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
