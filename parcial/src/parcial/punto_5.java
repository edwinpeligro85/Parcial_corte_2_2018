package parcial;

public class punto_5 {

    public static void main(String[] args) {
        // Aqui inicia el codigo
     //Declaro una variable "suma" que guarda el resultado de la suma.
     int suma = 0;
     //Creo una matriz de numeros enteros 10*10.
     int mat[][] = new int[10][10];
        //Hago un cliclo que recorre la matriz
        for(int f = 0; f < mat.length; f++){
           for(int c = 0; c < mat[f].length; c++){
              mat[f][c] = (int) (Math.random()*9);//Le asigno numeros aleatorios a la matriz.
              
              System.out.print("\t"+mat[f][c]);//Imprimo la matriz con una tabulación.
              if (f == c){/*Hago una condicion indicando que se detenga en las
                            pocisiones donde sean igual fila y columna.
                          
                  Sumo la variable "suma" com el numero que hay en la pocision donde se detuvo y 
                  le asigno el resutado a la variable suma. */  
                  suma += mat[f][c];
                }
            }
            System.out.println("\n");//imprimo un salto de linea.
        }
        //Imprimo el resultado de la suma.
        System.out.println("\n \t\t\t Suma de la diagonal pribcipal: "+suma);
    }
}