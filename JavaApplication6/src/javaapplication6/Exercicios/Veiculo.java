/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6.Exercicios;

/**
 *
 * @author Nicolas Caseio de Abreu
 */
public class Veiculo {
    protected int capacidadeTanque;
    protected int numeroPassageiros;
    protected double preco;

    public Veiculo() {}

    public Veiculo(int capacidadeTanque, int numeroPassageiros, double preco) {
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
