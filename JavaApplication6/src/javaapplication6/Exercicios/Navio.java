/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6.Exercicios;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */
import java.util.Scanner;

public class Navio extends Veiculo {

    String nome;
    int numeroTripulantes;
    String dataLancamento;

    public Navio() {
    }

    public Navio(String nome) {
        this.nome = nome;
    }

    public Navio(String nome, int capacidadeTanque) {
        this.nome = nome;
        this.capacidadeTanque = capacidadeTanque;
    }

    public Navio(String nome, int capacidadeTanque, int numeroPassageiros) {
        this.nome = nome;
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
    }

    public Navio(String nome, int capacidadeTanque, int numeroPassageiros, int numeroTripulantes, double preco, String dataLancamento) {
        this.nome = nome;
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.numeroTripulantes = numeroTripulantes;
        this.preco = preco;
        this.dataLancamento = dataLancamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void cadastrar(String nome, int capacidadeTanque, int numeroPassageiros, int numeroTripulantes, double preco, String dataLancamento) {
        this.nome = nome;
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.numeroTripulantes = numeroTripulantes;
        this.preco = preco;
        this.dataLancamento = dataLancamento;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Capacidade do tanque: " + capacidadeTanque);
        System.out.println("Número de passageiros: " + numeroPassageiros);
        System.out.println("Número de tripulantes: " + numeroTripulantes);
        System.out.println("Preço: " + preco);
        System.out.println("Data de lançamento: " + dataLancamento);
    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        nome = sc.nextLine();
        System.out.print("Digite a capacidade do tanque: ");
        capacidadeTanque = sc.nextInt();
        System.out.print("Digite o número de passageiros: ");
        numeroPassageiros = sc.nextInt();
        System.out.print("Digite o número de tripulantes: ");
        numeroTripulantes = sc.nextInt();
        System.out.print("Digite o preço: ");
        preco = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite a data de lançamento: ");
        dataLancamento = sc.nextLine();
    }

    public double passageirosPorTripulantes() {
        if (numeroTripulantes == 0) {
            return 0;
        }
        return (double) numeroPassageiros / numeroTripulantes;
    }
}
