/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4.Exercicios;

/**
 *
 * @author Nicolas Caseio de Abreu
 */

//Exercício 2 (continuação)

public class Main {

    public static void main(String[] args) {
        Cadeira cadeira = new Cadeira();
        cadeira.setTipoEncosto('R');
        cadeira.setCor("Vermelha");
        cadeira.setNumeroParafusos(8);
        cadeira.setPossuiBraco(true);
        cadeira.setPesoMaximo(120.5);

        Mesa mesa = new Mesa();
        mesa.setNumeroPernas((byte) 4);
        mesa.setEspessura((short) 3);
        mesa.setLargura(1.5f);
        mesa.setMaterial("Madeira");
        mesa.setTemGaveta(false);

        Televisao tv = new Televisao();
        tv.setPolegadas((short) 55);
        tv.setVolumeAudio(30);
        tv.setMarca("Samsung");
        tv.setSmartTV(true);
        tv.setNumeroSerie(123456789L);

        Geladeira geladeira = new Geladeira();
        geladeira.setCapacidadeLitros(350L);
        geladeira.setAltura(1.8f);
        geladeira.setTipoDegelo('A');
        geladeira.setCor("Branca");
        geladeira.setPossuiFreezer(true);

        Carro carro = new Carro();
        carro.setAnoFabricacao(2020);
        carro.setVelocidadeMaxima(220.5);
        carro.setNumeroPortas((byte) 4);
        carro.setTemArCondicionado(true);
        carro.setModelo("Toyota Corolla");

        System.out.println("Cadeira:");
        System.out.println("Tipo Encosto: " + cadeira.getTipoEncosto());
        System.out.println("Cor: " + cadeira.getCor());
        System.out.println("Número Parafusos: " + cadeira.getNumeroParafusos());
        System.out.println("Possui Braço: " + cadeira.getPossuiBraco());
        System.out.println("Peso Máximo: " + cadeira.getPesoMaximo());

        System.out.println("\nMesa:");
        System.out.println("Número Pernas: " + mesa.getNumeroPernas());
        System.out.println("Espessura: " + mesa.getEspessura());
        System.out.println("Largura: " + mesa.getLargura());
        System.out.println("Material: " + mesa.getMaterial());
        System.out.println("Tem Gaveta: " + mesa.getTemGaveta());

        System.out.println("\nTelevisão:");
        System.out.println("Polegadas: " + tv.getPolegadas());
        System.out.println("Volume Áudio: " + tv.getVolumeAudio());
        System.out.println("Marca: " + tv.getMarca());
        System.out.println("Smart TV: " + tv.getSmartTV());
        System.out.println("Número Série: " + tv.getNumeroSerie());

        System.out.println("\nGeladeira:");
        System.out.println("Capacidade Litros: " + geladeira.getCapacidadeLitros());
        System.out.println("Altura: " + geladeira.getAltura());
        System.out.println("Tipo Degelo: " + geladeira.getTipoDegelo());
        System.out.println("Cor: " + geladeira.getCor());
        System.out.println("Possui Freezer: " + geladeira.getPossuiFreezer());

        System.out.println("\nCarro:");
        System.out.println("Ano Fabricação: " + carro.getAnoFabricacao());
        System.out.println("Velocidade Máxima: " + carro.getVelocidadeMaxima());
        System.out.println("Número Portas: " + carro.getNumeroPortas());
        System.out.println("Tem Ar Condicionado: " + carro.getTemArCondicionado());
        System.out.println("Modelo: " + carro.getModelo());
    }
}
