/*
 * @fileoverview    {Application} se encarga de realizar tareas específicas.
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementación realizada.
 * @version 2.0     Documentación agregada.
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
