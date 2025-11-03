/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.latihanuklno1;

/**
 *
 * @author li0nfl
 */
import java.util.Scanner;

public class LatihanUklNo1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat paket(Kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak tempuh(Km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket(Cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket(Cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket(Cm): ");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;

        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        double biayaDasar = berat * biayaPerKg;

        double biayaVolume = 0;
        if (volume > 100) {
            biayaVolume = 50000;
        }

        double totalBiaya = biayaDasar + biayaVolume;

        System.out.println("Berat Paket      : " + berat + "Kg");
        System.out.println("Jarak Tempuh     : " + jarak + "Km");
        System.out.println("Volume Paket     : " + volume + "Cm³");
        System.out.println("Biaya PerKg      : Rp " + biayaPerKg);
        System.out.println("Biaya Volume     : Rp " + biayaVolume);
        System.out.println("-------------------------------------");
        System.out.println("Total Biaya      : Rp "+ totalBiaya);
        
    }
}
