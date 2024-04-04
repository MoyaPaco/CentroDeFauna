package com.mycompany.centrofauna;

import java.util.Date;

/**
 *
 * @author Paco y Mario
 */
public class Ave extends Animal {

    boolean motivoCaza;

    public Ave(boolean motivoCaza, Date fecha_entrada, String especie, double peso, String tipo_lesion, String gravedad) {
        super(fecha_entrada, especie, peso, tipo_lesion, gravedad);
        this.motivoCaza = motivoCaza;
    }

    public boolean isMotivoCaza() {
        return motivoCaza;
    }

    public void setMotivoCaza(boolean motivoCaza) {
        this.motivoCaza = motivoCaza;
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

    public String getTipo_lesion() {
        return tipo_lesion;
    }

    public void setTipo_lesion(String tipo_lesion) {
        this.tipo_lesion = tipo_lesion;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }
}
