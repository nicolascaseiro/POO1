/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2.Exercicios;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */

//Exercício 4

import java.util.Scanner;

public class ParesEntreDoisValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        if (a < b) {
            int meio = a + 1;

            if (meio < b) {
                if (meio % 2 == 0) {
                    System.out.println(meio);
                } else {
                    System.out.println("Não há número par entre os dois.");
                }
            } else {
                System.out.println("Não há nenhum número entre os dois.");
            }
        } else {
            System.out.println("O primeiro número deve ser menor que o segundo.");
        }

        sc.close();
    }
}

