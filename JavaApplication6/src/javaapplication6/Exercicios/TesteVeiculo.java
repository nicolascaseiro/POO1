/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6.Exercicios;

/**
 *
 * @author Nicolas Caseio de Abreu
 */
public class TesteVeiculo {

    public static void main(String[] args) {
        Navio navio1 = new Navio();
        navio1.cadastrar("Cruzeiro do Neymar", 50000, 2200, 900, 5000000.0, "1912-04-10");
        Navio navio2 = new Navio("Barquinho");
        Navio navio3 = new Navio("Titanic", 30000, 2700);

        Aviao aviao1 = new Aviao();
        aviao1.cadastrar("PR-GOL", 15000, 180, 750000.0, "2023-05-10");
        Aviao aviao2 = new Aviao("PT-BRA");
        Aviao aviao3 = new Aviao("PR-XYZ", 20000, 220, 900000.0, "2024-01-15");

        navio1.imprimir();
        System.out.println("Passageiros por tripulante: " + navio1.passageirosPorTripulantes());

        System.out.println("\n---\n");

        navio2.imprimir();
        System.out.println("\n---\n");

        navio3.imprimir();
        System.out.println("\n---\n");

        aviao1.imprimir();
        aviao1.reajustarPreco(10);
        System.out.println("Preço reajustado em 10%: " + aviao1.getPreco());

        System.out.println("\n---\n");

        aviao2.imprimir();
        System.out.println("\n---\n");

        aviao3.imprimir();
    }
}
