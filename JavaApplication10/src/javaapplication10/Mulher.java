/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */
public class Mulher extends Humano {

    boolean gravidez;
    double busto, cintura;

    public Mulher() {
        this.sexo = "Feminino";
    }

    public void setGravidez(boolean gravidez) {
        this.gravidez = gravidez;
    }

    public void setBusto(double busto) {
        this.busto = busto;
    }

    public void setCintura(double cintura) {
        this.cintura = cintura;
    }

    public boolean getGravidez() {
        return gravidez;
    }

    public double getBusto() {
        return busto;
    }

    public double getCintura() {
        return cintura;
    }

    public String amamentar() {
        return "Mulheres usam os seios";
    }
}
