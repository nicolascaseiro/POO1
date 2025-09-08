/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5.Exercicios;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */

//Exercício 1

import java.util.Scanner;

public class PenDrive {

    String marca;
    String modelo;
    int capacidade;
    double comprimento;
    double largura;
    double profundidade;
    double peso;
    double preco;
    String unidade;

    public void setMarca() {
        this.marca = "";
    }

    public void setMarca(String m) {
        this.marca = m;
    }

    public void setModelo() {
        this.modelo = "";
    }

    public void setModelo(String mo) {
        this.modelo = mo;
    }

    public void setCapacidade() {
        this.capacidade = 0;
    }

    public void setCapacidade(int c) {
        this.capacidade = c;
    }

    public void setComprimento() {
        this.comprimento = 0.0;
    }

    public void setComprimento(double co) {
        this.comprimento = co;
    }

    public void setLargura() {
        this.largura = 0.0;
    }

    public void setLargura(double la) {
        this.largura = la;
    }

    public void setProfundidade() {
        this.profundidade = 0.0;
    }

    public void setProfundidade(double pr) {
        this.profundidade = pr;
    }

    public void setPeso() {
        this.peso = 0.0;
    }

    public void setPeso(double pe) {
        this.peso = pe;
    }

    public void setPreco() {
        this.preco = 0.0;
    }

    public void setPreco(double pre) {
        this.preco = pre;
    }

    public void setUnidade() {
        this.unidade = "";
    }

    public void setUnidade(String un) {
        this.unidade = un;
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

    public void entrada() {
        Scanner ent = new Scanner(System.in);
        System.out.print("Digite a marca: ");
        setMarca(ent.nextLine());
        System.out.print("Digite o modelo: ");
        setModelo(ent.nextLine());
        System.out.print("Digite a capacidade: ");
        setCapacidade(ent.nextInt());
        System.out.print("Digite o comprimento: ");
        setComprimento(ent.nextDouble());
        System.out.print("Digite a largura: ");
        setLargura(ent.nextDouble());
        System.out.print("Digite a profundidade: ");
        setProfundidade(ent.nextDouble());
        System.out.print("Digite o peso: ");
        setPeso(ent.nextDouble());
        System.out.print("Digite o preço: ");
        setPreco(ent.nextDouble());
        ent.nextLine();
        System.out.print("Digite a unidade de armazenamento (KB, MB, GB, TB): ");
        setUnidade(ent.nextLine());
    }

    public void imprimir() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Capacidade: " + getCapacidade());
        System.out.println("Comprimento: " + getComprimento());
        System.out.println("Largura: " + getLargura());
        System.out.println("Profundidade: " + getProfundidade());
        System.out.println("Peso: " + getPeso());
        System.out.println("Preço: " + getPreco());
        System.out.println("Unidade: " + getUnidade());
    }

    public void cadastrar(String ma, String mo, int ca,
            double co, double la, double pr,
            double pe, double pre) {
        setMarca(ma);
        setModelo(mo);
        setCapacidade(ca);
        setComprimento(co);
        setLargura(la);
        setProfundidade(pr);
        setPeso(pe);
        setPreco(pre);
        setUnidade("");
    }

    public void cadastrar(String ma, String mo, int ca,
            double co, double la, double pr,
            double pe, double pre, String un) {
        setMarca(ma);
        setModelo(mo);
        setCapacidade(ca);
        setComprimento(co);
        setLargura(la);
        setProfundidade(pr);
        setPeso(pe);
        setPreco(pre);
        setUnidade(un);
    }
}
