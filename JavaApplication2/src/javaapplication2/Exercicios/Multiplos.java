/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2.Exercicios;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */

//Exercício 1

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero % 3 == 0 && numero % 4 == 0) {
            System.out.println("É múltiplo de 3 e 4 ao mesmo tempo.");
        } else {
            if (numero % 3 == 0) {
                System.out.println("É múltiplo apenas de 3.");
            } else {
                if (numero % 4 == 0) {
                    System.out.println("É múltiplo apenas de 4.");
                } else {
                    System.out.println("Não é múltiplo de 3 nem de 4.");
                }
            }
        }

        sc.close();
    }
}
