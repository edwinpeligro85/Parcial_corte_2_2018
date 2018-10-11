package parcial;

import java.util.Scanner;//Importamos la clase Scanner

public class Punto_1 {
    
  public static void main(String[] args) {
    // El codigo inicia aqui:
    try{ // El codigo esta encerrado en una excepciòn por si ocurre un error no esperado.
      float suma;//Declaro una variable que guarde el resultado de la suma.
      float num1, num2;//Declaro las variable que guardan los numeros a sumar.
      
        //Mando un mensaje por pantalla pidiendo el primer numero
        System.out.print("Ingrese el primer numero: ");
    
        //Creo un objeto tipo scanner de nombre "sc" para tomar los numero por teclado.
        Scanner sc = new Scanner(System.in);
     
        //Le asigno el primer dato obtenido por teclado a la variable "num1".
        num1 = sc.nextFloat();
    
        //Mando un mensaje por pantalla pidiendo el segundo numero. 
        System.out.print("Ingrese el segundo numero: ");
     
        //Le asigno el seundo dato obtenido por teclado a la variable "num2".
        num2 = sc.nextFloat();
     
        //Aqui realizo la suma de los numeros y la asigno a la variable "suma".
        suma = num1 + num2;
      
        //Imprimo el resultado por pantalla.
            System.out.println("\n"+"\t El resultado de la suma es: "+suma);
    }
    catch(Exception ex){
        // Este mensaje se mostrará en caso que ocurra una excepciòn.
        System.out.println("\t !!Por favor ingrese solo numeros!!");
    }
  }
}