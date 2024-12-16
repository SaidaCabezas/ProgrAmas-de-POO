/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pryanimal;

/**
 *
 * @author Hp
 */
public class Reptil extends Salvaje {
     public String tipodeescamas;
    public Reptil(String nombre, int edad,String tipodeescamas ) {
        super(nombre, edad);
        this.tipodeescamas=tipodeescamas;
    }
    public void comer(){
        System.out.println(nombre+ "esta comiendo");
    }
    public void arrastrar(){
        System.out.println(nombre+ "se esta arrastrando con sus escamas "+tipodeescamas);
    }

    public String getTipodeescamas() {
        return tipodeescamas;
    }

    public void setTipodeescamas(String tipodeescamas) {
        this.tipodeescamas = tipodeescamas;
    }
    
    
    
}
