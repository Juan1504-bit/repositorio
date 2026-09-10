package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int[][] matriz = {
                {12, 42, 13},
                {64, 5, 16},
                {97, 18, 39}
        };

        // 1. Imprimir
        System.out.println("1. Matriz:");
        imprimirMatriz(matriz);

        // 2. Sumar todos
        System.out.println("2. Suma de todos: " + sumarMatriz(matriz));

        // 3. Sumar diagonal
        System.out.println("3. Suma de la diagonal: " + sumarDiagonal(matriz));

        // 4. Espiral
        System.out.println("4. Matriz en espiral:");
        espiral(matriz);

    }
    public static void imprimirMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sumarMatriz(int[][] matriz) {

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma = suma + matriz[i][j];
            }
        }

        return suma;
    }

    public static int sumarDiagonal(int[][] matriz) {

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            suma = suma + matriz[i][i];
        }

        return suma;
    }

    
    public static void espiral(int[][] matriz) {

        int arriba = 0;
        int abajo = matriz.length - 1;
        int izquierda = 0;
        int derecha = matriz[0].length - 1;

        while (arriba <= abajo && izquierda <= derecha) {

            // Izquierda a derecha
            for (int j = izquierda; j <= derecha; j++) {
                System.out.print(matriz[arriba][j] + " ");
            }
            arriba++;

            // Arriba hacia abajo
            for (int i = arriba; i <= abajo; i++) {
                System.out.print(matriz[i][derecha] + " ");
            }
            derecha--;

            // Derecha a izquierda
            if (arriba <= abajo) {
                for (int j = derecha; j >= izquierda; j--) {
                    System.out.print(matriz[abajo][j] + " ");
                }
                abajo--;
            }

            // Abajo hacia arriba
            if (izquierda <= derecha) {
                for (int i = abajo; i >= arriba; i--) {
                    System.out.print(matriz[i][izquierda] + " ");
                }
                izquierda++;
            }
        }
    }
}