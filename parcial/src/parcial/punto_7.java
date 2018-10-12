package parcial;

import java.util.Arrays;
import java.util.Scanner;

public class punto_7 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int matA[][] = new int [3][3];
        int matB[][] = new int [3][3];
        int matR[][] = new int [3][3];
        int fila, columna;
        
        matA[0][0] = 1;
        matA[0][1] = 4;
        matA[0][2] = 7;
        matA[1][0] = 2;
        matA[1][1] = 5;
        matA[1][2] = 8;
        matA[2][0] = 3;
        matA[2][1] = 6;
        matA[2][2] = 9;
        for (int i = 0; i < matA.length; i++) {
            int[] is = matA[i];
            System.out.println(Arrays.toString(is));
        }
        System.out.println("\n");
        matB[0][0] = 1;
        matB[0][1] = -1;
        matB[0][2] = 2;
        matB[1][0] = 2;
        matB[1][1] = -1;
        matB[1][2] = 2;
        matB[2][0] = 3;
        matB[2][1] = -3;
        matB[2][2] = 0;
        for (int i = 0; i < matB.length; i++) {
            int[] is = matB[i];
            System.out.println(Arrays.toString(is));
        }
        System.out.println("\n");
        
        Scanner sc = new Scanner (System.in);
         
        System.out.println("Ingrese los datos de la Matriz A :");
         
        for (fila=0; fila < matA.length; fila++){
            for (columna = 0; columna < matA[fila].length; columna++){
                System.out.print("Escribir valor " + fila + " , " + columna + " : ");
                matA[fila][columna]= sc.nextInt();
            }
        }           
        System.out.println("Ingrese los datos de la Matriz B :");  
        for (fila = 0; fila < matB.length; fila++){
            for (columna=0; columna < matB[fila].length; columna++){
                System.out.print("Escribir valor " + fila + " , " + columna + " : ");
                matB [fila][columna]= sc.nextInt();
            }
        }
        for (fila = 0; fila < matR.length; fila++){
            for (columna = 0; columna < matR[fila].length; columna++){
                for (int vueltas = 0; vueltas < matR.length; vueltas++) {
                    matR[fila][columna] += matA[fila][vueltas] * matB[vueltas][columna]; 
                }
            }
        }
            
        System.out.println("Matriz resultante de la multiplicación :");
        for (fila=0;fila<=2;fila++){
            for (columna=0;columna<=2;columna++) {
                System.out.print(matR[fila][columna] + " ");
            }
            System.out.println("");
            
        }
    }
}