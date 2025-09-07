/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Nicolas Caseio de Abreu
 */
public class Motor {

    private String tipoCombustivel;
    private int potenciaMaxima;
    private int potenciaAtual;

    public Motor() {
    }

    public Motor(String tipoCombustivel, int potenciaMaxima, int potenciaAtual) {
        this.tipoCombustivel = tipoCombustivel;
        this.potenciaMaxima = potenciaMaxima;
        this.potenciaAtual = potenciaAtual;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setPotenciaMaxima(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaAtual(int potenciaAtual) {
        this.potenciaAtual = potenciaAtual;
    }

    public int getPotenciaAtual() {
        return potenciaAtual;
    }

    public void cadastrar(String tipoCombustivel, int potenciaMaxima, int potenciaAtual) {
        this.tipoCombustivel = tipoCombustivel;
        this.potenciaMaxima = potenciaMaxima;
        this.potenciaAtual = potenciaAtual;
    }

    public void imprimir() {
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
        System.out.println("Potência Máxima: " + potenciaMaxima);
        System.out.println("Potência Atual: " + potenciaAtual);
    }

    public void acelerar() {
        if (potenciaAtual + 100 <= potenciaMaxima) {
            potenciaAtual += 100;
        }
    }

    public void desacelerar() {
        if (potenciaAtual - 100 >= 0) {
            potenciaAtual -= 100;
        }
    }
}
