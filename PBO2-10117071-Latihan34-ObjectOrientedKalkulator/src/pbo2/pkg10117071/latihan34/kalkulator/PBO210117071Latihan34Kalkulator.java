/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan34.kalkulator;

import java.util.Scanner;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi program perhitungan (kalkulator)
 */
public class PBO210117071Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        Scanner scn = new Scanner(System.in);
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        kalkulator.value1=scn.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kalkulator.value2=scn.nextDouble();
        System.out.println("");
        
        System.out.println("Hasil Pertambahan : "+kalkulator.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+kalkulator.kurangBilangan());
        System.out.println("Hasil Perkalian   : "+kalkulator.kaliBilangan());
        System.out.println("Hasil Pembagian   : "+kalkulator.bagiBilangan());
        System.out.println("Hasil Sisa        : "+kalkulator.sisaBilangan());
    }
    
}
