package Rompecabeza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PuzzleJava {
    
    public int sumaArreglo(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if (arr[i] > 10) {
                System.out.println("Numero mayor a 10:");
                System.out.println(arr[i]);
            }
        }
        return sum;
    }

    public List<String> combinacionPalabra(String palabra, String palabra2, String palabra3, String palabra4, String palabra5) {
        List<String> group = new ArrayList<>();
        group.add(palabra);
        group.add(palabra2);
        group.add(palabra3);
        group.add(palabra4);
        group.add(palabra5);
        System.out.println(group);
        
        List<String> mayorChar = new ArrayList<>();
        Collections.shuffle(group);
        
        System.out.println("\nNombres mezclados:");
        for (String nombre : group) {
            System.out.println(nombre);
            if (nombre.length() > 5) {
                mayorChar.add(nombre);
            }
        }
        System.out.println("\nNombres con mas de 5 caracteres:");
        return mayorChar;
    }

    public void alfabeto(){
        List<Character> letras = new ArrayList<>();
        for (char i = 'A'; i <= 'Z'; i++) {
            letras.add(i);
        }
        Collections.shuffle(letras);

        char ultimaLetra = letras.get(letras.size() - 1);
        System.out.println("Ultima letra del arreglo: " + ultimaLetra);

        char primeraLetra = letras.get(0);
        System.out.println("Primera letra del arreglo: " + primeraLetra);

        if(primeraLetra=='A' || primeraLetra=='E' || primeraLetra=='I' || primeraLetra=='O' || primeraLetra=='U'){
            System.out.println("----"+"La primera letra es una vocal"+"----");
        }
    }

    public void numAleatorio() {
        List<Integer> num = new ArrayList<>();
        int cantidad = 10;
        int minimo = 55;
        int maximo = 100;
        int[] numeros = new int[cantidad];

        Random r = new Random();
        for (int i = 0; i < cantidad; i++) {
            int numero;
            do {
                numero = r.nextInt(maximo - minimo + 1) + minimo;
            } while (num.contains(numero));

            numeros[i] = numero;
            num.add(numero);
        }
        System.out.println(num);
    }

    public void numOrdenado(){
        List<Integer> orden= new ArrayList<>();
        int cantidad=10;
        int minimo=55;
        int maximo=100;
        int[] numeros=new int[cantidad];

        Random r =new Random();
        for (int i = 0; i < cantidad; i++) {
            int numero;
            do {
                numero = r.nextInt(maximo - minimo + 1) + minimo;
            } while (orden.contains(numero));

            numeros[i] = numero;
            orden.add(numero);
        }
        System.out.println("Numeros desordenados: "+orden);
        Collections.sort(orden);
        int minOrdenado = orden.get(0);
        int maxOrdenado = orden.get(orden.size() - 1);
        System.out.println("Numeros ordenados: " + orden);
        System.out.println("Valor minimo: " + minOrdenado);
        System.out.println("Valor maximo: " + maxOrdenado);
    }

    public void cadenaAleatoria() {
        int longitud=5;
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cadenaAleatoria = "";

        for (int i = 0; i < longitud; i++) {
            int indice = (int) (Math.random() * alfabeto.length());
            char caracter = alfabeto.charAt(indice);
            cadenaAleatoria += caracter;
        }
        System.out.println(cadenaAleatoria);
    }

    public void arregloAleatorio() {
        List<String> arreglo = new ArrayList<>();
        int cantidad=10;
        int longitud=5;
        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            String cadena = "";
            for (int j = 0; j < longitud; j++) {
                int indice = random.nextInt(abecedario.length());
                char caracter = abecedario.charAt(indice);
                cadena += caracter;
            }
            arreglo.add(cadena);
        }
        System.out.println(arreglo);
    }

}
