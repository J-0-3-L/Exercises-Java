package Rompecabeza;
import java.util.List;

public class PuzzleJavaTest {
    public static void main(String[] args){
        PuzzleJava play = new PuzzleJava();

        //Ejercicio1:
        int[] sum=new int[] {3,5,1,2,7,9,8,13,25,32};
        int result=play.sumaArreglo(sum);
        System.out.println(result);

        //Ejercicio2:
        String palabra = "Nancy";
        String palabra2 = "Jinichi";
        String palabra3 = "Fujibayashi";
        String palabra4 = "Momochi";
        String palabra5 = "Ishikawa";

        List<String> resultado = play.combinacionPalabra(palabra, palabra2, palabra3, palabra4, palabra5);
        System.out.println(resultado);

        //Ejercicio3:
        play.alfabeto();

        //Ejercicio4:
        play.numAleatorio();

        //Ejercicio5:
        play.numOrdenado();

        //Ejercicio6:
        play.cadenaAleatoria();

        //Ejercicio7:
        play.arregloAleatorio();



    }
}
