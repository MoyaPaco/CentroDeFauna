package com.mycompany.centrofauna;

import java.util.Date;

/**
 *
 * @author Paco y Mario
 */
public class Ave extends Animal {

<<<<<<< Updated upstream
    boolean motivoCaza;
=======
    boolean caza;
    Date fecha_baja;
>>>>>>> Stashed changes

    public Ave(boolean motivoCaza, Date fecha_entrada, String especie, double peso, String tipo_lesion, String gravedad) {
        super(fecha_entrada, especie, peso, tipo_lesion, gravedad);
        this.motivoCaza = motivoCaza;
    }

<<<<<<< Updated upstream
    public boolean isMotivoCaza() {
        return motivoCaza;
=======
    public Ave(boolean caza, Date fecha_baja, Date fecha_entrada, String especie, double peso, String gravedad) {
        super(fecha_entrada, especie, peso, gravedad);
        this.caza = caza;
        this.fecha_baja = fecha_baja;
    }

    public boolean isCaza() {
        return caza;
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
=======

    }

    @Override
    public String toString() {
        String texto;
        if (fecha_baja != null) {
            texto = "Tipo: AVE, Especie: " + especie + ", Peso: " + peso + ", Fecha Entrada: " + fecha_entrada + ", Tipo Lesión: " + caza + "Gravedad Lesión : " + gravedad;

        } else {
            texto = "Tipo: AVE, Especie: " + especie + ", Peso: " + peso + ", Fecha Entrada: " + fecha_entrada + ", Tipo Lesión: " + caza + "Gravedad Lesión : " + gravedad + "Fecha Baja: " + fecha_baja;
        }
        return texto;
>>>>>>> Stashed changes
    }

}
