/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */
import java.util.Scanner;

public class Motor {

    private int potencia;
    private int rpm;
    private String tipoCombustivel;

    public Motor(int potencia, int rpm, String tipoCombustivel) {
        this.potencia = potencia;
        this.rpm = rpm;
        this.tipoCombustivel = tipoCombustivel;
    }

    public Motor(int potencia) {
        this.potencia = potencia;
    }

    public Motor(int potencia, String tipoCombustivel) {
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
    }

    public Motor(int potencia, int rpm) {
        this.potencia = potencia;
        this.rpm = rpm;
    }

    public Motor(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public Motor() {
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getRpm() {
        return rpm;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void cadastrar(int potencia, int rpm, String tipoCombustivel) {
        setPotencia(potencia);
        setRpm(rpm);
        setTipoCombustivel(tipoCombustivel);
    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Potência do motor: ");
        setPotencia(sc.nextInt());
        System.out.print("RPM do motor: ");
        setRpm(sc.nextInt());
        sc.nextLine();
        System.out.print("Tipo de combustível: ");
        setTipoCombustivel(sc.nextLine());
    }

    public void imprimir() {
        System.out.println("  Potência: " + potencia + " cv");
        System.out.println("  RPM: " + rpm);
        System.out.println("  Combustível: " + tipoCombustivel);
    }
}
