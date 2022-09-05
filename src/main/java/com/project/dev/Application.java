/*
 * @fileoverview {Application} se encarga de realizar tareas especificas.
 *
 * @version             1.0
 *
 * @author              Dyson Arley Parra Tilano <dysontilano@gmail.com>
 * Copyright (C) Dyson Parra
 *
 * @History v1.0 --- La implementacion de {Application} fue realizada el 31/07/2022.
 * @Dev - La primera version de {Application} fue escrita por Dyson A. Parra T.
 */
package com.project.dev;

import com.project.dev.recursion.Factorial;
import com.project.dev.recursion.Fibonacci;

/**
 * TODO: Definición de {@code Application}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public class Application {

    /**
     * Entrada principal del sistema.
     *
     * @param args argumentos de la linea de comandos.
     */
    public static void main(String[] args) {
        int fib = 10;
        System.out.println("Fibonacci of " + fib + ": " + Fibonacci.getFibonacci(fib));

        int fact = 10;
        System.out.println("Factorial of " + fact + ": " + Factorial.getFactorial(fact));
    }

}
