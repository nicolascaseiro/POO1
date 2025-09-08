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

public class Onibus extends Veiculo implements SegurancaVeicular {

    private int numeroPassageiros;
    private boolean banheiro;

    public Onibus(int numeroPassageiros, boolean banheiro, double preco, String marca, String placa, Motor motor) {
        super(preco, marca, placa, motor);
        this.numeroPassageiros = numeroPassageiros;
        this.banheiro = banheiro;
    }

    public Onibus(int numeroPassageiros, boolean banheiro, double preco, String marca, String placa) {
        super(preco, marca, placa);
        this.numeroPassageiros = numeroPassageiros;
        this.banheiro = banheiro;
    }

    public Onibus(int numeroPassageiros, boolean banheiro, String marca, String placa) {
        super(marca, placa);
        this.numeroPassageiros = numeroPassageiros;
        this.banheiro = banheiro;
    }

    public Onibus(int numeroPassageiros, boolean banheiro, String marca) {
        super(marca);
        this.numeroPassageiros = numeroPassageiros;
        this.banheiro = banheiro;
    }

    public Onibus(int numeroPassageiros, String mercedes, String preco, int par1, int par2, String diesel, int par3, boolean banheiro) {
        super(preco);
        this.numeroPassageiros = numeroPassageiros;
        this.banheiro = banheiro;
    }

    public Onibus(int numeroPassageiros, boolean banheiro) {
        this.numeroPassageiros = numeroPassageiros;
        this.banheiro = banheiro;
    }

    public Onibus(double preco, String marca, String placa, Motor motor) {
        super(preco, marca, placa, motor);
    }

    public Onibus(double preco, String marca, String placa) {
        super(preco, marca, placa);
    }

    public Onibus(String marca, String placa) {
        super(marca, placa);
    }

    public Onibus(String marca) {
        super(marca);
    }

    public Onibus(double preco) {
        super(preco);
    }

    public Onibus() {

    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public void setBanheiro(boolean banheiro) {
        this.banheiro = banheiro;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public boolean isBanheiro() {
        return banheiro;
    }

    public void cadastrar(double preco, String marca, String placa, int potencia, int rpm, String tipoCombustivel, int numeroPassageiros, boolean banheiro) {
        super.cadastrar(preco, marca, placa, potencia, rpm, tipoCombustivel);
        setNumeroPassageiros(numeroPassageiros);
        setBanheiro(banheiro);
    }

    @Override
    public void entradaDados() {
        super.entradaDados();
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o numero de passageiros: ");
        setNumeroPassageiros(sc.nextInt());

        System.out.print("Tem banheiro? True para sim ou False para não: ");
        setBanheiro(sc.nextBoolean());
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.printf("Numero de passageiros: %d\nPossui banheiro?: %s", getNumeroPassageiros(), isBanheiro());
    }

    @Override
    public void acelerar() {
        motor.setRpm(motor.getRpm() + 50);
    }

    @Override
    public void desacelerar() {
        motor.setRpm(motor.getRpm() - 50);
    }

    @Override
    public void frear() {
        System.out.print("Ônibus freando");
    }

    @Override
    public void virarDireita() {
        System.out.print("Ônibus virando a direita");
    }

    @Override
    public void virarEsquerda() {
        System.out.print("Ônibus virando a esquerda");
    }

    public double desconto() {
        return getPreco() - (getPreco() * 0.15);
    }
}
