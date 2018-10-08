/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan40.warnakepribadian;

import java.util.Scanner;
import static pbo2.pkg10117071.latihan40.warnakepribadian.Warna.BLUE;
import static pbo2.pkg10117071.latihan40.warnakepribadian.Warna.B_BLUE;
import static pbo2.pkg10117071.latihan40.warnakepribadian.Warna.B_GREEN;
import static pbo2.pkg10117071.latihan40.warnakepribadian.Warna.B_MAGENTA;
import static pbo2.pkg10117071.latihan40.warnakepribadian.Warna.B_RED;
import static pbo2.pkg10117071.latihan40.warnakepribadian.Warna.B_YELLOW;
import static pbo2.pkg10117071.latihan40.warnakepribadian.Warna.CYAN;
import static pbo2.pkg10117071.latihan40.warnakepribadian.Warna.GREEN;
import static pbo2.pkg10117071.latihan40.warnakepribadian.Warna.MAGENTA;
import static pbo2.pkg10117071.latihan40.warnakepribadian.Warna.NORMAL;
import static pbo2.pkg10117071.latihan40.warnakepribadian.Warna.RED;
import static pbo2.pkg10117071.latihan40.warnakepribadian.Warna.WHITE;
import static pbo2.pkg10117071.latihan40.warnakepribadian.Warna.YELLOW;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi program melihat kepribadian seseorang
 * dari warna yang dipilih
 */
public class PBO210117071Latihan40WarnaKepribadian {

    public static void main(String[] args) {
        Warna warna = new Warna();
        Kepribadian kepribadian = new Kepribadian();
        Scanner scn = new Scanner(System.in);
        
        System.out.println(RED + "YUK " + GREEN + "CEK " + YELLOW 
                + "KEPRIBADIANMU " + CYAN + "DARI " + MAGENTA + "WARNA " 
                + BLUE + "FAVORITMU" + NORMAL + "\n");
        
        System.out.println(WHITE+B_RED+"\t MERAH \t\t \n" 
                +B_GREEN+"\t HIJAU \t\t \n" 
                +B_YELLOW+"\t KUNING \t \n" 
                +B_BLUE+"\t BIRU \t\t \n" 
                +B_MAGENTA+"\t UNGU \t\t \n" + NORMAL);
        
        System.out.print("PILIH WARNA FAVORITMU : ");
        warna.pWarna = scn.nextLine();
        System.out.print("NAMA KAMU : ");
        warna.nama = scn.nextLine();
        
        kepribadian.sifat(warna.pWarna, warna.nama);
       
    }
    
}
