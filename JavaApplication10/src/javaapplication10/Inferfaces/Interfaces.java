/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10.Inferfaces;

/**
 *
 * @author Nicolas Caseio de Abreu
 */
public class Interfaces {

    public static void main(String[] args) {
        Triatleta triatleta = new Triatleta("André", 85.4, 1.85);
        triatleta.aquecer();
        triatleta.nadar();
        triatleta.correrBicicleta();
        triatleta.correr();
        System.out.println("Idade Mínima: " + triatleta.IDADEMINIMA);
        triatleta.getIDADEMINIMA();

        // Tentando alterar o valor de IDADEMINIMA - isso vai gerar erro de compilação
        // triatleta.IDADEMINIMA = 20; // Erro: cannot assign a value to final variable IDADEMINIMA
    }
}
