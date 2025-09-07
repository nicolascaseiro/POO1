/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Exercicios;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */

//Exercício 2

import java.util.Scanner;

public class LataOleo {
    private double raio;
    private double altura;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularVolume() {
        return 3.14159 * raio * raio * altura;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LataOleo lata = new LataOleo();

        System.out.print("Raio da lata: ");
        lata.setRaio(sc.nextDouble());

        System.out.print("Altura da lata: ");
        lata.setAltura(sc.nextDouble());

        System.out.println("Volume: " + lata.calcularVolume());

        sc.close();
    }
}
