/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */
public class Classe {

    public static double calculaTotal(int dias) {
        if (dias > 15) {
            return dias * 80;
        } else {
            return dias * 105;
        }
    }

    public static double calculaINSS(double salario) {
        if (salario <= 600.00) {
            return 0;
        } else if (salario <= 1200.00) {
            return salario * 0.20;
        } else if (salario <= 2000.00) {
            return salario * 0.25;
        } else {
            return salario * 0.30;
        }
    }

    public static boolean ePar(int numero) {
        return numero % 2 == 0;
    }

    public static boolean eDivisivel(int numero1, int numero2) {
        return numero1 % numero2 == 0;
    }

    public static long fatorial(long numero) {
        long resultado = 1;
        for (long i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static double precoTotal(int codigoProduto, int quantidade) {
        double precoUnitario = 0;
        switch (codigoProduto) {
            case 1:
                precoUnitario = 7.00;
                break;
            case 2:
                precoUnitario = 10.00;
                break;
            case 3:
                precoUnitario = 15.00;
                break;
            default:
                System.out.println("Código de produto inválido.");
                return 0;
        }
        return precoUnitario * quantidade;
    }
}
