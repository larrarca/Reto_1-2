/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto1_2_calculadora;

import javax.swing.JOptionPane;



/**
 *
 * @author larrc0
 */
public class clsCalculadora {
    //Constructor
     public clsCalculadora() {
    }
    
    //Métodos operaciones básicas
    public int sumar(int operando1, int operando2){
        int suma = operando1 + operando2;
        return suma;
    }
    public int restar(int operando1, int operando2){
        int resta = operando1 - operando2;
        return resta;
    }
    
    public int multiplicar(int operando1, int operando2){
        int multiplicacion = operando1 * operando2;
        return multiplicacion;
    }
    public double dividir(int operando1, int operando2){
        double division = operando1 / operando2;
        return division;
    }
    
    public double potenciar(int operando1, int operando2){
         double potencia = Math.pow(operando1, operando2);
        return potencia;
    }
    public double raizcuadrada(int operando1){
         double raiz = Math.sqrt(operando1);
        return raiz;
    }
    
}
