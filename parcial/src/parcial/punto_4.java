package parcial;

public class punto_4 {

    public static void main(String[] args) {
        //inicio del programa.
        int [] num = {10,5,1,20,3,6,90,6,12,10};   // Arreglo a ordenar
      
        for (int i = 0; i <= 9; i++) {             // Ciclo que controla una posicion del arreglo
            for (int j = 0; j <= 9; j++) {         // Ciclo que controla otra posicion del arreglo
                
                if(num[i] <= num [j]){             // condicion 
                    int t = num[i];                // Auxiliar que guarda la posicion y pueda continuar el proceso.
                    num[i] = num[j];               //No perder la posicion del arreglo 
                    num[j] = t;                                   
                }
            }
        }
        for (int i = 0; i <= 9;i++){               //Ciclo que imprime el arreglo 
            System.out.print(num[i]+ " ");
        }
    }
}//Fin del programa.