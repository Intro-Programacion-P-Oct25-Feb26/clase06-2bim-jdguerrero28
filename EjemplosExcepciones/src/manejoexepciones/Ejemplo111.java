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
 * @author reroes
 */
public class Ejemplo111 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese cantidad de divisiones a realizar");
        int valor = entrada.nextInt();
        int i = 0;
        while (i < valor) {
            try {
                System.out.println("Ingrese valor 1 a operar: ");
                int valor1 = entrada.nextInt(); // 200
                System.out.println("Ingrese valor 2 a operar: ");
                int valor2 = entrada.nextInt(); // 30
                if (valor1 < 0 || valor2 < 0) {
                    throw new Exception("Número negativos");
                } else if (valor1 > 100) {
                    throw new Exception("El valor de primer valor es muy alto");
                }
                i = i + 1;
                int resultado = valor1 / valor2;
                System.out.printf("Resultado %s\n", resultado);

            } catch (ArithmeticException e) {
                System.out.printf("(ArithmeticException) Ocurrió una "
                        + "excepción %s\n", e);
            } catch (InputMismatchException e) {
                System.out.printf("(InputMismatchException) Ocurrió una "
                        + "excepción %s\n", e);
            } catch (Exception e) {
                System.out.printf("Ocurrió una excepción %s\n", e);
            }
            entrada.nextLine();
        }
    }
}
