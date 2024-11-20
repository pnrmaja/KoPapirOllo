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
        jatek();
     
    }
    public static boolean helyesValasztas(String valasztas){
        return "ko".equals(valasztas) || "papir".equals(valasztas) || "ollo".equals(valasztas) || "kilepes".equals(valasztas);
    }
    public static String dontes(String jatekos, String gep){
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
    public static void jatek(){
        String valasztas =Adatbekeres.beker("ko/papir/ollo/kilepes");
        
        while (!helyesValasztas(valasztas)) {
            System.out.println("Hibás bemenet! Adj meg újat");
            valasztas =Adatbekeres.beker("ko/papir/ollo/kilepes");  
        }
        String dontes = dontes(valasztas,"ko");
        System.out.println(dontes);
        
    
    }
}
