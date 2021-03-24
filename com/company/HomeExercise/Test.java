package com.company.HomeExercise;
import java.util.Scanner;
public class Test {
    public static void main (String[] args)
    {
        Scanner scr=new Scanner(System.in);
        System.out.print("Insert name:  ");
        String name=scr.nextLine();
        System.out.print(name);
        scr.close();
    }
}
