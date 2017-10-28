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
public class palkka {
    public static void main(String [] args){
        Scanner lukija = new Scanner(System.in);
        double palkka=0, tunnit=0, maksu=0;
        
        System.out.println("Anna tuntipalkkasi.");
        palkka = lukija.nextDouble();
        System.out.println("Anna työtunnit");
        tunnit = lukija.nextDouble();
        
        if(tunnit <=7){
            maksu = palkka*tunnit;
        }else if(tunnit <=9){
            maksu = (tunnit-7)*1.5+7*palkka;
        }else{
            maksu = (tunnit-9)*2*palkka+(1.5*2*palkka)+7*palkka;
        }
        System.out.println("Saat palkkaa "+maksu+"€.");
    }
}
