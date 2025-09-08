/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */
import java.util.Scanner;

public class Carro extends Veiculo implements SegurancaVeicular {

    private int numeroPassageiros;
    private int volumeMala;

    public Carro(int numeroPassageiros, int volumeMala, double preco, String marca, String placa) {
        super(preco, marca, placa);
        this.numeroPassageiros = numeroPassageiros;
        this.volumeMala = volumeMala;
    }

    public Carro(int numeroPassageiros, int volumeMala, String marca, String placa) {
        super(marca, placa);
        this.numeroPassageiros = numeroPassageiros;
        this.volumeMala = volumeMala;
    }

    public Carro(int numeroPassageiros, int volumeMala, String marca) {
        super(marca);
        this.numeroPassageiros = numeroPassageiros;
        this.volumeMala = volumeMala;
    }

    public Carro(int numeroPassageiros, int volumeMala, double preco) {
        super(preco);
        this.numeroPassageiros = numeroPassageiros;
        this.volumeMala = volumeMala;
    }

    public Carro(int numeroPassageiros, int volumeMala) {
        this.numeroPassageiros = numeroPassageiros;
        this.volumeMala = volumeMala;
    }

    public Carro(double preco, String marca, String placa, Motor motor) {
        super(preco, marca, placa, motor);
    }

    public Carro(double preco, String marca, String placa) {
        super(preco, marca, placa);
    }

    public Carro(String marca, String placa) {
        super(marca, placa);
    }

    public Carro(String marca) {
        super(marca);
    }

    public Carro(double preco) {
        super(preco);
    }

    public Carro() {

    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public void setVolumeMala(int volumeMala) {
        this.volumeMala = volumeMala;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public int getVolumeMala() {
        return volumeMala;
    }

    public void cadastrar(double preco, String marca, String placa, int potencia, int rpm, String tipoCombustivel, int numeroPassageiros, int volumeMala) {
        super.cadastrar(preco, marca, placa, potencia, rpm, tipoCombustivel);
        setNumeroPassageiros(numeroPassageiros);
        setVolumeMala(volumeMala);
    }

    @Override
    public void entradaDados() {
        super.entradaDados();
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de passageiros: ");
        setNumeroPassageiros(sc.nextInt());
        System.out.println("Volume da mala: ");
        setVolumeMala(sc.nextInt());
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de passageiros: " + numeroPassageiros);
        System.out.println("Volume da mala: " + volumeMala + " L");
    }

    public void acelerar() {
        motor.setRpm(motor.getRpm() + 100);
    }

    @Override
    public void desacelerar() {
        motor.setRpm(motor.getRpm() - 100);
    }

    @Override
    public void frear() {
        System.out.print("Carro freando");
    }

    @Override
    public void virarDireita() {
        System.out.print("Carro virando a direita");
    }

    @Override
    public void virarEsquerda() {
        System.out.print("Carro virando a esquerda");
    }

    public double desconto() {
        return getPreco() - (getPreco() * 0.10);
    }
}
