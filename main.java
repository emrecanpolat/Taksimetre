package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double perKM=2.20, toplamYol, tutar;
        int acilisUcret = 10;


        Scanner input = new Scanner(System.in);  // Create a Scanner object 1 kere tanımlamak yeterli
        System.out.print("Kaç km yol gittiniz:");
        toplamYol = input.nextInt();  // Read user input

        tutar = (perKM*toplamYol)+acilisUcret;
        if (tutar<20){
            tutar = 20;
        }else {
            tutar=tutar;
        }
        System.out.println(tutar);
        
    }
}
