package com.mycompany.taller4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Taller4 extends JFrame implements ActionListener{
    private JTextField textfield1;
    private JLabel label1;
    private JButton boton1;
    Taller4(){
        setLayout(null);
        label1= new JLabel("Adivina el numero", SwingConstants.CENTER);
        label1.setFont(new Font("Sans",Font.BOLD,50));
        label1.setBounds(5,30,1000,100);
        add(label1);
        textfield1= new JTextField();
        textfield1.setBounds(350,150,300,40);
        add(textfield1);
        boton1= new JButton("Aceptar");
        boton1.setBounds(450, 200, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton1){
            String numero=textfield1.getText();
        }
    }
    public static void main(String[] args) {
        Taller4 juego=new Taller4();
        juego.setBounds(171,134,1024,500);
        juego.setResizable(false);
        juego.setVisible(true);
        
    }

   
}
