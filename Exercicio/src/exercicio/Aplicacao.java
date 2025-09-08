/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */
public class Aplicacao {

    public static void main(String[] args) {
        // --- Chinelo ---
        Chinelo chinelo1 = new Chinelo("Havaianas");
        Chinelo chinelo2 = new Chinelo("Ipanema");
        Chinelo chinelo3 = new Chinelo();
        chinelo3.setMarca("Rider");
        chinelo3.setPreco(35.50);
        chinelo3.setTamanho(42);
        chinelo3.setCor("Azul");
        chinelo3.setAcessorio(false);
        chinelo3.setTiras(true);

        // --- Tênis ---
        Tenis tenis1 = new Tenis("Nike");
        Tenis tenis2 = new Tenis(true, false);
        Tenis tenis3 = new Tenis("Adidas");

        // --- Sapato ---
        Sapato sapato1 = new Sapato("Ferracini");
        Sapato sapato2 = new Sapato(false, "Esportivo");
        Sapato sapato3 = new Sapato();
        sapato3.setMarca("Pegada");
        sapato3.setPreco(280.00);
        sapato3.setTamanho(41);
        sapato3.setCor("Preto");
        sapato3.setCadarco(true);
        sapato3.setModelo("Casual");

        // --- Imprimir ---
        System.out.println("=== CHINELOS ===");
        chinelo1.imprimir();
        System.out.println();
        chinelo2.imprimir();
        System.out.println();
        chinelo3.imprimir();

        System.out.println("\n=== TÊNIS ===");
        tenis1.imprimir();
        System.out.println();
        tenis2.imprimir();
        System.out.println();
        tenis3.imprimir();

        System.out.println("\n=== SAPATOS ===");
        sapato1.imprimir();
        System.out.println();
        sapato2.imprimir();
        System.out.println();
        sapato3.imprimir();
    }
}
