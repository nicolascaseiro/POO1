/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */
public class MicroOndas extends Eletrodomestico {

    private int potenciaMinima;
    private int potenciaMaxima;

    public MicroOndas(String marca, String modelo, int volume, double preco, int potenciaMinima, int potenciaMaxima) {
        super(marca, modelo, volume, preco);
        this.potenciaMinima = potenciaMinima;
        this.potenciaMaxima = potenciaMaxima;
    }

    public int getPotenciaMinima() {
        return potenciaMinima;
    }

    public void setPotenciaMinima(int potenciaMinima) {
        this.potenciaMinima = potenciaMinima;
    }

    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaMaxima(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    @Override
    public double desconto() {
        return getPreco() * 0.88;
    }
}
