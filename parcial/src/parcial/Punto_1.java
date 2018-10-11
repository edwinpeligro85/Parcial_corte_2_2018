package parcial;

import java.util.Scanner;

public class Punto_1 {
    
  public static void main(String[] args) {
    // El codigo inicia aqui:
    Scanner teclado;
        float primerNumero, segundoNumero;
 
        teclado = new Scanner(System.in);
        System.out.print( "Introduzca el primer número real: " );
        primerNumero = teclado.nextFloat();
        System.out.print( "Introduzca el segundo número real: " );
        segundoNumero = teclado.nextFloat(); 
 
        System.out.print( "Su suma es: " );
        System.out.println( primerNumero+segundoNumero );
    }
}
 