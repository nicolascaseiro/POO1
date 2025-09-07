/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */
import java.util.Scanner;

public class Quadrilatero {
    private double largura;
    private double altura;
    private double profundidade;

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularVolume() {
        return calcularArea() * profundidade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quadrilatero q = new Quadrilatero();

        System.out.print("Digite a largura: ");
        q.setLargura(sc.nextDouble());

        System.out.print("Digite a altura: ");
        q.setAltura(sc.nextDouble());

        System.out.print("Digite a profundidade: ");
        q.setProfundidade(sc.nextDouble());

        System.out.println("Área: " + q.calcularArea());
        System.out.println("Volume: " + q.calcularVolume());

        sc.close();
    }
}
