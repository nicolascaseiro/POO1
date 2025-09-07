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

public class Geladeira {

    long capacidadeLitros;
    float altura;
    char tipoDegelo;
    String cor;
    boolean possuiFreezer;

    public void setCapacidadeLitros(long capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setTipoDegelo(char tipoDegelo) {
        this.tipoDegelo = tipoDegelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPossuiFreezer(boolean possuiFreezer) {
        this.possuiFreezer = possuiFreezer;
    }

    public long getCapacidadeLitros() {
        return capacidadeLitros;
    }

    public float getAltura() {
        return altura;
    }

    public char getTipoDegelo() {
        return tipoDegelo;
    }

    public String getCor() {
        return cor;
    }

    public boolean getPossuiFreezer() {
        return possuiFreezer;
    }
}
