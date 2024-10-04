/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturaderepeticaofor;

/**
 *
 * @author renat
 */
public class EstruturadeRepeticaoFor {

    public static void main(String[] args) {
        //for(int cc = 0; cc <= 20; cc += 2){
        //    System.out.println("Cambalhota " + cc);
        //}
        
        for(int cc = 20; cc >= 2; cc -= 2){
            System.out.println("Cambalhota " + cc);
        }
        
        for(int i = 1; i <= 3; i++){
            for(int j = 0; j <= 2; j += 2){
            System.out.println(i +", "+ j);
        }
        }
    }
}
