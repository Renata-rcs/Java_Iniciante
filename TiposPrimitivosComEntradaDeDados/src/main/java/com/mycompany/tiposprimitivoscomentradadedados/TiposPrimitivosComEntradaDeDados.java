 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiposprimitivoscomentradadedados;
import java.util.Scanner;
/**
 *
 * @author renat
 */
public class TiposPrimitivosComEntradaDeDados {

    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota da %s é %.2f \n", nome, nota);
    }
}
