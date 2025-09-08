/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5.Exercicios;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */

//Exercício 2b (continuação)

import java.util.Scanner;

public class Geladeira {

    private String marca;
    private String modelo;
    private short capacidadeLitros;
    private boolean frostFree;
    private float consumoKWh;
    private char eficiencia;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidadeLitros(short capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
    }

    public void setFrostFree(boolean frostFree) {
        this.frostFree = frostFree;
    }

    public void setConsumoKWh(float consumoKWh) {
        this.consumoKWh = consumoKWh;
    }

    public void setEficiencia(char eficiencia) {
        this.eficiencia = eficiencia;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public short getCapacidadeLitros() {
        return capacidadeLitros;
    }

    public boolean isFrostFree() {
        return frostFree;
    }

    public float getConsumoKWh() {
        return consumoKWh;
    }

    public char getEficiencia() {
        return eficiencia;
    }

    public void entrada() {
        Scanner sc = new Scanner(System.in);
        setMarca(sc.nextLine());
        setModelo(sc.nextLine());
        setCapacidadeLitros(sc.nextShort());
        setFrostFree(sc.nextBoolean());
        setConsumoKWh(sc.nextFloat());
        setEficiencia(sc.next().charAt(0));
    }

    public void imprimir() {
        System.out.println(marca + " " + modelo + " " + capacidadeLitros + " " + frostFree + " " + consumoKWh + " " + eficiencia);
    }

    public void cadastrar(String marca, String modelo, short capacidade) {
        setMarca(marca);
        setModelo(modelo);
        setCapacidadeLitros(capacidade);
    }

    public void cadastrar(String marca, boolean frostFree, float consumo) {
        setMarca(marca);
        setFrostFree(frostFree);
        setConsumoKWh(consumo);
    }

    public void cadastrar(String marca, String modelo, short capacidade, boolean frostFree, float consumo, char eficiencia) {
        setMarca(marca);
        setModelo(modelo);
        setCapacidadeLitros(capacidade);
        setFrostFree(frostFree);
        setConsumoKWh(consumo);
        setEficiencia(eficiencia);
    }

    public Geladeira() {
    }

    public Geladeira(String marca) {
        this.marca = marca;
    }

    public Geladeira(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Geladeira(String marca, String modelo, short capacidade) {
        this(marca, modelo);
        this.capacidadeLitros = capacidade;
    }

    public Geladeira(String marca, String modelo, short capacidade, boolean frostFree) {
        this(marca, modelo, capacidade);
        this.frostFree = frostFree;
    }

    public Geladeira(String marca, String modelo, short capacidade, boolean frostFree, float consumo) {
        this(marca, modelo, capacidade, frostFree);
        this.consumoKWh = consumo;
    }

    public Geladeira(String marca, String modelo, short capacidade, boolean frostFree, float consumo, char eficiencia) {
        this(marca, modelo, capacidade, frostFree, consumo);
        this.eficiencia = eficiencia;
    }

    public Geladeira(boolean frostFree, char eficiencia) {
        this.frostFree = frostFree;
        this.eficiencia = eficiencia;
    }

    public Geladeira(String marca, float consumo) {
        this.marca = marca;
        this.consumoKWh = consumo;
    }

    public Geladeira(short capacidade, char eficiencia) {
        this.capacidadeLitros = capacidade;
        this.eficiencia = eficiencia;
    }
}
