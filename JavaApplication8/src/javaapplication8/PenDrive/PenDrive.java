/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8.PenDrive;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */
import java.util.Scanner;

public class PenDrive {
    private String marca;
    private int capacidade;
    private String tipoConexao;
    private double preco;
    private String modelo;

    public PenDrive() { }

    public PenDrive(String marca, int capacidade, String tipoConexao, double preco, String modelo) {
        this.marca = marca;
        this.capacidade = capacidade;
        this.tipoConexao = tipoConexao;
        this.preco = preco;
        this.modelo = modelo;
    }

    public void setMarca(String marca) { this.marca = marca; }
    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }
    public void setTipoConexao(String tipoConexao) { this.tipoConexao = tipoConexao; }
    public void setPreco(double preco) { this.preco = preco; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getMarca() { return marca; }
    public int getCapacidade() { return capacidade; }
    public String getTipoConexao() { return tipoConexao; }
    public double getPreco() { return preco; }
    public String getModelo() { return modelo; }

    public void cadastrar(String marca, int capacidade, String tipoConexao, double preco, String modelo) {
        this.marca = marca;
        this.capacidade = capacidade;
        this.tipoConexao = tipoConexao;
        this.preco = preco;
        this.modelo = modelo;
    }

    public void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Capacidade: " + capacidade + " GB");
        System.out.println("Tipo de Conexão: " + tipoConexao);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Modelo: " + modelo);
    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Marca: ");
        marca = sc.nextLine();

        System.out.print("Capacidade (em GB): ");
        capacidade = sc.nextInt();
        sc.nextLine();  // Consumir a quebra de linha

        System.out.print("Tipo de Conexão (USB 2.0/3.0/3.1): ");
        tipoConexao = sc.nextLine();

        System.out.print("Preço: ");
        preco = sc.nextDouble();
        sc.nextLine();  // Consumir a quebra de linha

        System.out.print("Modelo: ");
        modelo = sc.nextLine();
    }
}