package parcial;

import java.util.Scanner;

public class punto_7 {

    public static void main(String[] args) {
        // Inicio del programa.
        int matA[][] = new int [3][3];                                          //Creo la matriz A.
        int matB[][] = new int [3][3];                                          //Creo la matriz B.
        int matR[][] = new int [3][3];                                          //Creo una matriz para guardar el resultado.
        int fila, columna;                                                      //Declaro dos variables tipo entero.
        
        Scanner sc = new Scanner (System.in);                                   //Creo un objeto tipo Scanner para tomar datos por teclado.
         
        System.out.println("Ingrese los datos de la Matriz A");               //Muestro por pantalla un mensaje indicando la matriz.
        for (fila=0; fila < matA.length; fila++){                               //Recorro las filas dela matriz (matA).
            for (columna = 0; columna < matA[fila].length; columna++){          //Recorro las columnas de la matriz (matA).
                System.out.print("Escribir valor "+fila+" , "+columna+" : ");   //Muestro por pantalla un mensaje indicando la posición.
                matA[fila][columna]= sc.nextInt();                              //Tomo por teclado los datos y los almaceno en la matriz(matA).
            }
        }System.out.println("\n");                                              //Salto de linea entre matriz.
        
        System.out.println("Ingrese los datos de la Matriz B");               //Muestro por pantalla un mensaje indicando la matriz.
        for (fila = 0; fila < matB.length; fila++){                             //Recorro las filas dela matriz (matB).
            for (columna=0; columna < matB[fila].length; columna++){            //Recorro las columnas de la matriz (matB).
                System.out.print("Escribir valor "+fila+" , "+columna+" : ");   //Muestro por pantalla un mensaje indicando la posición.
                matB [fila][columna]= sc.nextInt();                             //Tomo por teclado los datos y los almaceno en la matriz(matB).
            }
        }System.out.println("\n");                                              //Salto de linea entre matriz.
        
        //Cilo para hacer la multiplicación
        for (fila = 0; fila < matR.length; fila++){
            for (columna = 0; columna < matR[fila].length; columna++){
                for (int vueltas = 0; vueltas < matR.length; vueltas++) {
                    matR[fila][columna] += matA[fila][vueltas] * matB[vueltas][columna]; 
                }
            }
            System.out.println("");
        }System.out.println("");
        
        //Ciclo que Muestra la matriz A.
        System.out.println("Matriz A:");
        for (fila = 0; fila < matA.length; fila++){
            for (columna = 0;columna < matA[fila].length; columna++) {
                System.out.print("\t"+matA[fila][columna]);
            }
            System.out.println("");
        }System.out.println("\t\t");
        
        //Ciclo que muestra la matriz B.
        System.out.println("Matriz B:");
        for (fila = 0; fila < matB.length; fila++){
            for (columna = 0;columna < matB[fila].length; columna++) {
                System.out.print("\t"+matB[fila][columna]);
            }
            System.out.println("");
        }System.out.println("\t\t");
        
        //Ciclo que muestra el resultado.
        System.out.println("Resultado de la multiplicación :");
        for (fila = 0; fila < matR.length; fila++){
            for (columna = 0;columna < matR[fila].length; columna++) {
                System.out.print("\t"+matR[fila][columna]);
            }
            System.out.println("");
        }
    }
}//Fin del prigrama