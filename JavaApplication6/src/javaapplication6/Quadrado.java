/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author Nicolas Caseio de Abreu
 */
public class Quadrado {

    double base;

    public Quadrado() {
    }

    public Quadrado(double b) {
        base = b;
    }

    public void setBase(double b) {
        base = b;
    }

    public double getBase() {
        return base;
    }

    public double area() {
        return base * base;
    }

    public double volume() {
        return base * base * base;
    }
}
