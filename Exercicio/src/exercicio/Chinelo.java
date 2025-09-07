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

public class Chinelo extends Calcado {

    private boolean acessorio;
    private boolean tiras;

    public Chinelo(boolean acessorio, boolean tiras, String marca, double preco, String cor, int tamanho) {
        super(marca, preco, cor, tamanho);
        this.acessorio = acessorio;
        this.tiras = tiras;
    }

    public Chinelo(boolean acessorio, boolean tiras, String cor, int tamanho) {
        super(cor, tamanho);
        this.acessorio = acessorio;
        this.tiras = tiras;
    }

    public Chinelo(boolean acessorio, boolean tiras, String marca) {
        super(marca);
        this.acessorio = acessorio;
        this.tiras = tiras;
    }

    public Chinelo(boolean acessorio, boolean tiras) {
        this.acessorio = acessorio;
        this.tiras = tiras;
    }

    public Chinelo(String marca, double preco, String cor, int tamanho) {
        super(marca, preco, cor, tamanho);
    }

    public Chinelo(String cor, int tamanho) {
        super(cor, tamanho);
    }

    public Chinelo(String marca) {
        super(marca);
    }

    public Chinelo() {

    }

    public void setAcessorio(boolean acessorio) {
        this.acessorio = acessorio;
    }

    public void setTiras(boolean tiras) {
        this.tiras = tiras;
    }

    public boolean isAcessorio() {
        return acessorio;
    }

    public boolean isTiras() {
        return tiras;
    }   
    
    public void cadastrar(String marca, double preco, int tamanho, String cor, boolean acessorio, boolean tiras) {
        super.cadastrar(marca, preco, tamanho, cor);
        setAcessorio(acessorio);
        setTiras(tiras);
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Acessorio: " + (acessorio ? "Sim" : "Não"));
        System.out.println("Tiras: " + (tiras ? "Sim" : "Não"));
    }

    
    @Override
    public void entrada(){
        super.entrada();
        Scanner sc = new Scanner(System.in);
        System.out.println("Possui acessório (true/false)? ");
        setAcessorio(sc.nextBoolean());
        System.out.println("Possui tiras (true/false)? ");
        setTiras(sc.nextBoolean());
    }
}
