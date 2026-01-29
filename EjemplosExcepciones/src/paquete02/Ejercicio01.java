/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author jdieg
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        System.out.println("Ingrese valor 1:");
        int valor1 = ingresarValores();
        System.out.println("Ingrese valor 2:");
        int valor2 = ingresarValores();

        int suma = obtenerSuma(valor1, valor2);
        imprimir(valor1, valor2, suma);
    }

    public static int ingresarValores() {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        int resultado = 0;
        while (bandera) {
            try {
                resultado = entrada.nextInt();
                if (resultado % 2 != 0) {
                    throw new Exception("Número impar");
                } else {
                    bandera = false;
                }

            } catch (Exception e) {
                System.out.printf("Ocurrió una excepción %s\n", e);
                System.out.println("Ingrese nuevamente el valor:");
            }
        }
        return resultado;
    }

    public static void imprimir(int v1, int v2, int suma) {
        System.out.printf("La suma de %d + %d = %d", v1, v2, suma);
    }

    public static int obtenerSuma(int v1, int v2) {
        int suma = v1 + v2;
        return suma;
    }

}
