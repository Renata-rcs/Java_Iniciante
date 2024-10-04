/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programamedia;

import java.util.Scanner;

public class ProgramaMedia {

    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite sua primeira nota: ");
        float n1 = teclado.nextFloat();
        
        System.out.print("Digite sua segunda nota: ");
        float n2 = teclado.nextFloat();
        
        float m = (n1 + n2) / 2;
        System.out.print("Sua média é: " + m);
        
        if (m > 9) {
            System.out.println("Parabéns"); 
        }

        teclado.close(); // Fechando o Scanner
    }
}

