/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiposprimitivos;

/**
 *
 * @author renat
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        String nome = "Renata";
        float nota = 8.5f;
        // Mostrar dados
        System.out.println("A nota é " + nota);
        System.out.printf("A nota da %s é %.2f \n", nome, nota);
        System.out.format("A nota da %s é %.4f \n", nome, nota);
    }
}
