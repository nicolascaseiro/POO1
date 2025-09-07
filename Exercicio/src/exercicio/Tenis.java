/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;

/**
 *
 * @author Nicolas Caseio de Abreu
 */
import java.util.Scanner;

public class Tenis extends Calcado {

    private boolean cadarco;
    private boolean esportivo;

    public Tenis(boolean cadarco, boolean esportivo, String marca, double preco, String cor, int tamanho) {
        super(marca, preco, cor, tamanho);
        this.cadarco = cadarco;
        this.esportivo = esportivo;
    }

    public Tenis(boolean cadarco, boolean esportivo, String cor, int tamanho) {
        super(cor, tamanho);
        this.cadarco = cadarco;
        this.esportivo = esportivo;
    }

    public Tenis(boolean cadarco, boolean esportivo, String marca) {
        super(marca);
        this.cadarco = cadarco;
        this.esportivo = esportivo;
    }

    public Tenis(boolean cadarco, boolean esportivo) {
        this.cadarco = cadarco;
        this.esportivo = esportivo;
    }

    public Tenis(String marca, double preco, String cor, int tamanho) {
        super(marca, preco, cor, tamanho);
    }

    public Tenis(String cor, int tamanho) {
        super(cor, tamanho);
    }

    public Tenis(String marca) {
        super(marca);
    }

    public Tenis() {
    }

    public void setCadarco(boolean cadarco) {
        this.cadarco = cadarco;
    }

    public void setEsportivo(boolean esportivo) {
        this.esportivo = esportivo;
    }

    public boolean isCadarco() {
        return cadarco;
    }

    public boolean isEsportivo() {
        return esportivo;
    }

    public void cadastrar(String marca, double preco, int tamanho, String cor, boolean cadarco, boolean esportivo) {
        super.cadastrar(marca, preco, tamanho, cor);
        setCadarco(cadarco);
        setEsportivo(esportivo);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cardarço: " + (cadarco ? "Sim" : "Não"));
        System.out.println("Esportivo: " + (esportivo ? "Sim" : "Não"));
    }

    @Override
    public void entrada() {
        super.entrada();
        Scanner sc = new Scanner(System.in);
        System.out.print("Possui cadarço (true/false)? ");
        setCadarco(sc.nextBoolean());
        System.out.print("É esportivo (true/false)? ");
        setEsportivo(sc.nextBoolean());
    }
}
