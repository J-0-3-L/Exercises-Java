package Ejercicios.E2;

public class E2 {

    public static void main(String[] args){
        E2 resultado= new E2();
        // resultado.fizzBuzz();
        // resultado.retro();
        // resultado.saltoCinco();
        resultado.multiplosTres();

    }
    
    // 1. ***********************************************************

    // Generar un algoritmo que muestre los números del 1000 al 1050 e imprima Fizz
    // si el número es divisible por 3, Buzz si el número es divisible por 5 y
    // FizzBuzz si el número es divisible por 3 y por 5.

    // public void fizzBuzz(){
    //     for(int i=1000; i<=1050; i++){
    //         if(i%15==0){
    //             System.out.println("FizzBuzz "+i);
    //         }else if(i%5==0){
    //             System.out.println("Buzz "+i);
    //         }else if(i%3==0){
    //             System.out.println("Fizz "+i);
    //         }
    //     }
    // }

    // 2. ***********************************************************

    // Generar un algoritmo que muestre los números del 50 al 20.

    // public void retro(){
    //     for(int i=50; i>=20; i--){
    //         System.out.println(i);
    //     }
    // }

    // 3. ***********************************************************

    // Generar un algoritmo que muestre los números del 50 al 0 pero de 5 en 5.

    // public void saltoCinco(){
    //     for(int i=50; i>=0; i-=5){
    //         System.out.println(i);
    //     }
    // }

    // 4. ***********************************************************

    // Generar un algoritmo que muestre los múltiplos de 3 hasta el 90.

    public void multiplosTres(){
        for(int i=0;i<=90; i+=3){
            System.out.println(i);
        }
    }
}
