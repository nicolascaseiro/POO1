/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5.Exercicios;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */

//Exercício 2a

public class PenDriveMelhorado {

    private String marca;
    private String modelo;
    private int capacidade;
    private double comprimento;
    private double largura;
    private double profundidade;
    private double peso;
    private double preco;
    private String unidade;

    public PenDriveMelhorado() {
        this.marca = "";
        this.modelo = "";
        this.capacidade = 0;
        this.comprimento = 0;
        this.largura = 0;
        this.profundidade = 0;
        this.peso = 0;
        this.preco = 0;
        this.unidade = "";
    }

    /**
     *
     * @param marca
     */
    public PenDriveMelhorado(String marca) {
        this();
        this.marca = marca;
    }

    public PenDriveMelhorado(String marca, String modelo) {
        this(marca);
        this.modelo = modelo;
    }

    public PenDriveMelhorado(String marca, String modelo, int capacidade) {
        this(marca, modelo);
        this.capacidade = capacidade;
    }

    public PenDriveMelhorado(String marca, String modelo, int capacidade, double comprimento) {
        this(marca, modelo, capacidade);
        this.comprimento = comprimento;
    }

    public PenDriveMelhorado(String marca, String modelo, int capacidade, double comprimento, double largura) {
        this(marca, modelo, capacidade, comprimento);
        this.largura = largura;
    }

    public PenDriveMelhorado(String marca, String modelo, int capacidade, double comprimento, double largura, double profundidade) {
        this(marca, modelo, capacidade, comprimento, largura);
        this.profundidade = profundidade;
    }

    public PenDriveMelhorado(String marca, String modelo, int capacidade, double comprimento, double largura, double profundidade, double peso) {
        this(marca, modelo, capacidade, comprimento, largura, profundidade);
        this.peso = peso;
    }

    public PenDriveMelhorado(String marca, String modelo, int capacidade, double comprimento, double largura, double profundidade, double peso, double preco) {
        this(marca, modelo, capacidade, comprimento, largura, profundidade, peso);
        this.preco = preco;
    }

    public PenDriveMelhorado(String marca, String modelo, int capacidade, double comprimento, double largura, double profundidade, double peso, double preco, String unidade) {
        this(marca, modelo, capacidade, comprimento, largura, profundidade, peso, preco);
        this.unidade = unidade;
    }

    public PenDriveMelhorado(String marca, int capacidade) {
        this();
        this.marca = marca;
        this.capacidade = capacidade;
    }

    public PenDriveMelhorado(String marca, int capacidade, double peso) {
        this(marca, capacidade);
        this.peso = peso;
    }

    public PenDriveMelhorado(String modelo, double preco) {
        this();
        this.modelo = modelo;
        this.preco = preco;
    }

    public PenDriveMelhorado(double preco) {
        this();
        this.preco = preco;
    }

    public PenDriveMelhorado(String marca, String modelo, double preco) {
        this(marca, modelo);
        this.preco = preco;
    }

    public PenDriveMelhorado(int capacidade, double peso) {
        this();
        this.capacidade = capacidade;
        this.peso = peso;
    }

    public PenDriveMelhorado(double comprimento, double largura, double profundidade) {
        this();
        this.comprimento = comprimento;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    public PenDriveMelhorado(double comprimento, double largura, double profundidade, double peso) {
        this(comprimento, largura, profundidade);
        this.peso = peso;
    }

    public PenDriveMelhorado(int capacidade, String unidade) {
        this();
        this.capacidade = capacidade;
        this.unidade = unidade;
    }

    public PenDriveMelhorado(String marca, int capacidade, String unidade) {
        this(marca, capacidade);
        this.unidade = unidade;
    }

    public PenDriveMelhorado(String marca, String modelo, String unidade) {
        this(marca, modelo);
        this.unidade = unidade;
    }

    public PenDriveMelhorado(int capacidade, double preco, String unidade) {
        this();
        this.capacidade = capacidade;
        this.preco = preco;
        this.unidade = unidade;
    }

    public PenDriveMelhorado(String marca, int capacidade, double preco, String unidade) {
        this(marca, capacidade);
        this.preco = preco;
        this.unidade = unidade;
    }

    public PenDriveMelhorado(String marca, String modelo, int capacidade, String unidade) {
        this(marca, modelo, capacidade);
        this.unidade = unidade;
    }

    public PenDriveMelhorado(String marca, String modelo, double preco, String unidade) {
        this(marca, modelo);
        this.preco = preco;
        this.unidade = unidade;
    }

    public PenDriveMelhorado(double peso, double preco) {
        this();
        this.peso = peso;
        this.preco = preco;
    }

    public PenDriveMelhorado(double peso, double preco, String unidade) {
        this(peso, preco);
        this.unidade = unidade;
    }

    public PenDriveMelhorado(String marca, double peso, double preco, String unidade) {
        this();
        this.marca = marca;
        this.peso = peso;
        this.preco = preco;
        this.unidade = unidade;
    }

    public PenDriveMelhorado(int capacidade, double comprimento, double largura, double profundidade, double peso, double preco, String unidade) {
        this();
        this.capacidade = capacidade;
        this.comprimento = comprimento;
        this.largura = largura;
        this.profundidade = profundidade;
        this.peso = peso;
        this.preco = preco;
        this.unidade = unidade;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public double getPeso() {
        return peso;
    }

    public double getPreco() {
        return preco;
    }

    public String getUnidade() {
        return unidade;
    }
}
