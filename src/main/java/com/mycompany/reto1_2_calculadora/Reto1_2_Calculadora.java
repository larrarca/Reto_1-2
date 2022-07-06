/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reto1_2_calculadora;

import java.util.Arrays;
import javax.swing.JOptionPane;


/**
 *
 * @author larrc0
 */
public class Reto1_2_Calculadora {
    public static void main(String[] args) {
        IniciarPrograma();
    }    

    public static void IniciarPrograma(){
        clsCalculadora calculadora = new clsCalculadora();
        int[] numeros;
        double resultado;
        
        String menu1 = "--------------------------\nSeleccione una opción: \n" +
                      "1. Realizar una operación \n" +
                      "2. Salir \n--------------------------";

        String menu2 = "--------------------------\nSeleccione una opción: \n" +
                      "1. Suma \n" +
                      "2. Resta \n" +
                      "3. Multiplicación \n" +
                      "4. División \n" +
                      "5. Potencia \n" +
                      "6. Raíz cuadrada de un número \n" +
                      "7. Salir \n--------------------------";
        
        String nivel1 = "";
        
        while(!nivel1.equals("2")){
            //Try catch para evitar que el programa termine si hay un error
            try{
                nivel1 = JOptionPane.showInputDialog(menu1);
                
                switch(nivel1){
                    case "1": 
                        String nivel2 = "";
                        while(!nivel2.equals("7")){
                            try{
                                nivel2 = JOptionPane.showInputDialog(menu2);
                                switch(nivel2){
                                    case "1": // Suma
                                        numeros = CapturaNumeros(true);
                                        resultado = calculadora.sumar(numeros[0], numeros[1]);
                                        resultado = Math.round(resultado*100.0)/100.0;
                                        JOptionPane.showMessageDialog(null,"El resultado es: " + resultado);
                                        break;
                                    case "2": //Resta
                                        numeros = CapturaNumeros(true);
                                        resultado = calculadora.restar(numeros[0], numeros[1]);
                                        JOptionPane.showMessageDialog(null,"El resultado es: " + resultado);
                                        break;
                                    case "3": //Multiplicación
                                        numeros = CapturaNumeros(true);
                                        resultado = calculadora.multiplicar(numeros[0], numeros[1]);
                                        JOptionPane.showMessageDialog(null,"El resultado es: " + resultado);
                                        break;
                                    case "4": //Division
                                        try{
                                            numeros = CapturaNumeros(true);
                                            resultado = calculadora.dividir(numeros[0], numeros[1]);
                                            resultado = Math.round(resultado*100.0)/100.0;
                                            JOptionPane.showMessageDialog(null,"El resultado es: " + resultado);
                                        break;
                                        }catch(Exception e){
                                                JOptionPane.showMessageDialog(null,"No es posible dividir por cero");
                                                break;
                                        }
                                        
                                    case "5": //Potencia
                                        numeros = CapturaNumeros(true);
                                        resultado = calculadora.potenciar(numeros[0], numeros[1]);
                                        resultado = Math.round(resultado*100.0)/100.0;
                                        JOptionPane.showMessageDialog(null,"El resultado es: " + resultado);
                                        break;
                                    case "6": //Raiz
                                        numeros = CapturaNumeros(false);
                                        resultado = calculadora.raizcuadrada(numeros[0]);
                                        resultado = Math.round(resultado*100.0)/100.0;
                                        JOptionPane.showMessageDialog(null,"El resultado es: " + resultado);
                                        break;
                                    case "7":    
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null,"Número no reconocido");
                                        break;
                                }
                            }catch(Exception e){
                                    break;
                            }
                        }
                        break;
                    case "2":
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Número no reconocido");
                        break;
                }        
            }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Cerrando el sistema!");
                    break;
            }
        }
    }
    
    static int[] CapturaNumeros(boolean flag) {
        String numero1="0";
        String numero2="0";

        if (flag){ //Captura dos numeros
            do {
                numero1 = JOptionPane.showInputDialog(null,"Ingrese el número 1:"); // Se ejecuta una vez.
            } while(!isNumeric(numero1));
            do {
                numero2 = JOptionPane.showInputDialog(null,"Ingrese el número 2:"); // Se ejecuta una vez.
            } while(!isNumeric(numero2));
        }else{ //Captupa un solo numero
            do {
                numero1 = JOptionPane.showInputDialog("Ingrese el número 1:"); // Se ejecuta una vez.
            } while(!isNumeric(numero1));
        }
        return new int[]{Integer.parseInt(numero1),Integer.parseInt(numero2)};        
        //return new int[]{1, 3, 6, 8, 10};
    }
   
    //Función que valida si la entrada digitada son numeros
    private static boolean isNumeric(String cadena){
            try {
                    Integer.parseInt(cadena);
                    return true;
            } catch (NumberFormatException nfe){
                    return false;
            }
    }    
    
}
