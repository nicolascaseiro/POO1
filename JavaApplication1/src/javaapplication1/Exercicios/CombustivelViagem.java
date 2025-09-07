/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Exercicios;

/**
 *
 * @author Nicolas Caseiro de Abreu

*/

//Exercício 1

import java.util.Scanner ;

public class CombustivelViagem {

    private double tempo;
    private double velocidade;

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getTempo() {
        return tempo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public double calcularDistancia() {
        return tempo * velocidade;
    }

    public double calcularLitrosUsados() {
        return calcularDistancia() / 12;
    }
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        CombustivelViagem cv = new CombustivelViagem();

        System.out.print("Tempo gasto na viagem (horas): ");
        cv.setTempo(sc.nextDouble());

        System.out.print("Velocidade média (km/h): ");
        cv.setVelocidade(sc.nextDouble());

        double distancia = cv.calcularDistancia();
        double litros = cv.calcularLitrosUsados();

        System.out.println("Velocidade média: " + cv.getVelocidade());
        System.out.println("Tempo gasto: " + cv.getTempo());
        System.out.println("Distância percorrida: " + distancia);
        System.out.println("Litros usados: " + litros);

        sc.close();
    }
}
