/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan35.programtunjangan;

/**
 *
 * @author Destroy Eyes
 */
public class Gaji {
    public int gajiPokok; 
    public String status;
    
    public void hitungTunjanganPegawai(int parGajiPokok, String parStatus,
            double parTunjangan, double parTGaji){
        
        parTunjangan = (parStatus.equalsIgnoreCase("menikah"))? parGajiPokok 
                * 0.35 :0;
        
        parTGaji = parTunjangan+parGajiPokok; 
        System.out.println("Gaji Pokok\t : " + parGajiPokok);
        System.out.println("Tunjangan\t : "+parTunjangan);
        System.out.println("Total Gaji\t : "+parTGaji);
    }
}
