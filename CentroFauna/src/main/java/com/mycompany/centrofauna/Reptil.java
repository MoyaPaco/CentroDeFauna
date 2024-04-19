package com.mycompany.centrofauna;

import java.util.Date;

/**
 *
 * @author Paco y Mario
 */
public class Reptil extends Animal {

    boolean motivoInfeccion;

    public Reptil(boolean motivoInfeccion, Date fecha_entrada, String especie, double peso, String gravedad) {
        super(fecha_entrada, especie, peso, gravedad);
        this.motivoInfeccion = motivoInfeccion;
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
        return "Tipo: REPTIL, Especie: " + especie + ", Peso: " + peso + ", Fecha Entrada: " + fecha_entrada + ", Tipo Lesión: " + motivoInfeccion + "Gravedad Lesión : " + gravedad;
    }
}
