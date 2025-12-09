/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopropuesto85;

/**
 *
 * @author USER
 */
public class Habitación {
    private int númeroHabitación; 
    private boolean disponible; 
    private double precioDía;
    private Huésped huésped;
    
    public Habitación(int númeroHabitación, boolean disponible,double precioDía) {
    this.númeroHabitación = númeroHabitación;
    this.disponible = disponible;
    this.precioDía = precioDía;
}

public int getNúmeroHabitación() {
    return númeroHabitación;
}

public boolean getDisponible() {
    return disponible;
}

public double getPrecioDía() {
    return precioDía;
}

public Huésped getHuésped() {
    return huésped;
}

public void setHuésped(Huésped huésped) {
    this.huésped = huésped;
}

public void setDisponible(boolean disponible) {
    this.disponible = disponible;
}
}
