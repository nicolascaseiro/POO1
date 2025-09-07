/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author Nicolas Caseio de Abreu
 */
public class Homem extends Humano {

    boolean barba, bigode;
    double peitoral;

    public void setBarba(boolean b) {
        barba = b;
    }

    public void setBigode(boolean b) {
        bigode = b;
    }

    public void setPeitoral(double p) {
        peitoral = p;
    }

    public boolean getBarba() {
        return barba;
    }

    public boolean getBigode() {
        return bigode;
    }

    public double getPeitoral() {
        return peitoral;
    }
}
