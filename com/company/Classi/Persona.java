package com.company.Classi;

   public class Persona {
        private String nome;
        private String cognome;
        private String data_di_nascita;
        private String residenza;
        private double peso;
        private double Età;
        private double altezza;

        public Persona() {
            this.nome = "";
            this.cognome = "";
            this.altezza = 0.0D;
            this.peso = 0.0D;
            this.data_di_nascita = "";
        }

        public String toString() {
            return "Persona{nome='" + this.nome + "', cognome='" + this.cognome + "', altezza=" + this.altezza + ", peso=" + this.peso + ", data_di_nascita='" + this.data_di_nascita + ",";
        }

        public Persona(String nome, String cognome, double altezza, double peso, String data_di_nascita) {
            this.nome = nome;
            this.cognome = cognome;
            this.altezza = altezza;
            this.peso = peso;
            this.data_di_nascita = data_di_nascita;
        }

        public Persona(Persona persona) {
            this.nome = persona.nome;
            this.cognome = persona.cognome;
            this.altezza = persona.altezza;
            this.peso = persona.peso;
            this.data_di_nascita = persona.data_di_nascita;
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

        public double getAltezza() {
            return this.altezza;
        }

        public void setAltezza(double altezza) {
            this.altezza = altezza;
        }

        public double getPeso() {
            return this.peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public String getData_di_nascita() {
            return this.data_di_nascita;
        }

        public void setData_di_nascita(String data_di_nascita) {
            this.data_di_nascita = data_di_nascita;
        }

        public String getNome() {
            return this.nome;
        }
   }


