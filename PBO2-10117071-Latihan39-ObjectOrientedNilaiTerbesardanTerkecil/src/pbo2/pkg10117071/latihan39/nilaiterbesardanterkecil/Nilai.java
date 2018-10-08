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
 */
public class Nilai {
    public String namaPetugas;
    public int bNilai,nilai[],j=1,i=1;
    public int min,max;
    
    public void nilaiMahasiswa(int bNilai){
        Scanner scn = new Scanner(System.in);
        nilai = new int[bNilai];
        while(i <= bNilai){
        System.out.print("Masukkan Nilai Mahasiswa ke-"+i+" = ");
        nilai[i-1] = scn.nextInt();
        i = i+1;
        }
    }
    public void nilaiBesarKecil(int bNilai){
        while (j <= bNilai){
            System.out.println("Nilai Mahasiswa ke-"+j+" = "+nilai[j-1]);
            j = j+1;
        }
        min=nilai[0];
        max=nilai[0];
        for (i=0; i < bNilai; i++){
            if(nilai[i] > max){
                max = nilai[i];   
            }
            else if(nilai[i] < min){
                min = nilai[i];    
            }    
        }
        System.out.println("");
        System.out.println("Nilai Terbesar adalah "+max);
        System.out.println("Nilai Terkecil adalah "+min);
        
    }
}
