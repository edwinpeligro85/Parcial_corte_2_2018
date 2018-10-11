package parcial;

public class punto_2 
{

    public static void main(String[] args) 
    {
        // Este es el comienzo del codigo
        
      int pisos = 5;   // Declarar una variable de tipo entero( pisos ) para indicar el numero de pisos de la piramide.        
      
        for (int x = 1; x <=pisos; x++)  // Este ciclo me controla los pisos.
        {
            for (int j=pisos; j>= x;j--) // Este ciclo controla el numero de (*) que se van a mostrar.
            {
              System.out.print("*");   // Imprimi los (*) sin salto de linea.
                
            }
            System.out.println();  //Imprimi un salto de linea.
        }
            
    }
}