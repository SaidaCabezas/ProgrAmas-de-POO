/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pryanimal;

/**
 *
 * @author Hp
 */
public class Ave extends Salvaje{
     public double Alas;
    public Ave(String nombre, int edad,double Alas) {
        super(nombre, edad);
        this.Alas=Alas;
    }
    public void volar(){
        System.out.println(nombre+ "esta volando con una envergada de "+Alas);
    }
    public void comer(){
        System.out.println(nombre+ "esta comiendo");
    }

    public double getAlas() {
        return Alas;
    }

    public void setAlas(double Alas) {
        this.Alas = Alas;
    }
    
    
}
