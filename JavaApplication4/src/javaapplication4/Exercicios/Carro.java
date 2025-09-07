/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4.Exercicios;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */

//Exercício 2 (continuação)

public class Carro {

    int anoFabricacao;
    double velocidadeMaxima;
    byte numeroPortas;
    boolean temArCondicionado;
    String modelo;

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setNumeroPortas(byte numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public void setTemArCondicionado(boolean temArCondicionado) {
        this.temArCondicionado = temArCondicionado;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public byte getNumeroPortas() {
        return numeroPortas;
    }

    public boolean getTemArCondicionado() {
        return temArCondicionado;
    }

    public String getModelo() {
        return modelo;
    }
}
