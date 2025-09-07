/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2.Exercicios;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */

//Exercício 2

import java.util.Scanner;

public class Jogador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do jogador: ");
        int idade = sc.nextInt();

        if (idade <= 10) {
            System.out.println("Categoria: Mirim");
        } else {
            if (idade <= 18) {
                System.out.println("Categoria: Juvenil");
            } else {
                if (idade <= 40) {
                    System.out.println("Categoria: Adulto");
                } else {
                    System.out.println("Categoria: Master");
                }
            }
        }

        sc.close();
    }
}
