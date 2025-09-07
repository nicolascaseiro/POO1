/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3.Exercicios;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */

//Exercício 5

import java.util.Scanner;

public class Multiplos2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número positivo (-1 para sair): ");
            numero = sc.nextInt();

            if (numero % 2 == 0 && numero % 3 == 0) {
                System.out.println("Múltiplo de 2 e 3 ao mesmo tempo.");
            } else {
                System.out.println("Não é múltiplo de 2 e 3 ao mesmo tempo.");
            }

        } while (numero != -1);

        sc.close();
    }
}
