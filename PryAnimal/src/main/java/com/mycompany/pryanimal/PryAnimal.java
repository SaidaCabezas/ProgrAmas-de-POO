/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pryanimal;

import java.util.Scanner; 

public class PryAnimal {

    public static void main(String[] args) { 
       Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del mamifero");
        String nomamifero=scanner.nextLine();
        scanner.nextLine();
        System.out.println("Ingrese el tipo de pelaje ");
        String tipodepelaje=scanner.nextLine();
 
        
        System.out.println("Ingrese el nombre de la ave");
        String noave=scanner.nextLine();
        scanner.nextLine();
        System.out.println("Ingrese cuanto mide las alas");
        double Alas = scanner.nextDouble();
        
        System.out.println("Ingrese el nombre del reptil");
        String notreptil=scanner.nextLine();
        scanner.nextLine();
        System.out.println("Ingrese el tipo de escamas");
        String tipodeescamas=scanner.nextLine();
        
        Mamifero metmamifero=new Mamifero(nomamifero,10,tipodepelaje);
        metmamifero.comer();
        metmamifero.amamantar();
        
        Ave metave=new Ave(noave,10,Alas);
        metave.comer();
        metave.volar();
        
        Reptil metreptil=new Reptil(notreptil,10,tipodeescamas);
        metreptil.comer();
        metreptil.arrastrar();
        
        scanner.close();
                
    }
}
