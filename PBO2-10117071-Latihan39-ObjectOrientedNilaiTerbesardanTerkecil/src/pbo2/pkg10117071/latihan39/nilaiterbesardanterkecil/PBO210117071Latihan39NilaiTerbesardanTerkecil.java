/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi mencari nilai terbesar dan terkecil
 * dari nilai yang diinputkan user
 */
public class PBO210117071Latihan39NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nilai nl = new Nilai();
        Scanner scn = new Scanner(System.in);
        System.out.println("==Program Nilai Terbesar dan Terkecil Mahasiswa==");
        System.out.print("Masukkan Nama Petugas : ");
        nl.namaPetugas = scn.nextLine();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        nl.bNilai = scn.nextInt();

        nl.nilaiMahasiswa(nl.bNilai);

        System.out.println("");
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        nl.nilaiBesarKecil(nl.bNilai);
        System.out.println("\nPetugas : " + nl.namaPetugas);
    }

}
