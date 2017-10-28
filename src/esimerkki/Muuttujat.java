/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esimerkki;

/**
 *
 * @author s1600888
 */
public class Muuttujat {
    public static void main(String [] args){
        String sana;
        int luku;
        int summa;
        
        luku = 5;
        summa = luku+luku;
        System.out.println(summa);
        sana="auto bmw" +luku;
        System.out.println(sana);
        sana =" Opel on myös auto";
        System.out.println(sana + luku);
        sana += "? Toimiiko tämä";
        System.out.println(sana);
    }
}
