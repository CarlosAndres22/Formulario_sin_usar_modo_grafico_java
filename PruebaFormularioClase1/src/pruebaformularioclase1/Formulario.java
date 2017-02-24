/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaformularioclase1;

/**
 *
 * @author C.andres
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Formulario extends JFrame implements ActionListener {
    
    private JLabel lab_Login, lab_Usu, lab_Pass,hecho; // paquete label
    private JTextField txt_Usu, txt_Pwd;  // paquete campo de textos
    private JButton btn_Aceptar, btn_Cancelar; // paquete boton
    private JPanel Formu; //paquete panel
  
    public Formulario() {
       this.setTitle("Login");  
   
    
    hecho = new JLabel ("Realizado por Carlos Andres Martinez Poveda");
    hecho.setFont(new java.awt.Font("arial", 1, 18));
    hecho.setForeground(Color.red);
    hecho.setBounds(13,350,500,80);
    
    
    lab_Login = new JLabel("Login");
    lab_Login.setFont(new java.awt.Font("ar berkley", 1, 50));  //nombre, estilo y tamano
    lab_Login.setForeground(Color.DARK_GRAY);
    lab_Login.setBounds(150,50, 300, 90); // ubicacion x, ubicacion y, tamano x, tamano y
       
    lab_Usu = new JLabel("Usuario");
    lab_Usu.setFont(new java.awt.Font("tahoma",0,22));
    lab_Usu.setBounds(140,160,80,20);
    txt_Usu = new JTextField("",30);
    txt_Usu.setBounds(290,160,80,20);
    
    lab_Pass =new JLabel ("Contrasena");
    lab_Pass.setBounds(140,190,120,20);
    lab_Pass.setFont(new java.awt.Font("tahoma",0,22));
    lab_Pass.setForeground(Color.DARK_GRAY);
    txt_Pwd = new JPasswordField("",30);
    txt_Pwd.setBounds(290, 190, 80, 20);
    
    btn_Aceptar = new JButton("Aceptar");
    btn_Aceptar.setBounds(90,280,100,40);
    btn_Aceptar.setForeground(Color.GRAY);// color letra del boton
    btn_Aceptar.setBackground(Color.BLUE); // fondo color boton
    btn_Aceptar.addActionListener(this);
    
    
    btn_Cancelar = new JButton ("Cancelar");
    btn_Cancelar.setBounds(210,280,100,40);
    btn_Cancelar.setForeground(Color.GRAY);
    btn_Cancelar.setBackground(Color.BLUE);
    
    Formu = new JPanel();  //crear el panel
    Formu.setBackground(Color.WHITE); // color del panel
    Formu.setBounds(30, 60, 350, 400);
    
    
    
    Formu.setLayout(null); // configurar diseno
    Formu.add(lab_Login); // agregar label Login
    Formu.add(lab_Usu);
    Formu.add(txt_Usu);
    Formu.add(lab_Pass);
    Formu.add(txt_Pwd);
    Formu.add(btn_Aceptar);
    Formu.add(btn_Cancelar);
    Formu.add(hecho);
    
      
    add(Formu); // agregamos el panel 
    
    
    
    
    this.setSize(430, 450); // tamano ventana ancho y largo
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // termina ejecucion programa al cerrar ventana
    this.setLocationRelativeTo(null); //Acomoda ventana en el centro de la pantalla
    this.setResizable(false); //Ajustar tamanno ventana
    this.setVisible( true); // Mostrar si esta visible
    }
    
    
   /* if (GeneroF.isSelected()) {
                    datos.txt_Genero.setText("Femenino");
                } else if (GeneroM.isSelected()) {
                    datos.txt_Genero.setText("Masculino");
                } else if (GeneroOtro.isSelected()) {
                    datos.txt_Genero.setText("Otro");
                }

                if (eps1.isSelected()) {
                    datos.txt_hobiesM.setText("Musica");
                } else {
                    datos.txt_hobiesM.setText("***********");
                }

                if (eps2.isSelected()) {
                    datos.txt_hobiesF.setText("Futbol");
                } else {
                    datos.txt_hobiesF.setText("***********");
                }*/
  

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btn_Aceptar){
            captura();
        }
    }
     private void captura(){
        JOptionPane.showMessageDialog(null, "Los datos ingresados no existen  \n" + txt_Usu.getText()+ "\n"+txt_Pwd.getText()+"\n"+"Por favor registrese para iniciar sesion.");
          Registro rg = new Registro();
         
     }
}
