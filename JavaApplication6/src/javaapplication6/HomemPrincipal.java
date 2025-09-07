/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author Nicolas Caseio de Abreu
 */
public class HomemPrincipal {

    public static void main(String[] args) {
        Homem h1 = new Homem();
        h1.setSexo("Masculino");
        h1.setNome("Joao");
        h1.setIdade(23);
        h1.setPeso(65.4);
        h1.setAltura(1.76);
        h1.setBigode(true);
        h1.setBarba(false);
        h1.setPeitoral(0.96);
        System.out.println("Nome: " + h1.getNome() + " Sexo: "
                + h1.getSexo() + " Idade: " + h1.getIdade() + " Peso: " + h1.getPeso()
                + " Altura: " + h1.getAltura() + " Bigode: " + h1.getBigode()
                + " Barba: " + h1.getBarba() + " Peitoral: " + h1.getPeitoral());
    }
}
