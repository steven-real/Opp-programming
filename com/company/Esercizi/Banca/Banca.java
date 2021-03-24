package com.company.Esercizi.Banca;

public class Banca {

    private double saldo;
    private String[] s = new String[5];
    int i = 0;

    public Banca() {
        this.saldo = 0.0D;
    }

    public Banca(double saldo) {
        this.saldo = saldo;
    }

    public Banca(Banca cc) {
        this.saldo = cc.saldo;
    }

    public void Versamenti(double importo) {
        this.saldo += importo;
        if (this.i == 5) {
            this.i = 0;
            this.s[this.i] = "Versamento";
        } else {
            this.s[this.i] = "Versamento";
            ++this.i;
        }

        System.out.println("versamento di " + importo + "€ andato a buon fine");
    }

    public void Prelievi(double importo) {
        this.saldo -= importo;
        if (this.i == 5) {
            this.i = 0;
            this.s[this.i] = "Prelievo";
        } else {
            this.s[this.i] = "Prelievo";
            ++this.i;
        }

        System.out.println("Prelievo di " + importo + "€ andato a buon fine");
    }

    public void Stampa_movimenti() {
        for(int i = 0; i < 5; ++i) {
            if (this.s[i] != null) {
                System.out.println(this.s[i]);
            }
        }

    }
    public static void main(String[] args) {
        Banca bancomat = new Banca(1000.0D);
        bancomat.Prelievi(30.0D);
        bancomat.Versamenti(60.0D);
        bancomat.Prelievi(50.0D);
        bancomat.Versamenti(230.0D);
        bancomat.Versamenti(130.0D);
        bancomat.Versamenti(0.0D);
        bancomat.Stampa_movimenti();
    }
}
