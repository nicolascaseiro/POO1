/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Nicolas Caseio de Abreu
 */
public class Aplicacao {

    public static void main(String[] args) {
        Aviao a1 = new Aviao();
        a1.getMotor1().setPotenciaMaxima(1000);
        a1.getMotor2().setPotenciaMaxima(1000);
        a1.getMotor3().setPotenciaMaxima(1000);
        a1.getMotor4().setPotenciaMaxima(1000);

        a1.getMotor1().acelerar();
        a1.getMotor2().acelerar();
        a1.getMotor3().acelerar();
        a1.getMotor4().acelerar();

        a1.getMotor1().acelerar();
        a1.getMotor2().desacelerar();
        a1.getMotor3().acelerar(); 
        a1.getMotor4().desacelerar();

        a1.setPrefixo("PT-ABC");
        a1.setCapacidadeTanque(5000);
        a1.setNumeroPassageiros(150);
        a1.setPreco(150000000.00);
        a1.setDataRevisao("06-09-2025");

        a1.imprimir();
    }
}
