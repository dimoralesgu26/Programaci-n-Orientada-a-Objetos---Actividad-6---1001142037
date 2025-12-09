/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopropuesto85;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Huésped {
    private String nombres; 
    private String apellidos; 
    private int documentoIdentidad;
    private Date fechaIngreso;
    private Date fechaSalida; 
    
public Huésped(String nombres, String apellidos, int documentoIdentidad) {
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.documentoIdentidad = documentoIdentidad;
}

public void setFechaSalida(Date fecha) {
    fechaSalida = fecha;
}

public void setFechaIngreso(Date fecha) {
    fechaIngreso = fecha;
}

public Date getFechaIngreso() {
    return fechaIngreso;
}

public int obtenerDíasAlojamiento() {
    int días = (int) ((fechaSalida.getTime() - fechaIngreso.getTime())/86400000);
return días;
}
}
