/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author adria
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ejercicio1 ();
        
        //reinos();
       
    }

    public static void ejercicio1() {

        int num1, num2;

        Scanner escan = new Scanner(System.in);

        System.out.println("Digite el primer numero");
        num1 = escan.nextInt();
        System.out.println("Digite el segundo numero");
        num2 = escan.nextInt();
        System.out.println("La suma es : " + (num1 + num2) + '\n' + "La resta es : " + (num1 - num2) + '\n' + "El residuo es : " + (num1 % num2));

       
    }

    public static void reinos() {

        int opcion;

        Scanner escan = new Scanner(System.in);

        System.out.println("Digite el numero de la opción: \n 1.Bacterias \n 2.Hogos \n 3.Helechos\n 4.Algas\n 5.León ");
        opcion = escan.nextInt();

        if (opcion == 1) {

            System.out.println("Reino Mónera");
        } else {
            if (opcion == 2) {
                System.out.println("Reino Fungi");
            } else {
                if (opcion == 3) {
                    System.out.println("Reino Vegetal");
                } else {
                    if (opcion == 4) {
                        System.out.println("Reino Protoctista");
                    } else {
                        if (opcion == 5) {
                            System.out.println("Reino Animal");
                        }

                    }

                }
            }
        }
    }
   
    
    
    
    public static void ejercicio3() {

        int num;
        String notas="";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero del 1 al 7 "));

        switch (num) {

            case 1: {
                notas ="Do";
                break;
            }
            case 2: {
                notas ="Re";
                break;
            }
            case 3: {
                notas ="Mi";
                break;
            }
            case 4: {
                notas = "Fa";
                break;
            }
            case 5: {
                notas = "Sol";
                break;
            }

            case 6: {
                notas = "La";
                break;
            }
            case 7: {
                notas = "Si";
                break;
            }

            default: {
                notas = " El valor digitado no es valido ";
            }
            
    }
        JOptionPane.showMessageDialog(null,"La nota musical es:" +notas);
    }
    
   
    
    
    public static void ejercicio4() {

        int valor;

        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un valor entero "));

        for (int i = 0; i <= valor; i++) {

            JOptionPane.showMessageDialog(null, +i);
            //System.out.println(i);      
        }
    }

    public static void ejercicio5() {

        int valor;

        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un valor entero "));

        for (int i = 0; i <= valor; i = i + 3) {

            JOptionPane.showMessageDialog(null, +i);
        }
    }

    public static void ejercicio6() {

        int n;

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero "));

        if (n % 2 == 0) {

            JOptionPane.showMessageDialog(null, "Es par");
        } else {
            JOptionPane.showMessageDialog(null, "Es impar");
        }

    }

    public static void fibonacci() {

        int val1 = 0;
        int val2 = 1;
        int numero;
        int valor;

        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero entero"));
        JOptionPane.showMessageDialog(null, val1);
        JOptionPane.showMessageDialog(null, val2);
        while (val2 + val1 <= numero) {

            valor = val1;
            val1 = val2;
            val2 = valor + val1;

            JOptionPane.showMessageDialog(null, +val2);

        }

    }

    public static void ejercicio8() {

        final int NUMERO_ADIVINAR = 5;

        int numero = 0;
        int intentos = 3;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));

        if (numero == NUMERO_ADIVINAR && intentos <= 3) {
            JOptionPane.showMessageDialog(null, "Acceso Permitido");
        }
        while (numero != NUMERO_ADIVINAR && intentos >= 1) {
            intentos--;
            JOptionPane.showMessageDialog(null, "Acceso denegado");

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero de nuevo "));

            if (numero == NUMERO_ADIVINAR && intentos < 3) {
                JOptionPane.showMessageDialog(null, "Acceso Permitido");
            } else if (numero != NUMERO_ADIVINAR && intentos == 1) {

                JOptionPane.showMessageDialog(null, "Clave Bloqueada");

                break;
            }

        }

    }

    public static void creacion() {

        int valor;
        int promedio=0;
        int contador=0;
       
        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));
        
        for (int i = 1 ; i <= valor; i++)
        {

            if (i%4==0) { //Pedir al usuario un numero y desde 1 hasta n , va sacar los numeros multiplos de 4 para sumarlos y sacar el promedio . 

                promedio = i+promedio;
                contador=contador+1;
            } 
        }
        promedio=promedio/contador;
      JOptionPane.showMessageDialog(null, promedio);
    }

}
