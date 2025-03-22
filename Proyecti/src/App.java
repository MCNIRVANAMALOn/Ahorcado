import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan  = new Scanner(System.in);
       String palabraSecreta = "inteligencia";
       int intentosMax = 10;
       int intentos = 0;
       boolean palabraAdivinada = false;

       char[] letrasAdivinadas = new char[palabraSecreta.length()];

       for (int i = 0; i < letrasAdivinadas.length; i++) {
        letrasAdivinadas[i] = '_';
       }  
        while (!palabraAdivinada && intentos < intentosMax ){
          System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + ")" + "letras");

           System.out.println("Introduce una letra por favor");
           // CharAt 0 toma la primera letra que escriba el usuario
           char letra  = Character.toLowerCase(scan.nextLine().charAt(0));
           
           boolean letraCorrecta =  false;
           for (int i = 0; i < palabraSecreta.length(); i++) {
            
            if( palabraSecreta.charAt(i) == letra){
              letrasAdivinadas[i] = letra; 
              letraCorrecta = true;
            }
           }
           if(!letraCorrecta){
            intentos++;
            System.out.println("Letra Incorrecta, te quedan " + (intentosMax - intentos) + " Intentos disponibles");
           }
           if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
            palabraAdivinada = true;
            System.out.println("Felicidades, haz adivinado la palabra secreta " + palabraSecreta);
           }
        }
        if (!palabraAdivinada){
          System.out.println("Has perdido, te quedaste sin intentos");
        }
        scan.close();
 


    }
}
