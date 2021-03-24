package com.company.Esercizi.Prova_Frame;

import javax.swing.*;
public class Come_Va extends JFrame {

    private  final JButton B2;
    private final JButton B4;
    private  final JLabel Male;
    private final JLabel Abbastanza;
    private final JLabel Così;

    public Come_Va()
    {
        super("Come va?");
        JLabel bene = new JLabel("Bene");
        Male=new JLabel("Male");
        Così=new JLabel("Così così");
        Abbastanza=new JLabel("Abbastanza bene");
        JButton b1 = new JButton("clicca qui se stai bene");
        B2=new JButton("clicca qui se stai male");
        JButton b3 = new JButton("clicca qui se stai così così");
        B4 =new JButton("clicca qui se stai abbastanza bene ");


        JPanel p1=new JPanel();
        p1.add(bene);
        p1.add(b1);
        p1.add(Abbastanza);
        p1.add(B4);
        p1.add(Così);
        p1.add(b3);
        p1.add(Male);
        p1.add(B2);

        setContentPane(p1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500,180);
        setVisible((true));
    }
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(Come_Va::new);
    }




}
