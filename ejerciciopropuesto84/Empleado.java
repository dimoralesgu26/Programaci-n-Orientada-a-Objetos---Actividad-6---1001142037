/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopropuesto84;

/**
 *
 * @author USER
 */
public class Empleado {
    public String nombre; 
    public String apellidos; 
    public double salarioDia; 
    public double otrosIngresos; 
    public double pagosSalud; 
    public double aportePensiones;
    public int diasTrabajados;
    public TipoCargo cargo; 
    public TipoGenero genero;

public Empleado(String nombre, String apellidos, TipoCargo cargo, TipoGenero genero, double salarioDia, int díasTrabajados, double otrosIngresos, double pagosSalud, double aportePensiones) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.cargo = cargo;
    this.genero = genero;
    this.salarioDia = salarioDia;
    this.diasTrabajados = díasTrabajados;
    this.otrosIngresos = otrosIngresos;
    this.pagosSalud = pagosSalud;
    this.aportePensiones = aportePensiones;
}

public String getNombre() {
    return nombre;
}

public String getApellidos() {
    return apellidos;
}

public TipoCargo getCargo() {
    return cargo;
}

public TipoGenero getGenero() {
    return genero;
}

public double getOtrosIngresos() {
    return otrosIngresos;
}

public double getPagosSalud() {
    return pagosSalud;
}

public double getAportePensiones() {
    return aportePensiones;
}

public double calcularNómina() {
    return ((salarioDia * diasTrabajados) + otrosIngresos - pagosSalud - aportePensiones);
}
public double getSalarioDía() {
    return salarioDia;
}

public int getDíasTrabajados() {
    return diasTrabajados;
}
}