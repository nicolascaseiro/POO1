/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estaticos;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */

public class Produto {

    protected static double peso = 2.55;
    protected static double precoUnitario = 12500.00;
    protected static double percentualLucro = 70.0;
    protected String cor;
    protected double valorFrete;

    public static double getPeso() {
        return peso;
    }

    public static void setPeso(double p) {
        peso = p;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public void setPrecoUnitario(double precoUnitario) {
        Produto.precoUnitario = precoUnitario;
    }

    public void setPercentualLucro(double percentualLucro) {
        Produto.percentualLucro = percentualLucro;
    }

    public String getCor() {
        return this.cor;
    }

    public double getValorFrete() {
        return this.valorFrete;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public double getPercentualLucro() {
        return percentualLucro;
    }

    public final static double calculaPrecoTotal(int quantidade) {
        double valorFinal = 0;
        valorFinal = (percentualLucro / 100 + 1) * (precoUnitario * quantidade);
        return valorFinal;
    }
}
