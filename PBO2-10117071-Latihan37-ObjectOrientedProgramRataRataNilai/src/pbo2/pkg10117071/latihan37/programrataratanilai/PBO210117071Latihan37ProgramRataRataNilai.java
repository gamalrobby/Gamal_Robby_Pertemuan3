/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan37.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi menghitung rata-rata nilai yang 
 * inputan nilainya berasal dari user
 */
public class PBO210117071Latihan37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        Scanner scanner = new Scanner(System.in);
        nilai.bMhs = scanner.nextInt();
        
        nilai.nilaiMahasiswa(nilai.bMhs);
        nilai.hitungJumlahNilai(nilai.bMhs);
        nilai.hitungRataRata(nilai.bMhs, nilai.jmlh);
        
    }
    
}
