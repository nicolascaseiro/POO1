/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Nicolas Caseiro de Abreu
 */
public class RadioRelogio
{
    Radio radio = new Radio();
    Relogio relogio = new Relogio();

    public void setRadioHora(int hora)
    {
        radio.setHora(hora);
    }

    public int getRadioHora()
    {
        return radio.getHora();
    }

    public void setRadioMinuto(int minuto)
    {
        radio.setMinuto(minuto);
    }

    public int getRadioMinuto()
    {
        return radio.getMinuto();
    }

    public void setRadioSegundo(int segundo)
    {
        radio.setSegundo(segundo);
    }

    public int getRadioSegundo()
    {
        return radio.getSegundo();
    }

    public void setRadioHoraAlarme(int horaAlarme)
    {
        radio.setHoraAlarme(horaAlarme);
    }

    public int getRadioHoraAlarme()
    {
        return radio.getHoraAlarme();
    }

    public void setRadioMinutoAlarme(int minutoAlarme)
    {
        radio.setMinutoAlarme(minutoAlarme);
    }

    public int getRadioMinutoAlarme()
    {
        return radio.getMinutoAlarme();
    }

    public void setRelogioTipoFrequencia(String tipoFrequencia)
    {
        relogio.setTipoFrequencia(tipoFrequencia);
    }

    public String getRelogioTipoFrequencia()
    {
        return relogio.getTipoFrequencia();
    }

    public void setRelogioFaixa(String faixa)
    {
        relogio.setFaixa(faixa);
    }

    public String getRelogioFaixa()
    {
        return relogio.getFaixa();
    }

    public void setRelogioMemoria1(String memoria1)
    {
        relogio.setMemoria1(memoria1);
    }

    public String getRelogioMemoria1()
    {
        return relogio.getMemoria1();
    }

    public void setRelogioMemoria2(String memoria2)
    {
        relogio.setMemoria2(memoria2);
    }

    public String getRelogioMemoria2()
    {
        return relogio.getMemoria2();
    }

    public void setRelogioMemoria3(String memoria3)
    {
        relogio.setMemoria3(memoria3);
    }

    public String getRelogioMemoria3()
    {
        return relogio.getMemoria3();
    }
}
