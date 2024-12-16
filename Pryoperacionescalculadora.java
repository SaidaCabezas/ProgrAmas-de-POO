/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pryoperacionescalculadora;

/**
 *
 * @author Hp
 */
import java.util.Scanner;
public class Pryoperacionescalculadora {

    public static void main(String[] args) {
        //declaramos dos variables 
        int numero1;
        int numero2;
        int resultado;
        //realizamos el proceso para la suma 
        Scanner Scanner=new Scanner(System.in);
        // mostramos la salida
        System.out.println("Ingrese el primer numero");
        numero1=Scanner.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        numero2=Scanner.nextInt();
        // realizamos laoperacion que deseamos  que haga 
        resultado=numero1+numero2;
        // mostramos la salida 
        System.out.println("La suma del numero 1 + numero2= "+resultado);
        // realizamos el proceso para la resta 
        // mostrar la salida para la resta
        resultado=numero1-numero2;
        System.out.println("La resta del numero 1 - numero 2= "+resultado);
        // realizamos´el proceso para la division
        resultado=numero1 / numero2;
        System.out.println("La Division del numero 1 / numero2= "+resultado);
        //realizamos el proceso para la multiplicacion
        resultado=numero1*numero2;
        System.out.println("La multiplicacion del numero 1* numero2= "+resultado);
    }
        
    }

