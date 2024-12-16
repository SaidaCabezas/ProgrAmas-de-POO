/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pryanimal;


public class Mamifero extends Salvaje {
    public String tipodepelaje ;

    public Mamifero( String nombre, int edad,String tipodepelaje) {
        super(nombre, edad);
        this.tipodepelaje = tipodepelaje;
        this.nombre = nombre;
    }
 
    public void amamantar(){
        System.out.println(nombre+ "esta amamantando sus crias");
    }
    public void comer(){
        System.out.println(nombre+ "esta comiendo");
    }

    public String getTipodepelaje() {
        return tipodepelaje;
    }

    public void setTipodepelaje(String tipodepelaje) {
        this.tipodepelaje = tipodepelaje;
    }
    
    
}
