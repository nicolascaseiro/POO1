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

public class Geladeira extends Eletrodomestico {

    double temperaturaMinima;
    double temperaturaMaxima;
    Porta porta1 = new Porta();
    Porta porta2 = new Porta();

    public Geladeira() { }

    public Geladeira(String marca) {

        super(marca);
    }

    public Geladeira(String marca, String modelo) {

        super(marca, modelo);
    }

    public Geladeira(String marca, String modelo, int volume) {

        super(marca, modelo, volume);
    }

    public Geladeira(String marca, String modelo, int volume, double preco) {

        super(marca, modelo, volume, preco);
    }

    public Geladeira(String marca, String modelo, int volume, double preco, double temperaturaMinima, double temperaturaMaxima) {

        super(marca, modelo, volume, preco);
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public Geladeira(String marca, String modelo, int volume, double preco, Porta porta1, Porta porta2) {

        super(marca, modelo, volume, preco);
        this.porta1 = porta1;
        this.porta2 = porta2;
    }

    public Geladeira(String marca, String modelo, int volume, double preco, double temperaturaMinima, double temperaturaMaxima, Porta porta1, Porta porta2) {

        super(marca, modelo, volume, preco);
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
        this.porta1 = porta1;
        this.porta2 = porta2;
    }

    public Geladeira(double temperaturaMinima, double temperaturaMaxima) {

        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public void setTemperaturaMinima(double temperaturaMinima) {

        this.temperaturaMinima = temperaturaMinima;
    }

    public void setTemperaturaMaxima(double temperaturaMaxima) {

        this.temperaturaMaxima = temperaturaMaxima;
    }

    public void setPorta1(Porta porta1) {

        this.porta1 = porta1;
    }

    public void setPorta2(Porta porta2) {

        this.porta2 = porta2;
    }

    public double getTemperaturaMinima() {

        return temperaturaMinima;
    }

    public double getTemperaturaMaxima() {

        return temperaturaMaxima;
    }

    public Porta getPorta1() {

        return porta1;
    }

    public Porta getPorta2() {

        return porta2;
    }

    public void cadastrar(String marca, String modelo, int volume, double preco, double temperaturaMinima, double temperaturaMaxima, Porta porta1, Porta porta2) {

        super.cadastrar(marca, modelo, volume, preco);
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
        this.porta1 = porta1;
        this.porta2 = porta2;
    }

    public void imprimir() {

        super.imprimir();
        System.out.println("Temperatura Mínima: " + temperaturaMinima);
        System.out.println("Temperatura Máxima: " + temperaturaMaxima);
        System.out.println("Porta 1:");
        porta1.imprimir();
        System.out.println("Porta 2:");
        porta2.imprimir();
    }

    public void entradaDados() {

        super.entradaDados();
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura Mínima: ");
        temperaturaMinima = sc.nextDouble();

        System.out.print("Temperatura Máxima: ");
        temperaturaMaxima = sc.nextDouble();

        System.out.println("Porta 1:");
        porta1.entradaDados();

        System.out.println("Porta 2:");
        porta2.entradaDados();
    }
}
