/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */
import java.util.Scanner;

public class Calcado {

    private String marca;
    private double preco;
    private String cor;
    private int tamanho;

    public Calcado(String marca, double preco, String cor, int tamanho) {
        this.marca = marca;
        this.preco = preco;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public Calcado(String cor, int tamanho) {
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public Calcado(String marca) {
        this.marca = marca;
    }

    public Calcado() {

    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public String getCor() {
        return cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void cadastrar(String marca, double preco, int tamanho, String cor) {
        setMarca(marca);
        setPreco(preco);
        setTamanho(tamanho);
        setCor(cor);
    }

    public void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Preço = " + preco);
        System.out.println("Tamanho = " + tamanho);
        System.out.println("Cor = " + cor);
    }

    public void entrada() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a marca: ");
        setMarca(sc.nextLine());
        System.out.println("Digite o preço: ");
        setPreco(sc.nextDouble());
        System.out.println("Digite o tamanho: ");
        setTamanho(sc.nextInt());
        System.out.println("Digite a cor: ");
        setCor(sc.nextLine());
    }
}
