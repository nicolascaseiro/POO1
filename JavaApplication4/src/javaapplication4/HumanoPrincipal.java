/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */
public class HumanoPrincipal {

    public static void main(String[] args) {
        Humano h1 = new Humano();

        h1.setSexo("Masculino");
        h1.setNome("Joao");
        h1.setIdade(23);
        h1.setPeso(65.4);
        h1.setAltura(1.76);

        System.out.println("Nome: " + h1.getNome()
                + " Sexo: " + h1.getSexo()
                + " Idade: " + h1.getIdade()
                + " Peso: " + h1.getPeso()
                + " Altura: " + h1.getAltura());
    }
}
