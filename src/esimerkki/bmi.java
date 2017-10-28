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
public class bmi {
    
    public static void main(String[] args){

        Scanner lukija = new Scanner(System.in);

        double pituus;

        double paino;

        

        System.out.println("Syötä pituus metreinä :");

        pituus = lukija.nextDouble();

        System.out.println("Syötä paino kilogrammoina :");

        paino = lukija.nextDouble();

        System.out.println("Painoindeksi on :"+(paino/(pituus*pituus)));

    }

    
}
