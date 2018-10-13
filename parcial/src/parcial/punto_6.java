package parcial;

import java.util.Scanner;

public class punto_6 {

    public static void main(String[] args) {
        //Inicio del Programa.
        Scanner scan = new Scanner(System.in);  // Leer una entrada por pantalla.
        System.out.println("Digite un numero entre el 1 y el 27 y te dire a que letra del abecedario pertenece:");
        int x ;  // Variable de tipo entero en el que se guarda la entrada por pantalla.
        x = scan.nextInt();    // Condicion que se indica que la entrada por pantalla es de tipo entero
        String [] abc = { "A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z" };// Arreglo con todas las letras del abecedario.
        
        for (int i = 0; i <=abc.length; i++){  // Ciclo que recorre todas las letras del abecedario.
            if (i+1 == x){                    // condicional en donde el numero digitado por pantalla sea igual a la posicion del arreglo.
                System.out.println("El numero "+x+" pertenece a la letra: "+abc[i]);  // Mostrar por pantalla la posicion en ese momento del arreglo.  
            }
        }    
    }
}//Fin del programa.