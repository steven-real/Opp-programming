package com.company.HomeExercise;
/**
 * Write a program that calculates and displays a person's body mass index
 * (BMI). A person's BMI is calculated with the following formula: BMI = weight
 * (kg) / height (m) ^ 2. Display a message indicating whether the person has
 * optimal weight, is underweight, or is overweight. A sedentary person's weight
 * is considered optimal if his or her BMI is between 18.5 and 25. If the BMI is
 * less than 18.5, the person is considered underweight. If the BMI value is
 * greater than 25, the person is considered overweight.
 *
 * @author Justin Musgrove
 */

public class BodyMassIndex {
    double altezza;
    double peso;
    public BodyMassIndex(double altezza,double peso) {
        this.altezza = altezza;
        this.peso = peso;
    }
    public void BMI( ) {
        double bmi = this.peso / (this.altezza * this.altezza);
        if (bmi < 18.5) {
            System.out.print("il tuo indice di massa muscolare è:");
            System.out.printf(" %.2f ", bmi);
            System.out.print("sei sottopeso");

        } else if (bmi >= 18.5 && bmi <= 25) {
            System.out.print("il tuo indice di massa muscolare è:");
            System.out.printf(" %.2f ", bmi);
            System.out.print("il tuo peso è ottimale");
        } else if (bmi > 25) {
            System.out.print("il tuo indice di massa muscolare è:");
            System.out.printf(" %.2f ", bmi);
            System.out.print("sei in sovrappeso");
        }
    }
        public static void main (String[] args)
        {
        BodyMassIndex b=new BodyMassIndex(1.67,80);
        b.BMI();
        }


    }