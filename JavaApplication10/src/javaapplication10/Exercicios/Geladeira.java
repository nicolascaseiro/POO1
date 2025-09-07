/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10.Exercicios;

/**
 *
 * @author Nicolas Caseio de Abreu
 */


public class Geladeira extends Eletrodomestico implements EletrodomesticoInterface, Desconto {

    private double temperaturaMinima;
    private double temperaturaMaxima;

    public Geladeira(String marca, String modelo, int volume, double preco, double temperaturaMinima, double temperaturaMaxima) {
        super(marca, modelo, volume, preco);
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    @Override
    public void aquecer() {
        System.out.println("Geladeira " + getMarca() + " está aquecendo");
    }

    @Override
    public void getIDADEMINIMA() {
        System.out.println("Idade mínima para usar a geladeira: 15 anos");
    }

    @Override
    public double desconto() {
        return getPreco() * 0.85;  // Desconto de 15% para Geladeiras
    }
}
