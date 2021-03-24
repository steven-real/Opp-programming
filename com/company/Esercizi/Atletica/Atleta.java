package com.company.Esercizi.Atletica;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import com.company.Classi.Persona;

public class Atleta extends Persona {
    private String specialità;

    public Atleta() {
        this.specialità = "";
    }

    public Atleta(String nome, String cognome, double altezza, double peso, String data_di_nascita, String specialità) {
        super(nome, cognome, altezza, peso, data_di_nascita);
        this.specialità = specialità;
    }

    public Atleta(Atleta atleta) {
        super(atleta);
        this.specialità = atleta.specialità;
    }

    public String getSpecialità() {
        return this.specialità;
    }

    public void setSpecialità(String specialità) {
        this.specialità = specialità;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + "specialità='" + this.specialità + "'}";
    }


    public static void main(String[] args) {
        Atleta a1 = new Atleta("giorgia", "lasa", 1.7D, 100.0D, "21/06/2006", "aula BYOD");
        Atleta a2 = new Atleta("giorgio", "lasalvia", 1.7D, 100.0D, "21/06/2006", "aula BYOD");
        Atleta a3 = new Atleta(a1);
        a3.setNome("scemo");
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
    }
}

