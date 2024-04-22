package com.mycompany.centrofauna;

import java.util.Date;

/**
 *
 * @author Paco
 */
public abstract class Animal {

    //especie no se si va aqui o con la herencia no hace falta
    Date fecha_entrada;
    String especie;
    double peso;
    String gravedad;

    public Animal(Date fecha_entrada, String especie, double peso, String gravedad) {
        this.fecha_entrada = fecha_entrada;
        this.especie = especie;
        this.peso = peso;
        this.gravedad = gravedad;
    }

    public Animal(Date fecha_entrada, String especie, String gravedad) {
        this.fecha_entrada = fecha_entrada;
        this.especie = especie;
        this.gravedad = gravedad;
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
        return "Animal{" + "fecha_entrada=" + fecha_entrada + ", especie=" + especie + ", peso=" + peso + ", gravedad=" + gravedad + '}';
    }

}
