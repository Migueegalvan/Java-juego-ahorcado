import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        /// clase scaner nos permite que el usuario escriba 
         Scanner scanner = new Scanner(System.in);
        // asignaciones  y declaraciones 
         String palabraSecreta = "inteligencia";
         int intentosMaximos = 10 ;
         int intentos = 0 ;
         boolean palabraAdivinada = false ;

         //arreglos 

         char[] letrasAdivinadas = new char[palabraSecreta.length()] ;


         // Estructura de control : interactiva ( bucle)
         for(int i = 0 ; i < letrasAdivinadas.length; i++){

            letrasAdivinadas[i] ='_';
          
         }
         // Estructura de control : interactiva ( bucle)

         while (!palabraAdivinada && intentos < intentosMaximos) {
                                                        // Esto se usa cuando tenemos una palabra de chars
            System.out.println("Palabra a adivinar : " + String.valueOf(letrasAdivinadas) +" (" +palabraSecreta.length() + "Letras )" );
            System.out.println("introduce una letra, por favor");
            /// Usamos la clase scanner para pedir una letra 
                         // si entra una letra en Mayuscula la pone en minuscula    
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false ;



            for(int i = 0 ; i <palabraSecreta.length() ; i ++){
                // estructura de control condicional 
                if (palabraSecreta.charAt(i)==letra ){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true ;

                }
            }
             if (!letraCorrecta) {
                intentos++ ; 
                System.out.println("Incorrecto! Te quedan "+(intentosMaximos-intentos)+ " intentos");
                
             }

             if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                /* para que salga del while  */
                palabraAdivinada = true ;

                System.out.println("Felcidades adivinaste la palabra secreta !");
                
             }

         }
         

         if (!palabraAdivinada) {
            System.out.println("Que pena te has quedado sin intentos! GAME OVER");
            
         }

         scanner.close();



         

    }
}
