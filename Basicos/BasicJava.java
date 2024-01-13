package Basicos;
import java.util.ArrayList;

public class BasicJava{

    public void contador(){
        for(int i=1; i<256; i++){
            System.out.println(i);
        }
    }

    public void impares(){
        for(int i=1; i<=255; i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
    public void suma(){
        int res=0;
        for(int i=0; i<=255; i++){
            res+=i;
            System.out.println("Numero: " + i + ", Suma acumulada: " + res);
        }
    }

    public void arreglo( int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public void numMayor(int[] arr){
        int maxNumero=arr[0];
        for(int i=0; i<arr.length; i++){
            if(i> maxNumero){
                maxNumero=arr[i];
            } 
        }
        System.out.println("Numero mayor del arreglo: "+maxNumero);
    }

    public int promedio(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        int avg=sum/arr.length;
        return avg;
    }

    public void newArr(){
        ArrayList<Integer> y = new ArrayList<>();
        for(int i=1; i<=255; i+=2){
            y.add(i);
        }
        System.out.println(y);
    }

    public void mayorY(int[] arr , int y){
        for(int i=0; i<arr.length;i++){
            if(arr[i]>y){
                System.out.println(arr[i]);
            }
        }
    }

    public int[] numCuadrado(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        return arr;
    }

    public int[] deleteNeg(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                arr[i]=0;
            }
        }
        return arr;
    }

    public int[] maxMinAvg(int[] arr){
        int max=arr[0];
        int min=arr[0];
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
            sum+=arr[i];
        }
        double avg=sum/arr.length;
        int[] res = { max, min, (int) avg };
        return res;
    }

    public int[] cambiarValor(int[] arr){
        int[] resultado = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            resultado[i] = arr[i + 1];
        }
        resultado[arr.length - 1] = 0;
        return resultado;
    }
    
}