/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author Nicolas Caseio de Abreu
 */
public class TesteClasse {

    public static void main(String[] args) {
        
        System.out.println("Total de 10 dias: R$ " + Classe.calculaTotal(10));
        System.out.println("Total de 20 dias: R$ " + Classe.calculaTotal(20));

        System.out.println("INSS de R$ 500,00: R$ " + Classe.calculaINSS(500.00));
        System.out.println("INSS de R$ 1000,00: R$ " + Classe.calculaINSS(1000.00));
        System.out.println("INSS de R$ 1500,00: R$ " + Classe.calculaINSS(1500.00));
        System.out.println("INSS de R$ 2500,00: R$ " + Classe.calculaINSS(2500.00));

        System.out.println("É 10 par? " + Classe.ePar(10));
        System.out.println("É 15 par? " + Classe.ePar(15));

        System.out.println("10 é divisível por 2? " + Classe.eDivisivel(10, 2));
        System.out.println("10 é divisível por 3? " + Classe.eDivisivel(10, 3));

        System.out.println("Fatorial de 5: " + Classe.fatorial(5));
        System.out.println("Fatorial de 7: " + Classe.fatorial(7));

        System.out.println("Total para 3 unidades do produto 1: R$ " + Classe.precoTotal(1, 3));
        System.out.println("Total para 5 unidades do produto 2: R$ " + Classe.precoTotal(2, 5));
        System.out.println("Total para 2 unidades do produto 3: R$ " + Classe.precoTotal(3, 2));
    }
}
