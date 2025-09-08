/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estaticos;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */

public class HerdaProduto extends Produto {
    protected final static double LUCROMAXIMO = 85.00;

    public static double calculaPreco(int quantidade) {
        precoUnitario = 13700.00;
        percentualLucro = LUCROMAXIMO;
        return calculaPrecoTotal(quantidade);
    }
}
