package com.mycompany.centrofauna;

import java.util.Date;

/**
 *
 * @author Paco y Mario
 */
public class Ave extends Animal {

    boolean caza;

    public Ave(boolean caza, Date fecha_entrada, String especie, double peso, String gravedad) {
        super(fecha_entrada, especie, peso, gravedad);
        this.caza = caza;
    }

    public boolean isCaza() {
        return caza;
    }

    public void setCaza(boolean caza) {
        this.caza = caza;
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
}
