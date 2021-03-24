package com.company.Esercizi.Garage;

public class MainGarage {

        public static void main(String[] args) {
            Car[] c = new Car[]{new SDcar("EIRRUEE", "rosso", "benzina", true, "SD", true), new Car("EIRRUEE", "rosso", "benzina", true, "normale"), new SDcar("EIRRUEE", "rosso", "benzina", true, "SD", true), new Car("EIRRUEE", "rosso", "benzina", true, "normale")};
            Car[] var2 = c;
            int var3 = c.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                Car p = var2[var4];
                p.status();
            }

        }
    }


