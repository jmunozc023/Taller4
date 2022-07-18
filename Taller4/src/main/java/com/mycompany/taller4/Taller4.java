package com.mycompany.taller4;
import javax.swing.*;
import java.awt.*;
public class Taller4 extends JFrame{
    private JLabel label1;
    Taller4(){
        setLayout(null);
        label1= new JLabel("Adivina el numero");
        label1.setBounds(10,20,300,30);
        add(label1);
    }
    
    public static void main(String[] args) {
        Taller4 juego=new Taller4();
        juego.setBounds(171,134,1024,500);
        juego.setResizable(false);
        juego.setVisible(true);
        
    }
}
