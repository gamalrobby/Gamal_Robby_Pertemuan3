/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan33.userlogin;

/**
 *
 * @author Destroy Eyes
 */
public class User {
    private final String username = "RizkiAdam";
    private final String password = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName,String parPassword){
        statusAkun = false;
        if (parUserName.equals(username) && parPassword.equals(password)){
            statusAkun = true;
        }
        return statusAkun;
    }
    private void hasilLogin(boolean status, String parUserName){
        status=this.statusAkun;
        System.out.println("");
       if (true==status){
            System.out.println("******HALO "+parUserName.toUpperCase()+"******");
            System.out.println("Selamat datang di Aplikasi ini");
        } else {
            System.out.println("Ooops, Username atau Password Anda Salah");
        }
    }
    public void pengecekkanLogin(String parUserName,String parPassword){
        this.cekAkun(parUserName, parPassword);
        this.hasilLogin(statusAkun, parUserName);
    }
    
}
