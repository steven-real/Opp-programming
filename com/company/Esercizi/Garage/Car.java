package com.company.Esercizi.Garage;

public class Car {
    private String licensePlate;
    private boolean isOn;
    private String color;
    private String fuel;
    private String Type;

    public Car() {
        this.isOn = false;
        this.licensePlate = "";
        this.color = "";
        this.fuel = "";
        this.Type = "normal";
    }

    public Car(String licensePlate, String color, String fuel, boolean isOn, String Type) {
        this.isOn = isOn;
        this.color = color;
        this.licensePlate = licensePlate;
        this.fuel = fuel;
        this.Type = Type;
    }

    public Car(Car car) {
        this.isOn = car.isOn;
        this.licensePlate = car.licensePlate;
    }

    public void turnON() {
        this.isOn = true;
        System.out.println("la macchina è stata accesa");
    }

    public void turnOFF() {
        this.isOn = false;
        System.out.println("la macchina è stata spenta");
    }

    public void status() {
        if (!this.isOn) {
            System.out.print(" la macchina è spenta ");
        } else {
            System.out.print("la macchina è accesa ");
        }

        if (this.Type == "normale") {
            System.out.println("la macchina è normale");
        }

    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void setOn(boolean on) {
        this.isOn = on;
    }
}
