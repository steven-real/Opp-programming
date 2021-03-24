package com.company.Esercizi.Potenze;

public class Potenza {

        private int num = 2;
        private int elev;

        public Potenza() {
            this.elev = 0;
        }

        public Potenza(int elev) {
            this.elev = elev;
        }

        public Potenza(Potenza potenza) {
            this.elev = potenza.elev;
        }

        public int pow() {
            int ris = 1;

            for(int i = 0; i < this.elev; ++i) {
                ris *= this.num;
            }

            return ris;
        }

        public void cambio_base(int num) {
            this.num = num;
        }

    public static void main(String[] args) {
        Potenza n = new Potenza(2);
        n.cambio_base(5);
        System.out.println(n.pow());
    }
    }


