/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturacondicionalswitch;

import java.util.Scanner;

/**
 *
 * @author renat
 */
public class EstruturaCondicionalSwitch {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String tipo;
        System.out.println("Quantas pernas:");
        int perna = t.nextInt();
        switch (perna) {
        case 1:
            tipo = "Saci";
            break;
        case 2:
            tipo = "Bípede";
            break;
        case 3:
            tipo = "Tripé";
            break;
        case 4:
            tipo = "Quadrúpede";
            break;
        case 6:
            tipo = "Aranha";
            break;
        default: 
            tipo = "Ete";
            break;  
    }
        System.out.println(tipo);
    }

    private static void Switch(int perna) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
