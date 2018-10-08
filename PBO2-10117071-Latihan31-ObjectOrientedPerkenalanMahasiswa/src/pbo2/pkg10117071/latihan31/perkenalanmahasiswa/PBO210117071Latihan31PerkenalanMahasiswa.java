/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan31.perkenalanmahasiswa;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi menampilkan perkenalan 
 * nim dan nama dan terhubung dengan class lain
 */
public class PBO210117071Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa Mhs = new Mahasiswa();
        Mhs.nim="10110269";
        Mhs.nama="Rizki Adam Kurniawan";
        Mhs.perkenalkanDiri(Mhs.nim, Mhs.nama);
        
        Mahasiswa Mhs1 = new Mahasiswa();
        Mhs1.nim="10110270";
        Mhs1.nama="Indra Tiola";
        Mhs1.perkenalkanDiri(Mhs1.nim, Mhs1.nama);
        
        Mahasiswa Mhs2 = new Mahasiswa();
        Mhs2.nim="10110271";
        Mhs2.nama="Robi Tanzil ganefi";
        Mhs2.perkenalkanDiri(Mhs2.nim, Mhs2.nama);
        
        Mahasiswa Mhs3 = new Mahasiswa();
        Mhs3.nim="10110271";
        Mhs3.nama="Muhammad Nur Awaludin";
        Mhs3.perkenalkanDiri(Mhs3.nim, Mhs3.nama);
    }
    
}
