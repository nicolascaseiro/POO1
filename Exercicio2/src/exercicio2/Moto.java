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

public class Moto extends Veiculo implements SegurancaVeicular {

    private int volumeBagageiro;

    public Moto(int volumeBagageiro, double preco, String marca, String placa, Motor motor) {
        super(preco, marca, placa, motor);
        this.volumeBagageiro = volumeBagageiro;
    }

    public Moto(int volumeBagageiro, double preco, String marca, String placa) {
        super(preco, marca, placa);
        this.volumeBagageiro = volumeBagageiro;
    }

    public Moto(int volumeBagageiro, String marca, String placa) {
        super(marca, placa);
        this.volumeBagageiro = volumeBagageiro;
    }

    public Moto(int volumeBagageiro, String marca) {
        super(marca);
        this.volumeBagageiro = volumeBagageiro;
    }

    public Moto(int volumeBagageiro, double preco) {
        super(preco);
        this.volumeBagageiro = volumeBagageiro;
    }

    public Moto(int volumeBagageiro) {
        this.volumeBagageiro = volumeBagageiro;
    }

    public Moto(double preco, String marca, String placa, Motor motor) {
        super(preco, marca, placa, motor);
    }

    public Moto(double preco, String marca, String placa) {
        super(preco, marca, placa);
    }

    public Moto(int par, String marca, String placa, int par1, int par2, String gasolina, int par3) {
        super(marca, placa);
    }

    public Moto(String marca) {
        super(marca);
    }

    public Moto(double preco) {
        super(preco);
    }

    public Moto() {

    }

    public void setVolumeBagageiro(int volumeBagageiro) {
        this.volumeBagageiro = volumeBagageiro;
    }

    public int getVolumeBagageiro() {
        return volumeBagageiro;
    }

    public void cadastrar(double preco, String marca, String placa, int potencia, int rpm, String tipoCombustivel, int volumeBagageiro) {
        super.cadastrar(preco, marca, placa, potencia, rpm, tipoCombustivel);
        setVolumeBagageiro(volumeBagageiro);
    }

    @Override
    public void entradaDados() {
        super.entradaDados();
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o volume do bagageiro: ");
        setVolumeBagageiro(sc.nextInt());
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.printf("Volume do bagageiro: %d", getVolumeBagageiro());
    }

    // metodos abstratos que devem ser implementados
    @Override
    public void acelerar() {
        motor.setRpm(motor.getRpm() + 200);
    }

    @Override
    public void desacelerar() {
        motor.setRpm(motor.getRpm() - 200);
    }

    @Override
    public void frear() {
        System.out.print("Moto freando");
    }

    @Override
    public void virarDireita() {
        System.out.print("Moto virando a direita");
    }

    @Override
    public void virarEsquerda() {
        System.out.print("Moto virando a esquerda");
    }

    public double desconto() {
        return getPreco() - (getPreco() * 0.08);
    }
}
