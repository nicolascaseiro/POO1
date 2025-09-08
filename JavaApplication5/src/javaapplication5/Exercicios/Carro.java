/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5.Exercicios;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */

//Exercício 2b

import java.util.Scanner;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private boolean automatico;
    private double preco;
    private byte portas;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setPortas(byte portas) {
        this.portas = portas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public double getPreco() {
        return preco;
    }

    public byte getPortas() {
        return portas;
    }

    public void entrada() {
        Scanner sc = new Scanner(System.in);
        setMarca(sc.nextLine());
        setModelo(sc.nextLine());
        setAno(sc.nextInt());
        setAutomatico(sc.nextBoolean());
        setPreco(sc.nextDouble());
        setPortas(sc.nextByte());
    }

    public void imprimir() {
        System.out.println(marca + " " + modelo + " " + ano + " " + automatico + " " + preco + " " + portas);
    }

    public void cadastrar(String marca, String modelo, int ano) {
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
    }

    public void cadastrar(String marca, boolean automatico, double preco) {
        setMarca(marca);
        setAutomatico(automatico);
        setPreco(preco);
    }

    public void cadastrar(String marca, String modelo, int ano, boolean automatico, double preco, byte portas) {
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        setAutomatico(automatico);
        setPreco(preco);
        setPortas(portas);
    }

    public Carro() {
    }

    public Carro(String marca) {
        this.marca = marca;
    }

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Carro(String marca, String modelo, int ano) {
        this(marca, modelo);
        this.ano = ano;
    }

    public Carro(String marca, String modelo, int ano, boolean automatico) {
        this(marca, modelo, ano);
        this.automatico = automatico;
    }

    public Carro(String marca, String modelo, int ano, boolean automatico, double preco) {
        this(marca, modelo, ano, automatico);
        this.preco = preco;
    }

    public Carro(String marca, String modelo, int ano, boolean automatico, double preco, byte portas) {
        this(marca, modelo, ano, automatico, preco);
        this.portas = portas;
    }

    public Carro(String marca, boolean automatico) {
        this.marca = marca;
        this.automatico = automatico;
    }

    public Carro(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    public Carro(boolean automatico, byte portas) {
        this.automatico = automatico;
        this.portas = portas;
    }
}
