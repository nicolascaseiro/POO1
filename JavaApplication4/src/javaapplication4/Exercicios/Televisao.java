/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4.Exercicios;

/**
 *
 * @author movva
 */

//Exercício 2 (continuação)

public class Televisao {

    short polegadas;
    int volumeAudio;
    String marca;
    boolean smartTV;
    long numeroSerie;

    public void setPolegadas(short polegadas) {
        this.polegadas = polegadas;
    }

    public void setVolumeAudio(int volumeAudio) {
        this.volumeAudio = volumeAudio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setSmartTV(boolean smartTV) {
        this.smartTV = smartTV;
    }

    public void setNumeroSerie(long numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public short getPolegadas() {
        return polegadas;
    }

    public int getVolumeAudio() {
        return volumeAudio;
    }

    public String getMarca() {
        return marca;
    }

    public boolean getSmartTV() {
        return smartTV;
    }

    public long getNumeroSerie() {
        return numeroSerie;
    }
}
