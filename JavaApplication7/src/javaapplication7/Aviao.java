/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Nicolas Caseio de Abreu
 */
public class Aviao {

    public String prefixo, dataRevisao;
    public int capacidadeTanque, numeroPassageiros;
    public double preco;
    Motor motor1 = new Motor();
    Motor motor2 = new Motor();
    Motor motor3 = new Motor();
    Motor motor4 = new Motor();

    public Aviao() {
    }

    public Aviao(String prefixo, int capacidadeTanque, int numeroPassageiros, double preco, String dataRevisao,
            Motor motor1, Motor motor2, Motor motor3, Motor motor4) {
        this.prefixo = prefixo;
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
        this.dataRevisao = dataRevisao;
        this.motor1 = motor1;
        this.motor2 = motor2;
        this.motor3 = motor3;
        this.motor4 = motor4;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setDataRevisao(String dataRevisao) {
        this.dataRevisao = dataRevisao;
    }

    public String getDataRevisao() {
        return dataRevisao;
    }

    public void setMotor1(Motor motor1) {
        this.motor1 = motor1;
    }

    public Motor getMotor1() {
        return motor1;
    }

    public void setMotor2(Motor motor2) {
        this.motor2 = motor2;
    }

    public Motor getMotor2() {
        return motor2;
    }

    public void setMotor3(Motor motor3) {
        this.motor3 = motor3;
    }

    public Motor getMotor3() {
        return motor3;
    }

    public void setMotor4(Motor motor4) {
        this.motor4 = motor4;
    }

    public Motor getMotor4() {
        return motor4;
    }

    public void cadastrar(String prefixo, int capacidadeTanque, int numeroPassageiros, double preco, String dataRevisao,
            Motor motor1, Motor motor2, Motor motor3, Motor motor4) {
        this.prefixo = prefixo;
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
        this.dataRevisao = dataRevisao;
        this.motor1 = motor1;
        this.motor2 = motor2;
        this.motor3 = motor3;
        this.motor4 = motor4;
    }

    public void imprimir() {
        System.out.println("Prefixo: " + prefixo);
        System.out.println("Capacidade do Tanque: " + capacidadeTanque);
        System.out.println("Número de Passageiros: " + numeroPassageiros);
        System.out.println("Preço: " + preco);
        System.out.println("Data da Revisão: " + dataRevisao);
        System.out.println("Motor 1: ");
        motor1.imprimir();
        System.out.println("Motor 2: ");
        motor2.imprimir();
        System.out.println("Motor 3: ");
        motor3.imprimir();
        System.out.println("Motor 4: ");
        motor4.imprimir();
    }
}
