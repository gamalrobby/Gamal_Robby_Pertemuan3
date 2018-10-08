/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan40.warnakepribadian;

import static pbo2.pkg10117071.latihan40.warnakepribadian.Warna.BLUE;
import static pbo2.pkg10117071.latihan40.warnakepribadian.Warna.GREEN;
import static pbo2.pkg10117071.latihan40.warnakepribadian.Warna.MAGENTA;
import static pbo2.pkg10117071.latihan40.warnakepribadian.Warna.RED;
import static pbo2.pkg10117071.latihan40.warnakepribadian.Warna.YELLOW;

/**
 *
 * @author Destroy Eyes
 */
public class Kepribadian {
    Warna warna = new Warna();
    public void sifat(String pWarna,String nama){
    System.out.println("");
        System.out.println("===HASIL TEST KEPRIBADIAN "+nama.toUpperCase()+"===");
        if (pWarna.equalsIgnoreCase("biru")){
            System.out.println("Warna Favoritmu adalah "
                    +BLUE+pWarna.toUpperCase());
            System.out.println("1. Menyenangkan, \n"+"2. Bijaksana,\n"
                    +"3. Pembawaan diri tenang saat menghadapi masalah, \n"
                    +"4. Dinamis, \n"+"5. Senang berbagi, \n"+"6. Bersahabat,\n"
                    +"7. Tidak terlalu suka menjadi sorotan banyak orang, \n"
                    +"8. Menyembunyikan perasaan karena karakternya yang "
                    + "cenderung mencari jalan damai. \n");
        } else if (pWarna.equalsIgnoreCase("merah")){
            System.out.println("Warna Favoritmu adalah "
                    +RED+pWarna.toUpperCase());
            System.out.println("1. Periang, \n"+"2. Pemberani,\n"
                    +"3. Berani mengambil resiko dalam setiap langkah, \n"
                    +"4. Menyukai tantangan, \n"+"5. Kurang sabar, \n"
                    +"6. Dapat menahan marah namun jika sudah tahap puncak "
                    + "toleransi,kemarahannya akan sulit dikontrol,\n"
                    +"7. Memiliki energi kehangatan dan cinta. \n");
        } else if (pWarna.equalsIgnoreCase("kuning")){
            System.out.println("Warna Favoritmu adalah "
                    +YELLOW+pWarna.toUpperCase());
            System.out.println("1. Optimis, \n"+"2. Suka bergaul,\n"
                    +"3. Periang, \n"+"4. Senang menolong, \n"
                    +"5. Lincah dan aktif, \n"+"6. Tidak suka meremehkan "
                    + "kekurangan orang lain,\n"+"7. Loyal, \n"
                    +"8. Hangat, \n"+"9. Meskipun karakternya optimis dan "
                    + "idealis, seringkali goyah dan tidak stabil, \n"
                    +"10. Cenderung penakut.");
        } else if (pWarna.equalsIgnoreCase("ungu")){
            System.out.println("Warna Favoritmu adalah "
                    +MAGENTA+pWarna.toUpperCase());
            System.out.println("1. Optimis, \n"+"2. Tidak pernah ragu,\n"
                    +"3. Menurutnya pasangan yang ideal adalah yang memiliki "
                    +"mental yang kuat, \n"+"4. Memiliki ambisi yang besar,\n"
                    +"5. Memiliki empati yang besar, \n"+"6. Memiliki sisi "
                    + "misterius sebab seringkali menutupi perasaannya,\n"
                    +"7. Terkadang bersikap keras kepala dan angkuh, \n");
        } else if (pWarna.equalsIgnoreCase("hijau")){
            System.out.println("Warna Favoritmu adalah "
                    +GREEN+pWarna.toUpperCase());
            System.out.println("1. Romantis, \n"+"2. Menyukai hal yang berbau "
                    + "alami dan keindahan,\n"+"3. Teguh pada prinsip, \n"
                    +"4. Menginginkan kesempurnaan, \n"+"5. Mudah cemburu, \n"
                    +"6. Mudah merasa iri,\n"+"7. Menjunjung tinggi suatu nilai "
                    + "toleransi dan kepercayaan, \n");
        } else {
            System.out.println("Ooops. Belum Teridentifikasi");
        }
    }
}
