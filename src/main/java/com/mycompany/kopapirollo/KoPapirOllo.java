/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kopapirollo;

import java.util.Random;

/**
 *
 * @author Maja
 */
public class KoPapirOllo {

    public static void main(String[] args) {
        jatek();
    }
    
    public static void jatek(){
        String valasztas = Adatbekeres.beker("ko/papir/ollo");
        
        while (!helyesValasztas(valasztas)) {
            System.out.println("Hibás bemenet! Adj meg újat");
            valasztas =Adatbekeres.beker("ko/papir/ollo");  
        }
        String gepValasztas = gepValaszt();
        System.out.println("A gep valasztasa: " + gepValasztas);

        String dontes = dontes(valasztas, gepValasztas);
        System.out.println(dontes);
    }
    
    private static boolean helyesValasztas(String valasztas){
        return "ko".equals(valasztas) || "papir".equals(valasztas) || "ollo".equals(valasztas);
    }
    
    private static String dontes(String jatekos, String gep){
        if (jatekos.equals(gep)){
            return "Dontetlen";
        }
        if (    ("ko".equals(jatekos) && "papir".equals(gep) ) ||
                ("papir".equals(jatekos) && "ollo".equals(gep)) ||
                ("ollo".equals(jatekos) && "ko".equals(gep))){
            return "A gep nyert!";
        }
        return "A jatekos nyert!:)";
    }

    private static String gepValaszt(){
        Random random = new Random();
        int randomSzam = random.nextInt(3);
        if (randomSzam == 0){
            return "ko";
        }
        if (randomSzam == 1){
            return "papir";
        }  
        return "ollo";
    }
}
