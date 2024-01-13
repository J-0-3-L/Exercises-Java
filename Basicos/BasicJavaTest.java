package Basicos;
import java.util.Arrays;

public class BasicJavaTest {
    public static void main(String[] args){
        BasicJava resultado = new BasicJava();

        // Imprimir 1 - 255
        resultado.contador();

        // Imprimir los Números Impares Entre 1 - 255
        resultado.impares();

        // Imprimir la Suma
        resultado.suma();

        // Recorrer un Arreglo
        int[] numero= new int[] {1,3,5,7,9,13};
        resultado.arreglo(numero);

        // Encontrar el Máximo
        int[] max= new int[] {-3,-5,-7,0};
        resultado.numMayor(max);

        // Obtener el Promedio
        int[] num=new int[] {2,10,3};
        int solucion= resultado.promedio(num);
        System.out.println("Promedio: "+solucion);

        // Arreglo con Números Impares
        resultado.newArr();

        // Mayor que Y
        int[] arreglo= new int[] {1,3,5,7};
        int y=3;
        resultado.mayorY(arreglo, y);

        // Valores al Cuadrado
        int[] arr=new int[] {1,5,10,-2};
        int[] sol=resultado.numCuadrado(arr);
        System.out.println(Arrays.toString(sol));

        // Eliminar Números Negativos
        int[] datos=new int[] {1,5,10,-2};
        int[] salida=resultado.deleteNeg(datos);
        System.out.println(Arrays.toString(salida));

        // Mínimo, Máximo y Promedio
        int[] x= new int[] {1,5,10,-2};
        int[] salida2=resultado.maxMinAvg(x);
        System.out.println(Arrays.toString(salida2));

        // Cambiando los Valores del Arreglo
        int[] z= new int[] {1,5,10,7,-2};
        int[] salida3=resultado.cambiarValor(z);
        System.out.println(Arrays.toString(salida3));
    }
}
