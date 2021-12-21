package tushar;

import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;

class Casiolator implements ActionListener{

    JFrame jFrame;
    JTextField jTextField;
    JPanel p, p1, p2;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b00, bdiv, bmul, bsub, badd, bmod, bdec, beq, bclr;

    static double a=0, b=0, result=0;
    static int operator=0;

    Casiolator(){

        jFrame=new JFrame("Calculator");
        jTextField=new JTextField();
        jTextField.setBounds(30, 35, 285, 50);

        p=new JPanel();
        p.setBounds(15, 25, 340, 400);
        p.setBackground(Color.white);

        p1=new JPanel();
        p1.setBounds(245,95,68,300);
        p1.setBackground(Color.cyan);

        p2 = new JPanel();
        p2.setBounds(30,95, 220,300);
        p2.setBackground(Color.green);

        b0=new JButton("0");
        b0.setBounds(40,100,60,45);

        b1=new JButton("1");
        b1.setBounds(110,100,60,45);

        b2=new JButton("2");
        b2.setBounds(180,100,60,45);

        b3=new JButton("3");
        b3.setBounds(40,180,60,45);

        b4=new JButton("4");
        b4.setBounds(110,180,60,45);

        b5=new JButton("5");
        b5.setBounds(180,180,60,45);

        b6=new JButton("6");
        b6.setBounds(40,260,60,45);

        b7=new JButton("7");
        b7.setBounds(110,260,60,45);

        b8=new JButton("8");
        b8.setBounds(180,260,60,45);

        b9=new JButton("9");
        b9.setBounds(40,340,60,45);

        bdiv=new JButton("/");
        bdiv.setBounds(250,228,55,35);

        bmul=new JButton("*");
        bmul.setBounds(250,270,55,35);

        bsub=new JButton("-");
        bsub.setBounds(250,142,55,35);

        badd=new JButton("+");
        badd.setBounds(250,100,55,35);

        b00=new JButton("00");
        b00.setBounds(180,340,60,45);

        bmod=new JButton("%");
        bmod.setBounds(250,185,55,35);

        bdec=new JButton(".");
        bdec.setBounds(110,340,60,45);

        beq=new JButton("=");
        beq.setBounds(250,312,55,35);

        bclr=new JButton("C");
        bclr.setBounds(250,352,55,35);

        p.add(jTextField);

        jFrame.add(jTextField);
        jFrame.add(b0);
        jFrame.add(b1);
        jFrame.add(b2);
        jFrame.add(badd);
        jFrame.add(b3);
        jFrame.add(b4);
        jFrame.add(b5);
        jFrame.add(bsub);
        jFrame.add(b6);
        jFrame.add(b7);
        jFrame.add(b8);
        jFrame.add(bdiv);
        jFrame.add(b9);
        jFrame.add(bdec);
        jFrame.add(b00);
        jFrame.add(bmul);
        jFrame.add(beq);
        jFrame.add(bclr);
        jFrame.add(bmod);
        jFrame.add(p1);
        jFrame.add(p2);
        jFrame.add(p);
        jFrame.add(p);
        p1.setLayout(new GridLayout(4, 3));
        p1.setLayout(new GridLayout(7, 1));
        jFrame.setSize(360,460);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        beq.addActionListener(this);
        bdec.addActionListener(this);
        bdiv.addActionListener(this);
        b00.addActionListener(this);
        bmod.addActionListener(this);
        bclr.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b0)
            jTextField.setText(jTextField.getText().concat("0"));

        if(e.getSource()==b1)
            jTextField.setText(jTextField.getText().concat("1"));

        if(e.getSource()==b2)
            jTextField.setText(jTextField.getText().concat("2"));

        if(e.getSource()==b3)
            jTextField.setText(jTextField.getText().concat("3"));

        if(e.getSource()==b4)
            jTextField.setText(jTextField.getText().concat("4"));

        if(e.getSource()==b5)
            jTextField.setText(jTextField.getText().concat("5"));

        if(e.getSource()==b6)
            jTextField.setText(jTextField.getText().concat("6"));

        if(e.getSource()==b7)
            jTextField.setText(jTextField.getText().concat("7"));

        if(e.getSource()==b8)
            jTextField.setText(jTextField.getText().concat("8"));

        if(e.getSource()==b9)
            jTextField.setText(jTextField.getText().concat("9"));

        if(e.getSource()==bdec)
            jTextField.setText(jTextField.getText().concat("."));

        if(e.getSource()==badd)
        {
            a=Double.parseDouble(jTextField.getText());
            operator=1;
            jTextField.setText("");
        }

        if(e.getSource()==bsub) {
            a=Double.parseDouble(jTextField.getText());
            operator=2;
            jTextField.setText("");
        }

        if(e.getSource()==bmul) {
            a=Double.parseDouble(jTextField.getText());
            operator=3;
            jTextField.setText("");
        }

        if(e.getSource()==bdiv) {
            a=Double.parseDouble(jTextField.getText());
            operator=4;
            jTextField.setText("");
        }
        if(e.getSource()==b00)
            jTextField.setText(jTextField.getText().concat("00"));

        if(e.getSource()==bmod) {
            a=Double.parseDouble(jTextField.getText());
            operator=5;
            jTextField.setText("");
        }


        if(e.getSource()==beq) {
            b=Double.parseDouble(jTextField.getText());
            switch(operator) {
                case 1: result=a+b;
                    break;

                case 2: result=a-b;
                    break;

                case 3: result=a*b;
                    break;

                case 4: result= a/b;
                    break;

                case 5:result=a%b;
                    break;

                default:result = 0;
            }

            jTextField.setText(""+result);
        }
        if(e.getSource()==bclr)
            jTextField.setText("");
    }

    public static void main(String[] args) {

        new Casiolator();
    }
}