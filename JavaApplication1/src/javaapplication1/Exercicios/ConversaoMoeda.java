/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Exercicios;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */

//Exercício 4

import java.util.Scanner;

public class ConversaoMoeda {

    private double precoReais;
    private double taxaCambio;

    public void setPrecoReais(double precoReais) {
        this.precoReais = precoReais;
    }

    public void setTaxaCambio(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    public double getPrecoReais() {
        return precoReais;
    }

    public double getTaxaCambio() {
        return taxaCambio;
    }

    public double converterParaDolar() {
        return precoReais * taxaCambio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConversaoMoeda c = new ConversaoMoeda();

        System.out.print("Preço em reais: ");
        c.setPrecoReais(sc.nextDouble());

        System.out.print("Taxa de conversão para dólar: ");
        c.setTaxaCambio(sc.nextDouble());

        System.out.println("Valor em dólares: " + String.format("%.2f", c.converterParaDolar()));

        sc.close();
    }
}
