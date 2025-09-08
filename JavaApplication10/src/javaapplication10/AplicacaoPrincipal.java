/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */
public class AplicacaoPrincipal {

    public static void main(String[] args) {
        Geladeira geladeira = new Geladeira("Samsung", "GTX-200", 400, 2500.00, -18, 10);
        MicroOndas microOndas = new MicroOndas("LG", "SpeedWave", 30, 800.00, 800, 2200);

        System.out.println("Geladeira: " + geladeira.getMarca() + " " + geladeira.getModelo()
                + " - Preço Original: R$ " + geladeira.getPreco() + " - Preço com Desconto: R$ " + geladeira.desconto());

        System.out.println("Microondas: " + microOndas.getMarca() + " " + microOndas.getModelo()
                + " - Preço Original: R$ " + microOndas.getPreco() + " - Preço com Desconto: R$ " + microOndas.desconto());
    }
}
