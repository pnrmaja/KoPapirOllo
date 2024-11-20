/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kopapirollo;

/**
 *
 * @author Maja
 */
public class KoPapirOllo {

    public static void main(String[] args) {
       String valasztas = Adatbekeres.beker("ko/papir/ollo/kilepes");
       System.out.println("Válaszod: " + valasztas);
       boolean helyesE=helyesValasztas(valasztas);
       System.out.println( helyesE);
     
    }
    public static boolean helyesValasztas(String valasztas){
        return "ko".equals(valasztas) || "papir".equals(valasztas) || "ollo".equals(valasztas) || "kilepes".equals(valasztas);
    }
}
