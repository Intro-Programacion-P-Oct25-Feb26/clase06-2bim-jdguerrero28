/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes﻿​_
 */
public class Ejemplo052 {

    public static void main(String[] args) {
        boolean bandera = true;

        while (bandera) {
            try {
                Scanner entrada = new Scanner(System.in);
                System.out.println("Ingrese valor 1:");
                int valor1 = entrada.nextInt(); // 20 - se espera un valor entero 
                System.out.println("Ingrese valor 2:");
                int valor2 = entrada.nextInt(); // 2 - se espera un valor entero // 0
                int resultado = valor1 / valor2; // 20/2 >> 10

                System.out.printf("Resultado %d\n", resultado); // 10
                bandera = false;
                /*
                Aqui en el codigo tenemos un ciclo While el cual nos va permitir
                seguir dentro del ciclo hasta que el usuario ingrese bien los 
                datos pedidos por teclado, sino este seguira repitiendose infinitamente.
                 */
            } catch (InputMismatchException inputMismatchException) {

                System.out.printf("Existe un error de tipo %s\n",
                        inputMismatchException);
            } catch (ArithmeticException arithmeticException) {

                System.out.println("Lo sentimos hay un error");
                System.out.printf("De tipo %s\n", arithmeticException);

            }
        }

        System.out.println("Continuamos");

    }
}
