/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5.Exercicios;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */

//Exercício 2b (continuação)

import java.util.Scanner;

public class Televisao {

    private String marca;
    private String modelo;
    private int polegadas;
    private boolean smart;
    private double preco;
    private char classificacao;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setClassificacao(char classificacao) {
        this.classificacao = classificacao;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPolegadas() {
        return polegadas;
    }

    public boolean isSmart() {
        return smart;
    }

    public double getPreco() {
        return preco;
    }

    public char getClassificacao() {
        return classificacao;
    }

    public void entrada() {
        Scanner sc = new Scanner(System.in);
        setMarca(sc.nextLine());
        setModelo(sc.nextLine());
        setPolegadas(sc.nextInt());
        setSmart(sc.nextBoolean());
        setPreco(sc.nextDouble());
        setClassificacao(sc.next().charAt(0));
    }

    public void imprimir() {
        System.out.println(marca + " " + modelo + " " + polegadas + " " + smart + " " + preco + " " + classificacao);
    }

    public void cadastrar(String marca, String modelo, int polegadas) {
        setMarca(marca);
        setModelo(modelo);
        setPolegadas(polegadas);
    }

    public void cadastrar(String marca, boolean smart, double preco) {
        setMarca(marca);
        setSmart(smart);
        setPreco(preco);
    }

    public void cadastrar(String marca, String modelo, int polegadas, boolean smart, double preco, char classificacao) {
        setMarca(marca);
        setModelo(modelo);
        setPolegadas(polegadas);
        setSmart(smart);
        setPreco(preco);
        setClassificacao(classificacao);
    }

    public Televisao() {
    }

    public Televisao(String marca) {
        this.marca = marca;
    }

    public Televisao(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Televisao(String marca, String modelo, int polegadas) {
        this(marca, modelo);
        this.polegadas = polegadas;
    }

    public Televisao(String marca, String modelo, int polegadas, boolean smart) {
        this(marca, modelo, polegadas);
        this.smart = smart;
    }

    public Televisao(String marca, String modelo, int polegadas, boolean smart, double preco) {
        this(marca, modelo, polegadas, smart);
        this.preco = preco;
    }

    public Televisao(String marca, String modelo, int polegadas, boolean smart, double preco, char classificacao) {
        this(marca, modelo, polegadas, smart, preco);
        this.classificacao = classificacao;
    }

    public Televisao(String marca, boolean smart) {
        this.marca = marca;
        this.smart = smart;
    }

    public Televisao(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    public Televisao(boolean smart, char classificacao) {
        this.smart = smart;
        this.classificacao = classificacao;
    }
}
