/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pry.recuerdos;
 import java.util.Scanner;
public class PryRecuerdos {

    public static void main(String[] args) {
     Scanner scanner=new Scanner (System.in);
     
        String[] recMia;
        String[] recPedro;
        System.out.println("Ingrese los recuerdos de Pedro");
        String recuerdo1 =scanner.nextLine();
        recPedro=recuerdo1.split(",");
        
        System.out.println("Ingrese los recuerdos de Mia");
        String recuerdo2=scanner.nextLine();
        recMia=recuerdo2.split(",");

        System.out.println("Ingrese el orden que debemos de combinarlo");
        String[] indices=scanner.nextLine().split(",");
        
      
            if(indices.length==2){
            int combi=Integer.parseInt(indices[0].trim());
            int combi2=Integer.parseInt(indices[1].trim());
            if (combi<recPedro.length&&combi2<recMia.length){
                System.out.println("Sus recuerdos combinados es:"+recPedro[combi].trim()+" y " +recMia[combi2].trim());
            }
        }  
    }
}    
