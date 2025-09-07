/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5.Exercicios;

/**
 *
 * @author Nicolas Caseio de Abreu
 */

//Exercício 2b (continuação)

import java.util.Scanner;

public class Mesa {

    private String material;
    private int lugares;
    private float comprimento;
    private double preco;
    private boolean dobravel;
    private char forma;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDobravavel(boolean dobravel) {
        this.dobravel = dobravel;
    }

    public void setForma(char forma) {
        this.forma = forma;
    }

    public String getMaterial() {
        return material;
    }

    public int getLugares() {
        return lugares;
    }

    public float getComprimento() {
        return comprimento;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isDobravavel() {
        return dobravel;
    }

    public char getForma() {
        return forma;
    }

    public void entrada() {
        Scanner sc = new Scanner(System.in);
        setMaterial(sc.nextLine());
        setLugares(sc.nextInt());
        setComprimento(sc.nextFloat());
        setPreco(sc.nextDouble());
        setDobravavel(sc.nextBoolean());
        setForma(sc.next().charAt(0));
    }

    public void imprimir() {
        System.out.println(material + " " + lugares + " " + comprimento + " " + preco + " " + dobravel + " " + forma);
    }

    public void cadastrar(String material, int lugares, float comprimento) {
        setMaterial(material);
        setLugares(lugares);
        setComprimento(comprimento);
    }

    public void cadastrar(String material, double preco, boolean dobravel) {
        setMaterial(material);
        setPreco(preco);
        setDobravavel(dobravel);
    }

    public void cadastrar(String material, int lugares, float comprimento, double preco, boolean dobravel, char forma) {
        setMaterial(material);
        setLugares(lugares);
        setComprimento(comprimento);
        setPreco(preco);
        setDobravavel(dobravel);
        setForma(forma);
    }

    public Mesa() {
    }

    public Mesa(String material) {
        this.material = material;
    }

    public Mesa(String material, int lugares) {
        this.material = material;
        this.lugares = lugares;
    }

    public Mesa(String material, int lugares, float comprimento) {
        this(material, lugares);
        this.comprimento = comprimento;
    }

    public Mesa(String material, int lugares, float comprimento, double preco) {
        this(material, lugares, comprimento);
        this.preco = preco;
    }

    public Mesa(String material, int lugares, float comprimento, double preco, boolean dobravel) {
        this(material, lugares, comprimento, preco);
        this.dobravel = dobravel;
    }

    public Mesa(String material, int lugares, float comprimento, double preco, boolean dobravel, char forma) {
        this(material, lugares, comprimento, preco, dobravel);
        this.forma = forma;
    }

    public Mesa(int lugares, boolean dobravel) {
        this.lugares = lugares;
        this.dobravel = dobravel;
    }

    public Mesa(float comprimento, double preco) {
        this.comprimento = comprimento;
        this.preco = preco;
    }

    public Mesa(boolean dobravel, char forma) {
        this.dobravel = dobravel;
        this.forma = forma;
    }
}
