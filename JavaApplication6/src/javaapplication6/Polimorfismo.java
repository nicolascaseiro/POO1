/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author Nicolas Caseio de Abreu
 */
public class Polimorfismo {

    public static void main(String[] args) {
        double alt = 5.0;
        double lado = 6.0;

        Quadrado q1 = new Quadrado();
        Quadrado q2 = new Quadrado(4.0);
        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo(3.0, 3.0);

        q1.setBase(lado);
        r1.setBase(lado);
        r1.setAltura(alt);

        System.out.println("Q1 - Base = " + q1.getBase());
        System.out.println("Q2 - Base = " + q2.getBase());
        System.out.println("R1 - Base = " + r1.getBase());
        System.out.println("R2 - Base = " + r2.getBase());

        System.out.println("\n\n");
    }
}
