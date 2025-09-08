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

public class Sapato extends Calcado {

    private boolean cadarco;
    private String modelo;

    public Sapato(boolean cadarco, String modelo, String marca, double preco, String cor, int tamanho) {
        super(marca, preco, cor, tamanho);
        this.cadarco = cadarco;
        this.modelo = modelo;
    }

    public Sapato(boolean cadarco, String modelo, String cor, int tamanho) {
        super(cor, tamanho);
        this.cadarco = cadarco;
        this.modelo = modelo;
    }

    public Sapato(boolean cadarco, String modelo, String marca) {
        super(marca);
        this.cadarco = cadarco;
        this.modelo = modelo;
    }

    public Sapato(boolean cadarco, String modelo) {
        this.cadarco = cadarco;
        this.modelo = modelo;
    }

    public Sapato(String marca, double preco, String cor, int tamanho) {
        super(marca, preco, cor, tamanho);
    }

    public Sapato(String cor, int tamanho) {
        super(cor, tamanho);
    }

    public Sapato(String marca) {
        super(marca);
    }

    public Sapato() {

    }

    public void setCadarco(boolean cadarco) {
        this.cadarco = cadarco;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isCadarco() {
        return cadarco;
    }

    public String getModelo() {
        return modelo;
    }

    public void cadastrar(String marca, double preco, int tamanho, String cor, boolean cadarco, String modelo) {
        super.cadastrar(marca, preco, tamanho, cor);
        setCadarco(cadarco);
        setModelo(modelo);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cadarço: " + (cadarco ? "Sim" : "Não"));
        System.out.println("Modelo: " + modelo);
    }

    @Override
    public void entrada() {
        super.entrada();
        Scanner sc = new Scanner(System.in);
        System.out.println("Possui cadarço (true/false)? ");
        setCadarco(sc.nextBoolean());
        System.out.println("Modelo: ");
        setModelo(sc.nextLine());
    }
}
