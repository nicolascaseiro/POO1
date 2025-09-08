/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PenDrive;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */

//Exercício 1

public class PenDrive {

    private String marca;
    private int capacidade;
    private String tipoConexao;
    private double preco;
    private String modelo;
    private static final String TipoInterface = "USB";

    public PenDrive() {
    }

    public PenDrive(String marca, int capacidade, String tipoConexao, double preco, String modelo) {
        setMarca(marca);
        setCapacidade(capacidade);
        setTipoConexao(tipoConexao);
        setPreco(preco);
        setModelo(modelo);
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        }
    }

    public void setCapacidade(int capacidade) {
        if (capacidade > 0) {
            this.capacidade = capacidade;
        }
    }

    public void setTipoConexao(String tipoConexao) {
        if ("USB".equalsIgnoreCase(tipoConexao)) {
            this.tipoConexao = tipoConexao;
        }
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
        }
    }

    public String getMarca() {
        return marca;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public double getPreco() {
        return preco;
    }

    public String getModelo() {
        return modelo;
    }

    public static String getTipoInterface() {
        return TipoInterface;
    }

    public void cadastrar(String marca, int capacidade, String tipoConexao, double preco, String modelo) {
        setMarca(marca);
        setCapacidade(capacidade);
        setTipoConexao(tipoConexao);
        setPreco(preco);
        setModelo(modelo);
    }

    public void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Capacidade: " + capacidade + " GB");
        System.out.println("Tipo de Conexão: " + tipoConexao);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tipo de Interface: " + TipoInterface);
    }

    public void entradaDados() {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Marca: ");
        setMarca(sc.nextLine());

        System.out.print("Capacidade (em GB): ");
        setCapacidade(sc.nextInt());
        sc.nextLine();

        System.out.print("Tipo de Conexão (USB): ");
        setTipoConexao(sc.nextLine());

        System.out.print("Preço: ");
        setPreco(sc.nextDouble());
        sc.nextLine();

        System.out.print("Modelo: ");
        setModelo(sc.nextLine());
    }
}
