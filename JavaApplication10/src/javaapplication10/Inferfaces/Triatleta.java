/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10.Inferfaces;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */
public class Triatleta extends Humano implements Nadar, Correr, Ciclista {
    public Triatleta(String nome, double peso, double altura) {
        super(nome, peso, altura);
    }

    public void aquecer() {
        System.out.println(this.getNome() + " está aquecendo");
    }

    public void nadar() {
        System.out.println(this.getNome() + " está nadando");
    }

    public void correr() {
        System.out.println(this.getNome() + " está correndo");
    }

    public void correrBicicleta() {
        System.out.println(this.getNome() + " está correndo de bicicleta");
    }

    public void getIDADEMINIMA() {
        System.out.println("Idade Mínima: " + IDADEMINIMA + " anos");
    }
}
