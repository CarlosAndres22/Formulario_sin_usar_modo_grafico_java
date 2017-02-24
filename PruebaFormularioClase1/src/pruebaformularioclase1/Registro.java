
package pruebaformularioclase1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Usuario
 */
public class Registro extends JFrame implements ActionListener, KeyListener {

    public JButton Boton_verde, Boton_amarillo, Boton_rojo;
    protected JLabel lab_Nom, lab_nom2,lab_ndoc,lab_registro, lab_Apll, lab_Apll2, lab_tdoc, lab_numdoc, lab_genero, lab_tel, lab_Dir, lab_email, lab_hobbies, lab_comentar;
    protected JTextField txt_Nom, txt_Nom2, txt_Apll, txt_Apll2, txt_numdoc, txt_tel, txt_Dir, txt_email, txt_doc;
    protected JComboBox tdoc;
    protected JRadioButton generoM, generoF, generoOtro;
    protected JCheckBox checkMusica, checkLectura, checkDepor, checkOtro;
    protected JTextArea Ta_comentario;
    protected JButton btn_Aceptar;
    protected JPanel Formu;
//    protected JMenuBar Submenu, Submenu1,contacto;
//    protected JMenu contenedor,contenedor1,contec;
//    protected JMenuItem Info, Salir, Telefono,direc;
    
    
    

    //Constructores
    public Registro() {
        super("Registro");
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
        txt_Nom = new JTextField("", 10);
        txt_Nom.setBounds(100, 30, 80, 20);

        lab_nom2 = new JLabel("Segundo nombre");
        lab_nom2.setBounds(50, 110, 80, 20);
        txt_Nom2 = new JTextField("", 10);
        txt_Nom2.setBounds(150, 80, 80, 20);

        lab_Apll = new JLabel("Primer apellido");
        lab_Apll.setBounds(50, 140, 80, 20);
        txt_Apll = new JTextField("", 10);
        txt_Apll.setBounds(150, 80, 80, 20);

        lab_Apll2 = new JLabel("Segundo apellido");
        lab_Apll2.setBounds(50, 170, 80, 20);
        txt_Apll2 = new JTextField("", 10);
        txt_Apll2.setBounds(150, 80, 80, 20);

        lab_tel = new JLabel("Numero de telefono");
        lab_tel.setBounds(150, 80, 80, 20);
        txt_tel = new JTextField("", 10);
        txt_tel.setBounds(50, 80, 80, 20);

        lab_Dir = new JLabel("Direccion");
        lab_Dir.setBounds(150, 80, 80, 20);
        txt_Dir = new JTextField("", 10);
        txt_Dir.setBounds(50, 80, 80, 20);

        lab_email = new JLabel("Email");
        lab_email.setBounds(150, 80, 80, 20);
        txt_email = new JTextField("", 10);
        txt_email.setBounds(50, 80, 80, 20);

        //Documento
        lab_tdoc = new JLabel("Tipo de documento");
        lab_tdoc.setBounds(200, 150, 80, 20);
        tdoc = new JComboBox();
        tdoc.addItem(null);
        tdoc.addItem("C.C");
        tdoc.addItem("T.I");
        tdoc.addItem("C.E");
        txt_doc = new JTextField("", 10);
        txt_doc.setBounds(120, 200, 80, 20);
        lab_ndoc = new JLabel("Numero de documento");
        lab_tdoc.setBounds(200, 150, 80, 20);
        //Genero
        lab_genero = new JLabel("Genero");
        lab_tdoc.setBounds(50, 140, 80, 20);
        generoF = new JRadioButton("Femenino");
        generoM = new JRadioButton("Masculino");
        generoM.setBackground(Color.white);
        generoF.setBackground(Color.white);
        generoM.setBackground(Color.white);
       
        generoOtro = new JRadioButton("Otro");
        
        
        //Seleccionar solo uno
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(generoM);
        grupo.add(generoF);
        grupo.add(generoOtro);
        
 generoOtro.setBackground(Color.white);
        //Mensaje oculto
        lab_genero.setToolTipText("Seleccione el genero al que pertenece");

        //Hobbies
        lab_hobbies= new JLabel("Hobbies");
        checkLectura = new JCheckBox("Lectura");
        checkDepor = new JCheckBox("Deportes");
        checkMusica = new JCheckBox("Musica");
        checkOtro = new JCheckBox("Otros");

        
         checkOtro.setBackground(Color.white);
          checkMusica.setBackground(Color.white);
           checkDepor.setBackground(Color.white);
            checkLectura.setBackground(Color.white);
         
         
         
         
        lab_comentar= new JLabel("Comentario");
        Ta_comentario= new JTextArea(0,0);
        Ta_comentario.setEditable(true);
        
        this.Boton_verde= new JButton("Aceptar");
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
        Boton_rojo.addActionListener(this);
        
        
//Panel
      //  principal.setBackground(Color.GRAY);
        Formu = new JPanel();
        TitledBorder title1;
        title1= BorderFactory.createTitledBorder("Ingresar Datos");
        Formu.setBorder(title1);
       Formu.setBackground(Color.white);
        Formu.setBounds(70, 60, 300, 630);
        //btn_Aceptar.addActionListener(this);

        //Formu.setLayout(null);
        Formu.setLayout(new BoxLayout(Formu, BoxLayout.Y_AXIS));
        //Formu.setLayout(new GridLayout(22,5,7,7));
        Formu.add(lab_registro);

        Formu.add(lab_registro);
        Formu.add(lab_Nom);
        Formu.add(txt_Nom);
        Formu.add(lab_nom2);
        Formu.add(txt_Nom2);
        Formu.add(lab_Apll);
        Formu.add(txt_Apll);
        Formu.add(lab_Apll2);
        Formu.add(txt_Apll2);
        Formu.add(lab_tel);
        Formu.add(txt_tel);
        Formu.add(lab_Dir);
        Formu.add(txt_Dir);
        Formu.add(lab_email);
        Formu.add(txt_email);
        Formu.add(lab_tdoc);
        Formu.add(tdoc);
        Formu.add( lab_ndoc);
        Formu.add(txt_doc);
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
        Formu.add(Ta_comentario);
        //Formu.add(Boton_verde);
        //Formu.add(Boton_amarillo);
        //Formu.add(Boton_rojo);
        //Formu.add(btn_Aceptar);
        add(Formu);
        Letra(txt_Nom);
        Letra(txt_Nom2);
        Letra(txt_Apll);
        Letra(txt_Apll2);
      
        
        Num(txt_doc);
        Num(txt_tel);
       
        
        
        
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
        public static boolean ValidaText(JTextField a){
        
                if (a.getText().trim().compareTo("")==0){
               JOptionPane.showMessageDialog(null,"No puede contener campos vacios","Error", JOptionPane.ERROR_MESSAGE); 
                a.requestFocusInWindow();
                return false;
                }
                return true;
        }
        //metodo para validar espacios en blanco genero
        
     /*   public static boolean ValidaSex(JRadioButton a){
        
                if (a.isSelected()){
                return false;
                }JOptionPane.showMessageDialog(null,"Debe seleccionar un genero","Error", JOptionPane.ERROR_MESSAGE);
                return true;
        }*/
                //metodo para validar espacios en blanco genero
        
        
        
        public static boolean ValidaHobbie(JCheckBox a){
        
                if (a.isSelected()){
                return true;
                
                }JOptionPane.showMessageDialog(null,"Debe seleccionar un hobbie o todos","Error", JOptionPane.ERROR_MESSAGE);
                return false;
        }
        
    @Override
    public void actionPerformed(ActionEvent e) {

        int val1=0, val2=0, val3=0, val4=0;
        
        if(e.getSource()==Boton_verde){
             captura();
            
        //Aqui instancia la  ventana nueva
            // Form_Dat_Reg fdr = new Form_Dat_Reg();
          //   Registro rg = new Registro();
            
  
            ValidaText(txt_Nom);
            validaemail(txt_email);
            ValidaText(txt_Apll);
            ValidaText(txt_doc);
           //ValidaSex(generoF);
          //  ValidaSex(generoM);
           // ValidaSex(generoOtro);
            //ValidaHobbie(checkLectura);
          //  ValidaHobbie(checkDepor);
          //  ValidaHobbie(checkMusica);
          //  ValidaHobbie(checkOtro);
            
            if (ValidaText(txt_Nom)==true && ValidaText(txt_Apll)==true && ValidaText(txt_doc)==true){
            val1=1;
            
            }else{
                JOptionPane.showMessageDialog(null,"Verifique los campos Nombre, Apellido o Numero de identifacion");
            }if(tdoc.getSelectedItem().toString().equals("Seleccione el tipo de documento")){
               JOptionPane.showMessageDialog(null,"Verifique el campo de tipo de documento");
               
             // Ventana2 vent=new Ventana2();
              // vent.nom1.setText(txt_Nom.getText());
              // vent.nom1.setText(txt_Apll.getText());
             // / vent.nom1.setText(txt_doc.getText());
              // vent.nom1.setText(txt_numdoc.getText());
               
            }else{
                val4=1;
            }
           /* if (ValidaSex(generoF)==true || ValidaSex(generoM)==true || ValidaSex(generoOtro)==true){
            val2=1;
            
            }else{
                JOptionPane.showMessageDialog(null,"Verifique e campo generoo");
            }if(tdoc.getSelectedItem().toString().equals("Seleccione un genero")){
               JOptionPane.showMessageDialog(null,"Verifique el campo de genero");
            }else{
                val4=1;
        }*/
    }

}
    
  
    
    
 public void Letra(JTextField a) {
     
        a.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char d = e.getKeyChar();
                if (Character.isDigit(d) && d != KeyEvent.VK_SPACE && d != KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Este espacio no puede contener numeros");
              super.keyTyped(e); //To change body of generated methods, choose Tools | Templates.
            } else if ((((int) e.getKeyChar()>32 && (int) e.getKeyChar() <= 47)
                    || ((int)  e.getKeyChar()>= 58 && (int) e.getKeyChar() <= 64)
                     || ((int) e.getKeyChar() >= 123 && (int) e.getKeyChar() <= 255))){
                    
                             e.consume();
                     getToolkit().beep();
                     JOptionPane.showMessageDialog(null, "Este espacio no puede contener caracteres especiales!"); 
                }
            }      
    });        
 }
 
 
         public void Num(JTextField a) {
     
        a.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke) {
                char d;
                d = ke.getKeyChar();
                if (Character.isLetter(d) && d != KeyEvent.VK_SPACE && d != KeyEvent.VK_BACK_SPACE) {
                    ke.consume();
                    getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Este espacio no puede contener letras");
           //   super.keyTyped(e); //To change body of generated methods, choose Tools | Templates.
            } else if ((((int) ke.getKeyChar()>32 && (int) ke.getKeyChar() <= 47)
                    || ((int)  ke.getKeyChar()>= 58 && (int) ke.getKeyChar() <= 64)
                     || ((int) ke.getKeyChar() >= 123 && (int) ke.getKeyChar() <= 255))){
                    
                             ke.consume();
                     getToolkit().beep();
                     JOptionPane.showMessageDialog(null, "Este espacio no puede contener caracteres especiales!"); 
                }
               
            }
            
             } );     
    }  
         
         
    public void validaemail(JTextField em){
        String email;
        email = em.getText();
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[_A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(email);
        if(matcher.find() == false){
            JOptionPane.showMessageDialog(null,"Direccion de correo no valida");
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


    private void captura(){
        JOptionPane.showMessageDialog(null, "Estos son los datos ingresados.");
          Form_Dat_Reg fdr = new Form_Dat_Reg();
           fdr.primernombre.setText(txt_Nom.getText());
           fdr.segundonombre.setText(txt_Nom2.getText());
           fdr.primerapellido.setText(txt_Apll.getText());
           fdr.segundoapellido.setText(txt_Apll2.getText());
           fdr.telefono.setText(txt_tel.getText());
           fdr.direccion.setText(txt_Dir.getText());
           fdr.email.setText(txt_email.getText());
      //    fdr.txt_TipoDocu.setText(tdoc.getSelectedItem().toString());

          
           fdr.estado.setText(txt_doc.getText());
           fdr.cuadrotexto.setText(Ta_comentario.getText());
     }
}
