package com.company.Esercizi.Social;
import java.util.ArrayList;
public class Contatti {

        ArrayList<PersonaSocial> amici = new ArrayList();
        ArrayList<PersonaSocial> nemici = new ArrayList();

        public Contatti() {
            this.amici = this.amici;
            this.nemici = this.nemici;
        }

        public Contatti(ArrayList<PersonaSocial> amici, ArrayList<PersonaSocial> nemici) {
            this.amici = amici;
            this.nemici = nemici;
        }

        public ArrayList<PersonaSocial> getAmici() {
            return this.amici;
        }

        public void setAmici(ArrayList<PersonaSocial> amici) {
            this.amici = amici;
        }

        public ArrayList<PersonaSocial> getNemici() {
            return this.nemici;
        }

        public void setNemici(ArrayList<PersonaSocial> nemici) {
            this.nemici = nemici;
        }
}


