/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String matricula, nome;
        double nota1, nota2;
        int idade;
        
        System.out.println("Entre com a Matricula.......: ");
        matricula = sc.nextLine();
        
        System.out.println("Entre com o Nome...........: ");
        nome = sc.nextLine();
        
        System.out.println("Entre com a Nota A1........: ");
        nota1 = Double.parseDouble(sc.nextLine());
        
        System.out.println("Entre com a Nota A2........: ");
        nota2 = Double.parseDouble(sc.nextLine());
        
        System.out.println("Entre com a Idade..........: ");
        idade = Integer.parseInt(sc.nextLine());
        
        System.out.println("\nMatricula: " + matricula);
        System.out.println("Nome: " + nome + "\nNota 1: " + nota1);
        System.out.println("Nota 2: " + nota2 + "\nIdade: " + idade);
        System.out.println("Media: " + (nota1 + nota2) / 2);
    }
}
