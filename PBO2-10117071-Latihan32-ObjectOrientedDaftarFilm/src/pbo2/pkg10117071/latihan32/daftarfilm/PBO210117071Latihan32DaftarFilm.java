/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan32.daftarfilm;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : program ini berisi menampilkan daftar film sedang tayang
 * dan terhubung dengan class lain.
 */
public class PBO210117071Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("====DAFTAR FILM SEDANG TAYANG====\n");
        Film film = new Film();
        film.filmName="Venom";
        film.filmGenre="Action, Horror, Scifi";
        film.filmRating=8.5;
        film.filmDuration=120;
        film.nowPlaying(film.filmName, film.filmGenre, film.filmRating, film.filmDuration);
        
        Film film1 = new Film();
        film1.filmName="Small Foot";
        film1.filmGenre="Animation";
        film1.filmRating=9.0;
        film1.filmDuration=96;
        film.nowPlaying(film1.filmName, film1.filmGenre, film1.filmRating, film1.filmDuration);
        
        Film film2 = new Film();
        film2.filmName="Crazy Rich Asian";
        film2.filmGenre="Comedy";
        film2.filmRating=7.8;
        film2.filmDuration=119;
        film.nowPlaying(film2.filmName, film2.filmGenre, film2.filmRating, film2.filmDuration);
        
        Film film3 = new Film();
        film3.filmName="Asih";
        film3.filmGenre="Horror";
        film3.filmRating=6.0;
        film3.filmDuration=100;
        film.nowPlaying(film3.filmName, film3.filmGenre, film3.filmRating, film3.filmDuration);
        
    }
    
}
