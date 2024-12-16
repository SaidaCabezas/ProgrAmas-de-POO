/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pryanimal;

/**
 *
 * @author Hp
 */
public class Salvaje {
    public String nombre;
    public int edad;
    
    public Salvaje(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("ingrese el nombre");
        
    }
   
    public void metcomer(){
        System.out.println(nombre+ "esta comiendo");
       
    }
    public void metdormir(){
        System.out.println(nombre+ "esta durmiendo");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
