/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7.Exercicios;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */
import java.util.Scanner;

public class MicroOndas extends Eletrodomestico {

    int potenciaMinima;
    int potenciaMaxima;
    Porta porta1 = new Porta();

    public MicroOndas() {

    }

    public MicroOndas(String marca) {

        super(marca);
    }

    public MicroOndas(String marca, String modelo) {

        super(marca, modelo);
    }

    public MicroOndas(String marca, String modelo, int volume) {

        super(marca, modelo, volume);
    }

    public MicroOndas(String marca, String modelo, int volume, double preco) {

        super(marca, modelo, volume, preco);
    }

    public MicroOndas(String marca, String modelo, int volume, double preco, int potenciaMinima, int potenciaMaxima) {

        super(marca, modelo, volume, preco);
        this.potenciaMinima = potenciaMinima;
        this.potenciaMaxima = potenciaMaxima;
    }

    public MicroOndas(String marca, String modelo, int volume, double preco, Porta porta1) {

        super(marca, modelo, volume, preco);
        this.porta1 = porta1;
    }

    public MicroOndas(String marca, String modelo, int volume, double preco, int potenciaMinima, int potenciaMaxima, Porta porta1) {

        super(marca, modelo, volume, preco);
        this.potenciaMinima = potenciaMinima;
        this.potenciaMaxima = potenciaMaxima;
        this.porta1 = porta1;
    }

    public void setPotenciaMinima(int potenciaMinima) {

        this.potenciaMinima = potenciaMinima;
    }

    public void setPotenciaMaxima(int potenciaMaxima) {

        this.potenciaMaxima = potenciaMaxima;
    }

    public void setPorta1(Porta porta1) {

        this.porta1 = porta1;
    }

    public int getPotenciaMinima() {

        return potenciaMinima;
    }

    public int getPotenciaMaxima() {

        return potenciaMaxima;
    }

    public Porta getPorta1() {

        return porta1;
    }

    public void cadastrar(String marca, String modelo, int volume, double preco, int potenciaMinima, int potenciaMaxima, Porta porta1) {

        super.cadastrar(marca, modelo, volume, preco);
        this.potenciaMinima = potenciaMinima;
        this.potenciaMaxima = potenciaMaxima;
        this.porta1 = porta1;
    }

    public void imprimir() {

        super.imprimir();
        System.out.println("Potência Mínima: " + potenciaMinima);
        System.out.println("Potência Máxima: " + potenciaMaxima);
        System.out.println("Porta 1:");
        porta1.imprimir();
    }

    public void entradaDados() {

        super.entradaDados();
        Scanner sc = new Scanner(System.in);

        System.out.print("Potência Mínima: ");
        potenciaMinima = sc.nextInt();

        System.out.print("Potência Máxima: ");
        potenciaMaxima = sc.nextInt();

        System.out.println("Porta 1:");
        porta1.entradaDados();
    }
}
