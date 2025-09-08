/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4.Exercicios;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */

//Exercício 1.4 (continuação)

import java.util.Scanner;

public class AppPenDrive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PenDrive p = new PenDrive();

        System.out.print("Marca: ");
        p.setMarca(sc.nextLine());

        System.out.print("Capacidade (GB): ");
        p.setCapacidade(sc.nextInt());

        System.out.print("Comprimento (cm): ");
        p.setComprimento(sc.nextDouble());

        System.out.print("Largura (cm): ");
        p.setLargura(sc.nextDouble());

        System.out.print("Profundidade (cm): ");
        p.setProfundidade(sc.nextDouble());

        System.out.print("Peso (g): ");
        p.setPeso(sc.nextDouble());

        System.out.print("Preço (R$): ");
        p.setPreco(sc.nextDouble());

        System.out.println("\nDados do PenDrive:");
        System.out.println("Marca: " + p.getMarca());
        System.out.println("Capacidade: " + p.getCapacidade() + " GB");
        System.out.println("Comprimento: " + p.getComprimento() + " cm");
        System.out.println("Largura: " + p.getLargura() + " cm");
        System.out.println("Profundidade: " + p.getProfundidade() + " cm");
        System.out.println("Peso: " + p.getPeso() + " g");
        System.out.println("Preço: R$ " + String.format("%.2f", p.getPreco()));

        sc.close();
    }
}
