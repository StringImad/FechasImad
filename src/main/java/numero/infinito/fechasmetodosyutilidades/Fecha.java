/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numero.infinito.fechasmetodosyutilidades;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author imad
 */
public class Fecha {

    private int dia;
    private int mes;
    private int anyo;
    //LocalDate fechaPredeterminada;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anyo = 2022;

        //fechaPredeterminada = LocalDate.of(2022, 1, 1);
    }

    public Fecha(int dia, int mes, int anyo) {

        if (comprobarFecha(dia, mes, anyo)) {
            this.dia = dia;
            this.mes = mes;
            this.anyo = anyo;

        } else {
            this.dia = 1;
            this.mes = 1;
            this.anyo = 2022;
        }

    }
//si devuelve true es que el formato de la fecha es correcto

    private boolean comprobarFecha(int dia, int mes, int anyo) {

        boolean fechaComprobada = true;
        try {
            LocalDate.of(dia, mes, anyo);
        } catch (IllegalArgumentException IAE) {
            fechaComprobada = false;
        }
        return fechaComprobada;
    }
}
