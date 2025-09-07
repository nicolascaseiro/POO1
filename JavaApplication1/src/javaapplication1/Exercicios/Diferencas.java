/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Exercicios;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */

//Exercício 3

import java.util.Scanner;

public class Diferencas {

    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int quadradoDiferenca() {
        int dif = num1 - num2;
        return dif * dif;
    }

    public int diferencaQuadrados() {
        return (num1 * num1) - (num2 * num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Diferencas d = new Diferencas();

        System.out.print("Digite o primeiro número inteiro: ");
        d.setNum1(sc.nextInt());

        System.out.print("Digite o segundo número inteiro: ");
        d.setNum2(sc.nextInt());

        System.out.println("Quadrado da diferença: " + d.quadradoDiferenca());
        System.out.println("Diferença dos quadrados: " + d.diferencaQuadrados());

        sc.close();
    }
}
