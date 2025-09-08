/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author Nicolas Caseio de Abreu
 */
import java.util.Scanner;

public abstract class Veiculo {

    private double preco;
    private String marca;
    private String placa;
    private static final int idadeMinimaMotorista = 18;
    Motor motor = new Motor();

    public Veiculo(double preco, String marca, String placa, Motor motor) {
        this.preco = preco;
        this.marca = marca;
        this.placa = placa;
        this.motor = motor;
    }

    public Veiculo(double preco, String marca, String placa) {
        this.preco = preco;
        this.marca = marca;
        this.placa = placa;
    }

    public Veiculo(String marca, String placa) {
        this.marca = marca;
        this.placa = placa;
    }

    public Veiculo(String marca) {
        this.marca = marca;
    }

    public Veiculo(double preco) {
        this.preco = preco;
    }

    public Veiculo() {

    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public double getPreco() {
        return preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public static int getIdadeMinimaMotorista() {
        return idadeMinimaMotorista;
    }

    public Motor getMotor() {
        return motor;
    }

    public void cadastrar(double preco, String marca, String placa, int potencia, int rpm, String tipoCombustivel) {
        setPreco(preco);
        setMarca(marca);
        setPlaca(placa);
        motor.cadastrar(potencia, rpm, tipoCombustivel);
    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o preco: ");
        setPreco(sc.nextDouble());
        System.out.print("Informe a marca: ");
        setMarca(sc.nextLine());
        System.out.print("Informe a placa: ");
        setPlaca(sc.nextLine());

        motor.entradaDados();

    }

    public void imprimir() {
        System.out.printf("Preco: %.2f\nMarca: %s\nPlaca: %s", getPreco(), getMarca(), getPlaca());
        motor.imprimir();
    }

}
