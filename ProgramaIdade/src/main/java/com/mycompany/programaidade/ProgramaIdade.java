/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programaidade;

import java.util.Scanner;
/**
 *
 * @author renat
 */
public class ProgramaIdade {

    public static void main(String[] args) {
       
        Scanner t = new Scanner(System.in);
        System.out.println("Em que ano vc nasceu? ");
        int nasc = t.nextInt();
        int i = 2024 - nasc;
        
        if(i > 18){
            System.out.println("Você tem " + i +" anos, \nMaior de Idade!");
        } else{
            System.out.println("Você tem " + i +" aNOS, \nMenor de Idade!");
        }
        t.close();
    }
}
