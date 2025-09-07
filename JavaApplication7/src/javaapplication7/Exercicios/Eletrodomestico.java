/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7.Exercicios;

/**
 *
 * @author Nicolas Caseio de Abreu
 */

import java.util.Scanner;

public class Eletrodomestico {
    
    String marca;
    String modelo;
    int volume;
    double preco;

    public Eletrodomestico() { }

    public Eletrodomestico(String marca) {
        
        this.marca = marca;
    }

    public Eletrodomestico(String marca, String modelo) {
        
        this.marca = marca;
        this.modelo = modelo;
    }

    public Eletrodomestico(String marca, String modelo, int volume) {
        
        this.marca = marca;
        this.modelo = modelo;
        this.volume = volume;
    }

    public Eletrodomestico(String marca, String modelo, int volume, double preco) {
        
        this.marca = marca;
        this.modelo = modelo;
        this.volume = volume;
        this.preco = preco;
    }

    public Eletrodomestico(String marca, int volume) {
        
        this.marca = marca;
        this.volume = volume;
    }

    public Eletrodomestico(String marca, double preco) {
        
        this.marca = marca;
        this.preco = preco;
    }

    public Eletrodomestico(String modelo, int volume, double preco) {
        
        this.modelo = modelo;
        this.volume = volume;
        this.preco = preco;
    }

    public Eletrodomestico(String marca, String modelo, double preco) {
        
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public void setMarca(String marca) {
        
        this.marca = marca;
    }

    public String getMarca() {
        
        return marca;
    }

    public void setModelo(String modelo) {
        
        this.modelo = modelo;
    }

    public String getModelo() {
        
        return modelo;
    }

    public void setVolume(int volume) {
        
        this.volume = volume;
    }

    public int getVolume() {
        
        return volume;
    }

    public void setPreco(double preco) {
        
        this.preco = preco;
    }

    public double getPreco() {
        
        return preco;
    }

    public void cadastrar(String marca, String modelo, int volume, double preco) {
        
        this.marca = marca;
        this.modelo = modelo;
        this.volume = volume;
        this.preco = preco;
    }

    public void imprimir() {
        
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Volume: " + volume);
        System.out.println("Preço: " + preco);
    }

    public void entradaDados() {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Marca: ");
        marca = sc.nextLine();

        System.out.print("Modelo: ");
        modelo = sc.nextLine();

        System.out.print("Volume: ");
        volume = sc.nextInt();

        System.out.print("Preço: ");
        preco = sc.nextDouble();
    }
}
