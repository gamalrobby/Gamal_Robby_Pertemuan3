/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan32.daftarfilm;

/**
 *
 * @author Destroy Eyes
 */
public class Film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void nowPlaying(String parFilmName,String parFilmGenre,double parFilmRating,
            int parFilmDuration){
        System.out.println("Judul Film\t:"+parFilmName);
        System.out.println("Genre Film\t:"+parFilmGenre);
        System.out.println("Rating Film\t:"+parFilmRating);
        System.out.println("Duration Film\t:"+parFilmDuration+" menit");
        System.out.println("");
    }
    
}
