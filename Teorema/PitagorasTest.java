package Teorema;

public class PitagorasTest {
    public static void main(String[] args) {
        Pitagoras pitagoras = new Pitagoras();
        int catetoA = 3;
        int catetoB = 4;
        double hipotenusa = pitagoras.calcularHipotenusa(catetoA, catetoB);
        System.out.println("La hipotenusa es: " + hipotenusa);
    }
}
