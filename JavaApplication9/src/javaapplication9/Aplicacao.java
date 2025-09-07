/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author Nicolas Caseio de Abreu
 */
import Estaticos.Produto;
import Estaticos.HerdaProduto;

public class Aplicacao {

    public static void main(String[] args) {
        double peso;

        peso = Produto.getPeso();
        System.out.println("Peso Unitário = " + peso);

        System.out.println("Peso de 2 Unidades = " + (Produto.getPeso() * 2));

        System.out.println("Preço Final: " + Produto.calculaPrecoTotal(2));

        Produto.setPeso(3.15);
        System.out.println("Peso Unitário = " + Produto.getPeso());

        System.out.println("Preço Final = " + HerdaProduto.calculaPreco(1));
    }
}
