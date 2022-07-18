package com.mycompany.taller4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Taller4 extends JFrame implements ActionListener{
    private JTextField textfield1; 
    private JTextArea textfield2;
    private JLabel label1;
    private JButton boton1;
    int contador=0;
    int aleatorio=0;
    
    Taller4(){
        setLayout(null);
        aleatorio= (int)(Math.random()*25);
        label1= new JLabel("Adivina el número", SwingConstants.CENTER);
        label1.setFont(new Font("Sans",Font.BOLD,50));
        label1.setBounds(5,30,760,100);
        add(label1);
        textfield1= new JTextField();
        textfield1.setBounds(230,125,300,40);
        add(textfield1);
        textfield2= new JTextArea();
        textfield2.setBounds(230,215,300,250);
        add(textfield2);
        boton1= new JButton("Aceptar");
        boton1.setBounds(327, 175, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent e) {
        try {
            int numero=Integer.parseInt(textfield1.getText());
            if (numero== aleatorio){
                textfield2.append("Felicidades!! Acertó el numero secreto en " +contador+" intentos\n");
                boton1.setEnabled(false);
            } else if (numero<aleatorio){
                textfield2.append(numero+" El número es menor.\n");
            } else {
                textfield2.append(numero+" El número es mayor.\n");
            }
            
            contador++;
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        
        Taller4 juego=new Taller4();
        juego.setBounds(171,134,800,550);
        juego.setResizable(false);
        juego.setVisible(true);
        
    }

   
}
