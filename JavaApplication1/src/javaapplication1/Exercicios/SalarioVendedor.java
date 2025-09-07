/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Exercicios;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */

//Exercício 5

import java.util.Scanner;

public class SalarioVendedor {

    private int numeroVendedor;
    private double salarioFixo;
    private double totalVendas;
    private double percentualComissao;

    public void setNumeroVendedor(int numeroVendedor) {
        this.numeroVendedor = numeroVendedor;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public int getNumeroVendedor() {
        return numeroVendedor;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public double calcularSalarioTotal() {
        return salarioFixo + (totalVendas * percentualComissao / 100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SalarioVendedor sv = new SalarioVendedor();

        System.out.print("Número do vendedor: ");
        sv.setNumeroVendedor(sc.nextInt());

        System.out.print("Salário fixo: ");
        sv.setSalarioFixo(sc.nextDouble());

        System.out.print("Total de vendas: ");
        sv.setTotalVendas(sc.nextDouble());

        System.out.print("Percentual sobre vendas: ");
        sv.setPercentualComissao(sc.nextDouble());

        System.out.println("Número do vendedor: " + sv.getNumeroVendedor());
        System.out.println("Salário total: " + String.format("%.2f", sv.calcularSalarioTotal()));

        sc.close();
    }
}
