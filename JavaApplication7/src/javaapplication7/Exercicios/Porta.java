/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7.Exercicios;

/**
 *
 * @author Nicolas Caseio de Abreu
 */
import java.util.Scanner;

public class Porta {

    double comprimento;
    double largura;
    boolean possuiVidro;

    public Porta() { }

    public Porta(double comprimento, double largura, boolean possuiVidro) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.possuiVidro = possuiVidro;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getLargura() {
        return largura;
    }

    public void setPossuiVidro(boolean possuiVidro) {
        this.possuiVidro = possuiVidro;
    }

    public boolean getPossuiVidro() {
        return possuiVidro;
    }

    public void cadastrar(double comprimento, double largura, boolean possuiVidro) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.possuiVidro = possuiVidro;
    }

    public void imprimir() {
        System.out.println("Comprimento: " + comprimento);
        System.out.println("Largura: " + largura);
        System.out.println("Possui Vidro: " + possuiVidro);
    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Comprimento: ");
        comprimento = sc.nextDouble();

        System.out.print("Largura: ");
        largura = sc.nextDouble();

        System.out.print("Possui vidro (true/false): ");
        possuiVidro = sc.nextBoolean();
    }
}
