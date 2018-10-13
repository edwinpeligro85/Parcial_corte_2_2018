package parcial;
import java.util.Scanner;
public class Punto_3 {

    public static void main(String[] args) {
        //Inicio del progra:
       
        String nombre,color,objeto;//Declaro variables tipo String.
        String adj = "una";//Este va hacer el adjetivo del objeto.
        
        //creo un objeto tipo Scaner(datos) para tomar por teclado los datos.
        Scanner datos = new Scanner(System.in);
        
        //pido por pantalla distintos datos.
        System.out.println("Ingrese un nombre:");//Los datos tomados por el objeto "datos", 
            nombre = datos.next();              //los asigno a una variable en el orden de entrada.
            nombre = nombre.toLowerCase();      //Cambio mayusculas a minusculas.
        System.out.println("Ingrese un color:");
            color = datos.next();
            color = color.toLowerCase();
        System.out.println("Ingrese un objeto:");
            objeto = datos.next();
            objeto = objeto.toLowerCase();
        System.out.println("Ingrese una edad:");
            int edad = datos.nextInt();
            
            int pos = objeto.length()-1;    //Resto uno para obtener el índice del ultimo caracter.
            char fin = objeto.charAt(pos);  //Obtengo el carácter de la unltima posición.
            int pos2 = objeto.length()-2;   //Resto dos para obtener el índice del penultimo caracter.
            char fin2 = objeto.charAt(pos2);//Obtengo el carácter de la penunltima posición.
                
                //Condición para cambiar el tono del objeto.
                switch (fin){
                    case 'o':
                      adj = "un";
                    break;  
                    case 'i':
                      adj = "un";
                    break;
                }
                switch (fin2){
                    case 'o':
                      adj = "un";
                    break;  
                    case 'i':
                      adj = "un";
                    break;
                }
                    //muestro por pantalla un texto concatenado con las variables declaradas anteriormente.
                    System.out.println("Si  alguien supiera en qué piensa \n"
                    + ""+nombre+" cuando entrecierra  los ojos, a \n"
                    + "los "+edad+" años de edad, inclina un poco \n"
                    + "la cabeza hacia  abajo, hace chasquear los \n"
                    + "dedos, tiene "+adj+" "+objeto+" de color "+color+",\n"
                    + "curva hacia arriba  las cejas esta mañana,\n"
                    + "sonríe y aspira  hondo, preparándose para \n"
                    + "algo, juntando la fuerza necesaria para en\n"
                    + "el momento siguiente, actuar.");
    }
    
}//Fin del programa.