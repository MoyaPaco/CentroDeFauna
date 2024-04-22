package com.mycompany.centrofauna;

import java.util.Date;

/**
 *
 * @author Paco y Mario
 */
public class Ave extends Animal {

    boolean caza;
    Date fecha_baja;
    Date fecha_lib;

    public Date getFecha_lib() {
        return fecha_lib;
    }

    public void setFecha_lib(Date fecha_lib) {
        this.fecha_lib = fecha_lib;
    }

    public Ave(boolean caza, Date fecha_entrada, String especie, double peso, String gravedad) {
        super(fecha_entrada, especie, peso, gravedad);
        this.caza = caza;
    }

    public Ave(boolean caza, Date fecha_baja, Date fecha_entrada, String especie, double peso, String gravedad) {
        super(fecha_entrada, especie, peso, gravedad);
        this.caza = caza;
        this.fecha_baja = fecha_baja;
    }

    public Ave(boolean caza, Date fecha_lib, Date fecha_entrada, String especie, String gravedad) {
        super(fecha_entrada, especie, gravedad);
        this.caza = caza;
        this.fecha_lib = fecha_lib;
    }

    public Date getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(Date fecha_baja) {
        this.fecha_baja = fecha_baja;
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

    @Override
    public String toString() {
        String texto = "";
        if (this.fecha_baja != null && this.fecha_lib == null) {
            texto = "Tipo: AVE, Especie: " + especie + ", Peso: " + peso + ", Fecha Entrada: " + fecha_entrada + ", Tipo Lesión: " + caza + ", Gravedad Lesión : " + gravedad + ", Fecha Baja: " + fecha_baja;
        }
        if (this.fecha_lib != null && this.fecha_baja == null) {
            texto = "Tipo: AVE, Especie: " + especie  + ", Fecha Entrada: " + fecha_entrada + ", Tipo Lesión: " + caza + ", Gravedad Lesión : " + gravedad + ", Fecha Liberación: " + fecha_lib;
        }
        if (this.fecha_lib == null && this.fecha_baja == null) {
            texto = "Tipo: AVE, Especie: " + especie + ", Peso: " + peso + ", Fecha Entrada: " + fecha_entrada + ", Tipo Lesión: " + caza + " Gravedad Lesión : " + gravedad;
        }
        return texto;
    }
}
