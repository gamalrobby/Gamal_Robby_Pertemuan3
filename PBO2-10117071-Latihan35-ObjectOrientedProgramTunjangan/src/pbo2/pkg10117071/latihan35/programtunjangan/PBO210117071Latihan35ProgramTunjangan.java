/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi program perhitungan total gaji
 * setelah ditambah dengan tunjangan
 */
public class PBO210117071Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("==========Program Tunjangan==========");
        
        Gaji hitung = new Gaji();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Berapa gaji pokok anda perbulan? : Rp. ");
        hitung.gajiPokok = scanner.nextInt();
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Status anda? (menikah/belum)     : ");
        hitung.status = scn.nextLine();
        
        System.out.println("==========Hasil Perhitungan Gaji Anda==========");
        
        hitung.hitungTunjanganPegawai(hitung.gajiPokok,hitung.status,0,0);
       
        System.out.println("(Developed by : A Gamal Robby Abdulkarim)");
    }
    
}
