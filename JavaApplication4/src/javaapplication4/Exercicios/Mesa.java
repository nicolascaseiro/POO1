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

public class Mesa {

    byte numeroPernas;
    short espessura;
    float largura;
    String material;
    boolean temGaveta;

    public void setNumeroPernas(byte numeroPernas) {
        this.numeroPernas = numeroPernas;
    }

    public void setEspessura(short espessura) {
        this.espessura = espessura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setTemGaveta(boolean temGaveta) {
        this.temGaveta = temGaveta;
    }

    public byte getNumeroPernas() {
        return numeroPernas;
    }

    public short getEspessura() {
        return espessura;
    }

    public float getLargura() {
        return largura;
    }

    public String getMaterial() {
        return material;
    }

    public boolean getTemGaveta() {
        return temGaveta;
    }
}
