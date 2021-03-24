package com.company.Esercizi.Garage;

public class SDcar extends Car {

        private boolean modeSD;

        public SDcar() {
            this.modeSD = false;
        }

        public SDcar(String licensePlate, String color, String fuel, boolean isOn, String Type, boolean modeSD) {
            super(licensePlate, color, fuel, isOn, Type);
            this.modeSD = modeSD;
        }

        public SDcar(SDcar sdcar) {
            super(sdcar);
            this.modeSD = this.modeSD;
        }

        public void turnSDOn() {
            if (this.modeSD) {
                System.out.println("Sono già in modalità SD!");
            } else {
                this.modeSD = true;
            }

        }

        public void turnSDOff() {
            if (!this.modeSD) {
                System.out.println("Sono già in modalità guida normale!");
            } else {
                this.modeSD = false;
            }

        }

        public void turn0N() {
            this.turnSDOff();
            super.turnOFF();
        }

        public void turnOFF() {
            this.turnSDOff();
            super.turnON();
        }

        public void status() {
            super.status();
            System.out.println("sono self driving");
        }
    }
