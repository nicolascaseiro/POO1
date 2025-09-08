/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8.Teste;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */
import javaapplication8.PenDrive.PenDrive;
import java.util.Scanner;

public class TestePenDrive {

    public static void main(String[] args) {
        PenDrive p1 = new PenDrive();
        p1.setMarca("SanDisk");
        p1.setCapacidade(64);
        p1.setTipoConexao("USB 3.0");
        p1.setPreco(120.50);
        p1.setModelo("Ultra Flair");
        p1.imprimir();

        PenDrive p2 = new PenDrive();
        p2.cadastrar("Kingston", 128, "USB 3.1", 250.75, "DataTraveler");
        p2.imprimir();

        PenDrive p3 = new PenDrive();
        System.out.println("\nEntre com os dados do PenDrive 3:");
        p3.entradaDados();
        p3.imprimir();

        PenDrive p4 = new PenDrive("Samsung", 256, "USB 3.0", 400.00, "T7");
        p4.imprimir();

        PenDrive p5 = new PenDrive("Transcend", 32, "USB 3.0", 80.00, "JetFlash");
        p5.imprimir();
    }
}
