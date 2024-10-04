/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testetipos;

/**
 *
 * @author renat
 */
public class TesteTipos {

    public static void main(String[] args) {
        
        // Convertendo valor int em string
        //int idade = 30;
        //String valor = Integer.toString(idade);
        //System.out.println(valor);
        
        
        //String valor = "30";
        //int idade = Integer.parseInt(valor);
        //System.out.println(valor);
        
        String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.println(idade);
        System.out.printf("%.2f", idade);
        
        
       
    }
}
