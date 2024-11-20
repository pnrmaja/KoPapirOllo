/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kopapirollo;

import java.util.Scanner;

/**
 *
 * @author Maja
 */
public class Adatbekeres {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /* a kérdés, amire a user válaszol: */
        System.out.print("egy egész számot kérek: ");
        /* a beírt adat -megfelelő ípusban való- eltárolása: */
        int szam = sc.nextInt();
        /* eredmény megjelenítése: */
        System.out.println("A bekért szám duplája: " + szam*2);
        
        /* az csak akkor kell, ha szám bekérése után szöveget kérünk be: */
        sc.nextLine();
        
        /* a kérdés, amire a user válaszol: */
        System.out.print("szöveges adatot kérek: ");
        /* a beírt adat -megfelelő ípusban való- eltárolása: */
        String szoveg = sc.nextLine();
        /* eredmény megjelenítése: */
        System.out.println("A bekért szöveg: " + szoveg);
    }
    
    public static String beker(String opciok){
        System.out.println("Szöveges adatot kérek ("+opciok+")");
        String szoveg = sc.nextLine();
        return szoveg;
    
    }
    
}

