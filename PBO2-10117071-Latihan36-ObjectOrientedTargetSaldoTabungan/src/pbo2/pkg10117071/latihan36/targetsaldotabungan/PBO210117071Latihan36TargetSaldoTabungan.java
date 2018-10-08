/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan36.targetsaldotabungan;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi perhitungan lama tabungan sampai
 * mencapai saldo target
 */
public class PBO210117071Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TargetSaldo target = new TargetSaldo();
        target.saldo=3500000;
        target.bulan=1;
        target.hitungSaldo(target.saldo, target.bulan);
    }
    
}
