/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi program login
 */
public class Latihan33Login {
    private String usName;
    private String passWord;

    public static void main(String[] args) {
        Latihan33Login login = new Latihan33Login();
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan Username : ");
        login.usName = scn.nextLine();
        
        System.out.print("Masukkan password : ");
        login.passWord = scn.nextLine();
        
        User us = new User();
        us.pengecekkanLogin(login.usName, login.passWord);
    }
    
}
