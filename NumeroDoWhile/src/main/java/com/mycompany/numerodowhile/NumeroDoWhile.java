/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerodowhile;

import java.util.Scanner;

/**
 *
 * @author renat
 */
import java.util.Scanner;

public class NumeroDoWhile {

    public static void main(String[] args) {
        int n, s = 0;
        String resp;
        Scanner teclado = new Scanner(System.in); 

        do {
            System.out.println("Digite um número: ");
            n = teclado.nextInt();
            s += n; // s = s + n
            System.out.println("Quer continuar? [s/n]");
            resp = teclado.next();
        } while (resp.equals("s")); 

        System.out.println("A soma de todos os valores é " + s);
        teclado.close(); 
    }
}

