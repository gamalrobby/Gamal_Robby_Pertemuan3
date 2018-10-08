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
 */
public class Nilai {
    public int i=1,nMhs[],bMhs;
    public double jmlh,rata;
    
    public void nilaiMahasiswa(int parBmhs){
        nMhs = new int[bMhs];
        while(i <= bMhs){
        System.out.print("Nilai Mahasiswa ke-"+ i +" : ");
        Scanner scanner = new Scanner(System.in);
        nMhs[i-1] = scanner.nextInt();
        i = i+1;
        }
    }
    public void hitungJumlahNilai(int parBMhs){
        i=1;
        while (i <= parBMhs){
            jmlh = jmlh + nMhs[i-1];
            i = i+1;
        }
    }
    public void hitungRataRata(int parBMhs,double parJmlh){
        rata = parJmlh / parBMhs;
        System.out.println("");
        System.out.println("Maka,Rata-Rata Nilainya adalah "+rata);
        System.out.println("");
        System.out.println("Developed by : A Gamal Robby Abdulkarim");
    }
}
