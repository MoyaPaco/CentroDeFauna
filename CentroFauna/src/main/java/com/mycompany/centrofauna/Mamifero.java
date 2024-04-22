package com.mycompany.centrofauna;

import java.util.Date;

/**
 *
 * @author Paco y Mario
 */
public class Mamifero extends Animal{
    boolean motivoAtropello;
    Date fecha_baja;

    public Mamifero(boolean motivoAtropello, Date fecha_entrada, String especie, double peso, String gravedad) {
        super(fecha_entrada, especie, peso, gravedad);
        this.motivoAtropello = motivoAtropello;
    }

    public Mamifero(boolean motivoAtropello, Date fecha_baja, Date fecha_entrada, String especie, double peso, String gravedad) {
        super(fecha_entrada, especie, peso, gravedad);
        this.motivoAtropello = motivoAtropello;
        this.fecha_baja = fecha_baja;
    }

    public Date getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(Date fecha_baja) {
        this.fecha_baja = fecha_baja;
    }



    public boolean isMotivoAtropello() {
        return motivoAtropello;
    }

    public void setMotivoAtropello(boolean motivoAtropello) {
        this.motivoAtropello = motivoAtropello;
    }

    public Date getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(Date fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }
    
    @Override
    public String toString() {
        String texto;
        if (fecha_baja == null) {
            texto = "Tipo: MAMÍFERO, Especie: " + especie + ", Peso: " + peso + ", Fecha Entrada: " + fecha_entrada + ", Tipo Lesión: " + motivoAtropello + "Gravedad Lesión : " + gravedad ;
        } else {
            texto = "Tipo: MAMÍFERO, Especie: " + especie + ", Peso: " + peso + ", Fecha Entrada: " + fecha_entrada + ", Tipo Lesión: " + motivoAtropello + "Gravedad Lesión : " + gravedad + "Fecha Baja: " + fecha_baja;
        }
        return texto;
    }
}