/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esimerkki;

import java.util.Scanner;

/**
 *
 * @author s1600888
 */
public class bensa {
    
        public static void main(String[] args){

        Scanner lukija = new Scanner(System.in);

        double litrahinta;

        double rahaa;

        System.out.println("Paljonko rahaa sinulla on käytössäsi?"); 

        rahaa = lukija.nextDouble();

        System.out.println("Paljonko bensa maksaa litralta?"); 

        litrahinta = lukija.nextDouble();

        System.out.println(" Saat rahoillasi "+(rahaa/litrahinta)+" litraa!");

        }
    
}
