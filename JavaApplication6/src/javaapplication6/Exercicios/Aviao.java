/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6.Exercicios;

/**
 *
 * @author Nicolas Caseio de Abreu
 */
import java.util.Scanner;

public class Aviao extends Veiculo {

    private String prefixo;
    private String dataRevisao;

    public Aviao() {
    }

    public Aviao(String prefixo) {
        this.prefixo = prefixo;
    }

    public Aviao(String prefixo, int capacidadeTanque) {
        this.prefixo = prefixo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public Aviao(String prefixo, int capacidadeTanque, int numeroPassageiros) {
        this.prefixo = prefixo;
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
    }

    public Aviao(String prefixo, int capacidadeTanque, int numeroPassageiros, double preco, String dataRevisao) {
        this.prefixo = prefixo;
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
        this.dataRevisao = dataRevisao;
    }

    public Aviao(String prefixo, double preco) {
        this.prefixo = prefixo;
        this.preco = preco;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setDataRevisao(String dataRevisao) {
        this.dataRevisao = dataRevisao;
    }

    public String getDataRevisao() {
        return dataRevisao;
    }

    public void cadastrar(String prefixo, int capacidadeTanque, int numeroPassageiros, double preco, String dataRevisao) {
        this.prefixo = prefixo;
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
        this.dataRevisao = dataRevisao;
    }

    public void imprimir() {
        System.out.println("Prefixo: " + prefixo);
        System.out.println("Capacidade do tanque: " + capacidadeTanque);
        System.out.println("Número de passageiros: " + numeroPassageiros);
        System.out.println("Preço: " + preco);
        System.out.println("Data da revisão: " + dataRevisao);
    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o prefixo: ");
        prefixo = sc.nextLine();
        System.out.print("Digite a capacidade do tanque: ");
        capacidadeTanque = sc.nextInt();
        System.out.print("Digite o número de passageiros: ");
        numeroPassageiros = sc.nextInt();
        System.out.print("Digite o preço: ");
        preco = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite a data da revisão: ");
        dataRevisao = sc.nextLine();
    }

    public void reajustarPreco(double percentual) {
        preco += preco * percentual / 100;
    }
}
