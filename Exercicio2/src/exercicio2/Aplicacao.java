/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */
public class Aplicacao {

    public static void main(String[] args) {
        Carro[] carros = new Carro[5];
        Moto[] motos = new Moto[5];
        Onibus[] onibus = new Onibus[5];

        carros[0] = new Carro("Honda");
        carros[1] = new Carro("Gol", "DEF-5678");
        carros[2] = new Carro("Civic");
        carros[3] = new Carro("Corolla", "JKL-1122");
        carros[4] = new Carro("Kwid", "MNO-3344");

        motos[0] = new Moto(15000, "Honda", "XYZ-1234", 100, 3500, "Gasolina", 30);
        motos[1] = new Moto(12000, "Yamaha", "QRS-5678", 90, 3200, "Gasolina", 25);
        motos[2] = new Moto(10000, "Suzuki", "TUV-9101", 80, 3000, "Gasolina", 20);
        motos[3] = new Moto(20000, "Kawasaki", "WXY-2345", 120, 4000, "Gasolina", 40);
        motos[4] = new Moto(18000, "Harley-Davidson", "ABC-9876", 150, 4200, "Gasolina", 50);

        // Criando 5 objetos Ônibus
        onibus[0] = new Onibus(200000, "Mercedes", "ABC-1234", 350, 1200, "Diesel", 50, true);
        onibus[1] = new Onibus(180000, "Volvo", "DEF-5678", 300, 1000, "Diesel", 45, false);
        onibus[2] = new Onibus(250000, "Scania", "GHI-9101", 400, 1500, "Diesel", 60, true);
        onibus[3] = new Onibus(220000, "MAN", "JKL-1122", 350, 1200, "Diesel", 55, false);
        onibus[4] = new Onibus(230000, "Iveco", "MNO-3344", 370, 1300, "Diesel", 58, true);

        // Imprimindo os dados dos veículos
        System.out.println("Carros:");
        for (Carro carro : carros) {
            carro.imprimir();
            System.out.println();
        }

        System.out.println("Motos:");
        for (Moto moto : motos) {
            moto.imprimir();
            System.out.println();
        }

        System.out.println("Ônibus:");
        for (Onibus onibusVeiculo : onibus) {
            onibusVeiculo.imprimir();
            System.out.println();
        }
    }
}
