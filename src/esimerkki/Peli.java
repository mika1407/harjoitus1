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
public class Peli {
    public static void main(String [] args){
        Scanner lukija = new Scanner(System.in);
        double luku;
        
        System.out.println("Anna seuraava luku.");
        luku = lukija.nextDouble();
        System.out.println("Lukusi oli "+luku+". Minun lukuni on "+(luku+1)+". Voitin niukasti!");
    }
}
