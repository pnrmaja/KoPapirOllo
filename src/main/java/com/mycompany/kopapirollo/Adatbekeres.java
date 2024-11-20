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
    
    public static String beker(String opciok){
        System.out.println("Szöveges adatot kérek ("+opciok+")");
        String szoveg = sc.nextLine();
        return szoveg;
    
    }
    
}

