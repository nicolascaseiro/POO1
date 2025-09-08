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

import java.util.Scanner;

public class Cadeira {

    private String cor;
    private int pernas;
    private boolean estofada;
    private float altura;
    private byte nivelConforto;
    private char tipoEncosto;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPernas(int pernas) {
        this.pernas = pernas;
    }

    public void setEstofada(boolean estofada) {
        this.estofada = estofada;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setNivelConforto(byte nivelConforto) {
        this.nivelConforto = nivelConforto;
    }

    public void setTipoEncosto(char tipoEncosto) {
        this.tipoEncosto = tipoEncosto;
    }

    public String getCor() {
        return cor;
    }

    public int getPernas() {
        return pernas;
    }

    public boolean isEstofada() {
        return estofada;
    }

    public float getAltura() {
        return altura;
    }

    public byte getNivelConforto() {
        return nivelConforto;
    }

    public char getTipoEncosto() {
        return tipoEncosto;
    }

    public void entrada() {
        Scanner sc = new Scanner(System.in);
        setCor(sc.nextLine());
        setPernas(sc.nextInt());
        setEstofada(sc.nextBoolean());
        setAltura(sc.nextFloat());
        setNivelConforto(sc.nextByte());
        setTipoEncosto(sc.next().charAt(0));
    }

    public void imprimir() {
        System.out.println(cor + " " + pernas + " " + estofada + " " + altura + " " + nivelConforto + " " + tipoEncosto);
    }

    public void cadastrar(String cor, int pernas, boolean estofada) {
        setCor(cor);
        setPernas(pernas);
        setEstofada(estofada);
    }

    public void cadastrar(String cor, float altura, byte conforto) {
        setCor(cor);
        setAltura(altura);
        setNivelConforto(conforto);
    }

    public void cadastrar(String cor, int pernas, boolean estofada, float altura, byte conforto, char encosto) {
        setCor(cor);
        setPernas(pernas);
        setEstofada(estofada);
        setAltura(altura);
        setNivelConforto(conforto);
        setTipoEncosto(encosto);
    }

    public Cadeira() {
    }

    public Cadeira(String cor) {
        this.cor = cor;
    }

    public Cadeira(String cor, int pernas) {
        this(cor);
        this.pernas = pernas;
    }

    public Cadeira(String cor, int pernas, boolean estofada) {
        this(cor, pernas);
        this.estofada = estofada;
    }

    public Cadeira(String cor, int pernas, boolean estofada, float altura) {
        this(cor, pernas, estofada);
        this.altura = altura;
    }

    public Cadeira(String cor, int pernas, boolean estofada, float altura, byte conforto) {
        this(cor, pernas, estofada, altura);
        this.nivelConforto = conforto;
    }

    public Cadeira(String cor, int pernas, boolean estofada, float altura, byte conforto, char encosto) {
        this(cor, pernas, estofada, altura, conforto);
        this.tipoEncosto = encosto;
    }

    public Cadeira(int pernas, boolean estofada) {
        this.pernas = pernas;
        this.estofada = estofada;
    }

    public Cadeira(boolean estofada, float altura) {
        this.estofada = estofada;
        this.altura = altura;
    }

    public Cadeira(float altura, byte conforto) {
        this.altura = altura;
        this.nivelConforto = conforto;
    }
}
