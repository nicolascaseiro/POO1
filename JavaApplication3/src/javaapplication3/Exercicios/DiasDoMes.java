/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3.Exercicios;

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

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 dias");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 dias");
                break;
            case 2:
                System.out.println("28 dias");
                break;
            default:
                System.out.println("Mês inválido");
        }

        sc.close();
    }
}
