/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan38.perhitunganlingkaran;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi program perhitungan  jari2,luas dan 
 * keliling lingkaran dengan diketahui diameternya yang telah diinput user.
 * dan program ini berisi validasi jika yang di inputkannya tidak sesuai dengan 
 * yang diinginkan
 */
public class PBO210117071Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        Scanner scanner = new Scanner(System.in);
        System.out.println("======Perhitungan Lingkaran======");
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            try {
                lingkaran.diameter = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Nilai Diameter Tidak Sesuai");
                scanner.nextLine();
            }
        } while (lingkaran.diameter == 0);

        System.out.println("");
        System.out.println("======Hasil Perhitungan Lingkaran======");
        lingkaran.jariJari(lingkaran.diameter);
        lingkaran.luasLingkaran();
        lingkaran.kelilingLingkaran(lingkaran.diameter);
    }
    
}
