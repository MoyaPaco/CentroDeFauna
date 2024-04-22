package com.mycompany.centrofauna;

import java.util.Date;

/**
 *
 * @author Paco y Mario
 */
public class Reptil extends Animal {

    boolean motivoInfeccion;
    Date fecha_baja;

    public Reptil(boolean motivoInfeccion, Date fecha_entrada, String especie, double peso, String gravedad) {
        super(fecha_entrada, especie, peso, gravedad);
        this.motivoInfeccion = motivoInfeccion;
    }

    public Reptil(boolean motivoInfeccion, Date fecha_baja, Date fecha_entrada, String especie, double peso, String gravedad) {
        super(fecha_entrada, especie, peso, gravedad);
        this.motivoInfeccion = motivoInfeccion;
        this.fecha_baja = fecha_baja;
    }

    public Date getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(Date fecha_baja) {
        this.fecha_baja = fecha_baja;
    }

    public boolean isMotivoInfeccion() {
        return motivoInfeccion;
    }

    public void setMotivoInfeccion(boolean motivoInfeccion) {
        this.motivoInfeccion = motivoInfeccion;
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
            texto = "Tipo: REPTIL, Especie: " + especie + ", Peso: " + peso + ", Fecha Entrada: " + fecha_entrada + ", Tipo Lesi贸n: " + motivoInfeccion + "Gravedad Lesi贸n : " + gravedad;
        } else {
            texto = "Tipo: REPTIL, Especie: " + especie + ", Peso: " + peso + ", Fecha Entrada: " + fecha_entrada + ", Tipo Lesi贸n: " + motivoInfeccion + "Gravedad Lesi贸n : " + gravedad + "Fecha Baja: " + fecha_baja;
        }
        return texto;
    }
}