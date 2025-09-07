/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2.Exercicios;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */

//Exercício 3

import java.util.Scanner;

public class DiasDoMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número do mês (1 a 12): ");
        int mes = sc.nextInt();

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            System.out.println("31 dias");
        } else {
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                System.out.println("30 dias");
            } else {
                if (mes == 2) {
                    System.out.println("28 dias");
                } else {
                    System.out.println("Mês inválido");
                }
            }
        }

        sc.close();
    }
}
