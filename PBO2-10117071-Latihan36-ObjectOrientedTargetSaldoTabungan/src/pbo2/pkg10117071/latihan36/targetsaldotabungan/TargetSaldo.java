/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan36.targetsaldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Destroy Eyes
 */
public class TargetSaldo {

    public int saldo;
    public int bulan;

    public void hitungSaldo(int parSaldo, int parBulan) {
        DecimalFormat decimal = (DecimalFormat) 
                DecimalFormat.getIntegerInstance();
        DecimalFormatSymbols format = new DecimalFormatSymbols();
        format.setGroupingSeparator('.');
        decimal.setDecimalFormatSymbols(format);

        while (saldo <= 6000000) {
            saldo = (int) (saldo + (saldo * 0.08));
            System.out.printf("Saldo di Bulan ke-" + bulan + " Rp %s %n", 
                    decimal.format(saldo));
            bulan = bulan + 1;
        }
    }

}
