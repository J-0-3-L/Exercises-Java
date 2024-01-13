package Condicional;

public class FizzBuzzTest {
    public static void main(String[] args){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number=2;
        // int number=3;
        // int number=5;
        // int number=15;
        String resultado=fizzBuzz.fizzBuzz(number);
        System.out.println(resultado);
    }
}
