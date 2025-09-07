/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */
public class Humano {

    String sexo, nome;
    int idade;
    double peso, altura;

    public void setSexo(String s) {
        sexo = s;
    }

    public void setNome(String n) {
        nome = n;
    }

    public void setIdade(int i) {
        idade = i;
    }

    public void setPeso(double p) {
        peso = p;
    }

    public void setAltura(double a) {
        altura = a;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}
