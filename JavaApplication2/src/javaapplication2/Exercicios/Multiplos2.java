/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2.Exercicios;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */

//Exercício 5

import java.util.Scanner;

public class Multiplos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        if (n1 != -1) {
            if (n1 % 2 == 0 && n1 % 3 == 0) {
                System.out.println("Primeiro número: múltiplo de 2 e 3");
            } else {
                System.out.println("Primeiro número: não é múltiplo de 2 e 3");
            }
        }

        if (n2 != -1) {
            if (n2 % 2 == 0 && n2 % 3 == 0) {
                System.out.println("Segundo número: múltiplo de 2 e 3");
            } else {
                System.out.println("Segundo número: não é múltiplo de 2 e 3");
            }
        }
        
        sc.close();
    }
}
