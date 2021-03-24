package com.company.Esercizi.Social;
import java.io.PrintStream;

public class PersonaSocial {
    private String nome;
    private String cognome;
    Contatti Rubrica = new Contatti();

    public PersonaSocial() {
        this.nome = "";
        this.cognome = "";
    }

    public PersonaSocial(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Contatti getRubrica() {
        return this.Rubrica;
    }

    public void setRubrica(Contatti rubrica) {
        this.Rubrica = rubrica;
    }

    public void AddFriend(PersonaSocial tizio) {
        if (tizio.nome == this.nome && tizio.cognome == this.cognome) {
            System.out.println("Impossibile aggiungere se stessi ai contatti");
        } else if (this.Rubrica.amici.contains(tizio) && this.Rubrica.nemici.contains(tizio)) {
            System.out.println("Impossibile aggiungere un contatto che è sia amico sia nemico");
        } else if (!this.Rubrica.amici.contains(tizio) && !this.Rubrica.nemici.contains(tizio)) {
            this.Rubrica.amici.add(tizio);
            System.out.println(tizio.nome + " " + tizio.cognome + " aggiunto correttamente agli amici");
        } else {
            System.out.println("Contatto già presente in Rubrica");
        }

    }

    public void AddEnemy(PersonaSocial tizio) {
        if (tizio.nome == this.nome && tizio.cognome == this.cognome) {
            System.out.println("Impossibile aggiungere se stessi ai contatti");
        } else if (this.Rubrica.amici.contains(tizio) && this.Rubrica.nemici.contains(tizio)) {
            System.out.println("Impossibile aggiungere un contatto che è sia amico sia nemico");
        } else if (!this.Rubrica.amici.contains(tizio) && !this.Rubrica.nemici.contains(tizio)) {
            this.Rubrica.nemici.add(tizio);
            System.out.println(tizio.nome + " " + tizio.cognome + " correttamente ai nemici");
        } else {
            System.out.println("Contatto già presente in Rubrica");
        }

    }

    public void Contacts() {
        System.out.println("Ecco i tuoi amici:");

        PrintStream var10000;
        Object var10001;
        int j;
        for (j = 0; j < this.Rubrica.amici.size(); ++j) {
            var10000 = System.out;
            var10001 = this.Rubrica.amici.get(j);
            var10000.print(((PersonaSocial) var10001).nome + " ");
            System.out.println(((PersonaSocial) this.Rubrica.amici.get(j)).cognome);
        }

        System.out.println("Ecco i tuoi nemici:");

        for (j = 0; j < this.Rubrica.nemici.size(); ++j) {
            var10000 = System.out;
            var10001 = this.Rubrica.nemici.get(j);
            var10000.print(((PersonaSocial) var10001).nome + " ");
            System.out.println(((PersonaSocial) this.Rubrica.nemici.get(j)).cognome);
        }

    }
}
