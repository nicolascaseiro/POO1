/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author Nicolas Caseio de Abreu
 */
public class Homem extends Humano {

    boolean barba, bigode;
    double peitoral;

    public Homem() {
        this.sexo = "Masculino";
    }

    public void setBarba(boolean barba) {
        this.barba = barba;
    }

    public void setBigode(boolean bigode) {
        this.bigode = bigode;
    }

    public void setPeitoral(double peitoral) {
        this.peitoral = peitoral;
    }

    public boolean getBarba() {
        return this.barba;
    }

    public boolean getBigode() {
        return this.bigode;
    }

    public double getPeitoral() {
        return this.peitoral;
    }

    public String amamentar() {
        return "Homens usam mamadeiras";
    }
}
