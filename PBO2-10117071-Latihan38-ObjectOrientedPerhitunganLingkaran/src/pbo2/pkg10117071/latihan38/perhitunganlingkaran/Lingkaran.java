/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan38.perhitunganlingkaran;

import java.text.DecimalFormat;

/**
 *
 * @author Destroy Eyes
 */
public class Lingkaran {
    public double diameter = 0;
    public double jari, luas, keliling;
    public double phi = 3.14159265358979323846;
    
    DecimalFormat dc = new DecimalFormat("#.##");
    public void jariJari(double diameter){
        jari = (diameter / 2);
        System.out.printf("Jari-jari Lingkaran\t= %s%n", dc.format(jari) + " cm");
    }
    public void luasLingkaran(){
        luas = (float) phi * (jari * jari);
        System.out.printf("Luas Lingkaran\t\t= %s%n", dc.format(luas) + " cm");
    }
    public void kelilingLingkaran(double diameter){
        keliling = (phi * diameter);
        System.out.printf("Keliling Lingkaran\t= %s%n", dc.format(keliling) + " cm");
    }    
        
}
