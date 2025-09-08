/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5.Exercicios;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */

//Exercício 2b

public class AplicacaoPrincipal {

    public static void main(String[] args) {
        
        Cadeira c1 = new Cadeira();
        Cadeira c2 = new Cadeira("Madeira", 4);
        Cadeira c3 = new Cadeira("Plástico", 3);

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
       
        Mesa m1 = new Mesa();
        Mesa m2 = new Mesa ("Vidro", 2);
        Mesa m3 = new Mesa("Madeira", 4);

        m1.imprimir();
        m2.imprimir();
        m3.imprimir();

        Televisao t1 = new Televisao();
        Televisao t2 = new Televisao("Samsung", 55);
        Televisao t3 = new Televisao("LG", true);

        t1.imprimir();
        t2.imprimir();
        t3.imprimir();

        Geladeira g1 = new Geladeira();
        Geladeira g2 = new Geladeira("Brastemp", "Inox", (short) 300);
        Geladeira g3 = new Geladeira("Consul", "Branca", (short) 250, true, 1.2f, 'A');

        g1.imprimir();
        g2.imprimir();
        g3.imprimir();

        Carro ca1 = new Carro();
        Carro ca2 = new Carro("Ford", "Fiesta");
        Carro ca3 = new Carro("Volkswagen", "Golf", 2020, true, 95000.0, (byte) 4);

        ca1.imprimir();
        ca2.imprimir();
        ca3.imprimir();
    }
}
