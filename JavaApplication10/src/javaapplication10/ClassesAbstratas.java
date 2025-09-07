/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author Nicolas Caseio de Abreu
 */
public class ClassesAbstratas {
    public static void main(String[] args) {
        Homem h1 = new Homem();
        Mulher m1 = new Mulher();
        Humano hu1 = new Homem(); // Humano referenciando Homem
        Humano hu2 = new Mulher(); // Humano referenciando Mulher

        System.out.println("Homem: " + h1.amamentar());
        System.out.println("Mulher: " + m1.amamentar());
        System.out.println("Humano(H): " + hu1.amamentar());
        System.out.println("Humano(M): " + hu2.amamentar());
    }
}
