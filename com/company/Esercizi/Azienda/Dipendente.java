package com.company.Esercizi.Azienda;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Dipendente {
    private String nome;
    private double stipendio;

    public Dipendente() {
        this.nome = "";
        this.stipendio = 0.0D;
    }

    public Dipendente(String nome, double stipendio) {
        this.nome = nome;
        this.stipendio = stipendio;
    }

    public void Aumento(double percentuale) {
        double incr = this.stipendio * percentuale / 100.0D;
        this.stipendio += incr;
        System.out.print("lo stipendio aumentato è: ");
        this.StampaStipendio();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void StampaStipendio() {
        System.out.printf("%.2f", this.stipendio);
        System.out.println("€");
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public static void main(String[] args) {
        Dipendente d = new Dipendente("stefano", 3500.0D);
        d.StampaStipendio();
        d.Aumento(25.0D);
    }
}

