/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4.Exercicios;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */


//Exercício 2

public class Cadeira {

    char tipoEncosto;
    String cor;
    int numeroParafusos;
    boolean possuiBraco;
    double pesoMaximo;

    public void setTipoEncosto(char tipoEncosto) {
        this.tipoEncosto = tipoEncosto;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setNumeroParafusos(int numeroParafusos) {
        this.numeroParafusos = numeroParafusos;
    }

    public void setPossuiBraco(boolean possuiBraco) {
        this.possuiBraco = possuiBraco;
    }

    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public char getTipoEncosto() {
        return tipoEncosto;
    }

    public String getCor() {
        return cor;
    }

    public int getNumeroParafusos() {
        return numeroParafusos;
    }

    public boolean getPossuiBraco() {
        return possuiBraco;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }
}
